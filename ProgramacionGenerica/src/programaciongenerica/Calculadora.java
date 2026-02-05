package programaciongenerica;
public class Calculadora<T extends Number> {
    public double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

