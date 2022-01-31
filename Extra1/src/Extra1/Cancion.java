package Extra1;

import java.util.Locale;
import java.util.Scanner;

public class Cancion {
    private String autor;
    private String titulo;
    
    public Cancion(){
    }

    public Cancion(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //no pide pero bueno
    public void cargarCancion(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese titulo de la cancion");
        this.titulo=read.next();
        System.out.println("Ingrese autor de la cancion");
        this.autor=read.next();
    }
    public void mostrarCancion(){
        System.out.printf("El cantante es: %s \n",this.autor);
        System.out.printf("La cancion es: %s \n",this.titulo);
    }
}
