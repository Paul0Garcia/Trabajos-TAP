package model;

public interface OperacionStrategy {

    // Ahora devuelve un mensaje en lugar de imprimir
    String ejecutar(Usuario usuario, double cantidad);
}