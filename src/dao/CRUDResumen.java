package dao;

//Generales
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//Modelo
import modelo.Gasto;
import modelo.Ingreso;

public class CRUDResumen extends ConexionBD {

    //Conexion a la BD
    private static Connection ConexionBD() {
        return new ConexionBD().conexion;
    }

    //Método para mostrar resumen de ingresos por categorias
    public void MostrarIngreso(JTable tabla) {
        String[] titulos = {"Categoria", "Monto"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT categoria, SUM(monto) AS suma_montos FROM ingreso GROUP BY categoria");
            Ingreso i = new Ingreso();
            while (rs.next()) {
                String categoria = rs.getString("categoria");
                double monto = rs.getDouble("suma_montos");
                modelo.addRow(new Object[]{categoria, monto});
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    //Método para mostrar resumen de gastos por categorias
    public void MostrarGasto(JTable tabla) {
        String[] titulos = {"Categoria", "Monto"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT categoria, SUM(monto) AS suma_montos FROM gasto GROUP BY categoria");
            Gasto g = new Gasto();
            while (rs.next()) {
                String categoria = rs.getString("categoria");
                double monto = rs.getDouble("suma_montos");
                modelo.addRow(new Object[]{categoria, monto});
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //Método para mostrar la diferencia entre ingresos y gastos
    public double MostrarDiferencia() {
        double diferencia = 0;
        try {
            String query = "SELECT COALESCE(SUM(ingresos.suma_ingresos), 0) - COALESCE(SUM(gastos.suma_gastos), 0) AS diferencia "
                    + "FROM (SELECT SUM(monto) AS suma_ingresos FROM ingreso) AS ingresos "
                    + "LEFT JOIN (SELECT SUM(monto) AS suma_gastos FROM gasto) AS gastos ON 1 = 1";
            try (PreparedStatement ps = conexion.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    diferencia = rs.getDouble("diferencia");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return diferencia;
    }

}
