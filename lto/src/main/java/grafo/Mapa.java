package grafo;

import java.util.ArrayList;
import java.util.List;

public class Mapa {

    private List<Tienda> tiendas;

    public List<Tienda> getTiendas() {
        return tiendas;
    }

    public void setTienda(Tienda tienda) {
        if (tiendas == null) {
            tiendas = new ArrayList<>();
        }
        tiendas.add(tienda);
    }

    @Override
    public String toString() {
        return "Mapa{" + "tiendas=" + tiendas + '}';
    }
    
    

}
