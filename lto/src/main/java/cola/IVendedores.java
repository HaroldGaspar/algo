package cola;

public interface IVendedores {
    Boolean offer(Vendedor vendedor);
    Vendedor peek();
    Vendedor poll();
    void print();
}
