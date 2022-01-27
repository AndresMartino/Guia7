package Ejercicio9;

public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }
    
    public Matematica(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
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
    
    public double devolverMayor(){
        if (this.num1>this.num2) {
            return this.num1;
        }else{
            return this.num2;
        }
        
    }
    public void calcularPotencia(){
        if (num1>num2) {
            System.out.printf("LA potencia de %.0f elevado a %.0f es %d \n",num1,num2,(int)Math.pow((int)num1, (int)num2));
        }else{
            
            System.out.printf("LA potencia de %.0f elevado a %.0f es %d \n",num2,num1,(int)Math.pow((int)num2, (int)num1));
            
        }
        }
    public void calcularRaiz(){
        if (num1<num2) {
            System.out.printf("La raiz de %.2f es %.2f \n",num1,Math.sqrt(Math.abs(num1)));
        }else{
            
             System.out.printf("La raiz de %.2f es %.2f \n",num2,Math.sqrt(Math.abs(num2)));
        }
    
    }
}
