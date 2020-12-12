package cola;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Vendedores implements IVendedores {

    private Queue<Vendedor> cola;
    private List<Vendedor> proveedores;
    private Integer primero;

    public Vendedores() {
        cola = new LinkedList();
        primero =1;//id default
/*
        if (proveedores.size()>=1) {
            for (Vendedor vendedor : proveedores)
                cola.offer(vendedor);
            primero = cola.peek().getId();
        }
 */
    }

    public Boolean isEmpty() {
        return cola.isEmpty();
    }

    //Metodo para agregar elementos a la cola
    public Boolean offer(Vendedor vendedor) {
        return cola.offer(vendedor);
    }

    //Metodo para remover elementos de la cola
    public Vendedor poll() {
        System.out.println("id deleted: "+primero);
        primero++;//actualizar
        return cola.poll();
    }

    //Devolver el primer elemento  de la cola
    public Vendedor peek(){
        return cola.peek();
    }

    //Imprimir los datos
    public void print(){
        System.out.println("Los elementos de la cola son :");
        for (Vendedor vendedor : cola) {
            System.out.println("Elemento :"+ vendedor.toString());
        }
    }
}
