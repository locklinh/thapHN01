package game_object;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class TriangleButton extends Button {

	public static final int UP_TRIANGLE = 0;
	public static final int DOWN_TRIANGLE = 1;
	
	private int typeOfTriangle;
	
	public TriangleButton(String text, int posX, int posY, int width, int height, int paddingTextX, int paddingTextY, int typeOfTriangle) {
		super(text, posX, posY, width, height, paddingTextX, paddingTextY, Color.WHITE);
		this.typeOfTriangle = typeOfTriangle;
	}

	@Override
	public boolean isInButton(int x, int y) {
		return (enabled && x >= posX && x <= posX + width && y >= posY && y <= posY + height);
	}

	@Override
	public void draw(Graphics g) {
		
		g.setColor(Color.GREEN);
		if(typeOfTriangle == UP_TRIANGLE) {
			g.drawLine(posX + width / 2, posY, posX, posY + height);
			g.drawLine(posX + width / 2, posY, posX + width, posY + height);
			g.drawLine(posX, posY + height, posX + width, posY + height);
		} else {
			g.drawLine(posX, posY, posX + width / 2, posY + height);
			g.drawLine(posX + width, posY, posX + width/2, posY + height);
			g.drawLine(posX, posY, posX + width, posY);
		}

		switch (state) {
			case NONE: g.setColor(bgColor); break;
			case PRESSED: g.setColor(pressedBgColor); break;
			case HOVER: g.setColor(hoverBgColor); break;
		}
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
		g.drawString(text, posX + paddingTextX, posY + paddingTextY);
	}

}
