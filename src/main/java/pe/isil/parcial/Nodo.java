package pe.isil.parcial;

public class Nodo {


    private int area;
    private Nodo anterior;
    private Nodo siguiente;

    //Constructor cuando no hay nodos creados
    public Nodo(int area) {
        this.area = area;
    }
    //Constructor cuando hay nodos creados

    public Nodo(int area, Nodo siguiente, Nodo anterior) {
        this.area = area;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    // Metodo para enlazar al nodo siguiente

    public void enlazarNodoSiguiente(Nodo nodo) {
        this.siguiente = nodo;
    }

    public Nodo obtenerNodoSiguiente() {
        return this.siguiente;
    }

    public void enlazarNodoAnterior(Nodo nodo) {
        this.anterior = nodo;
    }

    public Nodo obtenerNodoAnterior() {
        return this.anterior;
    }

    public int obtenerDatoNodo() {
        return this.area;
    }

    public void setArea(int area){
        this.area = area;
    }

/*
    private Double medida;
    private Nodo nodoSiguiente;

    public Nodo(Double medida){
        this.medida = medida;
        this.nodoSiguiente = null;
    }
    public void enlazarSiguiente(Nodo nodo){
        nodoSiguiente = nodo;
    }

    public Double obtenerMedida(){
        return this.medida;
    }

    public Nodo obtenerSiguiente(){
        return nodoSiguiente;
    }
    public void setMedida(Double medida){
        this.medida = medida;
    }

    public void setNodoSiguiente(Nodo n){
        this.nodoSiguiente = n;
    }
 */
}

