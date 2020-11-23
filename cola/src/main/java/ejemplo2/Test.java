package ejemplo2;
public class Test {
    public static void main(String[] args) {
        
        Cola cola = new Cola();
        System.out.println("La cola esta vacia :"+cola.isEmpty());
        
        System.out.println("Agregando elementos a la cola");
        cola.offer("Carlos");
        
        System.out.println("La cola esta vacia :"+cola.isEmpty());
        
        
    }
    
}
