package grafo;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;
    private List<Arista> aristas = null;

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(Arista arista) {
        if (aristas == null) {
            aristas = new ArrayList<>();
        }
        aristas.add(arista);
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombre=" + nombre + ", enlaces=" + aristas + '}';
    }

}
