package dao;

//Generales
import java.sql.*;

public class ConexionBD implements Parametros {

    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;

    //Conexion a la BD
    public ConexionBD() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA, USUARIO, CLAVE);
            st = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
