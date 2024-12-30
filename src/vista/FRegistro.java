package vista;

import java.awt.Image;
import java.awt.Toolkit;

public class FRegistro extends javax.swing.JFrame {

    public FRegistro() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/Icono.png"));
        this.setIconImage(img);
        this.setTitle("Registrarse");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRegistrarNombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRegistrarApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRegistrarUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRegistrarPassword = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(226, 226, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("SE UN USUARIO NUEVO EN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SAVING MONEY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtRegistrarNombres.setBackground(new java.awt.Color(226, 226, 226));
        txtRegistrarNombres.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtRegistrarNombres.setBorder(null);
        txtRegistrarNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrarNombresActionPerformed(evt);
            }
        });
        jPanel1.add(txtRegistrarNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 260, 40));

        jLabel7.setText("_____________________________________________________");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 270, -1));

        txtRegistrarApellidos.setBackground(new java.awt.Color(226, 226, 226));
        txtRegistrarApellidos.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtRegistrarApellidos.setBorder(null);
        txtRegistrarApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrarApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtRegistrarApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 260, 40));

        jLabel8.setText("_____________________________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 270, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel10.setText("Usuario");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel4.setText("Nombres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        txtRegistrarUsuario.setBackground(new java.awt.Color(226, 226, 226));
        txtRegistrarUsuario.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtRegistrarUsuario.setBorder(null);
        txtRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 260, 40));

        jLabel11.setText("_____________________________________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 270, -1));

        jLabel9.setText("_____________________________________________________");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 270, -1));

        txtRegistrarPassword.setBackground(new java.awt.Color(226, 226, 226));
        txtRegistrarPassword.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtRegistrarPassword.setBorder(null);
        txtRegistrarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrarPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtRegistrarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 260, 40));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtRegistrarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrarPasswordActionPerformed
        
    }//GEN-LAST:event_txtRegistrarPasswordActionPerformed

    private void txtRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrarUsuarioActionPerformed
        
    }//GEN-LAST:event_txtRegistrarUsuarioActionPerformed

    private void txtRegistrarApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrarApellidosActionPerformed
        
    }//GEN-LAST:event_txtRegistrarApellidosActionPerformed

    private void txtRegistrarNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrarNombresActionPerformed
        
    }//GEN-LAST:event_txtRegistrarNombresActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtRegistrarApellidos;
    public javax.swing.JTextField txtRegistrarNombres;
    public javax.swing.JTextField txtRegistrarPassword;
    public javax.swing.JTextField txtRegistrarUsuario;
    // End of variables declaration//GEN-END:variables
}
