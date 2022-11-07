package Plotter;

import java.util.Observable;
import java.util.Observer;

public class PlotPanel implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Source s = (Source) o;
		int[] output = s.getValues();
		System.out.println(output[0]);
	}
	
	

}
