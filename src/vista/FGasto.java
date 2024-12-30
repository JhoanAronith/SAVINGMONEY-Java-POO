package vista;

import java.awt.Image;
import java.awt.Toolkit;

public class FGasto extends javax.swing.JFrame {

    public FGasto() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/Icono.png"));
        this.setIconImage(img);
        this.setTitle("Registrar Gastos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        btnIngreso = new javax.swing.JButton();
        btnGasto = new javax.swing.JButton();
        btnResumen = new javax.swing.JButton();
        btnMeta = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblGastos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(226, 226, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSesion.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Salir");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        btnIngreso.setBackground(new java.awt.Color(51, 51, 51));
        btnIngreso.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        btnIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnIngreso.setText("Ingresos");
        btnIngreso.setBorder(null);
        btnIngreso.setBorderPainted(false);
        btnIngreso.setContentAreaFilled(false);
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnGasto.setBackground(new java.awt.Color(51, 51, 51));
        btnGasto.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        btnGasto.setForeground(new java.awt.Color(255, 255, 255));
        btnGasto.setText("Gastos");
        btnGasto.setBorder(null);
        btnGasto.setBorderPainted(false);
        btnGasto.setContentAreaFilled(false);
        btnGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastoActionPerformed(evt);
            }
        });
        jPanel2.add(btnGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btnResumen.setBackground(new java.awt.Color(51, 51, 51));
        btnResumen.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        btnResumen.setForeground(new java.awt.Color(255, 255, 255));
        btnResumen.setText("Resumen");
        btnResumen.setBorder(null);
        btnResumen.setBorderPainted(false);
        btnResumen.setContentAreaFilled(false);
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });
        jPanel2.add(btnResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        btnMeta.setBackground(new java.awt.Color(51, 51, 51));
        btnMeta.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        btnMeta.setForeground(new java.awt.Color(255, 255, 255));
        btnMeta.setText("Metas");
        btnMeta.setBorder(null);
        btnMeta.setBorderPainted(false);
        btnMeta.setContentAreaFilled(false);
        btnMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetaActionPerformed(evt);
            }
        });
        jPanel2.add(btnMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        btnPerfil.setBackground(new java.awt.Color(51, 51, 51));
        btnPerfil.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfil.setText("Mi Perfil");
        btnPerfil.setBorder(null);
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        jPanel2.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("TOTAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        jtblGastos.setBackground(new java.awt.Color(171, 171, 171));
        jtblGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblGastos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 370, 280));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("REGISTRA TUS GASTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("DESCRIPCIÓN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("RESUMEN DE GASTOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        cbxCategoria.setBackground(new java.awt.Color(171, 171, 171));
        cbxCategoria.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentación", "Transporte", "Entretenimiento", "Salud", "Vivienda", "Servicios", " " }));
        jPanel1.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 260, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("CATEGORÍA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 260, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("MONTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txtMonto.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 120, 40));

        txtFecha.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 120, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("FECHA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jPanel3.setBackground(new java.awt.Color(171, 171, 171));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 110, 30));

        jPanel4.setBackground(new java.awt.Color(171, 171, 171));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel4.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, 30));

        jPanel6.setBackground(new java.awt.Color(171, 171, 171));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 110, 30));
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed

    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastoActionPerformed

    }//GEN-LAST:event_btnGastoActionPerformed

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed

    }//GEN-LAST:event_btnResumenActionPerformed

    private void btnMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetaActionPerformed

    }//GEN-LAST:event_btnMetaActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed

    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGasto;
    public javax.swing.JButton btnIngresar;
    public javax.swing.JButton btnIngreso;
    public javax.swing.JButton btnMeta;
    public javax.swing.JButton btnPerfil;
    public javax.swing.JButton btnResumen;
    public javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtblGastos;
    public javax.swing.JLabel lblTotal;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
