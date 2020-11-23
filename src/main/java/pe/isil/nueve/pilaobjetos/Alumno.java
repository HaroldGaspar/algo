package pe.isil.nueve.pilaobjetos;

public class Alumno {
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;

    public Alumno(Integer id, String nombre, String apellido, String dni, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }
}
