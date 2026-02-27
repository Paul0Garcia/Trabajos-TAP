package view;

import java.util.Scanner;

/*
 * La View se encarga de:
 * - Mostrar el menú
 * - Pedir datos al usuario
 * - Mostrar resultados
 *
 * NO tiene lógica de negocio
 */
public class CalculadoraView {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("\n=== CALCULADORA ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int leerOpcion() {
        return scanner.nextInt();
    }

    public double pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public void mostrarResultado(String mensaje) {
        System.out.println(mensaje);
    }
}