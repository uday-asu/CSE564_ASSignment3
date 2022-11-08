package Plotter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Class which acts as an Observer an Updates values
 * whenever there is a change in Observer class
 */
public class PlotPanel extends JPanel implements Observer {

	private ArrayList output;
	private Plot plot;
	private static int width = 400;
	private static int height = 150;

	/**
	 * Constructs to initialize the Panel
	 * X and Y coordinates
	 * @param x
	 * @param y
	 */
	public PlotPanel(int x, int y){
		setBounds(x, y, width, height);
	}

	/**
	 * Initializes the structure of each Panel
	 * @param p
	 * @return
	 */
	public PlotPanel setPlot( Plot p){
		plot = p;
		return this;
	}

	/**
	 * Updates the Panels connect when Run button is clicked
	 * @param o
	 * @param arg
	 */
	@Override
	public void update(Observable o, Object arg) {
		Source s = (Source) o;
		output = s.getValues();
		repaint();
	}

	/**
	 * Paint component
	 * @param graphic  the <code>Graphics</code> context in which to paint
	 */
	@Override
	public void paint(Graphics graphic) {
		super.paintComponent(graphic);
		if( output != null ){
			plot.graphPlotter(getPlotPoints(), graphic);
		}

	}

	/**
	 * Adjusts the X and Y coordinates to match with the
	 * coordinates with respect to panels size
	 * @return
	 */
	public ArrayList getPlotPoints(){
		ArrayList plots = new ArrayList<>();
		int x = 0;
		for (int i = 0; i < output.size(); i++) {
			int randomNum = (int) output.get(i);
			int y = (int) (height * (1 - ((float) randomNum) / 100));
			int[] point = { x, y };
			plots.add(point);
			x = x + width / 20;
		}
		return plots;
	}

	

}
