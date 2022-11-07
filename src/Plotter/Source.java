package Plotter;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Source extends Observable {
	
	int[][] values = new int[2][50];
	
	Source(){
		for( int r = 0 ; r < values.length; r++){
			for ( int c = 0 ; c < values[0].length ; c++ ){
				values[r][c] = (int) (Math.random() * 200) + 1;
			}
		}

		notifyObservers();
		setChanged();
	}
	public void updateValues() {

		for( int r = 0 ; r < values.length; r++){
			for ( int c = 0 ; c < values[0].length ; c++ ){
				values[r][c] = (int) (Math.random() * 200) + 1;
			}
		}
		notifyObservers();
		setChanged();
		
	}
	
	public int[][] getValues() {
		return values;
	}
	

}
