package Plotter;

import java.awt.*;
import java.util.ArrayList;

/**
 * This class is Decorator Design pattern Implementation
 * Has an aggregation connection with the parent class
 */
public class DecoratorPlot extends Plot {

	private Plot plot;

	/**
	 * Constructor to instantiate the parent Object
	 * @param plot
	 */
	public DecoratorPlot(Plot plot){
		this.plot = plot;
	}

	/**
	 * Plotting the graph
	 * @param values
	 * @param g
	 */
	@Override
	public void graphPlotter(ArrayList values, Graphics g) {
		if( plot != null ){
			plot.graphPlotter(values,g);
		}
	}
}
