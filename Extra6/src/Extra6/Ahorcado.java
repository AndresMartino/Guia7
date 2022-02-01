package Extra6;

import java.util.Locale;
import java.util.Scanner;

public class Ahorcado {

    private String[] palabra;
    private int cantLetrasEncontradas;
    private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetrasEncontradas, int cantJugadas) {
        this.palabra = palabra;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadas = cantJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetras(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    public void crearJuego() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese palabra para crear el juego");
        String frase = read.next();
        this.palabra=new String[frase.length()];
        System.out.println("Ingrese cantidad de jugadas maximas");
        this.cantJugadas = read.nextInt();
        for (int i = 0; i < frase.length(); i++) {
            this.palabra[i] = frase.substring(i, i+1);
        }
        this.cantLetrasEncontradas = 0;
    }

    public void longitud() {
        System.out.println("La longitud de la palabra a buscar es " + this.palabra.length);
    }

    public boolean buscar(String letra) {
        boolean b = false;
        for (int i = 0; i < this.palabra.length; i++) {
            if (palabra[i].equals(letra)) {
                this.cantLetrasEncontradas++;
                b=true;
            }
        }
        if (b) {
            System.out.println("LA letra fue encontrada");
        } else {
            System.out.println("La letra no fue encotnrada");
            this.cantJugadas--;
        }
        return b;
    }

    public boolean encontradas(String letra) {
        System.out.println("Letras encontradas: " + this.cantLetrasEncontradas);
        System.out.println("Letras que restan encontrar " + (this.palabra.length-this.cantLetrasEncontradas));
        
        return buscar(letra);
    }
    public void intentos(){
        System.out.println("La cantidad de intentos que le restan es: "+this.cantJugadas);
    
    }
    public void juego(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String letra;
       do{
         System.out.println("");
        System.out.println("Ingrese letra a buscar");
        letra=read.next();
        longitud();
        encontradas(letra);
        intentos();
       }while(this.cantLetrasEncontradas!=this.palabra.length && this.cantJugadas!=0);
        if (this.cantLetrasEncontradas==this.palabra.length || this.cantJugadas==0) {
            System.out.println("Palabra encontrada");
        }else{
            System.out.println(" la palabra no fue encontrada");
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
