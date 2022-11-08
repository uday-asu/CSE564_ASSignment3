package Plotter;

import java.awt.*;
import java.util.ArrayList;

public class BarPlot extends DecoratorPlot{
    public BarPlot(Plot plot) {
        super(plot);
    }

    @Override
    public void graphPlotter(ArrayList values, Graphics graphic){
        super.graphPlotter(values, graphic);
        if( values != null ){
             drawBarGraph(values, graphic);
        }
    }

    public void drawBarGraph(ArrayList<int[]> values, Graphics graphic ){
        for (int i = 0; i < values.size(); i++) {
            graphic.fillRect(values.get(i)[0] - 4, values.get(i)[1], 8, 200 - values.get(i)[1]);
        }
    }

}
