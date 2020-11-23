package colaproveedor;

public class Proveedor {
    private Integer id;
    private String razonSocial;
    private String ruc;
    private String producto;
    private String direccion;

    public Proveedor(Integer id, String razonSocial, String ruc, String producto, String direccion) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.producto = producto;
        this.direccion = direccion;
    }

    public Proveedor(String razonSocial, String ruc, String producto, String direccion) {
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.producto = producto;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", razonSocial='" + razonSocial + '\'' +
                ", ruc='" + ruc + '\'' +
                ", producto='" + producto + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
