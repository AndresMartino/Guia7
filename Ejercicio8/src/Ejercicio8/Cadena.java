package Ejercicio8;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void mostrarVocales(){
        int cont=0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toLowerCase().charAt(i)=='a' || this.frase.toLowerCase().charAt(i)=='e' || this.frase.toLowerCase().charAt(i)=='i' || this.frase.toLowerCase().charAt(i)=='o' || this.frase.toLowerCase().charAt(i)=='u'  ) {
                cont++;
            }
        }
        System.out.printf("\nLa cantidad de vocales que contiene la palabra %s es %d \n",this.frase,cont);
    
    }
    public void invertirFrase(){
        String invertir="";
        for (int i = 0; i < this.longitud; i++) {
            invertir+=this.frase.charAt(this.longitud-1-i);
        }
        System.out.printf("\nLa frase infertida es: %s \n",invertir);
    }
    
    public void vecesRepetido(String letra){
        int cant=0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toLowerCase().substring(i,i+1).equals(letra)){
                cant++;
            }
        }
        System.out.printf("\nLa cantidad de veces que se encuentra el caracter %s en la frase es %d \n",letra,cant);
    }
    public void compararLongitud(String frase){
        if (this.longitud==frase.length()) {
            System.out.printf("\nLa frase { %s } es igual de larga que { %s } \n",this.frase,frase);
        }else if (this.longitud>frase.length()) {
              System.out.printf("\nLa frase { %s }es mas larga que { %s}\n",this.frase,frase);
        }else{
          System.out.printf("\nLa frase { %s } es mas larga que { %s}\n",frase,this.frase);
        }
    
    }
    public void unirFrase(String frase){
        String frasesUnidas;
        frasesUnidas=this.frase.concat(frase);
        System.out.printf("\nLas frase unidas quedan: %s\n",frasesUnidas);
    }
    
    public void reemplazarCaracter(String caracter){
        String reemplazo;
        reemplazo=this.frase.replace("a",caracter);
        System.out.printf("\nLa frase con el caracter %s reemplazado queda: %s\n",caracter,reemplazo);
    }
    public boolean contieneCaracter(String caracter){
       
            return this.frase.contains(caracter);
        
    }
    
}
