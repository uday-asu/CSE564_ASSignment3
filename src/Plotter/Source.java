package Plotter;

import java.util.ArrayList;

/**
 * Notifies all the observers that some data is to be changed and broadcasts information
 * to the other classes
 */
public class Source extends Observable {
	public ArrayList<ArrayList<Integer>> getValues() {
		RandomNumGen randomNumGen = RandomNumGen.getInstance();
		return randomNumGen.generateValues();
	}
}
