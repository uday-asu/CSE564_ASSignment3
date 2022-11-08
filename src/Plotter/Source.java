package Plotter;

import java.util.ArrayList;
import java.util.Observable;

public class Source extends Observable {
	public ArrayList<ArrayList<Integer>> getValues() {
		RandomNumGen randomNumGen = RandomNumGen.getInstance();
		return randomNumGen.generateValues();
	}
	@Override
	protected void setChanged(){
		super.setChanged();
	}

	

}
