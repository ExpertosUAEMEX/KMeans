package Point;

import java.awt.Color;

public class Point {
    private double x;
    private double y;
    private Color color;
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void setColor(Color c){color=c;}
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}
    public double getX(){return x;}
    public double getY(){return y;}
    public Color getColor(){return color;}
}
