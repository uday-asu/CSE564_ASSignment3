package Plotter;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;


public class PlotPanel extends JPanel implements Observer {

	private ArrayList output;
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
		repaint();
	}
	@Override
	public void paint(Graphics graphic) {
		super.paintComponent(graphic);
		if( output != null ){
			plot.graphPlotter(getPlotPoints(output), graphic);
		}

	}
	public ArrayList getPlotPoints(ArrayList<ArrayList<Integer>> values){
		ArrayList plots = new ArrayList<>();
		int x = 0;
		for (int i = 0; i < output.size(); i++) {
			int num = (int) output.get(i);
			int y = (int) (height * (1 - ((float) num) / 100));
			int[] point = { x, y };
			plots.add(point);
			x = x + width / 20;
		}
		return plots;
	}

	

}
