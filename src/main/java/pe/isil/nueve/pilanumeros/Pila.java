package pe.isil.nueve.pilanumeros;

public class Pila {
    private Double numeros[];
    private int cantidadDeElementos;
    private int cima;

    public Pila(int cantidadDeElementos){
        this.cantidadDeElementos = cantidadDeElementos;
        numeros = new  Double[cantidadDeElementos];
        cima = 0;
    }

    public boolean isEmpty(){
        boolean resultFlag = false;
        if (cima == 0)resultFlag = true;
        return resultFlag;
    }


    public void push(Double dato){
        if (cima<cantidadDeElementos){
            numeros[cima] = dato;
            cima++;
        } else {
            System.out.println("La pila ya esta llena");
        }
    }

    public boolean isEmpty1(){
        return (numeros[0] == 0)? true :false;
    }

    public Double peek() {
        return (cima == 0)? 0.0 : numeros[cima-1];
    }

    public void pop(){
        if (cima == 0) System.out.println("La pila es vacia");
        else {
            numeros[cima-1] = null;
            cima--;
        }
    }

    public Double[] elementoPila() {
        int[] result;
        if (cima !=0)
            return numeros;
        else
            return null;
    }

    public void imprimir(){
        if (cima > 0){
            for (Double numero : numeros) {
                System.out.println(""+numero);
            }
        }else
            System.out.println("No hay elemetos en a pila");
    }
    public Double[] elementoPila1(){
        return (cima != 0)? numeros : null;
    }



}
