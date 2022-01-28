package Ejercicio11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Date fechaActual = new Date();
        System.out.println("Ingrese año: ");
        int anio = read.nextInt();
        System.out.println("Ingrese mes: ");
        int mes = read.nextInt() ;
        System.out.println("Ingrese dia: ");
        int dia = read.nextInt() ;
        Date fecha = new Date(anio, mes, dia);    //cargo la fecha ingresada por el usuraio
        
        System.out.printf("La feha ingrseada es: %d/%d/%d \n",fecha.getYear(),fecha.getMonth(),fecha.getDate());
        System.out.printf("LA fecha de hoy es: %d/%d/%d \n",fechaActual.getYear()+1900,fechaActual.getMonth()+1,fechaActual.getDate());
        
        int diferencia=fechaActual.getYear()+1900-fecha.getYear();
        if (fechaActual.getMonth()+1<=fecha.getMonth()) {
            if (fechaActual.getMonth()+1==fecha.getMonth()) {
                if (fecha.getDate()>fechaActual.getDate()) {
                    diferencia--;
                }
            }else{
                diferencia--;
            }
        }
        System.out.printf("La cantidad de años que hay entre las dos fechas es %d \n",diferencia);
    }

}
