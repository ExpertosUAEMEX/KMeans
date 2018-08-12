package Views;

import KMeans.KMeans;
import Point.Point;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author cachubis
 */
public class Main extends JFrame {
    /*
     * Creamos la clase Main, que extiende de la clase JFrame, es decir,
     * se comporta como un frame(Ventana), la finalidad de este frame es el de
     * unir la parte lógica del algoritmo con la parte gráfica. 
     */
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
        cent[0] = new Point(-30,50);
        cent[0].setColor(Color.RED);
        cent[1] = new Point(100,50);
        cent[1].setColor(Color.BLUE);
        KMeans km = new KMeans();
        km.configure(600, cent);
        try {
            km.run();
            cp = new ChartPanel(km.getCentroid(),km.getAleatoryPoints());
            add(cp);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "Asegusese de configurar la clase KMeans","Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
    }
    public static void main(String[] args) {
       Main m = new Main();
    }
    
}
