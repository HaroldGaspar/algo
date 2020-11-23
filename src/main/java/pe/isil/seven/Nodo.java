/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.isil.seven;

/**
 *
 * @author User
 */
public class Nodo {

    private int edad;
    private Nodo anterior;
    private Nodo siguiente;

    //Constructor cuando no hay nodos creados
    public Nodo(int edad) {
        this.edad = edad;
    }
    //Constructor cuando hay nodos creados 

    public Nodo(int edad,Nodo siguiente,Nodo anterior) {
        this.edad = edad;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    // Metodo para enlazar al nodo siguiente

    public void enlazarNodoSiguiente(Nodo nodo) {
        this.siguiente = nodo;
    }

    // Metodo para obtener el nodo siguiente
    public Nodo obtenerNodoSiguiente() {
        return this.siguiente;
    }

    // Metodo para enlazar al nodo anterior
    public void enlazarNodoAnterior(Nodo nodo) {
        this.anterior = nodo;
    }

    // Metodo para obtener el nodo anterior
    public Nodo obtenerNodoAnterior() {
        return this.anterior;
    }

    // Metodo para obtener el dato
    public int obtenerDatoNodo() {
        return this.edad;
    }

}
