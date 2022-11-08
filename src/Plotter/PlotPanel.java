package Plotter;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class PlotPanel extends JPanel implements Observer {

	private ArrayList< ArrayList<Integer> > output;
	private Plot plot;
	private static int width = 400;
	private static int height = 150;


	public PlotPanel(int x, int y){
		setBounds(x, y, width, height);
	}

	public PlotPanel setPlot( Plot p){
		plot = p;
		return this;
	}

	@Override
	public void update(Observable o, Object arg) {
		Source s = (Source) o;
		output = s.getValues();
		System.out.println();

	}
	public void paintComponent(Graphics graphic) {
		super.paintComponent(graphic);
		if( output.get(0).size() > 0 ){
			plot.graphPlotter(getPlotPoints(output), graphic);
		}

	}
	public ArrayList<ArrayList<Integer>> getPlotPoints(ArrayList<ArrayList<Integer>> values){
		ArrayList<ArrayList<Integer> > plots = new ArrayList<>();
		for(int i = 0 ; i < 2 ; i++ ){
			plots.add(new ArrayList<Integer>());
		}
		int x = 0;
		for(int i = 0 ; i < values.get(0).size(); i++ ){
			int numx = values.get(0).get(i);
			int numy = values.get(1).get(i);

			int y = (int) (height * (1 - ((float) numy) / 100));
			plots.get(0).add(x);
			plots.get(1).add(y);
			x = x + width / 20;


		}
		return plots;
	}

	

}
