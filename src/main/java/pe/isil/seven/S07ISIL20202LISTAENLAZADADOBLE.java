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
public class S07ISIL20202LISTAENLAZADADOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaEnlazadaDoble listaDoble = new ListaEnlazadaDoble();        
        System.out.println("La lista esta vacia :"+listaDoble.estaVacia());
        listaDoble.tamaño();
        listaDoble.estaVacia1();
        
        listaDoble.agregarAlFinal(10);
        listaDoble.agregarAlFinal(24);
        listaDoble.agregarAlInicio(30);
        
        //listaDoble.mostrarListaEnlazadaInicioAFin();
        
        listaDoble.mostrarListaEnlazadaFinAInicio();
        listaDoble.buscarElemento(24);
        //listaDoble.eliminar(30);
        listaDoble.mostrarListaEnlazadaInicioAFin();
        //listaDoble.mostrarListaEnlazadaFinAInicio();
        
        System.out.println("Tamaño :"+listaDoble.tamaño());
        int tamaño = listaDoble.tamaño();
        ListaEnlazadaDoble listaDobleReplica = new ListaEnlazadaDoble();
        for (int i = 0; i < tamaño; i++) {
            //int indice = Math.random();
            listaDobleReplica.agregarAlInicio(listaDoble.obtenerDato(i));    
        }
     
        listaDobleReplica.mostrarListaEnlazadaFinAInicio();
         listaDoble.mostrarListaEnlazadaInicioAFin();

        
        
    }
    
}
