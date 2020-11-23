package colaproveedor;

public class ColaTest {
    public static void main(String[] args) {
        Cola cola = new Cola();
        System.out.println(cola.isEmpty());

/*
        //FIRST TEST
            //La cola deberá de contener todos los métodos trabajados durante las sesiones
        cola.offer(new Proveedor("CarlosSA","84561234", "Peras", "av.Nueva Esperanza 704"));
        cola.offer(new Proveedor("JuanSA","84561234", "Manzanas", "av.Nueva Esperanza 704"));
        cola.offer(new Proveedor("AlbertoSA","84561234", "Sandias", "av.Nueva Esperanza 704"));
*/

        //SECOND TEST
            //Crear una cola la cual permite almacenar información de docentes extraídos desde una base de datos.
        cola.offer(new Proveedor("OuSA","84561234", "Cacahuate", "av.Nueva Esperanza 704"));
        cola.offer(new Proveedor("EuSA","84561234", "Palta", "av.Nueva Esperanza 704"));

        System.out.println("====================== peek ===========================");
        Proveedor peek = cola.peek();//PRIMERO
        if (peek != null)
            System.out.println("primero: "+peek.getProducto());

        System.out.println("====================== print./ ===========================");
        cola.print();


        System.out.println("====================== pop & peek ===========================");
        cola.poll();

        peek = cola.peek();//PRIMERO
        if (peek != null)
            System.out.println("primero: "+peek.getProducto());

        System.out.println("====================== pop & peek ===========================");
        cola.poll();

        peek = cola.peek();//PRIMERO
        if (peek != null)
            System.out.println("primero: "+peek.getProducto());


    }
}
