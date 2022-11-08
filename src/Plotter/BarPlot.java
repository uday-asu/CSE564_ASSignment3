package Plotter;

import java.awt.*;
import java.util.ArrayList;

public class BarPlot extends DecoratorPlot{
    public BarPlot(Plot plot) {
        super(plot);
    }

    @Override
    public void graphPlotter(ArrayList<ArrayList<Integer>> values, Graphics graphic){
        super.graphPlotter(values, graphic);
        if( values.get(0).size() > 0 ){
             drawBarGraph(values, graphic);
        }
    }

    public void drawBarGraph(ArrayList<ArrayList<Integer>> values, Graphics graphic ){
        for(int i = 0 ; i < values.get(0).size(); i++ ){
            int x1 = values.get(0).get(i);
            int y1 = values.get(1).get(i);
            graphic.fillRect(x1 - 4, y1 , 8, 200 - y1) ;
        }
    }

}
