package Juego;

import java.util.Locale;
import java.util.Scanner;

public class Ahorcado {

    String[] palabra;
    String[] palabraAux;
    int encontradas;
    int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] palabraAux, int cantJugadas) {
        this.palabra = palabra;
        this.palabraAux = palabraAux;
        this.cantJugadas = cantJugadas;
    }

    public String[] getPalabraAux() {
        return palabraAux;
    }

    public void setPalabraAux(String[] palabraAux) {
        this.palabraAux = palabraAux;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    public void crearJuego() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese palabra para generar el juego");
        String palabra1 = read.next();
        this.palabra = new String[palabra1.length()];
        this.palabraAux = new String[palabra1.length()];
        this.encontradas = 0;
        System.out.println("Ingrese cantidad de jugadas maximas permitidas");
        this.cantJugadas = read.nextInt();
        for (int i = 0; i < palabra1.length(); i++) {
            this.palabra[i] = palabra1.substring(i, i + 1);
            this.palabraAux[i] = "_";
        }
        System.out.printf("\n\n\n");
    }

    public boolean buscarLetra(String letra) {
        boolean band = false;
        for (int i = 0; i < this.palabra.length; i++) {

            if (this.palabra[i].equals(letra)) {
                band = true;

            }
        }
        if (band) {
            System.out.println("La letra se encuentra en la palabra");
        } else {
            System.out.println("LA letra no se encuentra en la palabra");
        }
        return band;
    }

    public boolean encontradas(String letra) {
        boolean band = false;
        for (int i = 0; i < this.palabra.length; i++) {

            if (this.palabra[i].equals(letra)) {
                if (this.palabraAux[i].equals("_")) {
                    this.palabraAux[i] = letra;
                    this.encontradas++;
                }

                band = true;

            }

        }
        if (!band) {
            this.cantJugadas--;
        }
        return buscarLetra(letra);
    }

    public void intentos() {
        System.out.println(" ------------------------");
        System.out.println(" Intentos disponibles: " + this.cantJugadas+"|");
    
    }

    public void mostrarAhorcado() {
        
        System.out.print("Palabra a buscar ->   ");
        for (int i = 0; i < this.palabraAux.length; i++) {
           
            System.out.print(this.palabraAux[i] + " ");
        }
     
    }

    public void juego() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String letra;
        do {
            mostrarAhorcado();
            System.out.println("");
            System.out.print("Ingrese letra ->  ");
            letra = read.next();
            
            encontradas(letra);

            intentos();
            System.out.printf("\n\n");
        } while (this.encontradas != this.palabra.length && this.cantJugadas != 0);
        if (this.encontradas != this.palabra.length && this.cantJugadas != 0) {
            System.out.println("Palabra encontrada!");
            mostrarAhorcado();
        }
        else{
            System.out.println("palabra no encontrada :(");
        }
    }
}
/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
