package Ejercicio10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array1 = new double[50];
        double[] array2 =new double[20];
        //array1
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (double) Math.round(((Math.random() * 20) + 1) * 100) / 100;  //define la cantidad de decimales haciendo un redondeo, capo parra
        }

        System.out.println("Arreglo 1 cargado con aleatorios:");
        System.out.println(Arrays.toString(array1));                   // <=convierte Este método imprime el arreglo como una cadena
        System.out.println("Arreglo 1 ordenado :");
        Arrays.sort(array1);                                             //ordena el array de menor a mayor              
        System.out.println(Arrays.toString(array1));                    // <=convierte Este método imprime el arreglo como una cadena ordenada
        
        //array2
        array2 = Arrays.copyOfRange(array1, 0, 20);                     //copa los primeros 20 valores del array1 en el array 2
        System.out.println("Arreglo 2 combinado :");
        Arrays.fill(array2, 10, 20, 0.5);                               //llena el array1 con 0.5 con el rango definido
        System.out.println(Arrays.toString(array2));                    //muestro el array2 combinado
    }

}
