package Plotter;

import java.awt.*;
import java.util.ArrayList;

public class DecoratorPlot extends Plot {

	private Plot plot;

	public DecoratorPlot(Plot plot){
		this.plot = plot;
	}

	@Override
	public void graphPlotter(ArrayList<Integer> values, Graphics g) {
		if( plot != null ){
			plot.graphPlotter(values,g);
		}
	}
}
