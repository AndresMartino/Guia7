package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private int numerodeCuenta;
    private long DNI;
    private double saldoActual;
    
    public Cuenta(){
    
    }

    public Cuenta(int numerodeCuenta, long DNI, double saldoActual) {
        this.numerodeCuenta = numerodeCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumerodeCuenta() {
        return numerodeCuenta;
    }

    public void setNumerodeCuenta(int numerodeCuenta) {
        this.numerodeCuenta = numerodeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
     
    public void crearCuenta(){
       
        System.out.println("ingrese numero de cuenta");
        numerodeCuenta=read.nextInt();
        System.out.println("ingrese DNI ");
        DNI=read.nextLong();
        System.out.println("ingrese saldo actual");
        saldoActual=read.nextDouble();
    }
    
    public void ingresar(){
        System.out.println("Ingrese dinero a la cuenta:");
        saldoActual+=read.nextDouble();
        
    }
    
    public void retirar(){
        System.out.println("Ingrese dinero a retirar:");
        double r=read.nextDouble();
       if(r>saldoActual){
           saldoActual=0;
       
       }else{
           saldoActual-=r;
       
       }
    
    }
    
    public void extraccionRapida(){
        System.out.println("Ingrese dinero a retirar ");
        double ext=read.nextDouble();
        while(ext>saldoActual*0.2){
            System.out.printf("ERROR saque menos del 20 %% que es %.2f \n",saldoActual*0.2); 
            ext=read.nextDouble();
        }
        saldoActual-=ext;
    }
    public void consultarSaldo(){
        System.out.printf("El saldo actual es %.2f \n",saldoActual);
    
    }
     public void consultarDatos(){
        System.out.printf("El numero de cuenta es %d \n",numerodeCuenta);
         System.out.printf("El DNI es %d \n",DNI);     
  
    }
}
