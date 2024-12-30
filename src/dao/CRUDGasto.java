package dao;

//Generales
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//Modelo
import modelo.Gasto;

public class CRUDGasto extends ConexionBD {

    //Conexion
    private static Connection ConexionBD() {
        return new ConexionBD().conexion;
    }

    //Método para insertar gastos a la BD
    public static boolean InsertarGasto(Gasto ga) {
        Connection cn = ConexionBD();
        PreparedStatement ps = null;

        String sql = "INSERT INTO gasto (categoria, descripcion, fecha, monto) VALUES (?,?,?,?)";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, ga.getCategoria());
            ps.setString(2, ga.getDescripcion());
            ps.setString(3, ga.getFecha());
            ps.setDouble(4, ga.getMonto());
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
    
    //Método para mostrar los gastos en la tabla
    public void MostrarGastos(JTable tabla) {
        String[] titulos = {"Num", "Categoria", "Descripcion", "Fecha", "Monto"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT gastoId, categoria, descripcion, fecha, monto FROM gasto");
            Gasto g = new Gasto();
            while (rs.next()) {
                int gastoId = rs.getInt("gastoId");
                String categoria = rs.getString("categoria");
                String descripcion = rs.getString("descripcion");
                String fecha = rs.getString("fecha");
                double monto = rs.getDouble("monto");
                modelo.addRow(new Object[]{gastoId, categoria, descripcion, fecha, monto});
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //Método para mostrar el monto total de los gastos
    public void MostrarMontoTotal(JLabel label) {
        try {
            rs = st.executeQuery("SELECT SUM(monto) FROM gasto");
            if (rs.next()) {
                double totalMontos = rs.getDouble(1);
                label.setText("" + totalMontos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para eliminar gastos
    public void EliminarGasto() {
        String input = JOptionPane.showInputDialog("Ingrese el gastoId a eliminar:");
        int gastoId = 0;
        try {
            gastoId = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido para el gastoId.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String query = "DELETE FROM ingreso WHERE gastoId = ?";
        try (PreparedStatement ps = conexion.prepareStatement(query)) {
            ps.setInt(1, gastoId);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Gasto eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el gasto o no se pudo eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //Método para editar los gastos
    public void EditarGasto() {
        String input = JOptionPane.showInputDialog("Ingrese el gastoId a editar:");
        int gastoId = 0;
        try {
            gastoId = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido para el gastoId.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String selectQuery = "SELECT * FROM gasto WHERE gastoId = ?";
            try (PreparedStatement psSelect = conexion.prepareStatement(selectQuery)) {
                psSelect.setInt(1, gastoId);
                ResultSet rs = psSelect.executeQuery();
                if (rs.next()) {
                    String categoriaExistente = rs.getString("categoria");
                    String descripcionExistente = rs.getString("descripcion");
                    String fechaExistente = rs.getString("fecha");
                    double montoExistente = rs.getDouble("monto");
                    String nuevaCategoria = JOptionPane.showInputDialog("Nueva categoría (actual: " + categoriaExistente + "):");
                    String nuevaDescripcion = JOptionPane.showInputDialog("Nueva descripción (actual: " + descripcionExistente + "):");
                    String nuevaFecha = JOptionPane.showInputDialog("Nueva fecha (actual: " + fechaExistente + "):");
                    String nuevoMontoStr = JOptionPane.showInputDialog("Nuevo monto (actual: " + montoExistente + "):");
                    double nuevoMonto = montoExistente;
                    try {
                        nuevoMonto = Double.parseDouble(nuevoMontoStr);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido para el monto.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    String updateQuery = "UPDATE gasto SET categoria = ?, descripcion = ?, fecha = ?, monto = ? WHERE gastoId = ?";
                    try (PreparedStatement psUpdate = conexion.prepareStatement(updateQuery)) {
                        psUpdate.setString(1, nuevaCategoria);
                        psUpdate.setString(2, nuevaDescripcion);
                        psUpdate.setString(3, nuevaFecha);
                        psUpdate.setDouble(4, nuevoMonto);
                        psUpdate.setInt(5, gastoId);
                        int filasAfectadas = psUpdate.executeUpdate();
                        if (filasAfectadas > 0) {
                            JOptionPane.showMessageDialog(null, "Gasto actualizado correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró el gasto o no se pudo actualizar.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el gasto con el gastoId proporcionado.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
