package programaciongenerica;
public class Suma implements Operacion<Integer> {
    @Override
    public Integer ejecutar(Integer a, Integer b) {
        return a + b;
    }
}

