package calculadora;
import controller.CalculadoraController;
import view.CalculadoraView;

public class Calculadora {

    public static void main(String[] args) {

        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(view);

        controller.iniciar();
    }
}
