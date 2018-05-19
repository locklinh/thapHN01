package algorithm;

import java.util.Stack;

import game_object.Disk;
import game_object.DiskColum;
import game_state.GamePlayState;
public class StatusObject {

    public MovingType getMoing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
	
	public static enum MovingType {
		SRC_TO_DES, SRC_TO_AUX, AUX_TO_SRC, AUX_TO_DES, DES_TO_SRC, DES_TO_AUX
	}

	private int[] source;
	private int[] auxilliary;
	private int[] destination;

	public StatusObject(Stack<Disk> source,  Stack<Disk> destination, Stack<Disk> auxilliary, int numberOfDisk) {
		this.source = new int[numberOfDisk];
		int index = 0;
		for(Disk d : source) {
			this.source[index] = d.getId();
			index ++;
		}
		
		index = 0;
		this.auxilliary = new int[numberOfDisk];
		for(Disk d : auxilliary) {
			this.auxilliary[index] = d.getId();
			index ++;
		}
		
		index = 0;
		this.destination = new int[numberOfDisk];
		for(Disk d : destination) {
			this.destination[index] = d.getId();
			index ++;
		}
	}
	
	public String toString() {
		String s = "";
		s += "\nCột A: ";
		for(Integer i : this.source) {
			s += (i + " ");
		}
		
		s += "\nCột B: ";
		for(Integer i : this.destination) {
			s += (i + " ");
		}
		
		s += "\nCột C: ";
		for(Integer i : this.auxilliary) {
			s += (i + " ");
		}
		
		return s;
	}
	
	public boolean isSameStatus(Stack<Disk> src, Stack<Disk> aux, Stack<Disk> des) {
		System.out.println();
		System.out.print("*****************************");
		int index = 0;
		System.out.println();
		for(int a : source) {
			System.out.print(" * " + a);
		}
		System.out.println();
		for(Disk d : src) {
			System.out.print(" - " + d.getId());
			if(d.getId() != this.source[index]) {
				return false;
			}
			index ++;
		}
		
		System.out.println();
		for(int a : auxilliary) {
			System.out.print(" * " + a);
		}
		System.out.println();
		index = 0;
		for(Disk d : aux) {
			System.out.print(" - " + d.getId());
			if(d.getId() != this.auxilliary[index]) {
				return false;
			}
			index ++;
		}
		
		System.out.println();
		for(int a : destination) {
			System.out.print(" * " + a);
		}
		System.out.println();
		index = 0;
		for(Disk d : des) {
			System.out.print(" - " + d.getId());
			if(d.getId() != this.destination[index]) {
				return true;
			}
			index ++;
		}
		
		return true;
	}
       
	
	public MovingType getMoving(StatusObject currentStatus, StatusObject nextStatus) {
		
		int start = -1;
		int end = -1;
		
		for(int i = 0; i < currentStatus.source.length; i++) {
			if(currentStatus.source[i] != nextStatus.source[i]) {
				if(currentStatus.source[i] == 0) {
					end = 0;
				} else if(nextStatus.source[i] == 0) {
					start = 0;
				}
				break;
			}
		}
		
		for(int i = 0; i < currentStatus.auxilliary.length; i++) {
			if(currentStatus.auxilliary[i] != nextStatus.auxilliary[i]) {
				if(currentStatus.auxilliary[i] == 0) {
					end = 1;
				} else if(nextStatus.auxilliary[i] == 0) {
					start = 1;
				}
				break;
			}
		}
		
		for(int i = 0; i < currentStatus.destination.length; i++) {
			if(currentStatus.destination[i] != nextStatus.destination[i]) {
				if(currentStatus.destination[i] == 0) {
					end = 2;
				} else if(nextStatus.destination[i] == 0) {
					start = 2;
				}
				break;
			}
		}
		
		System.out.println(start + " --> " + end);
		
		if(start == 0 && end == 1) {
			return MovingType.SRC_TO_AUX;
		} else if(start == 0 && end == 2) {
			return MovingType.SRC_TO_DES;
		} else if(start == 1 && end == 2) {
			return MovingType.AUX_TO_DES;
		} else if(start == 1 && end == 0) {
			return MovingType.AUX_TO_SRC;
		} else if(start == 2 && end == 1) {
			return MovingType.DES_TO_AUX;
		} else if(start == 2 && end == 0) {
			return MovingType.DES_TO_SRC;
		}
		
		new Throwable("Error in finding helping").printStackTrace();
		return null;
	}
	
	
}
