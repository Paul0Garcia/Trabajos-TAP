package model;

/*
 * Estrategia concreta: RESTA
 */
public class RestaStrategy implements OperacionStrategy {

    @Override
    public String ejecutar(double a, double b) {
        double resultado = a - b;
        return "Resultado: " + resultado;
    }
}
