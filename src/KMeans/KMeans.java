package KMeans;

import Point.Point;
import Utils.Utils;
import java.awt.Color;
import java.util.Arrays;

public class KMeans {
    private Point[] aleatoryPoints;
    private Point[] centroid;
    
    public void configure(int numOfPatterns, Point[] centroids){
        aleatoryPoints = new Point[numOfPatterns];
        centroid = centroids;
        Utils.randomPatterns(aleatoryPoints);
    }
    public void run(){
        double[][] distances= new double[centroid.length][aleatoryPoints.length];
        for(int i=0;i<centroid.length;i++){
            System.out.println(centroid[i].getX()+","+centroid[i].getY());
            for (int j=0; j<aleatoryPoints.length;j++) {
                distances[i][j]=Utils.getEuclideanDistance(aleatoryPoints[j], centroid[i]);
                System.out.print(distances[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args) {
        Point[] cent = new Point[2];
        cent[0] = new Point(10,9);
        cent[0].setColor(Color.red);
        cent[1] = new Point(-8,-13);
        cent[1].setColor(Color.CYAN);
        KMeans km = new KMeans();
        km.configure(10, cent);
        km.run();
    }
}
