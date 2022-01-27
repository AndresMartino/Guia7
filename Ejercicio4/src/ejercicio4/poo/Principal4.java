package ejercicio4.poo;

import java.util.Locale;
import java.util.Scanner;

public class Principal4 {

    public static void main(String[] args) {
        Rectangulo rectangulo=new Rectangulo();
        rectangulo.crearRectangulo();
        rectangulo.superficieRectangulo();
        System.out.println();
        rectangulo.perimetroRectangulo();
        System.out.println();
        rectangulo.dibujarRectangulo();
    }
    
}
