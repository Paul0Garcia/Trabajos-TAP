package model;

/*
 * Estrategia concreta: DIVISIÓN
 * Aquí agregamos validación para evitar división entre 0
 */
public class DivisionStrategy implements OperacionStrategy {

    @Override
    public String ejecutar(double a, double b) {

        if (b == 0) {
            return "Error: no se puede dividir entre 0";
        }

        double resultado = a / b;
        return "Resultado: " + resultado;
    }
}
