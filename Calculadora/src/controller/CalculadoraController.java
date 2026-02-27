package controller;

import model.*;
import view.CalculadoraView;

/*
 * El Controller:
 * - Recibe datos de la View
 * - Selecciona la Strategy adecuada
 * - Ejecuta la Strategy
 * - Envía el resultado a la View
 */
public class CalculadoraController {

    private CalculadoraView view;

    // Inyección de dependencias -> se pasa la View al controller
    public CalculadoraController(CalculadoraView view) {
        this.view = view;
    }

    public void iniciar() {

        boolean salir = false;

        while (!salir) {

            view.mostrarMenu();
            int op = view.leerOpcion();

            // Variable de tipo Strategy
            OperacionStrategy estrategia = null;

            // Solo si elige una operación matemática
            if (op >= 1 && op <= 4) {

                // El controller le pide a la View los números
                double a = view.pedirNumero("Ingrese el primer número: ");
                double b = view.pedirNumero("Ingrese el segundo número: ");

                /*
                 * Selección dinámica de la Strategy
                 * Aquí se aplica el patrón Strategy
                 */
                switch (op) {
                    case 1:
                        estrategia = new SumaStrategy();
                        break;
                    case 2:
                        estrategia = new RestaStrategy();
                        break;
                    case 3:
                        estrategia = new MultiplicacionStrategy();
                        break;
                    case 4:
                        estrategia = new DivisionStrategy();
                        break;
                }

                /*
                 * Se ejecuta la estrategia seleccionada
                 * El controller no sabe cómo se hace la operación,
                 * solo llama al método ejecutar()
                 */
                String resultado = estrategia.ejecutar(a, b);

                // El resultado se manda a la View para mostrarlo
                view.mostrarResultado(resultado);

            } else if (op == 5) {
                salir = true;
                view.mostrarResultado("Saliendo...");
            } else {
                view.mostrarResultado("Opción inválida");
            }
        }
    }
}
