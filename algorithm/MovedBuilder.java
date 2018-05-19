package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import game_object.Disk;
import game_object.DiskColum;

public class MovedBuilder {

	private Stack<Disk> source;
	private Stack<Disk> auxilliary;
	private Stack<Disk> destination;
	
	private List<StatusObject> listStatusObject;
	private int numberOfDisk;
	
	public List<StatusObject> makeMoved(DiskColum source, 
			DiskColum auxilliary, DiskColum destination, int numberOfDisk) {
		this.numberOfDisk = numberOfDisk;
		// Clone all object to avoid change the data when make helping
		this.source = new Stack<Disk>();
		for(Disk d : source.getStackList()) {
			this.source.push(d);
		}
		
		this.auxilliary = new Stack<Disk>();
		for(Disk d : auxilliary.getStackList()) {
			this.auxilliary.push(d);
		}
		
		this.destination = new Stack<Disk>();
		for(Disk d : destination.getStackList()) {
			this.destination.push(d);
		}
		
		listStatusObject = new ArrayList<StatusObject>();
		listStatusObject.add(new StatusObject(this.source, this.destination, this.auxilliary, this.numberOfDisk));
		move(numberOfDisk, this.source, this.destination, this.auxilliary);
		
		return listStatusObject;
	}
	
	private void move(int n, Stack<Disk> start, Stack<Disk> finish, Stack<Disk> spare) {
        if(n == 1){
            moveColumToColum(start, finish);
            StatusObject statusObject = new StatusObject(this.source, this.destination, this.auxilliary, numberOfDisk);
            System.out.println(statusObject);
            listStatusObject.add(statusObject);
            return;
        }
        else{
            move(n-1, start, spare, finish);
            move(1, start, finish, spare);
            move(n-1, spare, finish, start);
        }
    }
	
	private void moveColumToColum(Stack<Disk> c1, Stack<Disk> c2) {
		Disk d = c1.pop();
		c2.push(d);
	}
	
}
