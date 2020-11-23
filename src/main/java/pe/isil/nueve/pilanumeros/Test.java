package pe.isil.nueve.pilanumeros;

import pe.isil.nueve.pilanombres.PilaNombres;
import pe.isil.nueve.pilaobjetos.Alumno;
import pe.isil.nueve.pilaobjetos.PilaAlumnos;

public class Test {
    public static void main(String[] args) {
        /*
        Pila pila = new Pila(2);
        Pila pila1 = new Pila(10);

        System.out.println("vacia: "+pila.isEmpty());
        System.out.println(pila.peek());
        pila.push(3.0);
        pila.push(4.0);
        //pila.push(5.0);
        System.out.println("vacia: "+pila.isEmpty1());
        System.out.println(pila.peek());

        pila.pop();
        System.out.println(pila.peek());

        System.out.println("::::::::::::::::::");
        //pila.elementoPila1();
        //pila.imprimir();

        for (Double numero : pila.elementoPila()) {
            System.out.println(""+numero);
        }
*/

/*
        PilaNombres pilaN = new PilaNombres(2);

        System.out.println("vacia: "+pilaN.isEmpty());
        System.out.println(pilaN.peek());
        pilaN.push("HArold");
        pilaN.push("Romel");
        //pila.push(5.0);
        System.out.println("vacia: "+pilaN.isEmpty());
        System.out.println(pilaN.peek());
*/

        PilaAlumnos pilaA = new PilaAlumnos(3);
        System.out.println("vacia: "+pilaA.isEmpty());
        System.out.println(pilaA.peek().getNombre());
        pilaA.push(new Alumno(1,"Harold","Gaspar", "1234","my@mail.com"));
        pilaA.push(new Alumno(2,"Karl","Carden", "8888","my@mail.com"));
        pilaA.push(new Alumno(3,"KarlCopoa","CardenCpia", "8888","my@mail.com"));

        pilaA.pop();
        pilaA.imprimir();
        System.out.println("vacia: "+pilaA.isEmpty());
        System.out.println(pilaA.peek().getNombre());
        System.out.println("::::::::::::::::::");

        pilaA.pop();
        System.out.println(pilaA.peek().getNombre());
        //System.out.println(pilaA.elementosPila()); //[Lpe.isil.nueve.pilaobjetos.Alumno;@75b84c92
        //System.out.println(pilaA.getAlumnos()[0].getNombre());
        pilaA.imprimir();
//        Alumno[] alumnos = pilaA.elementosPila();
//        for (Alumno alumno : pilaA.getAlumnos()) {
//            System.out.println(alumno.getNombre());
//        }
//        pilaA.getAlumnos();


    }
}
