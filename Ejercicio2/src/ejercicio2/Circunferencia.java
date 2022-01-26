package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {
    private double radio;
    
    
    public Circunferencia(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio de la circunferencia");
        radio=read.nextDouble();
    }
    
    public void area(){
        System.out.printf("El area del circulo es : %.2f \n",(Math.PI*Math.pow(radio, 2))); // 3.14156*(radio*radio)
        
    }
    
    public void perimetro(){
        System.out.printf("El perimetro del circulo es : %.1f \n",((2*Math.PI)*radio)); // 3.14156*(radio*radio)
        
    }
    
}
