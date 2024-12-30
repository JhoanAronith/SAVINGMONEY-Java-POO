package vista;

import java.awt.Image;
import java.awt.Toolkit;

public class FMeta extends javax.swing.JFrame {

    public FMeta() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/Icono.png"));
        this.setIconImage(img);
        this.setTitle("Metas de ahorro");
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
        jPanel3 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pgsMeta = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMetas = new javax.swing.JTable();
        txtNombreMeta = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMontoActual = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnDepositar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnNuevaMeta = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnEditarMeta = new javax.swing.JButton();

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

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 120, 40));

        jLabel2.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Inicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 50, -1));

        pgsMeta.setBackground(new java.awt.Color(153, 153, 153));
        pgsMeta.setValue(30);
        pgsMeta.setBorderPainted(false);
        jPanel1.add(pgsMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 380, 30));

        tblMetas.setBackground(new java.awt.Color(171, 171, 171));
        tblMetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMetas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 380, 270));

        txtNombreMeta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtNombreMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 40));

        txtFechaInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ALCANZA TUS METAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 40, -1));

        txtFechaFin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 120, 40));

        jLabel5.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Monto Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, -1));

        txtMontoTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, 40));

        jLabel7.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Monto actual");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 110, -1));

        txtMontoActual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtMontoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 120, 40));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDepositar.setBackground(new java.awt.Color(51, 51, 51));
        btnDepositar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDepositar.setForeground(new java.awt.Color(255, 255, 255));
        btnDepositar.setText("DEPOSITAR");
        btnDepositar.setBorderPainted(false);
        btnDepositar.setContentAreaFilled(false);
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        jPanel5.add(btnDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 120, 40));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaMeta.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevaMeta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNuevaMeta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaMeta.setText("NUEVA META");
        btnNuevaMeta.setBorderPainted(false);
        btnNuevaMeta.setContentAreaFilled(false);
        btnNuevaMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMetaActionPerformed(evt);
            }
        });
        jPanel6.add(btnNuevaMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, 40));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 120, 40));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarMeta.setBackground(new java.awt.Color(51, 51, 51));
        btnEditarMeta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarMeta.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarMeta.setText("EDITAR META");
        btnEditarMeta.setBorderPainted(false);
        btnEditarMeta.setContentAreaFilled(false);
        btnEditarMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMetaActionPerformed(evt);
            }
        });
        jPanel8.add(btnEditarMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 180, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed

    }//GEN-LAST:event_btnCerrarSesionActionPerformed

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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed

    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevaMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMetaActionPerformed


    }//GEN-LAST:event_btnNuevaMetaActionPerformed

    private void btnEditarMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMetaActionPerformed

    }//GEN-LAST:event_btnEditarMetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEditarMeta;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGasto;
    public javax.swing.JButton btnIngreso;
    public javax.swing.JButton btnMeta;
    public javax.swing.JButton btnNuevaMeta;
    public javax.swing.JButton btnPerfil;
    public javax.swing.JButton btnResumen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar pgsMeta;
    private javax.swing.JTable tblMetas;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtMontoActual;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtNombreMeta;
    // End of variables declaration//GEN-END:variables
}
