package Plotter;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Source extends Observable {
	
	int[] values = new int[10];
	
	
	public void updateValues() {
		
		for(int i = 0; i< 10; i++) {
			values[i] = (int)(Math.random()*100);
			//System.out.println(Math.random());
		}
		
		notifyObservers();
		setChanged();
		
	}
	
	public int[] getValues() {
		return values;
	}
	

}