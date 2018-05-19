package game_state;

import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public interface GameState extends MouseListener, MouseMotionListener, KeyListener {

	void stateUpdate();
	
	void stateRender(Graphics g);
	
}
