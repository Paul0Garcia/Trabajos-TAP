package sistemaempleadoapp.controller;

import sistemaempleadoapp.model.Empleado;
import sistemaempleadoapp.view.EmpleadoView;

public class EmpleadoController {

    private EmpleadoView vista;

    public EmpleadoController(EmpleadoView vista) {
        this.vista = vista;
    }

    public void iniciar() {

        String nombre = vista.pedirNombre();
        int horas = vista.pedirHorasTrabajadas();
        double pagoHora = vista.pedirPagoPorHora();

        Empleado empleado = new Empleado(nombre, horas, pagoHora);

        double salario = empleado.calcularSalario();
        String categoria = empleado.getCategoriaSalario();

        vista.mostrarResultado(empleado.getNombre(), salario, categoria);
        vista.cerrarScanner();
    }
}
