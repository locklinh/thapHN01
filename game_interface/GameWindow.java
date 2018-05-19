package game_interface;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private GamePanel gamePanel;
	
	public GameWindow() throws IOException {
		super("Hanoi Tower");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Closed");
                gamePanel.saveGame();
                e.getWindow().dispose();
            }
        });
		setSize(800, 500);
		setLocation(new Point(400, 100));
		gamePanel = new GamePanel(this);
		add(gamePanel);
	}
	
	public static void main(String args[]) throws IOException {
		GameWindow gameWindow = new GameWindow();
		gameWindow.setVisible(true);
	}

}
