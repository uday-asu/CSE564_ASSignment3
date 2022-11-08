package Plotter;

import java.awt.*;
import java.util.ArrayList;

/**
 * The Most basic class to plot
 */
public class GeneralPlot extends Plot{
    /**
     * Used to draw Lines and points
     * @param values
     * @param g
     */
    @Override
    public void graphPlotter(ArrayList values, Graphics g) {
        if( values != null ){
            drawPoints(values, g);
            drawLines(values, g);
        }
    }

    /**
     * Function to draw lines
     * @param values
     * @param graphic
     */
    public void drawLines(ArrayList<int[]> values, Graphics graphic){
        for (int i = 0; i < values.size() - 1; i++) {
            int x1 = values.get(i)[0];
            int y1 = values.get(i)[1];
            int x2 = values.get(i + 1)[0];
            int y2 = values.get(i + 1)[1];
            graphic.drawLine(x1, y1 , x2, y2);
        }
    }

    /**
     * Function to draw points
     * @param values
     * @param graphic
     */
    public void drawPoints(ArrayList<int[]> values, Graphics graphic){
        for (int i = 0; i < values.size(); i++) {
            int x1 = values.get(i)[0] - 2;
            int y1 = values.get(i)[1] - 2;

            graphic.fillOval(x1, y1, 2, 2);
        }
    }


}
