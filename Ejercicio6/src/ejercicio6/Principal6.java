package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Principal6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafetera=new Cafetera(1000,0);
        int opc,opc1,tamaño,agregar;
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
                do{
                System.out.println("Ingrese el tamaño de la taza");
                System.out.println("1-Taza de 150cc");
                System.out.println("2-taza de 250cc");
                System.out.println("3-taza de 300cc");
                opc1=read.nextInt();
                switch(opc1){
                    case 1:
                        cafetera.servirTaza(150);
                        break;
                    case 2:
                        cafetera.servirTaza(250);
                        break;
                    case 3:
                        cafetera.servirTaza(300);
                        break;
                    default:
                        System.out.println("Ingrese una opcion correcta");
                }
                }while(!(opc==1 || opc==2 || opc== 3));
                       
                break;
            case 3:
                cafetera.vaciarCafetera();
                break;
            case 4:
                System.out.println("Ingrese cuanto cafe desea agregar a la cafetera");
                cafetera.agregarCafe(read.nextInt());
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
