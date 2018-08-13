package Utils;

import Point.Point;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Utils {

    /*
     * Creamos una clase llamada Utils en la cual se realizan las operaciones
     * matemáticas que requiere el algoritmo, el método getEuclideanDistance()
     * devuelve la distancia que hay entre dos puntos
     */
    public static double getEuclideanDistance(Point p1, Point p2) {

        int d;
        /*d= (int)Math.sqrt(Math.pow((p2.getX()-p1.getX()),2)+Math.pow((p2.getY()-p1.getY()), 2));*/
        int x1 = p1.getX() - (600 / 2);
        int x2 = p2.getX();
        int y1 = (600 / 2) - p1.getY();
        int y2 = p2.getY();

        d = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return d;
    }

    /*
     * El método calculateCentroid() reasigna las nuevas coordenadas del 
     * centroide de acuerdo con el promedio de las componentes en los ejes x y y
     */
    public static void calculateCentroid(Point[] objectsClass, Point attractor) {
        int sumX = 0;
        int sumY = 0;
        for (Point p : objectsClass) {
            if (p.getColor().equals(attractor.getColor())) {
                sumX += p.getX() - (300);
                sumY += (300) - p.getY();
            } else {
                break;
            }
        }
        attractor.setX(sumX / objectsClass.length);
        attractor.setY(sumY / objectsClass.length);
    }

    /*
     * El método randomPatterns() genera patrones (puntos) aleatorios en todo
     * el plano cartesiano
     * (int)(rnd.nextDouble() * 6 + 1);
     */
    public static void randomPatterns(Point[] ar) {
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new Point((int) (r.nextDouble() * 590 + 5), (int) (r.nextDouble() * 590 + 5));
            ar[i].setColor(Color.WHITE);
            /*if(i%3!=0){6
                ar[i].setX(ar[i].getX()*-1);
                
            }else if(i%2!=0){
                ar[i].setY(ar[i].getY()*-1);
            }else if(i%7!=0){
                ar[i].setY(ar[i].getY()*-1);
                ar[i].setX(ar[i].getX()*-1);
            }*/
            // System.out.println("'"+ar[i].getX()+","+ar[i].getY()+"'");
        }

    }

}
