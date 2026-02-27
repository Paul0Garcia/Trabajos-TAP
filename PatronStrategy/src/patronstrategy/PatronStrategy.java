package patronstrategy;
import controller.PagoController;
import view.PagoView;

public class PatronStrategy {
    public static void main(String[] args) {

        PagoView view = new PagoView();
        PagoController controller = new PagoController(view);

        controller.iniciar();
    }
}
