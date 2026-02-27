package model;

/*
 * Interfaz Strategy
 * Define el método que TODAS las estrategias deben implementar.
 * Cada operación (suma, resta, etc.) será una estrategia diferente.
 *
 * No imprime nada -> MVC estricto
 * Solo devuelve el resultado como texto
 */
public interface OperacionStrategy {

    String ejecutar(double a, double b);
}