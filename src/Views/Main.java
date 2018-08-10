package Views;

import KMeans.KMeans;
import Point.Point;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author cachubis
 */
public class Main extends JFrame {
    ChartPanel cp;
    public Main(){
        setTitle("K-Means");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.LIGHT_GRAY);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        Point[] cent = new Point[2];
        cent[0] = new Point(7,5);
        cent[0].setColor(Color.red);
        cent[1] = new Point(-8,-1);
        cent[1].setColor(Color.CYAN);
        KMeans km = new KMeans();
        km.configure(20, cent);
        km.run();
        cp = new ChartPanel(km.getCentroid(),km.getAleatoryPoints());
        add(cp);
    }
    public static void main(String[] args) {
       Main m = new Main();
    }
    
}
