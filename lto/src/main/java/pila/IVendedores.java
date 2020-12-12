package pila;

public interface IVendedores {
    Vendedor peek();
    void push(Vendedor vendedor);
    void pop();
    Vendedor[] elementos();
}
