package pe.isil.semdoce.ejeN;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<String> cola;

    public Cola(){
        cola = new LinkedList();//comportamiento de cola
    }

    public Boolean isEmpty(){
        return cola.isEmpty();
    }

    public Boolean offer(String nombre){
        return cola.offer(nombre);//!= add, is array behavior
    }

    public String poll() {
        return "Deleted: "+cola.poll();
    }

    public String peek(){
        return "Peek: "+ cola.peek();
    }

    public void print(){
            System.out.println("Tail: "+cola);
    }
}
