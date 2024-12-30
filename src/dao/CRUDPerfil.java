package dao;

import java.sql.*;

public class CRUDPerfil extends ConexionBD {

   //Conexion a la BD
    private static Connection ConexionBD() {
        return new ConexionBD().conexion;
    }
    
}
