package coladocente;

public class ColaTest {
    public static void main(String[] args) {
        Cola cola = new Cola();
        System.out.println(cola.isEmpty());
/*
        //FIRST TEST
            //La cola deberá de contener todos los métodos trabajados durante las sesiones
        cola.offer(new Docente("Carlos","Perez", "70550511", "mail@.com"));
        cola.offer(new Docente("Juan","Sanchez", "70550511", "mail@.com"));
        cola.offer(new Docente("Alberto","Huaman", "70550511", "mail@.com"));
*/
        //SECOND TEST
            //Crear una cola la cual permite almacenar información de docentes extraídos desde una base de datos.
        cola.offer(new Docente("Ou","Ou", "70550511", "mail@.com"));
        cola.offer(new Docente("Eu","Eu", "70550511", "mail@.com"));

        System.out.println("====================== peek ===========================");
        Docente peek = cola.peek();//PRIMERO
        if (peek != null)
            System.out.println("primero: "+peek.getNombre());

        System.out.println("====================== print./ ===========================");
        cola.print();


        System.out.println("====================== pop & peek ===========================");
        cola.poll();

        peek = cola.peek();//PRIMERO
        if (peek != null)
            System.out.println("primero: "+peek.getNombre());

        System.out.println("====================== pop & peek ===========================");
        cola.poll();

        peek = cola.peek();//PRIMERO
        if (peek != null)
            System.out.println("primero: "+peek.getNombre());
    }
}
