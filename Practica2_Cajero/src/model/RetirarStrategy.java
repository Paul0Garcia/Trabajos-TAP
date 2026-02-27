package model;

public class RetirarStrategy implements OperacionStrategy {

    @Override
    public String ejecutar(Usuario usuario, double cantidad) {

        if (usuario.getCuenta().retirar(cantidad)) {
            return "Retiro exitoso";
        } else {
            return "Fondos insuficientes o cantidad inválida";
        }
    }
}