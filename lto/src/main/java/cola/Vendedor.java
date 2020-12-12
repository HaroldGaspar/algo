package cola;

import grafo.Tienda;

public class Vendedor {
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private Integer edad;
    private Double peso;
    private Tienda tienda;

    public Vendedor(Integer id, String nombre, String apellido, String dni, String correo, Double peso, Integer edad, Tienda tienda) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.peso = peso;
        this.edad = edad;
        this.tienda = tienda;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codigo=" + id +
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
