package sistemaempleadoapp.model;
public class Empleado {

    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;

    public Empleado(String nombre, int horasTrabajadas, double pagoPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    public String getCategoriaSalario() {
        return calcularSalario() > 10000 ? "Empleado con salario alto." : "Empleado con salario regular.";
    }
}
