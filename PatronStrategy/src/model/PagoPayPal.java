package model;

// Estrategia concreta 3
public class PagoPayPal implements PagoStrategy {

    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con PayPal");
    }
}
