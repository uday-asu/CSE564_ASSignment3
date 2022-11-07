package Plotter;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Observable;
import java.util.Observer;

public class PlotPanel extends JPanel implements Observer {

	int[] output;
	@Override
	public void update(Observable o, Object arg) {
		Source s = (Source) o;
		output = s.getValues();
		for(int val : output){
			System.out.print(val + " ");
		}
		System.out.println();

	}
	public void paintComponent(Graphics graphic){
		Graphics2D pointDrawer = (Graphics2D) graphic.create();
		Graphics2D lineDrawer = (Graphics2D) graphic.create();

		pointDrawer.setStroke(new BasicStroke(7));
		lineDrawer.setStroke(new BasicStroke(1));

//		for(int val : output){
			pointDrawer.draw(new Line2D.Double(100, 200, 200, 400) );
//		}
	}

	

}
