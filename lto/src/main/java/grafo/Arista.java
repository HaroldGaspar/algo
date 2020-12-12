package grafo;

public class Arista {
 
    private Tienda origen;
    private Tienda destino;
    private Double distancia;

    public Arista(Tienda origen, Tienda destino, Double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Tienda getOrigen() {
        return origen;
    }

    public void setOrigen(Tienda origen) {
        this.origen = origen;
    }

    public Tienda getDestino() {
        return destino;
    }

    public void setDestino(Tienda destino) {
        this.destino = destino;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "\n Enlace{" + "origen=" + origen.getNombre() + ", destino=" + destino.getNombre() + ", distancia=" + distancia + '}';
    }
    
    
    
    
    
}
