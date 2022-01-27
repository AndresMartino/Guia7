package ejercicio4.poo;

import java.util.Locale;
import java.util.Scanner;

public class Principal4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Rectangulo rec=new Rectangulo();
        rec.crearRectangulo();
        rec.superficie();
        System.out.println();
        rec.perimetro();
        System.out.println();
        rec.dibujar();
    }
    
}
