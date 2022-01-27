package Ejercicio9;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Matematica matematica=new Matematica();
        int opc;
        matematica.setNum1(Math.random()*20);
        matematica.setNum2(Math.random()*20);
        
        do {
            System.out.println("-------MENU-------");
            System.out.println("1-Saber cual es el mayor de los aleatorios");
            System.out.println("2-Calcular potencia del mayor elevado el menor");
            System.out.println("3-Hallar raiz del menor");
            System.out.println("4-SALIR");
            opc=read.nextInt();
            
            switch(opc){
                case 1:
                    System.out.printf("\n El valor mayor es %.2f \n",matematica.devolverMayor());
                    break;
                case 2:
                     matematica.calcularPotencia();
                     break;
                case 3:
                    matematica.calcularRaiz();
                    break;
                case 4:
                    System.out.println("SALIENDO!");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            
            }
        } while (opc!=4);
           
        
    }
    
}
