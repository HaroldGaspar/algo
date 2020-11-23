package pe.isil.parcial;


public class ListaEnlazadaDoble {

    private Nodo inicio;
    private Nodo fin;
    private int size;

    public ListaEnlazadaDoble() {
        this.inicio = null;
        this.fin = null;

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


    public void buscarTerreno(int area) {
        String resultado = "";
        Boolean resultFlag = false;
        Boolean resulFlagVacio = false;
        if (!estaVacia()) {
            Nodo auxiliar = inicio;
            while (auxiliar != null) {
                int dato = auxiliar.obtenerDatoNodo();
                if (dato == area) {
                    resultado = "El terreno se encuentra en la lista";
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

    //Metodo para saber que la lista está vacia
    public Boolean estaVacia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }




    public void agregarAlInicio(int area) {
        if (estaVacia()) {
            inicio = fin = new Nodo(area);
            size++;
        } else {
            inicio = new Nodo(area, inicio, null);
            inicio.obtenerNodoSiguiente().enlazarNodoAnterior(inicio);
            size++;
        }
    }

    public void agregarAlFinal(int area) {

        if (estaVacia()) {
            inicio = fin = new Nodo(area);
            size++;
        } else {
            fin = new Nodo(area, null, fin);
            fin.obtenerNodoAnterior().enlazarNodoSiguiente(fin);
            size++;
        }
    }



    public void modificarArea(int indice, int area) {
        Nodo auxiliar = inicio;
        for (int i=0; i<indice;i++) {
            auxiliar=auxiliar.obtenerNodoSiguiente();
        }
        auxiliar.setArea(area);
    }
//
    public int tamaño(){
        return size;
    }


    //ELIMINAR
    public void eliminarInicio() {
        if (inicio != null) {
            Nodo auxiliar = inicio;
            inicio = inicio.obtenerNodoSiguiente();
            auxiliar.enlazarNodoSiguiente(null);
            inicio.enlazarNodoAnterior(null);
        }
    }
    public void eliminarFin() {
        if (inicio != null) {
            Nodo auxiliar = fin;
            fin = fin.obtenerNodoAnterior();
            auxiliar.enlazarNodoAnterior(null);
            fin.enlazarNodoSiguiente(null);
        }
    }

}
