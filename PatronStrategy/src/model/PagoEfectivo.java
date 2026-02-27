package model;

// Estrategia concreta 2
public class PagoEfectivo implements PagoStrategy {

    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando $" + cantidad + " en efectivo");
    }
}
