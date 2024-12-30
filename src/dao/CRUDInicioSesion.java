package dao;

//Generales
import java.sql.*;

//Modelo
import modelo.Usuario;

public class CRUDInicioSesion extends ConexionBD {

    //Conexión a la BD
    private static Connection ConexionBD() {
        return new ConexionBD().conexion;
    }

    //Método para insertar usuarios a la BD
    public static boolean InsertarUsuario(Usuario u) {
        Connection cn = ConexionBD();
        PreparedStatement ps = null;
        String sql = "INSERT INTO usuario (nombre, apellido, usuario, pass) VALUES (?,?,?,?)";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getUsuario());
            ps.setString(4, u.getPass());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                cn.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return false;
    }

    //Método para autentificar los usuarios
    public static boolean Autentication(String Puser, String Ppsw) {
        Connection cn = ConexionBD();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT usuario, pass from usuario where usuario = ? and pass = ?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, Puser);
            ps.setString(2, Ppsw);
            rs = ps.executeQuery();
            while (rs.next()) {
                cn.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

}
