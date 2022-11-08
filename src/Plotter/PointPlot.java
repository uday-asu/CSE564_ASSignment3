package Plotter;

import java.awt.*;
import java.util.ArrayList;

public class PointPlot extends DecoratorPlot{
    public PointPlot(Plot plot) {
        super(plot);
    }

    @Override
    public void graphPlotter(ArrayList values, Graphics graphic){
        super.graphPlotter(values, graphic);
        if( values != null ){
            drawPoints(values, graphic);
        }
    }

    public void drawPoints(ArrayList<int[] > values, Graphics graphic ){
        for (int i = 0; i < values.size(); i++) {
            graphic.fillRect(values.get(i)[0] - 4, values.get(i)[1] - 4, 8, 8);
        }
    }
}
