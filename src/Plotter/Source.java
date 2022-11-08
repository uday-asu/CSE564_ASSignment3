package Plotter;

import java.util.ArrayList;


public class Source extends Observable {
	public ArrayList<ArrayList<Integer>> getValues() {
		RandomNumGen randomNumGen = RandomNumGen.getInstance();
		return randomNumGen.generateValues();
	}


}
