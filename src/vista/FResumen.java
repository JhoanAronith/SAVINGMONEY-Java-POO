package vista;

import java.awt.Image;
import java.awt.Toolkit;

public class FResumen extends javax.swing.JFrame {

    public FResumen() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/Icono.png"));
        this.setIconImage(img);
        this.setTitle("Resumen Financiero");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblIngreso1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGasto = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblDiferencia = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("RESUMEN GENERAL DE INGRESOS Y GASTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("RESUMEN DE INGRESOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblIngreso1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblIngreso1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 220));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 250, 250));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGasto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblGasto);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 220));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 250, 250));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("RESUMEN DE GASTOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        lblDiferencia.setBackground(new java.awt.Color(255, 255, 255));
        lblDiferencia.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        lblDiferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblDiferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 110, 40));

        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnGasto;
    public javax.swing.JButton btnIngreso;
    public javax.swing.JButton btnMeta;
    public javax.swing.JButton btnPerfil;
    public javax.swing.JButton btnResumen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblDiferencia;
    public javax.swing.JTable tblGasto;
    public javax.swing.JTable tblIngreso1;
    // End of variables declaration//GEN-END:variables
}
