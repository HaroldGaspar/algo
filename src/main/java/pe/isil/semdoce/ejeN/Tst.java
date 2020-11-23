package pe.isil.semdoce.ejeN;

public class Tst {
    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.offer("Io");
        cola.offer("Iu");
        cola.offer("Oi");
        System.out.println(cola.peek());
        System.out.println(cola.poll());
        cola.print();
    }
}
