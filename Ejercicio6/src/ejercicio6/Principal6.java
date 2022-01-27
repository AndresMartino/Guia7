package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Principal6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafetera=new Cafetera(3,0);
        int opc,tamaño,agregar;
        do{
        System.out.println("--------------MENU------------");
        System.out.println("1. Llenar Cafetera");
        System.out.println("2. Servir Taza");
        System.out.println("3. Vaciar Cafetera");
        System.out.println("4. Agregar Cafe");
        System.out.println("5.Salir");
        opc=read.nextInt();
        switch(opc){
            case 1:
                cafetera.llenarCafetera();
                break;
            case 2:
                System.out.println("Ingrese el tamaño de la taza");
                tamaño=read.nextInt();
                cafetera.servirTaza(tamaño);
                break;
            case 3:
                cafetera.vaciarCafetera();
                break;
            case 4:
                System.out.println("Ingrese cuanto cafe desea agregar a la cafetera");
                agregar=read.nextInt();
                break;
            case 5:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opcion incorrecta!");
        }
        }while(opc!=5);
    }
    
}
