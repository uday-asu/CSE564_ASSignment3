package Plotter;

import java.awt.*;
import java.util.ArrayList;

/**
 * This is a class which adds square points to
 * the generic graph
 */
public class PointPlot extends DecoratorPlot{
    public PointPlot(Plot plot) {
        super(plot);
    }

    /**
     * Draws the Generic graph and later on adds square points to the graph
     * @param values
     * @param graphic
     */
    @Override
    public void graphPlotter(ArrayList values, Graphics graphic){
        super.graphPlotter(values, graphic);
        if( values != null ){
            drawPoints(values, graphic);
        }
    }

    /**
     * To add square points
     * @param values
     * @param graphic
     */

    public void drawPoints(ArrayList<int[] > values, Graphics graphic ){
        for (int i = 0; i < values.size(); i++) {
            int x1 = values.get(i)[0] - 4;
            int y1 = values.get(i)[1] - 4;
            graphic.fillRect(x1, y1, 6, 6);
        }
    }
}
