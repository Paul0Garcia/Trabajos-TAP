package view;

import java.util.Scanner;

public class CajeroView {

    private Scanner scanner = new Scanner(System.in);

    public int pedirNumeroUsuarios() {
        System.out.print("¿Cuántos usuarios desea registrar? ");
        return scanner.nextInt();
    }

    public String pedirPin() {
        System.out.print("Ingrese PIN: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String pedirNombre() {
        System.out.print("Ingrese nombre: ");
        return scanner.nextLine();
    }

    public double pedirSaldoInicial() {
        System.out.print("Ingrese saldo inicial: ");
        return scanner.nextDouble();
    }

    public void mostrarMenu() {
        System.out.println("\n1. Ver saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int leerOpcion() {
        int op = scanner.nextInt();
        return op;
    }

    public double pedirCantidad(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String pedirPinLogin() {
        System.out.print("Ingrese su PIN para iniciar sesión: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
}
