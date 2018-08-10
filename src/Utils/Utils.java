package Utils;

import Point.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.Random;
public class Utils {
    
    public static double getEuclideanDistance(Point p1, Point p2){
        double d;
        d= Math.sqrt(Math.pow((p2.getX()-p1.getX()),2)+Math.pow((p2.getY()-p1.getY()), 2));
        return d;
    }
    
    public static void calculateCentroid(ArrayList<Point> objectsClass,Point attractor){
        double sumX=0;
        double sumY=0;
        for (Point p : objectsClass) {
            sumX+=p.getX();
            sumY+=p.getY();
        }
        attractor.setX(sumX/objectsClass.size());
        attractor.setY(sumY/objectsClass.size());
    }
    public static void randomPatterns(Point[] ar ){
        Random r = new Random(System.currentTimeMillis());
        for(int i=0; i<ar.length;i++){
            ar[i]= new Point(r.nextInt(10),r.nextInt(10));
            if(i%3!=0){
                ar[i].setX(ar[i].getX()*-1);
                
            }else if(i%2!=0){
                ar[i].setY(ar[i].getY()*-1);
            }
            System.out.println("'"+ar[i].getX()+","+ar[i].getY()+"'");
        }
        
    }
    
}
