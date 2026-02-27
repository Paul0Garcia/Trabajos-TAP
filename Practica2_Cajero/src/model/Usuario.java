package model;

public class Usuario {
    private String pin;
    private String nombre;
    private Cuenta cuenta;

    public Usuario(String pin, String nombre, double saldoInicial) {
        this.pin = pin;
        this.nombre = nombre;
        this.cuenta = new Cuenta(saldoInicial);
    }

    public String getPin() { return pin; }
    public String getNombre() { return nombre; }
    public Cuenta getCuenta() { return cuenta; }
}