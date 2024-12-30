package dao;

//General 
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//Modelo
import modelo.Ingreso;

public class CRUDIngreso extends ConexionBD {

    //Conexion a BD
    private static Connection ConexionBD() {
        return new ConexionBD().conexion;
    }

    //Método para insertar ingresos
    public static boolean InsertarIngreso(Ingreso i) {
        Connection cn = ConexionBD();
        PreparedStatement ps = null;
        String sql = "INSERT INTO ingreso (categoria, descripcion, fecha, monto) VALUES (?,?,?,?)";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, i.getCategoria());
            ps.setString(2, i.getDescripcion());
            ps.setString(3, i.getFecha());
            ps.setDouble(4, i.getMonto());
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

    //Método para mostrar los ingresos en una tabla
    public void MostrarIngresos(JTable tabla) {
        String[] titulos = {"Num", "Categoria", "Descripcion", "Fecha", "Monto"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT ingresoId, categoria, descripcion, fecha, monto FROM ingreso");
            Ingreso i = new Ingreso();
            while (rs.next()) {
                int ingresoId = rs.getInt("ingresoId");
                String categoria = rs.getString("categoria");
                String descripcion = rs.getString("descripcion");
                String fecha = rs.getString("fecha");
                double monto = rs.getDouble("monto");
                modelo.addRow(new Object[]{ingresoId, categoria, descripcion, fecha, monto});
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //Método para mostrar el monto total de los ingresos
    public void MostrarMontoTotal(JLabel label) {
        try {
            rs = st.executeQuery("SELECT SUM(monto) FROM ingreso");
            if (rs.next()) {
                double totalMontos = rs.getDouble(1);
                label.setText("" + totalMontos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para eliminar ingresos
    public void EliminarIngreso() {
        String input = JOptionPane.showInputDialog("Ingrese el ingresoId a eliminar:");
        int ingresoId = 0;
        try {
            ingresoId = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido para el ingresoId.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String query = "DELETE FROM ingreso WHERE ingresoId = ?";
        try (PreparedStatement ps = conexion.prepareStatement(query)) {
            ps.setInt(1, ingresoId);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Ingreso eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el ingreso o no se pudo eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para editar ingresos
    public void EditarIngreso() {
        String input = JOptionPane.showInputDialog("Ingrese el ingresoId a editar:");
        int ingresoId = 0;
        try {
            ingresoId = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido para el ingresoId.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String selectQuery = "SELECT * FROM ingreso WHERE ingresoId = ?";
            try (PreparedStatement psSelect = conexion.prepareStatement(selectQuery)) {
                psSelect.setInt(1, ingresoId);
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
                    String updateQuery = "UPDATE ingreso SET categoria = ?, descripcion = ?, fecha = ?, monto = ? WHERE ingresoId = ?";
                    try (PreparedStatement psUpdate = conexion.prepareStatement(updateQuery)) {
                        psUpdate.setString(1, nuevaCategoria);
                        psUpdate.setString(2, nuevaDescripcion);
                        psUpdate.setString(3, nuevaFecha);
                        psUpdate.setDouble(4, nuevoMonto);
                        psUpdate.setInt(5, ingresoId);
                        int filasAfectadas = psUpdate.executeUpdate();
                        if (filasAfectadas > 0) {
                            JOptionPane.showMessageDialog(null, "Ingreso actualizado correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró el ingreso o no se pudo actualizar.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el ingreso con el ingresoId proporcionado.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
