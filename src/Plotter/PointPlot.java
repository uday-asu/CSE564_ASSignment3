package Plotter;

import java.awt.*;
import java.util.ArrayList;

public class PointPlot extends DecoratorPlot{
    public PointPlot(Plot plot) {
        super(plot);
    }

    @Override
    public void graphPlotter(ArrayList<ArrayList<Integer>> values, Graphics graphic){
        super.graphPlotter(values, graphic);
        if( values.get(0).size() > 0 ){
            drawPoints(values, graphic);
        }
    }

    public void drawPoints(ArrayList<ArrayList<Integer>> values, Graphics graphic ){
        for(int i = 0 ; i < values.get(0).size(); i++ ){
            int x1 = values.get(0).get(i);
            int y1 = values.get(1).get(i);
            graphic.fillRect(x1 - 4, y1 - 4, 8, 8) ;
        }
    }
}
