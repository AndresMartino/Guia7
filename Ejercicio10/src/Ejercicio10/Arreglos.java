package Ejercicio10;
import java.util.Arrays;
public class Arreglos {
    private double[] V1=new double[50];
    private double[] V2=new double[20];

    public Arreglos() {
    }

    public Arreglos(double[] V1, double[] V2) {
        this.V1 = V1;
        this.V2 = V2;
    }

    public double[] getV1() {
        return V1;
    }

    public void setV1(double[] V1) {
        this.V1 = V1;
    }

    public double[] getV2() {
        return V2;
    }

    public void setV2(double[] V2) {
        this.V2 = V2;
    }
   
    public void llenarV1(){
        for (int i = 0; i < this.V1.length; i++) {
            this.V1[i]=(int)(Math.random()*20)+1;        
        }
        //mostrando
        System.out.println("Mostrando V1 caragdo aleatoriamente");
        for (int i = 0; i < this.V1.length; i++) {
            System.out.printf("[%.1f] ",V1[i]);       
        }
        System.out.println();
    
    }
    public void ordenarV1(){
        Arrays.sort(V1);
        /*for (int i = 0; i < V1.length; i++) {
            System.out.print(V1[i]+" ");
        }*/
    }
    public void llenarV2(){
        for (int i = 0; i < this.V2.length; i++) {
            if (i<10) {
                 this.V2[i]=this.V1[i];
            }else{
                this.V2[i]=0.5;
            
            }
           
        }
    
    }
    public void mostrandoVectores(){
        System.out.println("Mostrando vector 1 ordenado");
        for (int i = 0; i <this.V1.length; i++) {
            System.out.printf("[%.1f] ",this.V1[i]);
            
        }
        System.out.println();
        System.out.println("Mostrando v2 combinado");
        for (int i = 0; i < this.V2.length; i++) {
            System.out.printf("[%.1f] ",this.V2[i]);
            
        }
        System.out.println();
        }
    }

