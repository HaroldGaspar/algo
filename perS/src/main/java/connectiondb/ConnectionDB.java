package connectiondb;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

    private static ConnectionDB instance=null;
    private static Connection conn = null;
    private  final String URL="jdbc:mysql://localhost:3306/db";
    private  final String DRIVER="com.mysql.cj.jdbc.Driver";
    private  final String USER="harold";
    private final String PASS="123";

    //CONSTRUCTOR PRIVADO
    private  ConnectionDB(){
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Conectado a mi base de datos");
        } catch (Exception ex) {
            System.out.println("Error de conexion"+ex.getMessage());
            ex.printStackTrace();
        }
    }
    public synchronized static ConnectionDB createInstance(){
        if(instance==null){
            instance = new ConnectionDB();
        }
        return instance;
    }
    public Connection getConnection(){
        return conn;
    }
    public void close(){
        instance=null;
    }
}
