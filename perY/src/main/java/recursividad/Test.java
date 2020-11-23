package recursividad;

public class Test {

    public static void main (String[] args) {
        Potencia potencia = new Potencia();

       //10*10 = 100
        int sumaN =  potencia.potenciar(10,3);

        System.out.println("La suma de los n numeros naturales es :"+sumaN);

    }
}
