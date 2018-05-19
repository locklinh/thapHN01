package game_interface;

import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import game_state.GamePlayState;
import game_state.GameState;
import game_state.MainMenuState;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private GameState currentState;
	private GameWindow gameWindow;
	
	public GamePanel(GameWindow gameWindow) throws IOException {
		currentState = new MainMenuState(this);
		this.gameWindow = gameWindow;
		registerMouse();
	}
	
	public void redraw() {
		repaint();
	}
	
	public void changeCurrentState(GameState gameState) {
		removeMouseListener(currentState);
		removeMouseMotionListener(currentState);
		removeKeyListener(currentState);
		currentState = gameState;
		registerMouse();
		registerKeyListener();
	}
	
	public void paint(Graphics g) {
		currentState.stateRender(g);
	}

	private void registerMouse() {
		addMouseListener(currentState);
		addMouseMotionListener(currentState);
	}
	
	private void registerKeyListener() {
		gameWindow.addKeyListener(currentState);
	}
	
	public void saveGame() {
		if(currentState instanceof GamePlayState) {
			try {
				((GamePlayState) currentState).saveGame();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public GameState getCurrentState() {
		return currentState;
	}
}
