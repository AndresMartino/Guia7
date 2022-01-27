package Ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena cadena=new Cadena();
        char opc;
        String caracter;
        System.out.println("Ingrese cadena");
        cadena.setFrase(read.next());
        cadena.setLongitud(cadena.getFrase().length());
        do {
            System.out.println("-------------------------MENU-----------------------------");
            System.out.println("|  1-Mostrar Cantidad de vocales en la frase              |");
            System.out.println("|  2-Invertir la frase ingresada                          |");
            System.out.println("|  3-Cantidad de veces que se repite un caracter ingresado|");
            System.out.println("|  4-Comaprar longitud con otra cadena ingresada          |");
            System.out.println("|  5-Unir frase con otra ingresada por teclado            |");
            System.out.println("|  6-Reemplazar letra a con otro caracter ingresado       |");
            System.out.println("|  7-Encontrar caracter especifico dentro de la cadena    |");
            System.out.println("|  S-Salir                                                |");
            System.out.println("|---------------------------------------------------------|");
            opc=read.next().toLowerCase().charAt(0);
            
            switch(opc){
                case '1':
                    cadena.mostrarVocales();
                    break;
                case '2':
                    cadena.invertirFrase();
                    break;
                case '3':
                    System.out.println("Ingrese caracter a buscar");
                    caracter=read.next();
                    while(caracter.length()>1){
                        System.out.println("ERROR! ingrese un solo caracter");
                         caracter=read.next();
                    }
                    cadena.vecesRepetido(caracter);
                    break;
                case '4':
                    System.out.println("Ingrese cadena para comparar longitud");
                    cadena.compararLongitud(read.next());
                    break;
                case '5':
                    System.out.println("Ingrese cadena para unir");
                    cadena.unirFrase(read.next());
                    break;
                case '6':
                    System.out.println("Ingrese caracter para reemplazar por la a");
                     caracter=read.next();
                    while(caracter.length()>1){
                        System.out.println("ERROR! ingrese un solo caracter");
                         caracter=read.next();
                    }
                    cadena.reemplazarCaracter(caracter);
                    break;
                case '7':
                    System.out.println("Ingrese cracater a encontrar");
                     caracter=read.next();
                    while(caracter.length()>1){
                        System.out.println("ERROR! ingrese un solo caracter");
                         caracter=read.next();
                    }
                    boolean encontrado=cadena.contieneCaracter(caracter);
                    if (encontrado) {
                        System.out.println("El caracter se encuentra en la cadena");
                    }else{
                        System.out.println("EL caracter no se encuentra en la cadena");
                    }
                    break;
                case '8':
                    System.out.println("SALIENDOU...");
                    break;
                default:
                    System.out.println("Error! opcion incorrecta");
            }
            
        } while (opc!='s');
        
    }
    
}
