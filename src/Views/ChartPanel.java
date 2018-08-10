package Views;

import Point.Point;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class ChartPanel extends JPanel {
    Point[] centroids;
    Point[] points;
    public ChartPanel(Point[] centr, Point[] points){
        
        
        this.centroids=centr;
        this.points=points;
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(getWidth()/2, 0, 2, getHeight());
        g.fillRect(0, getHeight()/2,getWidth() , 2);
      
        for (Point centroid : centroids) {
            g.setColor(centroid.getColor());
            g.fillOval((int) ((getWidth()/2) + centroid.getX()), (int) ((getHeight()/2) + centroid.getY()), 1, 1);
        }
        /*for(int i=0;i<points.length;i++){
        g.setColor(points[i].getColor());
        g.fillOval((int)((getWidth()/2)+points[i].getX()),(int)((getHeight()/2)+points[i].getY()), 1, 1);
        }*/
        
    }
}
