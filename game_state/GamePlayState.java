package game_state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.apache.commons.io.IOUtils;

import algorithm.MovedBuilder;
import algorithm.StatusObject;
import algorithm.StatusObject.MovingType;
import game_interface.GamePanel;
import game_object.Button;
import game_object.Disk;
import game_object.DiskColum;
import game_object.RectangleButton;
import game_object.TriangleButton;
import static game_state.MainMenuState.sound;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class GamePlayState  implements GameState, KeyListener {

	public static final int MAKE_NUMBER_OF_DISK = 0;
	public static final int PLAY_GAME = 1;
	public static final int GUIDING = 2;
	public static final int WIN_GAME = 3;
	
	private static final int Y_SHOW_HELPING = 180;

	private GamePanel context;

	private Button[] buttons;
	private Button buttonIsPressing;
private int[] source;
	private int[] auxilliary;
	private int[] destination;
	public static int numberOfDisk = 3;

	private final int INCREASED_PANEL_X = 247;
	private final int INCREASED_PANEL_Y = 40;

	private final int SRC_COLUM_X = 260;
	private final int AUX_COLUM_X = 450;
	private final int DES_COLUM_X = 650;
	private final int GROUND_Y = 410;

	private int state;
	private DiskColum [] diskColum;
	private Disk diskMoved;
	private int srcColumDiskMoved;
	private int numberOfTurn;
	
	private String playerName = "|";
	
	private Stack<MovingType> listMoving;
	private List<StatusObject> listSts;
	
	private MovingType showHelping = null;
public static SoundPlayer sound;
    BufferedImage wingame,diskcolumimage,cot;
	public GamePlayState(GamePanel gamePanel) throws IOException {
		this.context = gamePanel;
		listMoving = new Stack<MovingType>();
		state = MAKE_NUMBER_OF_DISK;
		diskColum = new DiskColum[3];
		resetDisks();
		buttons = new Button[8];
		buttons[0] = new TriangleButton("+", INCREASED_PANEL_X, INCREASED_PANEL_Y, 30, 30, 10, 25,
				TriangleButton.UP_TRIANGLE);
		buttons[0].setHoverBgColor(Color.BLUE);
		buttons[0].setPressedBgColor(Color.RED);

		buttons[1] = new TriangleButton("-", INCREASED_PANEL_X, INCREASED_PANEL_Y + 90, 30, 30, 12, 20,
				TriangleButton.DOWN_TRIANGLE);
		buttons[1].setHoverBgColor(Color.BLUE);
		buttons[1].setPressedBgColor(Color.RED);

		buttons[2] = new RectangleButton("START", 20, 100, 100, 40, 30, 25, Color.decode("#8A4B08"));
		buttons[2].setHoverBgColor(Color.BLUE);
		buttons[2].setPressedBgColor(Color.RED);
		
		buttons[3] = new RectangleButton("MAIN MENU", 20, 350, 100, 40, 10, 25, Color.decode("#8A4B08"));
		buttons[3].setHoverBgColor(Color.BLUE);
		buttons[3].setPressedBgColor(Color.RED);
		
		buttons[4] = new RectangleButton("REPLAY", 20, 400, 100, 40, 25, 25, Color.decode("#8A4B08"));
		buttons[4].setHoverBgColor(Color.BLUE);
		buttons[4].setPressedBgColor(Color.RED);
		
		buttons[5] = new RectangleButton("HELP", 30, 30, 80, 40, 25, 25, Color.decode("#8A4B08"));
		buttons[5].setHoverBgColor(Color.BLUE);
		buttons[5].setPressedBgColor(Color.RED);

		buttons[6] = new RectangleButton("OK", 305, 290, 50, 40, 15, 25, Color.decode("#8A4B08"));
		buttons[6].setHoverBgColor(Color.BLUE);
		buttons[6].setPressedBgColor(Color.RED);
		buttons[6].setEnable(false);
		
		buttons[7] = new RectangleButton("CANCEL", 400, 290, 80, 40, 15, 25, Color.decode("#8A4B08"));
		buttons[7].setHoverBgColor(Color.BLUE);
		buttons[7].setPressedBgColor(Color.RED);
		buttons[7].setEnable(false);
		    sound= new SoundPlayer(new File("tuyam.wav"));
                    sound.play();
                    wingame=ImageIO.read(new File("end2.jpg"));
                    diskcolumimage=ImageIO.read(new File("be.png"));
                    cot=ImageIO.read(new File("b4.png"));
	}
	
	private void resetDisks() {
		diskColum[0] = new DiskColum(numberOfDisk, 262, 390);
		diskColum[1] = new DiskColum(0, 452, 390);
		diskColum[2] = new DiskColum(0, 652, 390);
		
		System.out.println("--------------> reset ");
		listSts = (new MovedBuilder()).makeMoved(diskColum[0], diskColum[1], diskColum[2], numberOfDisk);
		
		listMoving.clear();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent e) {
		
		// To hide the helping
		showHelping = null;
		
		for (Button bt : buttons) {
			if (bt.isInButton(e.getX(), e.getY())) {
				buttonIsPressing = bt;
				bt.setState(Button.PRESSED);
			}
		}
		if(state == PLAY_GAME) {
			for(int i = 0; i < 3; i ++) {
				diskMoved = diskColum[i].takeDisk(e.getX(), e.getY());
				srcColumDiskMoved = i;
				if(diskMoved != null) {
					break;
				}
			}
		}
		context.redraw();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		switch(state) {
			case MAKE_NUMBER_OF_DISK:
				if (buttons[0].isInButton(e.getX(), e.getY()) && buttons[0] == buttonIsPressing
						&& numberOfDisk < 10) {
					numberOfDisk++;
					diskColum[0].resetDisk(numberOfDisk);
				} else if (buttons[1].isInButton(e.getX(), e.getY()) && buttons[1] == buttonIsPressing
						&& numberOfDisk > 1) {
					numberOfDisk--;
					diskColum[0].resetDisk(numberOfDisk);
				} else if(buttons[2].isInButton(e.getX(), e.getY()) && buttons[2] == buttonIsPressing) {
					state = PLAY_GAME;
					resetDisks();
				}
				break;
			case PLAY_GAME:
				if(diskMoved != null) {
					for(int i = 0; i < diskColum.length; i++) {
						if(diskColum[i].isInDiskColumArea(e.getX(), e.getY()) && diskColum[i].canPushDisk(diskMoved.getId())) {
							diskColum[i].pushDisk(diskMoved);
							diskMoved = null;
							if(srcColumDiskMoved != i) {
								numberOfTurn ++;
								if(diskColum[2].getSize() == numberOfDisk) {
									state = WIN_GAME;
									enablePopupButton();
									
								}
								
								
								if(isTheBackmovingFromMovingList(i, srcColumDiskMoved)) {
									listMoving.pop();
								}
                                                                else{
								
								addMovingBack(i, srcColumDiskMoved);
                                                                }
							}
							break;
						}
					}
					if(diskMoved != null) {
						diskColum[srcColumDiskMoved].pushDisk(diskMoved);
						diskMoved = null;
					}
				}
				break;
			case WIN_GAME:
				if (buttons[6].isInButton(e.getX(), e.getY()) && buttons[6] == buttonIsPressing) {
					if(playerName.length() > 1) {
						state = MAKE_NUMBER_OF_DISK;
						resetDisks();
						disablePopupButton();
						savePlayer();
						numberOfTurn = 0;
					}
				} else if (buttons[7].isInButton(e.getX(), e.getY()) && buttons[7] == buttonIsPressing) {
					state = MAKE_NUMBER_OF_DISK;
					resetDisks();
					disablePopupButton();
					numberOfTurn = 0;
				}
					
				break;
			default:
				System.out.println("GAME PLAY STATE invalid state");
		}

		if(buttons[3].isInButton(e.getX(), e.getY()) && buttons[3] == buttonIsPressing) {
                    try {
                        context.changeCurrentState(new MainMenuState(context));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePlayState.class.getName()).log(Level.SEVERE, null, ex);
                    }
			if(state == PLAY_GAME) {
				try {
					saveGame();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} else if(buttons[4].isInButton(e.getX(), e.getY()) && buttons[4] == buttonIsPressing) {
			state = MAKE_NUMBER_OF_DISK;
			resetDisks();
			numberOfTurn = 0;
		} else if (buttons[5].isInButton(e.getX(), e.getY()) && buttons[5] == buttonIsPressing) {
			showHelp();
		}
		
		for (Button bt : buttons) {
			bt.setState(Button.NONE);
		}
		buttonIsPressing = null;
		context.redraw();
		System.out.println("State game = " + state);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(diskMoved != null) {
			diskMoved.setPosX(e.getX());
			diskMoved.setPosY(e.getY());
		}
		context.redraw();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		for (Button bt : buttons) {
			if (bt.isInButton(e.getX(), e.getY())) {
				bt.setState(Button.HOVER);
			} else {
				bt.setState(Button.NONE);
			}
		}
		context.redraw();
	}

	@Override
	public void stateUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stateRender(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, context.getWidth(), context.getHeight());

		if (state == MAKE_NUMBER_OF_DISK) {
			// ve cum nut tang giam so luong dia
			g.setColor(Color.ORANGE);
			g.fillRect(INCREASED_PANEL_X - 5, INCREASED_PANEL_Y + 40, 40, 40);
			g.setColor(Color.WHITE);
			g.drawString(String.valueOf(numberOfDisk), INCREASED_PANEL_X + 10, INCREASED_PANEL_Y + 65);
			for (int i = 0; i < 2; i++) {
				buttons[i].draw(g);
			}
		}

		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 150, context.getHeight());
 g.drawImage(diskcolumimage,-220 ,00, context.getWidth()+210,context.getHeight()+90,null);
  g.drawImage(diskcolumimage,-50 , 0, context.getWidth()+243,context.getHeight()+90,null);
    g.drawImage(diskcolumimage,130 , 0, context.getWidth()+275,context.getHeight()+90,null);
//		g.setColor(Color.decode("#FAAC58"));
//		g.fillRect(170, GROUND_Y, 580, 150);
//               
    g.drawImage(cot, -48, 105, context.getWidth()-105,context.getHeight(),null);
        g.drawImage(cot, 40, 105, context.getWidth()+109,context.getHeight(),null);
            g.drawImage(cot, 200, 105, context.getWidth()+180,context.getHeight(),null);
//		g.setColor(Color.decode("#3B170B"));
//                
//		g.fillRect(SRC_COLUM_X, 200, 5, 210);
//		g.fillRect(AUX_COLUM_X, 200, 5, 210);
//		g.fillRect(DES_COLUM_X, 200, 5, 210);

		for (int i = 2; i < 6; i++) {
			buttons[i].draw(g);
		}
		
		for(DiskColum dc : diskColum) {
			dc.draw(g);
		}
		
		if(diskMoved != null) {
			diskMoved.draw(g);
		}
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		g.drawString("Turns: " + numberOfTurn, 30, 190);
		
		g.setFont(new Font("TimesRoman", Font.BOLD, 13));
		g.setColor(Color.red);
		g.drawString("Cột A", 240, 430);
                    g.drawString("Cột C",625, 430);
		g.drawString("Cột B", 432, 430);

		if (state == WIN_GAME) {
			   
//                           g.setColor(Color.ORANGE);
//			g.fillRect(300, 50, 250, 150);
			g.drawImage(wingame, 0, 0, context.getWidth(),context.getHeight(),null);
			g.setColor(Color.red);
			g.setFont(new Font("TimesRoman", Font.BOLD, 25));
			g.drawString("Your name", 325, 220);
			
			g.setColor(Color.decode("#8A4B08"));
			g.fillRect(313, 230, 160, 50);
                     
			
			g.setColor(Color.WHITE);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
			g.drawString(playerName, 317, 257);
			
			for(int i = 6; i < 8; i ++) {
				buttons[i].draw(g);
			}
		}
		
	if(showHelping == MovingType.SRC_TO_AUX) {
			drawRightArrow(g, SRC_COLUM_X, AUX_COLUM_X);
		} else if(showHelping == MovingType.SRC_TO_DES) {
			drawRightArrow(g, SRC_COLUM_X, DES_COLUM_X);
		} else if(showHelping == MovingType.AUX_TO_SRC) {
			drawLeftArrow(g, SRC_COLUM_X, AUX_COLUM_X);
		} else if(showHelping == MovingType.AUX_TO_DES) {
			drawRightArrow(g, AUX_COLUM_X, DES_COLUM_X);
		} else if(showHelping == MovingType.DES_TO_AUX) {
			drawLeftArrow(g, AUX_COLUM_X, DES_COLUM_X);
		} else if(showHelping == MovingType.DES_TO_SRC) {
			drawLeftArrow(g, SRC_COLUM_X, DES_COLUM_X);
		}
	}
	
	public void drawRightArrow(Graphics g, int x1, int x2) {
		g.setColor(Color.green);
		g.drawLine(x1, Y_SHOW_HELPING, x2 - 10, Y_SHOW_HELPING);
		g.drawLine(x1, Y_SHOW_HELPING + 10, x2 - 10, Y_SHOW_HELPING + 10);
		g.drawLine(x1, Y_SHOW_HELPING, x1, Y_SHOW_HELPING + 10);
		g.drawLine(x2 - 10, Y_SHOW_HELPING, x2 - 10, Y_SHOW_HELPING - 3);
		g.drawLine(x2 - 10, Y_SHOW_HELPING + 10, x2 - 10, Y_SHOW_HELPING + 13);
		g.drawLine(x2 - 10, Y_SHOW_HELPING - 3, x2, Y_SHOW_HELPING + 5);
		g.drawLine(x2 - 10, Y_SHOW_HELPING + 13, x2, Y_SHOW_HELPING + 5);
	}
	
	public void drawLeftArrow(Graphics g, int x1, int x2) {
		g.setColor(Color.green);
		g.drawLine(x1 + 10, Y_SHOW_HELPING, x2, Y_SHOW_HELPING);
		g.drawLine(x1 + 10, Y_SHOW_HELPING + 10, x2, Y_SHOW_HELPING + 10);
		g.drawLine(x2, Y_SHOW_HELPING, x2, Y_SHOW_HELPING + 10);
		g.drawLine(x1 + 10, Y_SHOW_HELPING, x1 + 10, Y_SHOW_HELPING - 3);
		g.drawLine(x1 + 10, Y_SHOW_HELPING + 10, x1 + 10, Y_SHOW_HELPING + 13);
		g.drawLine(x1 + 10, Y_SHOW_HELPING - 3, x1, Y_SHOW_HELPING + 5);
		g.drawLine(x1 + 10, Y_SHOW_HELPING + 13, x1, Y_SHOW_HELPING + 5);
	}
	
	public void continueGame() throws IOException {
		// get data from file
		diskColum[0].resetDisk(0);
		byte [] data = IOUtils.toByteArray(new FileInputStream("gamesaving.dat"));
		numberOfDisk = data[0];
		DiskColum colum = new DiskColum(numberOfDisk, 0, 0);
		Stack<Disk> stack = colum.getStackList();
		
		// Vi danh sach dia tu tren xuong duoi co id tang dan
		int i = numberOfDisk - 1;
		Disk[] disks = new Disk[numberOfDisk];
		for(Disk d : stack) {
			disks[i] = d;
			i--;
		}
		int index = 0;
		for(int j = 2; j < data.length; j ++) {
			if(data[j] == -1) {
				index ++;
				continue;
			}
			diskColum[index].pushDisk(disks[data[j] - 1]);
		}
		
		state = PLAY_GAME;

		// make guide
	}
	
	public void saveGame() throws IOException {
		// Only save game while playing
		if(state == PLAY_GAME) {
			System.out.println("Game saved");
			DataOutputStream out = new DataOutputStream (new FileOutputStream("gamesaving.dat"));
			byte [] data = new byte[numberOfDisk + 1 + 3];
			int index = 0;
			data[index] = (byte) numberOfDisk;
			index ++;
			
			// break point to read next paragraph
			data[index] = - 1;
			index ++;
			for(Disk d : diskColum[0].getStackList()) {
				data[index] = (byte) d.getId();
				index ++;
			}
			
			// break point to read next paragraph
			data[index] = -1;
			index ++;
			for(Disk d : diskColum[1].getStackList()) {
				data[index] = (byte) d.getId();
				index ++;
			}
			
			// break point to read next paragraph
			data[index] = -1;
			index ++;
			for(Disk d : diskColum[2].getStackList()) {
				data[index] = (byte) d.getId();
				index ++;
			}
			
			out.write(data);
			out.close();
		}
	}

	private void savePlayer() {
			
		try {FileWriter fw = new FileWriter("players.txt", true);
			fw.append(playerName.substring(0, playerName.length() - 1) + "," + numberOfTurn + "," + numberOfDisk + ";");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private void disablePopupButton() {
		buttons[6].setEnable(false);
		buttons[7].setEnable(false);
	}
	
	private void enablePopupButton() {
		buttons[6].setEnable(true);
		buttons[7].setEnable(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("key type");
		if(state == WIN_GAME) {
                    sound.close();
			if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
				if(playerName.length() > 1) {
					playerName = playerName.substring(0, playerName.length() - 2) + "|";
				}
			} else {
				if(playerName.length() < 11) {
					playerName = playerName.substring(0, playerName.length() - 1);
					playerName += (e.getKeyChar() + "|");
				}
			}
			context.redraw();
		}
	}
	
		
	
	private void addMovingBack(int src, int des) {
		if(src == 0 && des == 1) {
			listMoving.push(MovingType.SRC_TO_AUX);
		} else if(src == 0 && des == 2) {
			listMoving.push(MovingType.SRC_TO_DES);
		} else if(src == 1 && des == 0) {
			listMoving.push(MovingType.AUX_TO_SRC);
		} else if(src == 1 && des == 2) {
			listMoving.push(MovingType.AUX_TO_DES);
		} else if(src == 2 && des == 0) {
			listMoving.push(MovingType.DES_TO_SRC);
		} else if(src == 2 && des == 1) {
			listMoving.push(MovingType.DES_TO_AUX);
		} else {
			new Throwable("Invalid moving").printStackTrace();
		}
	}
        
	private boolean isTheBackmovingFromMovingList(int src, int des) {
		
		MovingType movingType = null;
		if(src == 0 && des == 1) {
			movingType = MovingType.AUX_TO_SRC;
		} else if(src == 0 && des == 2) {
			movingType = MovingType.DES_TO_SRC;
		} else if(src == 1 && des == 0) {
			movingType = MovingType.SRC_TO_AUX;
		} else if(src == 1 && des == 2) {
			movingType = MovingType.DES_TO_AUX;
		} else if(src == 2 && des == 0) {
			movingType = MovingType.SRC_TO_DES;
		} else if(src == 2 && des == 1) {
			movingType = MovingType.AUX_TO_DES;
		} else {
			new Throwable("Invalid moving").printStackTrace();
		}
		
		if(listMoving.isEmpty()) {
			return false;
		} else {
			return (listMoving.peek() == movingType);
		}
	}
	
        public boolean kt(int n,int[] diskcolum)
        {
            
            for(int i=0;i<numberOfDisk;i++)
            {
                if(source[i]==n )
                {

                  if(source[i+1]==0) {
                
                    if(diskcolum[0]==0 )  
                    {
                        return true;
                     
                    }
                 else
                        for(int j=1;j<numberOfDisk-1;j++)
                        {
                        if(diskcolum[0]!=0 &&diskcolum[0]<source[i] || diskcolum[0]!=0 &&diskcolum[0]>source[i] && diskcolum[j]<source[i])
                    {
                       return false; 
                    }
                        else if(diskcolum[0]!=0 && diskcolum[0]>source[i])
                        {
                            return false;
                        }
                        }
                    }
                  else if(source[i+1]!=0)
                  {
                      return false;
                  }
                  
                }
                
                else     if(auxilliary[i]==n )
                {

                  if(auxilliary[i+1]==0) {
                
                    if(diskcolum[0]==0 )  
                    {
                        return true;
                     
                    }
                 else
                        for(int j=1;j<numberOfDisk-1;j++)
                        {
                        if(diskcolum[0]!=0 &&diskcolum[0]<auxilliary[i] || diskcolum[0]!=0 &&diskcolum[0]>auxilliary[i] && diskcolum[j]<auxilliary[i])
                    {
                       return false; 
                    }
                        else if(diskcolum[0]!=0 && diskcolum[0]>auxilliary[i])
                        {
                            return true;
                        }
                        }
                    }
                  else if(auxilliary[i+1]!=0)
                  {
                      return false;
                  }
                  
                }
                
                else 
                        if(destination[i]==n )
                {

                  if(destination[i+1]==0) {
                
                    if(diskcolum[0]==0 )  
                    {
                        return true;
                     
                    }
                 else
                        for(int j=1;j<numberOfDisk-1;j++)
                        {
                        if(diskcolum[0]!=0 &&diskcolum[0]<destination[i] || diskcolum[0]!=0 &&diskcolum[0]>destination[i] && diskcolum[j]<destination[i])
                    {
                       return false; 
                    }
                        else if(diskcolum[0]!=0 && diskcolum[0]>destination[i])
                        {
                            return true;
                        }
                        }
                    }
                  else if(destination[i+1]!=0)
                  {
                      return false;
                  }
                  
                }
                
            }
           return true;
        }
        public boolean ktdes(int n)
        {
            for(int i=0;i<numberOfDisk;i++)
            {
                if(destination[i]==n)
                {
                    return true;
                }
                
            }
            return false;
        }
         public boolean ktsrc(int n)
        {
            for(int i=0;i<numberOfDisk;i++)
            {
                if(source[i]==n)
                {
                    return true;
                }
                
            }
            return false;
        }
          public boolean ktax(int n)
        {
            for(int i=0;i<numberOfDisk;i++)
            {
                if(auxilliary[i]==n)
                {
                    return true;
                }
                
            }
            return false;
        }
	private void showHelp() {
		for(int i = 0; i < listSts.size(); i ++) {
			// Cho nay se hoi roi mot xiu, vi chi khi nao ban di dung' voi nuoc nao do trong thuat toan
			// thi ket qua isSamStatus moi = true
			if(listSts.get(i).isSameStatus(diskColum[0].getStackList(), diskColum[1].getStackList(), diskColum[2].getStackList())) {
				if(listSts.get(i) != listSts.get(listSts.size() - 1)) {
					System.out.println("Show help from list step");
					showHelping = listSts.get(i).getMoving(listSts.get(i), listSts.get(i + 1));
					context.redraw();
				}
				return;
			}
		}
		
		if(listMoving.isEmpty()) {
			return;
		}
		showHelping = listMoving.peek();
		context.redraw();
	}
}
