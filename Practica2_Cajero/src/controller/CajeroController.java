package controller;

import model.DepositarStrategy;
import model.OperacionStrategy;
import model.Usuario;
import model.RepositorioUsuarios;
import model.RetirarStrategy;
import model.VerSaldoStrategy;
import view.CajeroView;

public class CajeroController {

    private RepositorioUsuarios<Usuario> repositorio;
    private CajeroView view;
    private Usuario usuarioActual;

    public CajeroController(RepositorioUsuarios<Usuario> repo, CajeroView view) {
        this.repositorio = repo;
        this.view = view;
    }

    public void iniciar() {
        registrarUsuarios();

        if (repositorio.estaVacio()) {
            view.mostrarMensaje("No hay usuarios registrados.");
            return;
        }

        autenticar();

        if (usuarioActual == null) {
            view.mostrarMensaje("Demasiados intentos fallidos.");
            return;
        }

        view.mostrarMensaje("Bienvenido " + usuarioActual.getNombre());
        menu();
    }

    private void registrarUsuarios() {
        int cantidad = view.pedirNumeroUsuarios();

        for (int i = 0; i < cantidad; i++) {
            view.mostrarMensaje("\nRegistro de usuario " + (i + 1));

            String pin = view.pedirPin();
            String nombre = view.pedirNombre();
            double saldo = view.pedirSaldoInicial();

            repositorio.agregar(new Usuario(pin, nombre, saldo));
        }
    }

    private void autenticar() {
        int intentos = 0;

        while (intentos < 3 && usuarioActual == null) {
            String pin = view.pedirPinLogin();

            for (Usuario u : repositorio.obtenerTodos()) {
                if (u.getPin().equals(pin)) {
                    usuarioActual = u;
                    return;
                }
            }

            view.mostrarMensaje("PIN incorrecto");
            intentos++;
        }
    }

    private void menu() {

        boolean salir = false;

        while (!salir) {

            view.mostrarMenu();
            int op = view.leerOpcion();

            OperacionStrategy estrategia = null;
            double cantidad = 0;

            switch (op) {

                case 1:
                    estrategia = new VerSaldoStrategy();
                    break;

                case 2:
                    cantidad = view.pedirCantidad("Cantidad a retirar: ");
                    estrategia = new RetirarStrategy();
                    break;

                case 3:
                    cantidad = view.pedirCantidad("Cantidad a depositar: ");
                    estrategia = new DepositarStrategy();
                    break;

                case 4:
                    salir = true;
                    view.mostrarMensaje("Gracias por usar el cajero");
                    break;

                default:
                    view.mostrarMensaje("Opción inválida");
            }

            if (estrategia != null) {
                String resultado = estrategia.ejecutar(usuarioActual, cantidad);
                view.mostrarMensaje(resultado);
            }
        }
    }
}