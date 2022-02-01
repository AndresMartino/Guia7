package Extra6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Ahorcado ahorcado=new Ahorcado();
        ahorcado.crearJuego();
        ahorcado.juego();
    }
    
}
