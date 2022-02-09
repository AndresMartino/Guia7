package Ahorcado;

import java.util.Locale;
import java.util.Scanner;

public class Ahorcado {

    private String[] palabra;
    private String[] palabraAux;
    private int cantEncontradas;
    private int cantJugadas;
    private int jugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] palabraAux, int cantEncontradas, int cantJugadas) {
        this.palabra = palabra;
        this.palabraAux = palabraAux;
        this.cantEncontradas = cantEncontradas;
        this.cantJugadas = cantJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabraAux() {
        return palabraAux;
    }

    public void setPalabraAux(String[] palabraAux) {
        this.palabraAux = palabraAux;
    }

    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    public void crearJuego() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la plabra para comenzar el juego: ");
        String frase = read.next();
        int opc;
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }
        do {
            System.out.println("Seleccione dificultad ");
            System.out.println("1-Facil(10 intentos)");
            System.out.println("2-normal(6 intentos)");
            System.out.println("3-dificil(3 intentos)");
            opc = read.nextInt();

        } while (opc != 1 && opc != 2 && opc != 3);
        switch (opc) {
            case 1:
                this.cantJugadas = 10;
                this.jugadas=10;
                break;
            case 2:
                this.cantJugadas = 6;
                this.jugadas=6;
                break;
            case 3:
                this.cantJugadas = 3;
                this.jugadas=3;
                break;

        }
        this.cantEncontradas = 0;
        this.palabra = new String[frase.length()];
        this.palabraAux = new String[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            this.palabra[i] = frase.substring(i, i + 1);
            this.palabraAux[i] = "_";
        }

    }

    public void longitud() {
        System.out.println("La longitud de la palabra es: " + this.palabra.length);
    }

    public boolean buscarLetra(String letra) {
        boolean band = false;
        int cont = 0;
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i].equals(letra)) {
                cont++;
                band = true;
            }
        }
        if (cont == 0) {
            System.out.printf("La letra %s no se encuentra en la palabra \n", letra);
        } else {
            System.out.printf("La letra %s se encuentra en la palabra %d veces \n", letra, cont);
        }
        return band;
    }

    public boolean econtradas(String letra) {
        boolean band = false;
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i].equals(letra)) {
                if (this.palabraAux[i].equals("_")) {
                    this.palabraAux[i] = letra;
                    this.cantEncontradas++;
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
        System.out.printf("Le quedan %d intentos \n", this.cantJugadas);
    }

    public void mostrarAhorcado() {
        for (int i = 0; i < this.palabraAux.length; i++) {
            System.out.print(this.palabraAux[i] + " ");
        }
        System.out.println("");
    }

    public void crearPersona() {
        
        if (this.jugadas == 10) {
            switch (cantJugadas) {
                case 10:
                    System.out.println("|");
                    break;
                case 9:
                    System.out.println("|");
                    System.out.println("0");
                    break;
                case 8:
                    System.out.println("|");
                    System.out.println("O");
                    System.out.println("|");
                    break;
                case 7:
                    System.out.println("|");
                    System.out.println("O");
                    System.out.println("|>");

                    break;
                case 6:
                    System.out.println(" |");
                    System.out.println(" O");
                    System.out.println("<|>");

                    break;
                case 5:
                    System.out.println(" |");
                    System.out.println(" O ");
                    System.out.println("<|>");
                    System.out.println(" | ");
                    break;
                case 4:
                    System.out.println(" |");
                    System.out.println(" O ");
                    System.out.println("<|>");
                    System.out.println(" | ");
                    System.out.println(" |");
                    break;
                case 3:
                    System.out.println(" |");
                    System.out.println(" O ");
                    System.out.println("<|>");
                    System.out.println(" | ");
                    System.out.println(" |");
                    System.out.println(" |");
                    break;
                case 2:
                    System.out.println(" |");
                    System.out.println(" O ");
                    System.out.println("<|>");
                    System.out.println(" | ");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("l");
                    break;
                case 1:
                    System.out.println(" |");
                    System.out.println(" O ");
                    System.out.println("<|>");
                    System.out.println(" | ");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("l-");
                    break;
                case 0:
                    System.out.println(" |");
                    System.out.println(" O ");
                    System.out.println("<|>");
                    System.out.println(" | ");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("l-l");
                    break;
            }
        } else if (this.jugadas == 6) {
            switch (this.cantJugadas) {

                case 6:
                    System.out.println("|");
                    break;
                case 5:
                    System.out.println("|");
                    System.out.println("0");
                    break;
                case 4:
                    System.out.println("|");
                    System.out.println("O");
                    System.out.println("|");
                    break;
                case 3:
                    System.out.println("|");
                    System.out.println("O");
                    System.out.println("|>");

                    break;
                case 2:
                    System.out.println(" |");
                    System.out.println(" O");
                    System.out.println("<|>");

                    break;
                case 1:
                    System.out.println(" |");
                    System.out.println(" O ");
                    System.out.println("<|>");
                    System.out.println(" | ");
                    break;
                case 0:
                    System.out.println(" |");
                    System.out.println(" O ");
                    System.out.println("<|>");
                    System.out.println(" | ");
                    System.out.println("1-1");
                    break;
            }
        } else {
            switch (this.cantJugadas) {
                case 3:
                    System.out.println("|");
                    break;
                case 2:
                    System.out.println("|");
                    System.out.println("0");
                    System.out.println("|");
                    break;
                case 1:
                    System.out.println(" |");
                    System.out.println(" O");
                    System.out.println("<|>");
                    break;
                case 0:
                    System.out.println(" |");
                    System.out.println(" O");
                    System.out.println("<|>");
                    System.out.println("l-l");

                    break;
            }

        }

    }

    public void juego() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String letra;
        crearJuego();
        do {
            System.out.printf("\n \n \n");
            mostrarAhorcado();
            intentos();
            longitud();
            System.out.println("ingrese letra a buscar en la palabra: ");
            letra = read.next();
            econtradas(letra);
            System.out.println("");
            System.out.println("");
            crearPersona();
        } while (this.cantJugadas != 0 && this.cantEncontradas != this.palabra.length);
        if (this.cantEncontradas == this.palabra.length) {
            System.out.println("Palabra encontrad");
            mostrarAhorcado();
        } else {
            System.out.println("palabra no encontrada :( ");
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
 /*    O
    \|/
     |
     |
     /\ */
