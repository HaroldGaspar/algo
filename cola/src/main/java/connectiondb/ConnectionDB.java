package connectiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Patron Singleton */
public class ConnectionDB {
    
    private static ConnectionDB instance=null;
    private static Connection con = null;
    private  final String URL="jdbc:mysql://localhost:3306/db";
    private  final String DRIVER="com.mysql.cj.jdbc.Driver";
    private  final String USER="harold";
    private final String PASS="1234";
    
    //CONSTRUCTOR PRIVADO
    private  ConnectionDB(){  
        try {
            //Crear una instancia del driver de conexion
            Class.forName(DRIVER).newInstance();
            //Conexion a la base de datos
            con = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Conectado a mi base de datos");
        } catch (Exception ex) {
            System.out.println("Error de conexion"+ex.getMessage());
            ex.printStackTrace();
        } 
    }
    //METODO PARA CREAR UNA INSTANCIA DE CONEXION A LA BD
    public synchronized static ConnectionDB createInstance(){
        if(instance==null){
        instance = new ConnectionDB();
        }
    return instance;
    }
    //METODO PARA OBTENER LA INSTANCIA DE CONEXION A LA BD
    public Connection getConnection(){
        return con;
    }
    //METODO PARA CERRAR LA CONEXION
    public void close(){
        instance=null;
    }
    
}
