package Ejercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int imc1, imc2, imc3, imc4, opc;
        double cantMayores = 0, cantDebajoPesoIdeal = 0, cantPesoIdeal = 0;
        boolean edad1, edad2, edad3, edad4;
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        persona1.crearPersona(1);
        persona2.crearPersona(2);
        persona3.crearPersona(3);
        persona4.crearPersona(4);

        //no hace falta pasar a una variable
        imc1 = persona1.calcularImc();
        imc2 = persona2.calcularImc();
        imc3 = persona3.calcularImc();
        imc4 = persona4.calcularImc();
        //no hace falta
        edad1 = persona1.mayorDeEdad();
        edad2 = persona2.mayorDeEdad();
        edad3 = persona3.mayorDeEdad();
        edad4 = persona4.mayorDeEdad();

        do {
            System.out.println("---------MENU----------");
            System.out.println("1-Ver IMC de la persona 1 y si es mayor de edad");
            System.out.println("2-Ver IMC de la persona 2 y si es mayor de edad");
            System.out.println("3-Ver IMC de la persona 3 y si es mayor de edad");
            System.out.println("4-Ver IMC de la persona 4 y si es mayor de edad");
            System.out.println("5-Salir y ver procentajes totales");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    if (imc1 == -1) {
                        System.out.println("La persona 1 esta por debajo de su peso ideal");
                        cantDebajoPesoIdeal++;
                    } else if (imc1 == 0) {
                        System.out.println("La persona 1 esta en su peso ideal");
                        cantPesoIdeal++;
                    } else {
                        System.out.println("La persona 1 esta con sobrepeso");
                    }
                    if (edad1) {
                        System.out.println(" y es mayor de edad");
                        cantMayores++;
                    } else {
                        System.out.println(" y no es mayor de edad");
                    }
                    break;
                case 2:
                    if (imc2 == -1) {
                        System.out.println("La persona 2 esta por debajo de su peso ideal");
                        cantDebajoPesoIdeal++;
                    } else if (imc2 == 0) {
                        System.out.println("La persona 2 esta con su peso ideal");
                        cantPesoIdeal++;
                    } else {
                        System.out.println("La persona 2 esta con sobrepeso");
                    }
                    if (edad2) {
                        System.out.println(" y es mayor de edad");
                        cantMayores++;
                    } else {
                        System.out.println(" y no es mayor de edad");
                    }
                    break;
                case 3:
                    if (imc3 == -1) {
                        System.out.println("La persona 3 esta por debajo de su peso ideal");
                        cantDebajoPesoIdeal++;
                    } else if (imc3 == 0) {
                        System.out.println("La persona 3 esta con su peso ideal");
                        cantPesoIdeal++;
                    } else {
                        System.out.println("La persona 3 esta con sobrepeso");
                    }
                    if (edad3) {
                        System.out.println(" y es mayor de edad");
                        cantMayores++;
                    } else {
                        System.out.println(" y no es mayor de edad");
                    }
                    break;
                case 4:
                    if (imc4 == -1) {
                        System.out.println("La persona 4 esta por debajo de su peso ideal");
                        cantDebajoPesoIdeal++;
                    } else if (imc4 == 0) {
                        System.out.println("La persona 4 esta con su peso ideal");
                        cantPesoIdeal++;
                    } else {
                        System.out.println("La persona 4 esta con sobrepeso");
                    }
                    if (edad4) {
                        System.out.println(" y es mayor de edad");
                        cantMayores++;
                    } else {
                        System.out.println(" y no es mayor de edad");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opc != 5);

        System.out.printf("El porcentaje de personas con su peso por debajo del ideal es %.0f %%\n", (cantDebajoPesoIdeal / 4) * 100);
        System.out.printf("El porcentaje de personas con su peso ideal es %.0f %%\n", (cantPesoIdeal / 4) * 100);
        System.out.printf("El porcentaje de personas con sobrepeso es %.0f %%\n", ((4 - (cantPesoIdeal + cantDebajoPesoIdeal)) / 4) * 100);
        System.out.printf("El porcentaje de personas mayores de edad es %.0f %%\n", ((cantMayores) / 4) * 100);
        System.out.printf("El porcentaje de personas menores de edad es %.0f %%\n", ((4 - cantMayores) / 4) * 100);

    }

}
