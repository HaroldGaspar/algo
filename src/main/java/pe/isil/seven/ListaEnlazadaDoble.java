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
public class ListaEnlazadaDoble {

    private Nodo inicio;
    private Nodo fin;
    private int size;

    //Creando el constructor
    public ListaEnlazadaDoble() {
        this.inicio = null;
        this.fin = null;

    }

    //Metodo para saber que la lista está vacia
    public Boolean estaVacia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public Boolean estaVacia1(){
        return (inicio == null)? true :false;
    }

    //Metodo para agregar elementos a la lista al inicio
    public void agregarAlInicio(int edad) {
        if (estaVacia()) {
            inicio = fin = new Nodo(edad);
            size++;
        } else {
            inicio = new Nodo(edad, inicio, null);
            inicio.obtenerNodoSiguiente().enlazarNodoAnterior(inicio);
            size++;
        }
    }

    //Metodo para agregar elementos al final de la lista doblemente enlazada
    public void agregarAlFinal(int edad) {

        if (estaVacia()) {
            inicio = fin = new Nodo(edad);
            size++;
        } else {
            fin = new Nodo(edad, null, fin);
            fin.obtenerNodoAnterior().enlazarNodoSiguiente(fin);
            size++;
        }
    }


    //METODO PARA MOSTRAR LOS ELEMENTOS RECORRIENDO DE INICIO A FIN
    public void mostrarListaEnlazadaInicioAFin() {
        String datos = "<=>";
        if (!estaVacia()) {
            Nodo auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + auxiliar.obtenerDatoNodo() + "<=>";
                auxiliar = auxiliar.obtenerNodoSiguiente();
            }
            System.out.println("La lista de los elementos son :");
            System.out.println("" + datos);
        }
    }

    public int obtenerDato(int indice) {
        int contador = 0;
        Nodo auxiliar = inicio;
        while (contador < indice) {
            auxiliar = auxiliar.obtenerNodoSiguiente();
            contador++;
        }
        return auxiliar.obtenerDatoNodo();
    }

    public int tamaño(){
     return size;
    }
    
    //METODO PARA MOSTRAR LOS ELEMENTOS RECORRIENDO DE FIN A INICIO
    public void mostrarListaEnlazadaFinAInicio() {
        String datos = "<=>";
        if (!estaVacia()) {
            Nodo auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + auxiliar.obtenerDatoNodo() + "<=>";
                auxiliar = auxiliar.obtenerNodoAnterior();
            }
            System.out.println("La lista de los elementos son :");
            System.out.println("" + datos);
        }
    }

    //METODO PARA BUSCAR ELEMENTO EN LA LISTA ENLAZADA
    public void buscarElemento(int edad) {
        String resultado = "";
        Boolean resultFlag = false;
        Boolean resulFlagVacio = false;
        if (!estaVacia()) {
            Nodo auxiliar = inicio;
            while (auxiliar != null) {
                int dato = auxiliar.obtenerDatoNodo();
                if (dato == edad) {
                    resultado = "El número se encuentra en la lista";
                    resultFlag = true;
                    break;
                } else {
                    auxiliar = auxiliar.obtenerNodoSiguiente();
                }
            }
        } else {
            resultado = "La lista se encuentra vacía";
            resulFlagVacio = true;
        }
        if (resultFlag) {
            System.out.println("-" + resultado);
        } else if (resulFlagVacio) {
            System.out.println("" + resultado);
        } else {
            resultado = "No se encuentra el dato en la lista";
            System.out.println(resultado);
        }
    }

    //METODO PARA ELIMINAR UN DATO
    public void eliminar(int dato) {

        if (inicio != null) {
            Nodo auxiliar = inicio;
            Nodo anterior = null;
            while (auxiliar != null) {
                if (auxiliar.obtenerDatoNodo() == dato) {
                    if (anterior == null) {
                        inicio = inicio.obtenerNodoSiguiente();
                        auxiliar.enlazarNodoSiguiente(null);
                        auxiliar = inicio;
                        // inicio.enlazarNodoAnterior(null);

                    } else {
                        anterior.enlazarNodoSiguiente(auxiliar.obtenerNodoSiguiente());
                        auxiliar.enlazarNodoSiguiente(null);
                        auxiliar = anterior.obtenerNodoSiguiente();
                    }
                } else {
                    anterior = auxiliar;
                    auxiliar = auxiliar.obtenerNodoSiguiente();
                }

            }
        } else {
            System.out.println("La lista se encuentra vacía");
        }
    }


}
