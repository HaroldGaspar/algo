/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.isil.semSix;

public class ListaEnlazada {

    private Nodo inicio;
    private int size;
    //Constructor para inicializar las variables
    public ListaEnlazada() {
        this.inicio = null;
        size = 0;
    }
    //Metodo para validar si la lista enlazada se encuentra vacía
    
    public Boolean estaVacia(){
          Boolean  resultFlag = false;
          if(inicio ==null){
           resultFlag = true;
          }
      return resultFlag;    
    }
    
    //Metodo agregar un elemento al inicio de la lista enlazada
    public void agregarInicio(Double dato){
        if (inicio==null) {
            inicio = new Nodo(dato);
        } else {
           Nodo aux = inicio;
           Nodo nuevoNodo = new Nodo(dato);
           nuevoNodo.enlazarSiguiente(aux);
           inicio = nuevoNodo;
        }
        size++;
    }
   //Metodo para agregar un elemento al final de la lista
    
    public void addFinal(Double dato){
        Nodo auxiliar = inicio; 
        if(size == 0){
            agregarInicio(dato);
        }
        else{
            for (int i = 0; i < size; i++) {
                if (i == size-1) {
                   Nodo nuevo  = new Nodo(dato);
                   auxiliar.enlazarSiguiente(nuevo);
                   size++;
                   break;
                } else {
                    auxiliar = auxiliar.obtenerSiguiente();
                }
            }
        }
    }
    
    //Metodo para obtener el valor almacenado pasandole el índice
    public double obtenerValor(int indice){
    
        int contador = 0;        
        Nodo auxiliar = inicio;
        while (contador<indice) {            
            auxiliar = auxiliar.obtenerSiguiente();
            contador++;
        }
        return auxiliar.obtenerDato();
        
    }

    // Anghelo Aguirre
//    public double obtenerValor(int valor) {
//        Nodo aux = inicio;
//        double dato = 0;
//        for (int i = 0; i < size; i++) {
//            if (i == valor) {
//                dato = aux.getDato();
//                break;
//            } else {
//                aux = aux.getNodoSiguiente();
//            }
//        }
//        return dato;
//    }
    public int getSize(){
        return size;
    }
    
}
