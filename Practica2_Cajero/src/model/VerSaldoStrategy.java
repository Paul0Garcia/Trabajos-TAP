package model;

public class VerSaldoStrategy implements OperacionStrategy {

    @Override
    public String ejecutar(Usuario usuario, double cantidad) {
        return "Saldo actual: $" + usuario.getCuenta().getSaldo();
    }
}
