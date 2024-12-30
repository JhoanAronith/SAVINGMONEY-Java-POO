package vista;

public class FEditarPerfil extends javax.swing.JFrame {

    public FEditarPerfil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNuevoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNuevoApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEditarPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEditarUsuario = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("EDITAR PERFIL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtNuevoNombre.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtNuevoNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtNuevoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 260, 40));

        jLabel5.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtNuevoApellido.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtNuevoApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtNuevoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 40));

        jLabel6.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtEditarPassword.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtEditarPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtEditarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, 40));

        jLabel7.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtEditarUsuario.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtEditarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 40));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel6.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JTextField txtEditarPassword;
    public javax.swing.JTextField txtEditarUsuario;
    public javax.swing.JTextField txtNuevoApellido;
    public javax.swing.JTextField txtNuevoNombre;
    // End of variables declaration//GEN-END:variables
}
