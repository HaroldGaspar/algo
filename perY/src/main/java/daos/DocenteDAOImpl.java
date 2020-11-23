package daos;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import coladocente.Docente;
import connectiondb.ConnectionDB;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class DocenteDAOImpl implements IDocenteDao{
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Statement st;
    private static ConnectionDB conn;
    
    public DocenteDAOImpl() {
        conn = ConnectionDB.createInstance();
    }
    
    public Boolean insert(Docente docente) {
        Boolean result = false;
        final String SQL = "INSERT INTO Docente (Nombre, Apellido, Dni, Correo) VALUES(?,?,?,?)";
        try {
            ps = conn.getConnection().prepareStatement(SQL);
            
            ps.setString(1, docente.getNombre());
            ps.setString(2, docente.getApellido());
            ps.setString(3, docente.getDni());
            ps.setString(4, docente.getCorreo());
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
    
    public Boolean update(Docente docente) {
        Boolean result = false;
        final String SQL = "UPDATE Docente SET Nombre=?, Apellido=?, Dni=?, Correo=? WHERE Id=?";
        try {
            ps = conn.getConnection().prepareStatement(SQL);
            ps.setString(1, docente.getNombre());
            ps.setString(2, docente.getApellido());
            ps.setString(3, docente.getDni());
            ps.setString(4, docente.getCorreo());
            ps.setInt(5, docente.getId());
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
    
    public Docente selectById(Integer id) {
        Docente docente = null;
        final String SQL = "SELECT * FROM Docente WHERE Id=?";
        try {
            ps = conn.getConnection().prepareStatement(SQL);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if (rs.next()) {
                docente = new Docente( rs.getInt("Id"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Dni"), rs.getString("Correo"));
            }
        }
        catch (Exception e) {
            System.out.println("Error al seleccionar por ID" + e.getMessage());
        }
        finally {
            close();
        }
        return docente;
    }
    
    public List<Docente> selectAll() {
        final String SQL = "SELECT * FROM Docente";
        List<Docente> docentes = new ArrayList<Docente>();
        try {
            st = conn.getConnection().createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                docentes.add(new Docente( rs.getInt("Id"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Dni"), rs.getString("Correo")));
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            close();
        }
        return docentes;
    }
    
    public void delete(Integer id) {
        final String SQL = "DELETE FROM Docente WHERE Id=?";
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