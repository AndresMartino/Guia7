package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Principal5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();
        int opc;
        do {
            System.out.println("-----------MENU--------------");
            System.out.println("1-Ingresar dinero");
            System.out.println("2-Retirar dinero");
            System.out.println("3-Extraccion rapida");
            System.out.println("4-Consultar saldo");
            System.out.println("5-Consultar datos de la cuenta");
            System.out.println("6-salir");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    cuenta.ingresar();
                    break;
                case 2:
                    cuenta.retirar();
                    break;
                case 3:
                    cuenta.extraccionRapida();
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");

            }
        } while (opc!=6);

    }

}
