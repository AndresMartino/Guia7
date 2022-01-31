package Extra2;

import java.util.Locale;
import java.util.Scanner;

public class Puntos {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void crearPuntos() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese coordenada X para el primer punto");
        this.x1 = read.nextDouble();
        System.out.println("Ingrese coordenada Y para el primer punto");
        this.y1 = read.nextDouble();
        System.out.println("Ingrese coordenada X para el segundo punto");
        this.x2 = read.nextDouble();
        System.out.println("Ingrese coordenada Y para el segundo punto");
        this.y2 = read.nextDouble();
    }
    public double calcularDistancia(){
        return Math.sqrt((Math.pow((this.x2-this.x1), 2)+(Math.pow((this.y2-this.y1), 2))));
        
    }
}
