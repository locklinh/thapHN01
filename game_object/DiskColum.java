package game_object;

import java.awt.Graphics;
import java.util.Stack;

public class DiskColum {

	private Stack<Disk> disks;
	private int posX;
	private int posY;

	public DiskColum(int numberOfDisk, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		resetDisk(numberOfDisk);
	}

	public void resetDisk(int numberOfDisk) {
		disks = new Stack<Disk>();
		if(numberOfDisk <= 0) {
			return;
		}
		int size = Disk.MAX_SIZE[numberOfDisk - 1];
		int y = posY;
		for (int id = numberOfDisk; id > 0; id--) {
			disks.push(new Disk(id, posX, y, size));
			size = size - Disk.MAX_SIZE[numberOfDisk - 1] * (18 - numberOfDisk) / 100;
			y -= Disk.DISK_HEIGHT;
		}
	}

	public void draw(Graphics g) {
		for (Disk d : disks) {
			d.draw(g);
		}
//		 g.drawRect(posX - 50, posY - 230, 100, 270);
	}
	
	// return the top disk when pressed mouse on top disk, return null if wrong disk or not disk
	public Disk takeDisk(int x, int y) {
		if(disks.isEmpty()) {
			return null;
		}
		Disk topDisk = disks.peek();
		if(topDisk.isInDiskArea(x, y)) {
			return disks.pop();
		}
		return null;
	}
	
	public void pushDisk(Disk disk) {
		if(disks.isEmpty()) {
			disk.setPosY(posY);
		} else {
			Disk topDisk = disks.peek();
			disk.setPosY(topDisk.getPosY() - Disk.DISK_HEIGHT);
		}
		disk.setPosX(posX);
		disks.push(disk);
	}

	public boolean isInDiskColumArea(int x, int y) {
		return (x >= posX - 50 && x <= posX + 50 && y >= posY - 250 && y <= posY + 20);
	}
	
	public boolean canPushDisk(int id) {
		if(disks.isEmpty() || disks.peek().getId() > id) {
			return true;
		}
		return false;
	}
	
	public int getSize() {
		return disks.size();
	}
	
	public Stack<Disk> getStackList() {
		return disks;
	}

}
