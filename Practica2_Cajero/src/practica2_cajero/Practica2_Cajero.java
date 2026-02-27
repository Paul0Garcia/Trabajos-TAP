package practica2_cajero;

import controller.CajeroController;
import model.RepositorioUsuarios;
import model.Usuario;
import view.CajeroView;

public class Practica2_Cajero {
    public static void main(String[] args) {

        RepositorioUsuarios<Usuario> repo = new RepositorioUsuarios<>();
        CajeroView view = new CajeroView();
        CajeroController controller = new CajeroController(repo, view);

        controller.iniciar();
    }
}
