package model;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios<T> {

    private List<T> lista = new ArrayList<>();

    public void agregar(T elemento) {
        lista.add(elemento);
    }

    public List<T> obtenerTodos() {
        return lista;
    }

    public boolean estaVacio() {
        return lista.isEmpty();
    }
}