package ejercicio4.poo;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(){
    }
    
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    
    public void setBase(double base){
        this.base=base;
    }
    public double getBase(){
        return base;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void crearRectangulo(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese base del rectangulo");
        double base=read.nextDouble();
        while(base<0){
            System.out.println("ERROR! ingrese valor positivo");
            base=read.nextDouble();
        }
        this.base=base;
        System.out.println("Ingrese altura del rectangulo");
        double altura=read.nextDouble();
        while(altura<0){
            System.out.println("ERROR! ingrese valor positivo");
            altura=read.nextDouble();
        }
        this.altura=altura;   
    }
    
    public void superficie(){
        System.out.printf("La superficie del rectangulo es %.2f \n",(this.base*this.altura));
    
    }
    public void perimetro(){
        System.out.printf("EL perimetro del rectangulo es %.2f \n",(this.base+this.altura)*2);
    }
    public void dibujar(){
        System.out.println("El rectangulo es: ");
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
}
