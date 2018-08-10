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
    /**
     * Creamos la clase ChartPanel que extiende de la clase JPanel, es decir 
     * esta clase se comporta como un JPanel, la finalidad de este panel es la
     * de graficar el plano cartesiano y los puntos generados por el algoritmo,
     * así como los atractores, para poder visualizar el comportamiento de este
     * algoritmo.
     */
    Point[] centroids;
    Point[] points;
    /**
     * Tenemos un constructor en el cual recibe como parámetros el arreglo de 
     * puntos aleatorios generados, así como el arreglo de los atractores
     */
    public ChartPanel(Point[] centr, Point[] points){
        
        
        this.centroids=centr;
        this.points=points;
    }
    /**
     * Sobreescribimos el método paint el cual se encarga de pintar el plano
     * cartesiano, así como los puntos y centroides que han sido tratados en la
     * clase del algoritmos
     */
    @Override
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(getWidth()/2, 0, 2, getHeight());
        g.fillRect(0, getHeight()/2,getWidth() , 2);
      
        for (Point centroid : centroids) {
            g.setColor(centroid.getColor());
            g.fillOval((int) ((getWidth()/2) - centroid.getX()), (int) ((getHeight()/2) - centroid.getY()), 5, 5);
        }
        for(int i=0;i<points.length;i++){
            g.setColor(points[i].getColor());
            g.fillOval((int)((getWidth()/2)-points[i].getX()),(int)((getHeight()/2)-points[i].getY()), 5, 5);
        }
        
    }
}
