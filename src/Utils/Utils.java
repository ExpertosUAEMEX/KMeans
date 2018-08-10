package Utils;

import Point.Point;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.Random;
public class Utils {
    /**
     * Creamos una clase llamada Utils en la cual se realizan las operaciones
     * matemáticas que requiere el algoritmo, el método getEuclideanDistance()
     * devuelve la distancia que hay entre dos puntos
     */
    public static double getEuclideanDistance(Point p1, Point p2){
        int d;
        d= (int)Math.sqrt(Math.pow((p2.getX()-p1.getX()),2)+Math.pow((p2.getY()-p1.getY()), 2));
        return d;
    }
    /**
     * El método calculateCentroid() reasigna las nuevas coordenadas del 
     * centroide de acuerdo con el promedio de las componentes en los ejes x y y
     */
    public static void calculateCentroid(ArrayList<Point> objectsClass,Point attractor){
        int sumX=0;
        int sumY=0;
        for (Point p : objectsClass) {
            sumX+=p.getX();
            sumY+=p.getY();
        }
        attractor.setX(sumX/objectsClass.size());
        attractor.setY(sumY/objectsClass.size());
    }
    /**
     * El método randomPatterns() genera patrones (puntos) aleatorios en todo
     * el plano cartesiano
     */
    public static void randomPatterns(Point[] ar ){
        Random r = new Random(System.currentTimeMillis());
        for(int i=0; i<ar.length;i++){
            ar[i]= new Point(r.nextInt(10),r.nextInt(10));
            ar[i].setColor(Color.BLACK);
            if(i%3!=0){
                ar[i].setX(ar[i].getX()*-1);
                
            }else if(i%2!=0){
                ar[i].setY(ar[i].getY()*-1);
            }
            System.out.println("'"+ar[i].getX()+","+ar[i].getY()+"'");
        }
        
    }
    
}
