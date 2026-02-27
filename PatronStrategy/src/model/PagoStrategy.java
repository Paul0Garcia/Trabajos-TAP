package model;

// Interfaz Strategy
// Define el método que todas las estrategias deben implementar
public interface PagoStrategy {
    void pagar(double cantidad);
}
