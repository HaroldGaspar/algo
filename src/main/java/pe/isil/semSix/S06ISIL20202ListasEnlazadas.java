package pe.isil.semSix;

/**
 *
 * @author User
 */
public class S06ISIL20202ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Creación del objeto nodo
        Nodo nodo1 = new Nodo(30.6);
        Nodo nodo2 = new Nodo(43.6);
        Nodo nodo3 = new Nodo(34.6);
       //Enlazar nodo1 con nodo2
       nodo1.enlazarSiguiente(nodo2);
       //Enlazar nodo2 con nodo3;
       nodo2 = nodo1.obtenerSiguiente();
       nodo1.obtenerSiguiente().enlazarSiguiente(nodo3);
       // Imprimir valor que tiene almacenado el Nodo1

       ListaEnlazada lista = new ListaEnlazada();
       Boolean estaVacia = lista.estaVacia();
       System.out.println("El resultado es :"+estaVacia);
       
       lista.agregarInicio(30.5);
       
       Boolean estaVacia1 = lista.estaVacia();
       System.out.println("El resultado es :"+estaVacia1);

       for (int i=0; i<lista.getSize(); i++){
           System.out.println(lista.obtenerValor(i));
       }
       
        
    }
    
}
