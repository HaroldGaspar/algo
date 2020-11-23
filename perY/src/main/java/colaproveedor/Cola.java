package colaproveedor;

import daos.ProveedorDaoImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cola {

    private Queue<Proveedor> cola;
    private ProveedorDaoImpl proveedorDAO;
    private List<Proveedor> proveedores;
    private Integer primero;

    public Cola() {
        cola = new LinkedList();
        primero =1;//id default

        //sincronizar db con cola
        proveedorDAO = new ProveedorDaoImpl();
        proveedores =proveedorDAO.selectAll();

        if (proveedores.size()>=1) {
            for (Proveedor proveedor : proveedores)
                cola.offer(proveedor);
            primero = cola.peek().getId();
        }
    }

    //Metodo para validar si se encuentra vacio
    public Boolean isEmpty() {
        return cola.isEmpty();
    }

    //Metodo para agregar elementos a la cola
    public Boolean offer(Proveedor proveedor) {
        proveedorDAO.insert(proveedor);//persist
        return cola.offer(proveedor);
    }

    //Metodo para remover elementos de la cola
    public Proveedor poll() {
        proveedorDAO.delete(primero);
        System.out.println("id deleted: "+primero);
        primero++;//actualizar
        return cola.poll();
    }

    //Devolver el primer elemento  de la cola
    public Proveedor peek(){
        return cola.peek();
    }

    //Imprimir los datos
    public void print(){
        System.out.println("Los elementos de la cola son :");
        for (Proveedor proveedor : cola) {
            System.out.println("Elemento :"+proveedor.toString());
        }
    }
}
