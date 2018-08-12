package Point;

import java.awt.Color;

public class Point {
    
    /* 
     * Creamos una clase llamada Point para representar los puntos cartesianos
     * tiene los atributos "x" y "y" con fines Obvios y uno mas llamado color
     * el cual nos va a ayudar a reconocer a qué clase pertenece el punto
     */
    private int x;
    private int y;
    private Color color;
    /*
     * Creamos un constructor que recibe dos parámetros enteros, los cuales 
     * son las coordenadas de l punto y las asigna a los respectivos atributos
     */
    public Point(int x, int y){
        this.x=x;
        this.y=y;
        this.color = Color.WHITE;
    }
    /*
     * Contamos con el método setColor que nos ayuda a inicializar los puntos 
     * con un color determinado, así como cambiarlo para reconocer a que clase
     * fue asignado por el algoritmo
     */
    public void setColor(Color c){color=c;}
    
    /*
     * Debido a que los atractores o centroides cambian de posición durante el 
     * proceso del algoritmo, nos apoyamos de los métodos set para modificar las
     * coordenadas de estos puntos
     */
    
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    /*
     * Los siguientes métodos nos ayudan a acceder a los valores de los 
     * atributos
     */
    public int getX(){return x;}
    public int getY(){return y;}
    public Color getColor(){return color;}
}
