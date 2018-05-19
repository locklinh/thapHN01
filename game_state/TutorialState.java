package game_state;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import game_interface.GamePanel;
import game_object.Button;
import game_object.RectangleButton;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TutorialState implements GameState{
	private Button[] buttons;
	private GamePanel context;
	private Button buttonIsPressing;
        private int i=0;
private static BufferedImage bg,bg0,bg1,bg2,bg3,bg4,bg5,bg6,bg7, backgroud,backgroud1,backgroud2,backgroud3,backgroud4,backgroud5,backgroud6,backgroud7,backgroud8,backgroud9,backgroud10,backgroud11,backgroud12,backgroud13,backgroud14,backgroud15,backgroud16,backgroud17,backgroud18,backgroud19,backgroud20,backgroud21;
	public TutorialState(GamePanel context) throws IOException {
		this.context = context;
		buttons = new RectangleButton[1];

		buttons[0] = new RectangleButton("BACK", 10, 10, 80, 40, 15, 25, Color.ORANGE);
		buttons[0].setHoverBgColor(Color.BLUE);
		buttons[0].setPressedBgColor(Color.GREEN);
     bg= ImageIO.read(new File("nen.jpg"));
                         backgroud
            =    ImageIO.read(new File("1.png"));
            backgroud1
            =    ImageIO.read(new File("1.png"));
            backgroud2
            =    ImageIO.read(new File("2.png"));
            backgroud3
            =    ImageIO.read(new File("2.png"));
            backgroud4
            =    ImageIO.read(new File("3.png"));
            backgroud5
            =    ImageIO.read(new File("3.png"));
            backgroud6
            =    ImageIO.read(new File("4.png"));
            backgroud7
            =    ImageIO.read(new File("4.png"));
            backgroud8
            =    ImageIO.read(new File("5.png"));
            backgroud9
            =    ImageIO.read(new File("5.png"));
            backgroud10
            =    ImageIO.read(new File("6.png"));
            backgroud11
            =    ImageIO.read(new File("6.png"));
            backgroud12
            =    ImageIO.read(new File("7.png"));
            

	}

	@Override
	public void stateUpdate() {
		
	}

	@Override
	public void stateRender(Graphics g) {
         
//		g.setColor(Color.GRAY);
//		g.fillRect(0, 0, context.getWidth(), context.getHeight());
  g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);  
 
         
            if(i==0)
            {
		g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
               
            }
             if(i==1)
            {
		g.drawImage(backgroud,-500, 0,800, context.getHeight(),null);
//                if((i+1)%2==0){ 
//                try {
//                    sleep(50);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//            }
            }  
              if(i==2)
            {
		g.drawImage(backgroud1,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2!=0){ 
//                 try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            }  
               if(i==3)
            {
		g.drawImage(backgroud2,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2==0){ 
//                try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            }   if(i==4)
            {
//                 if((i+1)%2!=0){ 
//		g.drawImage(backgroud3,0, 0, context.getWidth(), context.getHeight(),null);
//                 try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
              g.drawImage(backgroud3,-500, 0,800, context.getHeight(),null);
//                 }
            }   if(i==5)
            {
		g.drawImage(backgroud4,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2==0){ 
//                 try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            }   if(i==6)
            {
		g.drawImage(backgroud5,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2!=0){  
//                try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//            }
            }   if(i==7)
            {
		g.drawImage(backgroud6,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2==0){ 
//                try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            } 
            
            if(i==8)
            {
		g.drawImage(backgroud7,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2!=0){  
//                try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            }  
             if(i==9)
            {
		g.drawImage(backgroud8,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2==0){  
//                try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            }
               if(i==10)
            {
		g.drawImage(backgroud9,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2!=0){ 
//                 try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            }  
             if(i==11)
            {
		g.drawImage(backgroud10,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2==0){ 
//                try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            }  
              if(i==12)
            {
		g.drawImage(backgroud11,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2!=0){  
//                try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            }  
               if(i==13)
            {
		g.drawImage(backgroud12,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2==0){  
//                try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//                 }
            }  
                if(i==14)
            {
                try {
                    backgroud13
                            =    ImageIO.read(new File("7.jpg"));
                } catch (IOException ex) {
                   
                }
		g.drawImage(backgroud13,-500, 0,800, context.getHeight(),null);
//                 if((i+1)%2!=0){ 
//                 try {
//                    sleep(200);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//                }
             
//                 }
            }  
                
               i++;   
               
            
           
             
           
             if(i==14)   i=0; 
           
             BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("tutorial.png"));
		} catch (IOException e) {
		}
		g.drawImage(img, 200, 70, null);
               
          
                  
          try {
                    sleep(67);
                } catch (InterruptedException ex) {
                    
                    
                
        }
           
		for (Button bt : buttons) {
			bt.draw(g);
		}
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		for (Button bt : buttons) {
			if (bt.isInButton(e.getX(), e.getY())) {
				bt.setState(RectangleButton.PRESSED);
				buttonIsPressing = bt;
			}
		}
		context.redraw();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		for (Button bt : buttons) {
			if (bt.isInButton(e.getX(), e.getY()) && bt == buttonIsPressing) {
				if (bt == buttons[0]) {
                                    try {
                                        context.changeCurrentState(new MainMenuState(context));
                                    } catch (IOException ex) {
                                        Logger.getLogger(TutorialState.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				}
			}
		}
		context.redraw();
		buttonIsPressing = null;
		for (Button bt : buttons) {
			bt.setState(Button.NONE);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		for (Button bt : buttons) {
			if (bt.isInButton(e.getX(), e.getY())) {
				bt.setState(RectangleButton.HOVER);
			} else {
				bt.setState(RectangleButton.NONE);
			}
		}
		context.redraw();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
