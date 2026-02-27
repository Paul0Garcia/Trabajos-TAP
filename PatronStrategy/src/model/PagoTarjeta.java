package model;

// Estrategia concreta 1
public class PagoTarjeta implements PagoStrategy {

    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con tarjeta");
    }
}
