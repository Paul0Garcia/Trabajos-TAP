package sistemaempleadoapp.view;
import java.util.Scanner;

public class EmpleadoView {

    private Scanner sc = new Scanner(System.in);

    public String pedirNombre() {
        System.out.println("Nombre del empleado:");
        return sc.nextLine();
    }

    public int pedirHorasTrabajadas() {
        System.out.println("Horas trabajadas:");
        return sc.nextInt();
    }

    public double pedirPagoPorHora() {
        System.out.println("Pago por hora:");
        return sc.nextDouble();
    }

    public void mostrarResultado(String nombre, double salario, String categoria) {
        System.out.println("\nEmpleado: " + nombre);
        System.out.println("Salario calculado: $" + salario);
        System.out.println(categoria);
    }

    public void cerrarScanner() {
        sc.close();
    }
}