package programaciongenerica;
public class ProgramacionGenerica {
    public static void main(String[] args) {

        Caja<String> caja = new Caja<>();
        caja.setContenido("Programación Genérica");
        System.out.println(caja.getContenido());

        Utilidades.imprimir(10);
        Utilidades.imprimir("Java");

        Operacion<Integer> suma = new Suma();
        System.out.println("Resultado: " + suma.ejecutar(4, 6));

        Calculadora<Integer> calc = new Calculadora<>();
        System.out.println("Suma: " + calc.sumar(3, 7));

        Par<String, Integer> par = new Par<>("Semestre", 4);
        System.out.println(par.getClave() + ": " + par.getValor());
    }
}



