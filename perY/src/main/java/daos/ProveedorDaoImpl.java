package daos;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import coladocente.Docente;
import colaproveedor.Proveedor;
import connectiondb.ConnectionDB;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class ProveedorDaoImpl implements IProveedorDao{
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Statement st;
    private static ConnectionDB conn;

    public ProveedorDaoImpl() {
        conn = ConnectionDB.createInstance();
    }

    public Boolean insert(Proveedor proveedor) {
        Boolean result = false;
        final String SQL = "INSERT INTO Proveedor (RazonSocial, Ruc, Producto, Direccion) VALUES(?,?,?,?)";
        try {
            ps = conn.getConnection().prepareStatement(SQL);

            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getRuc());
            ps.setString(3, proveedor.getProducto());
            ps.setString(4, proveedor.getDireccion());
            if (ps.executeUpdate() > 0) {
                result = true;
            }
        }
        catch (Exception e) {
            System.out.println("Error al insertar");
            e.printStackTrace();
        }
        finally {
            close();
        }
        return result;
    }

    public Boolean update(Proveedor proveedor) {
        Boolean result = false;
        final String SQL = "UPDATE Proveedor SET RazonSocial=?, Ruc=?, Producto=?, Direccion=? WHERE Id=?";
        try {
            ps = conn.getConnection().prepareStatement(SQL);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getRuc());
            ps.setString(3, proveedor.getProducto());
            ps.setString(4, proveedor.getDireccion());
            ps.setInt(5, proveedor.getId());
            if (ps.executeUpdate() > 0) {
                result = true;
            }
        }
        catch (Exception e) {
            System.out.println("Error al actualizar");
            e.printStackTrace();
        }
        finally {
            close();
        }
        return result;
    }

    public Proveedor selectById(Integer id) {
        Proveedor proveedor = null;
        final String SQL = "SELECT * FROM Proveedor WHERE Id=?";
        try {
            ps = conn.getConnection().prepareStatement(SQL);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if (rs.next()) {
                proveedor = new Proveedor( rs.getInt("Id"), rs.getString("RazonSocial"), rs.getString("Ruc"), rs.getString("Producto"), rs.getString("Direccion"));
            }
        }
        catch (Exception e) {
            System.out.println("Error al seleccionar por ID" + e.getMessage());
        }
        finally {
            close();
        }
        return proveedor;
    }

    public List<Proveedor> selectAll() {
        final String SQL = "SELECT * FROM Proveedor";
        List<Proveedor> proveedores = new ArrayList<>();
        try {
            st = conn.getConnection().createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                proveedores.add(new Proveedor( rs.getInt("Id"), rs.getString("RazonSocial"), rs.getString("Ruc"), rs.getString("Producto"), rs.getString("Direccion")));
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            close();
        }
        return proveedores;
    }

    public void delete(Integer id) {
        final String SQL = "DELETE FROM Proveedor WHERE Id=?";
        try {
            ps = conn.getConnection().prepareStatement(SQL);
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected == 0) {
                System.out.println("Error columna no affectada");
            }
        }
        catch (Exception e) {
            System.out.println("Error al eliminar" + e.getMessage());
        }
        finally {
            close();
        }
    }

    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        catch (Exception e) {
            System.out.println("Error al cerrar las interfaces :");
        }
    }
}