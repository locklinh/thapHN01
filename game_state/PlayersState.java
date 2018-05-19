package game_state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;

import game_interface.GamePanel;
import game_object.Button;
import game_object.RectangleButton;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayersState implements GameState {

	private Button[] buttons;
	private GamePanel context;
	private Button buttonIsPressing;

	public PlayersState(GamePanel context) {
		this.context = context;
		buttons = new RectangleButton[1];

		buttons = new RectangleButton[1];
		buttons[0] = new RectangleButton("BACK", 10, 10, 80, 40, 15, 25, Color.ORANGE);
		buttons[0].setHoverBgColor(Color.BLUE);
		buttons[0].setPressedBgColor(Color.GREEN);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

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
                                        Logger.getLogger(PlayersState.class.getName()).log(Level.SEVERE, null, ex);
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
	public void mouseDragged(MouseEvent arg0) {}

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
	public void keyPressed(KeyEvent arg0) {}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}

	@Override
	public void stateUpdate() {}

	@Override
	public void stateRender(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, context.getWidth(), context.getHeight());
		for (Button bt : buttons) {
			bt.draw(g);
		}
		
		g.setColor(Color.ORANGE);
		g.fillRect(200, 30, 400, 400);
		g.setColor(Color.WHITE);
		g.drawRect(200, 30, 400, 400);
		g.drawLine(200, 50, 600, 50);
		g.drawLine(380, 30, 380, 430);
		g.drawLine(490, 30, 490, 430);
		g.drawString("NAME", 275, 45);
		g.drawString("TURNS", 415, 45);
		g.drawString("DISKS", 520, 45);
		
		File f = new File("players.doc");
		if(!f.exists() || f.isDirectory()) { 
			return;
		}
		
		FileReader fr = null;
		try {
			fr = new FileReader(new File("players.doc"));
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			String[] players = data.split(";");
			int i = 0;
			g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
			g.setColor(Color.WHITE);
			for(String s : players) {
				String[] columns = s.split(",");
				g.drawString(columns[0], 220, 70 + i * 20);
				g.drawString(columns[1], 430, 70 + i * 20);
				g.drawString(columns[2], 540, 70 + i * 20);
				i ++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
