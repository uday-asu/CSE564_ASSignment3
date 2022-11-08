package Plotter;

import java.awt.*;
import java.util.ArrayList;

public class GeneralPlot extends Plot{
    @Override
    public void graphPlotter(ArrayList<ArrayList<Integer>> values, Graphics g) {
        if( values != null ){
            drawPoints(values, g);
            drawLines(values, g);
        }
    }

    public void drawLines(ArrayList<ArrayList<Integer>> values, Graphics graphic){
        for(int i = 0 ; i < values.get(0).size() - 1; i++ ){
            int x1 = values.get(0).get(i);
            int y1 = values.get(1).get(i);
            int x2 = values.get(0).get(i + 1);
            int y2 = values.get(1).get(i + 1);
            graphic.drawLine(x1, y1, x2, y2);
        }
    }

    public void drawPoints(ArrayList<ArrayList<Integer>> values, Graphics graphic){
        for(int i = 0 ; i < values.get(0).size(); i++ ){
            int x1 = values.get(0).get(i);
            int y1 = values.get(1).get(i);
            graphic.drawLine(x1 - 2, y1 - 2, 2, 2);
        }
    }


}
