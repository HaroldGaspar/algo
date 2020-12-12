package pila;

import grafo.Tienda;

public class Vendedor {
    private Integer codigo;
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private Integer edad;
    private Double peso;
    private Tienda tienda;

    public Vendedor(Integer codigo, String nombre, String apellido, String dni, String correo, Double peso, Integer edad, Tienda tienda) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.peso = peso;
        this.edad = edad;
        this.tienda = tienda;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", tienda=" + tienda +
                '}';
    }
}
