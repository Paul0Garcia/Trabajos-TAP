package model;

/*
 * Estrategia concreta: SUMA
 * Implementa la interfaz Strategy
 * Contiene únicamente la lógica de la suma
 */
public class SumaStrategy implements OperacionStrategy {

    @Override
    public String ejecutar(double a, double b) {
        double resultado = a + b;
        return "Resultado: " + resultado;
    }
}