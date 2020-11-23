package coladocente;

import daos.DocenteDAOImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Cola {

    private Queue<Docente> cola;
    private DocenteDAOImpl docenteDAO;
    private List<Docente> docentes;
    private Integer primero;

    public Cola() {
        cola = new LinkedList();
        primero =1;//id default

        //sincronizar db con cola
        docenteDAO = new DocenteDAOImpl();
        docentes =docenteDAO.selectAll();

        if (docentes.size()>=1) {
            for (Docente docente : docentes)
                cola.offer(docente);
            primero = cola.peek().getId();
        }
    }

    //Metodo para validar si se encuentra vacio
    public Boolean isEmpty() {
        return cola.isEmpty();
    }

    //Metodo para agregar elementos a la cola
    public Boolean offer(Docente docente) {
        docenteDAO.insert(docente);//persist
        return cola.offer(docente);
    }

    //Metodo para remover elementos de la cola
    public Docente poll() {
        docenteDAO.delete(primero);
        System.out.println("id deleted: "+primero);
        primero++;//actualizar
        return cola.poll();
    }

    //Devolver el primer elemento  de la cola
    public Docente peek(){
        return cola.peek();
    }

    //Imprimir los datos
    public void print(){
        System.out.println("Los elementos de la cola son :");
        for (Docente docente : cola) {
            System.out.println("Elemento :"+docente.toString());
        }
    }
}
