package KMeans;

import Point.Point;
import Utils.Utils;
import java.util.Arrays;

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
       /* double[][] distances = new double[centroid.length][aleatoryPoints.length];
        for (int i = 0; i < centroid.length; i++) {
            System.out.println(centroid[i].getX() + "," + centroid[i].getY());
            for (int j = 0; j < aleatoryPoints.length; j++) {
                distances[i][j] = Utils.getEuclideanDistance(aleatoryPoints[j], centroid[i]);
                System.out.print(distances[i][j] + " ");
            }
            System.out.println("");
        }
        double[] pC = new double[centroid.length];
        for (int j = 0; j < aleatoryPoints.length; j++) {
            for (int i = 0; i < centroid.length; i++) {
                pC[i] = distances[i][j];
                aleatoryPoints[j].setColor(centroid[menor(pC)].getColor());

            }
        }*/
        
        for(int i=0;i<aleatoryPoints.length;i++){
            int[] dst= new int[centroid.length];
            int index=0;
            for(int j=0;j<centroid.length;j++){
                dst[j]=(int)Utils.getEuclideanDistance(aleatoryPoints[i], centroid[j]);
            }
            aleatoryPoints[i].setColor(centroid[find(menor(dst),dst)].getColor());
        }
        

    }

    public int menor(int [] num){
        int iMenor = 0;
        for(int i=1;i<num.length;i++){
            if(num[i]<num[iMenor])
                iMenor = i;
        }
        return num[iMenor];
    }
    private int find(int x, int[] ar){    
        for (int i = 0; i <ar.length; i++) {
            if (ar[i]==x) {
             return i;
            }
        }
        return -1;
    }
}
