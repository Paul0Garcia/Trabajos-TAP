package view;

import java.util.Scanner;

public class PagoView {

    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\nSeleccione método de pago:");
        System.out.println("1. Tarjeta");
        System.out.println("2. Efectivo");
        System.out.println("3. PayPal");
        return scanner.nextInt();
    }

    public double pedirCantidad() {
        System.out.print("Ingrese cantidad a pagar: ");
        return scanner.nextDouble();
    }
}