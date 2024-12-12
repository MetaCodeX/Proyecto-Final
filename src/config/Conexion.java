package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mysql://bcyboql1tlvzoxbokcat-mysql.services.clever-cloud.com:3306/bcyboql1tlvzoxbokcat?useSSL=false";
    private static final String USER = "u2z3kn52jzm4hpoo";
    private static final String PASS = "TROUdOLH7FU3rKe3LhuW";
    
    // Mantener una única conexión
    private static Connection conexion = null;
    
    // Volvemos al método original Conectar()
    public static Connection Conectar() {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Conexión exitosa");
            }
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de Conexión: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
            return null;
        }
    }
    
    // Método para cerrar la conexión
    public static void closeConnection() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                conexion = null;
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
