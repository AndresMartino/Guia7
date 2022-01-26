package ejercicio3;

public class Principal3 {

    public static void main(String[] args) {
        Operacion op=new Operacion();
        op.crearOperacion();
        System.out.printf("El resultado de la suma de %.2f + %.2f es %.2f \n",op.getN1(),op.getN2(),op.suma());
        System.out.printf("El resultado de la resta de %.2f - %.2f es %.2f \n",op.getN1(),op.getN2(),op.resta());
        System.out.printf("El resultado de la multiplicacion de %.2f * %.2f es %.2f \n",op.getN1(),op.getN2(),op.multiplicacion());
        System.out.printf("El resultado de la division de %.2f / %.2f es %.2f \n",op.getN1(),op.getN2(),op.dividir());
    }
    
}
