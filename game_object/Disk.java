package game_object;

import java.awt.Color;
import java.awt.Graphics;

public class Disk {
	
	public static final int [] MAX_SIZE = {100, 120, 130, 140, 150, 160, 170, 170, 170, 170}; 
	public static final int DISK_HEIGHT = 20;
	
	private int id;
	private int posX;
	private int posY;
	private int size;
	public Disk(int id, int posX, int posY, int size) {
		this.id = id;
		this.posX = posX;
		this.posY = posY;
		this.size = size;
	}
	public int getId() {
		return id;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(posX - size/2, posY, size, DISK_HEIGHT);
		g.setColor(Color.CYAN);
		g.drawRect(posX - size/2, posY, size, DISK_HEIGHT);
		g.drawRect(posX - size/2 + 1, posY + 1, size - 2, DISK_HEIGHT - 2);
		
		g.setColor(Color.WHITE);
		g.drawString(String.valueOf(id), posX - 2, posY + 15);
	}
	
	public boolean isInDiskArea(int x, int y) {
		return (x >= posX - size / 2 && x <= posX + size / 2 && y >= posY && y <= posY + DISK_HEIGHT);
	}
	
}
