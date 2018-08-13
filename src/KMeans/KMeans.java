package KMeans;

import Point.Point;
import Utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class KMeans {

    /*
     * La clase KMeans implementa el algoritmo y tiene como atributos dos 
     * arreglos de puntos, en los cuales almacenaremos los puntos aleatorios
     * y los atractores(Cerntroides) 
     */
    private Point[] aleatoryPoints;
    private Point[] centroid;

    /*
     * Métodos para acceder a los atributos
     */
    public Point[] getAleatoryPoints() {
        return aleatoryPoints;
    }

    public Point[] getCentroid() {
        return centroid;
    }

    /*
     * El método configure(), recibe como parametros el número de 
     * patrones(puntos); y un arreglo de puntos el cual contiene los atractores
     * Genera los puntos aleatorios haciendo uso de nuestra clase Utils
     */
    public void configure(int numOfPatterns, Point[] centroids) {
        aleatoryPoints = new Point[numOfPatterns];
        centroid = centroids;
        Utils.randomPatterns(aleatoryPoints);
    }

    /*
     * El método run() calcula y llena una matriz con las distancias de todos
     * los patrones respecto a cada atractor:
     * {dP1C1,dP2C1,dP3C1,.........dPnC1}
     * {dP1C2,dP2C2,dP3C2,.........dPnC2}
     * {..               .....        ..}
     * {dP1Cn,dP2Cn,dP3Cn,.........dPnCn}
     */
    public void run() throws NullPointerException {
        ArrayList<Integer> dist;
        ArrayList<Integer> sort;
        int x = 0;
        int y = 0;
        //while (x == centroid[0].getX() && y == centroid[0].getY()) {
            for (Point p : aleatoryPoints) {
                dist = new ArrayList<>();
                sort = new ArrayList<>();
                for (int i = 0; i < centroid.length; i++) {
                    dist.add((int) Utils.getEuclideanDistance(p, centroid[i]));
                    sort = (ArrayList<Integer>) dist.clone();
                }
                Collections.sort(sort);
                p.setColor(centroid[dist.indexOf(sort.get(0))].getColor());
            }
            for (Point c : centroid) {
                Utils.calculateCentroid(aleatoryPoints, c);
            }
          //  x=centroid[0].getX();
          //  y=centroid[0].getY();
        //}
    }
}
