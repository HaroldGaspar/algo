package pe.isil.util;

import java.sql.Connection;

public class DataBaseUtil {

    private static final String URL = "jdbc:postgresql://localhost:5432/isil_db";
    private static final String USER = "isil";
    private static final String PASSWORD = "1234";

    private static final String DRIVER = "";

    public static Connection getConnection() {
        Class.forName(DRIVER);
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }

    public static void main(String[] args) {

        try {
            DataBaseUtil.getConnection();
            System.out.println("Connection success!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

}
