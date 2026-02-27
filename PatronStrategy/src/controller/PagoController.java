package controller;

import model.*;
import view.PagoView;

public class PagoController {

    private PagoView view;
    private ProcesadorPago procesador;

    public PagoController(PagoView view) {
        this.view = view;
        this.procesador = new ProcesadorPago();
    }

    public void iniciar() {

        int opcion = view.mostrarMenu();
        double cantidad = view.pedirCantidad();

        // Selección de estrategia
        switch (opcion) {
            case 1:
                procesador.setEstrategia(new PagoTarjeta());
                break;
            case 2:
                procesador.setEstrategia(new PagoEfectivo());
                break;
            case 3:
                procesador.setEstrategia(new PagoPayPal());
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        // Se ejecuta la estrategia seleccionada
        procesador.procesarPago(cantidad);
    }
}
