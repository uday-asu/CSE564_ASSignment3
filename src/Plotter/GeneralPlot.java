package Plotter;

import java.awt.*;
import java.util.ArrayList;

public class GeneralPlot extends Plot{
    @Override
    public void graphPlotter(ArrayList values, Graphics g) {
        if( values != null ){
            drawPoints(values, g);
            drawLines(values, g);
        }
    }

    public void drawLines(ArrayList<int[]> values, Graphics graphic){
        for (int i = 0; i < values.size() - 1; i++) {
            graphic.drawLine(values.get(i)[0], values.get(i)[1], values.get(i + 1)[0], values.get(i + 1)[1]);
        }
    }

    public void drawPoints(ArrayList<int[]> values, Graphics graphic){
        for (int i = 0; i < values.size(); i++) {
            graphic.fillOval(values.get(i)[0] - 2, values.get(i)[1] - 2, 4, 4);
        }
    }


}
