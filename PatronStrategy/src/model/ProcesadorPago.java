package model;

// Contexto: usa una estrategia de pago
public class ProcesadorPago {

    private PagoStrategy estrategia;

    // Permite cambiar la estrategia en tiempo de ejecución
    public void setEstrategia(PagoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void procesarPago(double cantidad) {
        if (estrategia == null) {
            System.out.println("No se ha seleccionado método de pago");
            return;
        }

        estrategia.pagar(cantidad);
    }
}