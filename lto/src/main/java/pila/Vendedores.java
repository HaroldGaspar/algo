package pila;
import java.util.List;

public class Vendedores implements IVendedores{
    private Vendedor[] vendedores;
    private int cantidadDeElementos;
    private int cima;

    public Vendedores(int cantidadDeElementos) {
        this.cantidadDeElementos = cantidadDeElementos;
        this.vendedores = new Vendedor[cantidadDeElementos];
        cima = 0;
    }

    public boolean isEmpty() {
        return (cima == 0)? true : false;
    }

    public void push(Vendedor vendedor) {
        if (cima < cantidadDeElementos) {
            vendedores[cima] = vendedor;
            ++cima;
            System.out.println("[push executed]");
        }
        else {
            System.err.println("La pila ya se encuentra llena");
        }
    }

    public Vendedor peek() {
        if (cima == 0) {
            System.out.println("No hay datos en la pila");
            return null;
        }else {
            return vendedores[cima-1];
        }
    }

    public void pop() {
        if (cima == 0) {
            System.err.println("La pila se encuentra vacia");
        }
        else {
            vendedores[cima-1]= null;//indice
            --cima;
            System.out.println("[pop executed]");
        }
    }

    public Vendedor[] elementos() {
        if (cima != 0) {
            return vendedores;
        } else {
            return null;
        }
    }


}

