/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.isil.semSix;

/**
 *
 * @author User
 */
//Creamos la clase nodo
public class Nodo {
    //Definiendo sus atributos
    private Double dato;
    private Nodo nodoSiguiente;

    public Nodo(Double dato){
       this.dato = dato;
       this.nodoSiguiente=null;
    }

    public void enlazarSiguiente(Nodo nodo){
         nodoSiguiente = nodo;
    }

    public Double obtenerDato(){
       return this.dato;
    }
    
    public Nodo obtenerSiguiente(){    
        return nodoSiguiente;
    }
    
    
}
