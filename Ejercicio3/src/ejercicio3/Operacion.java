package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private double n1;
    private double n2;

    public Operacion() {
    }

    public Operacion(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void crearOperacion() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese primer numero para operar");
        n1 = read.nextDouble();
        System.out.println("Ingrese segundo numero para operar");
        n2 = read.nextDouble();

    }

    public double suma() {
        return (n1 + n2);
    }

    public double resta() {
        return (n1 - n2);
    }

    public double multiplicacion() {
        if(n1==0 || n2==0){
            System.out.println("ERROR! multiplicando por cero");
            return 0;
        }else{
            return (n1*n2);
        }
    }
     public double dividir() {
        if(n1==0 || n2==0){
            System.out.println("ERROR! dividiendo por cero");
            return 0;
        }else{
            return (n1/n2);
        }
    }
        
}
