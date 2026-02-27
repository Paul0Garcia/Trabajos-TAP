package model;

public class DepositarStrategy implements OperacionStrategy {

    @Override
    public String ejecutar(Usuario usuario, double cantidad) {

        if (usuario.getCuenta().depositar(cantidad)) {
            return "Depósito exitoso";
        } else {
            return "Cantidad inválida";
        }
    }
}