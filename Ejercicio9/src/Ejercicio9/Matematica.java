package Ejercicio9;

public class Matematica {

    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor() {
        return Math.max(num1, num2);

    }

    public void calcularPotencia() {
        double a = Math.round(devolverMayor() ) ;
        double b = Math.round(Math.min(num1,num2) ) ;
        System.out.println("LA potencia es "+Math.pow(a, b));
    }

    public void calcularRaiz() {
        System.out.println("LA raiz del menor es "+Math.sqrt(Math.abs(Math.min(num1, num2))));

    }
}
