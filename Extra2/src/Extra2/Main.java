package Extra2;

public class Main {

    public static void main(String[] args) {
        Puntos puntos=new Puntos();
        puntos.crearPuntos();
        System.out.printf("La distancia entre los puntos es %.2f \n",puntos.calcularDistancia());
    }
    
}
