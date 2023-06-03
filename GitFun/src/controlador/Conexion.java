package controlador;

import java.sql.*;

public class Conexion {

    private static Connection conexion;

    public static Connection getConexion() {
        if (conexion == null) {
            String url = "jdbc:mysql://localhost/prueba";
            String user = "root";
            String pass = "";

            try {
                conexion = DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return conexion;
    }

}
