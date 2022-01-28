package Ejercicio12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fechaNacimiento;

    public Persona() {

    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return fechaNacimiento;
    }

    public void setNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void crearPersona() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Date fecha = new Date();
        System.out.println("Ingrese nombre de la persona: ");
        this.nombre = read.next();
        System.out.println("Ingrese año de nacimiento");
        int anio = read.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = read.nextInt();
        System.out.println("Ingrese dia de nacimiento");
        int dia = read.nextInt();
        fecha.setDate(dia); // Seteamos el dia
        fecha.setMonth(mes); // Seteamos el mes
        fecha.setYear(anio); // Seteamos el anio
        this.fechaNacimiento = fecha;
    }

    public void calcularEdad() {
        Date fechaActual = new Date();
        int diferencia = (fechaActual.getYear() + 1900) - fechaNacimiento.getYear();
        if (fechaActual.getMonth() + 1 <= fechaNacimiento.getMonth()) {
            if (fechaActual.getMonth() + 1 == fechaNacimiento.getMonth()) {
                if (fechaNacimiento.getDate() > fechaActual.getDate()) {
                    diferencia--;
                }
            }

        } else {
            diferencia--;
        }
        System.out.printf("%s tiene %d años \n", this.nombre, diferencia);
    }

    public boolean menorQue(int edad) {
        Date fechaActual = new Date();
        int diferencia = (fechaActual.getYear() + 1900) - fechaNacimiento.getYear();
        if (fechaActual.getMonth() + 1 <= fechaNacimiento.getMonth()) {
            if (fechaActual.getMonth() + 1 == fechaNacimiento.getMonth()) {
                if (fechaNacimiento.getDate() > fechaActual.getDate()) {
                    diferencia--;
                }
            }

        } else {
            diferencia--;
        }

        return edad < diferencia;

    }

    public void mostrarPersona() {
        System.out.printf("\nLa persona se llama: %s y nacio el : %d/%d/%d \n", this.nombre, this.fechaNacimiento.getYear(), this.fechaNacimiento.getMonth(), this.fechaNacimiento.getDate());
    }
}
