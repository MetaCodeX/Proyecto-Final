package config;


import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class Conexion {

    Connection con;
    static String url = "jdbc:mysql://bcyboql1tlvzoxbokcat-mysql.services.clever-cloud.com:3306/bcyboql1tlvzoxbokcat?useSSL=false";
    static String user = "u2z3kn52jzm4hpoo";
    static String pass = "TROUdOLH7FU3rKe3LhuW";

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de Conexion a Base de Datos : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return con;
    }

    public static Connection ConectarDB() {
        Connection conex = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection(url, user, pass);
            if (conex != null) {
                System.out.println("Conexión exitosa a la base de datos");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de Conexión a Base de Datos: " + e.getMessage());
        }
        return conex;
    }
}
