package sistemaempleadoapp;

import sistemaempleadoapp.controller.EmpleadoController;
import sistemaempleadoapp.view.EmpleadoView;

public class SistemaEmpleadoApp {

    public static void main(String[] args) {

        EmpleadoView vista = new EmpleadoView();
        EmpleadoController controlador = new EmpleadoController(vista);

        controlador.iniciar();
    }
}
