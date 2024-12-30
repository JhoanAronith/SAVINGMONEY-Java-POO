package vista;

import java.awt.Image;
import java.awt.Toolkit;

public class FInicioSesion extends javax.swing.JFrame {

    public FInicioSesion() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/Icono.png"));
        this.setIconImage(img);
        this.setTitle("Iniciar Sesión");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIngresarUsuario1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIngresarPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        chkMostrarPassword = new javax.swing.JCheckBox();
        btnRegistrarme = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setBackground(new java.awt.Color(226, 226, 226));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SAVING MONEY");
        PanelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("TE DAMOS LA BIENVENIDA A");
        PanelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Swis721 Lt BT", 0, 24)); // NOI18N
        jLabel8.setText("__________ Regístrate para empezar a ahorrar ___________");
        PanelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        txtIngresarUsuario1.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtIngresarUsuario1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        PanelFondo.add(txtIngresarUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 280, 40));

        jLabel3.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        PanelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        jLabel4.setText("USUARIO");
        PanelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        txtIngresarPassword.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtIngresarPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        PanelFondo.add(txtIngresarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 280, 40));

        jLabel9.setFont(new java.awt.Font("Swis721 Lt BT", 0, 24)); // NOI18N
        jLabel9.setText("_____ Inicia sesión para acceder a tu app de finanzas _____");
        PanelFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        chkMostrarPassword.setBackground(new java.awt.Color(226, 226, 226));
        chkMostrarPassword.setFont(new java.awt.Font("Swis721 Lt BT", 0, 10)); // NOI18N
        chkMostrarPassword.setText("Mostrar contraseña");
        chkMostrarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarPasswordActionPerformed(evt);
            }
        });
        PanelFondo.add(chkMostrarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        btnRegistrarme.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarme.setText("REGISTRARME");
        btnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarmeActionPerformed(evt);
            }
        });
        PanelFondo.add(btnRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(204, 204, 204));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIngresar.setText("INGRESAR");
        PanelFondo.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 130, 30));

        getContentPane().add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkMostrarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarPasswordActionPerformed

    }//GEN-LAST:event_chkMostrarPasswordActionPerformed

    private void btnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarmeActionPerformed

    }//GEN-LAST:event_btnRegistrarmeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    public javax.swing.JButton btnIngresar;
    public javax.swing.JButton btnRegistrarme;
    public javax.swing.JCheckBox chkMostrarPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPasswordField txtIngresarPassword;
    public javax.swing.JTextField txtIngresarUsuario1;
    // End of variables declaration//GEN-END:variables
}
