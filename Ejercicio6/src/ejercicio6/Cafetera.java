package ejercicio6;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    
    
    public Cafetera(){
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.cantidadActual=cantidadActual;
        this.capacidadMaxima=capacidadMaxima;       
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
        System.out.println("Cafetera LLenada");
    }
     
    public void servirTaza(int tamaño){
        if(cantidadActual==0){
            System.out.println("No hay cafe disponible");
        }
        else if(cantidadActual<=tamaño){
            tamaño=cantidadActual;
            cantidadActual=0;
            System.out.printf("La taza no se lleno por completo, solo se lleno con %d de cafe \n",tamaño);      
        }else {
            System.out.println("La taza se lleno completamente");
            cantidadActual-=tamaño;
        }
        
    }
    public void vaciarCafetera(){
        cantidadActual=0;
        System.out.println("Cafetera vaciada!");
    }
    
    public void agregarCafe(int cafe){
        if ((cafe+cantidadActual)>capacidadMaxima) {
            cantidadActual=capacidadMaxima;
            System.out.println("sobro "+((cafe+cantidadActual)-capacidadMaxima)+" de cafe" );
        }else{
            System.out.println("Cafe agregado!");
            cantidadActual+=cafe;
        }
    
    }
}
