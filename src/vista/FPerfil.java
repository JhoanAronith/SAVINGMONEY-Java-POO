package vista;

import java.awt.Image;
import java.awt.Toolkit;


public class FPerfil extends javax.swing.JFrame {

    public FPerfil() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/Icono.png"));
        this.setIconImage(img);
        this.setTitle("Mi perfil");
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
        btnPerfil1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtApellido = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnEditarPerfil = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnEliminarUsuario = new javax.swing.JButton();

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

        btnPerfil1.setBackground(new java.awt.Color(51, 51, 51));
        btnPerfil1.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        btnPerfil1.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfil1.setText("Mi Perfil");
        btnPerfil1.setBorder(null);
        btnPerfil1.setBorderPainted(false);
        btnPerfil1.setContentAreaFilled(false);
        btnPerfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfil1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPerfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ICONO USUARIO");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 300, 330));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MI PERFIL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel10.setText("__________________________________________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 290, -1));

        jLabel11.setText("__________________________________________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 290, -1));

        jLabel12.setText("__________________________________________________________");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 290, -1));

        jLabel14.setText("__________________________________________________________");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 290, -1));

        jLabel8.setFont(new java.awt.Font("Swis721 Lt BT", 0, 20)); // NOI18N
        jLabel8.setText("Contraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 Lt BT", 0, 20)); // NOI18N
        jLabel6.setText("Apellidos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Swis721 Lt BT", 0, 20)); // NOI18N
        jLabel9.setText("Nombres:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Swis721 Lt BT", 0, 20)); // NOI18N
        jLabel5.setText("Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        txtPassword.setBackground(new java.awt.Color(226, 226, 226));
        txtPassword.setFont(new java.awt.Font("Swis721 Lt BT", 0, 14)); // NOI18N
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 280, 30));

        txtApellido.setBackground(new java.awt.Color(226, 226, 226));
        txtApellido.setFont(new java.awt.Font("Swis721 Lt BT", 0, 14)); // NOI18N
        txtApellido.setBorder(null);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 280, 30));

        txtUsuario.setBackground(new java.awt.Color(226, 226, 226));
        txtUsuario.setFont(new java.awt.Font("Swis721 Lt BT", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 280, 30));

        txtNombre.setBackground(new java.awt.Color(226, 226, 226));
        txtNombre.setFont(new java.awt.Font("Swis721 Lt BT", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 280, 30));

        jPanel4.setBackground(new java.awt.Color(171, 171, 171));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarPerfil.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditarPerfil.setText("EDITAR");
        btnEditarPerfil.setBorderPainted(false);
        btnEditarPerfil.setContentAreaFilled(false);
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });
        jPanel4.add(btnEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 110, 30));

        jPanel6.setBackground(new java.awt.Color(171, 171, 171));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEliminarUsuario.setText("ELIMINAR");
        btnEliminarUsuario.setBorderPainted(false);
        btnEliminarUsuario.setContentAreaFilled(false);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 110, 30));

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

    private void btnPerfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfil1ActionPerformed

    }//GEN-LAST:event_btnPerfil1ActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed

    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed

    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnEliminarUsuario;
    public javax.swing.JButton btnGasto;
    public javax.swing.JButton btnIngreso;
    public javax.swing.JButton btnMeta;
    public javax.swing.JButton btnPerfil1;
    public javax.swing.JButton btnResumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
