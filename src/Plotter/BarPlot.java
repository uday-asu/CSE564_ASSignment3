package Plotter;

import java.awt.*;
import java.util.ArrayList;

/**
 * Another Implementation of Decorator class
 */
public class BarPlot extends DecoratorPlot{
    public BarPlot(Plot plot) {
        super(plot);
    }

    /**
     * Draw the parent graph and decorate with bar graph
     * @param values
     * @param graphic
     */
    @Override
    public void graphPlotter(ArrayList values, Graphics graphic){
        super.graphPlotter(values, graphic);
        if( values != null ){
             drawBarGraph(values, graphic);
        }
    }

    /**
     * Function to draw bar graph
     * @param values
     * @param graphic
     */
    public void drawBarGraph(ArrayList<int[]> values, Graphics graphic ){
        for (int i = 0; i < values.size(); i++) {
            int x1 = values.get(i)[0] - 4;
            int y1 = values.get(i)[1];
            graphic.fillRect(x1, y1, 6, 150 - y1);
        }
    }

}
