package model;

/*
 * Estrategia concreta: MULTIPLICACIÓN
 */
public class MultiplicacionStrategy implements OperacionStrategy {

    @Override
    public String ejecutar(double a, double b) {
        double resultado = a * b;
        return "Resultado: " + resultado;
    }
}
