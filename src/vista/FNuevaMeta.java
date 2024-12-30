package vista;

import java.awt.Image;
import java.awt.Toolkit;

public class FNuevaMeta extends javax.swing.JFrame {

    public FNuevaMeta() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/Icono.png"));
        this.setIconImage(img);
        this.setTitle("Nueva Meta");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreNuevaMeta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNuevoFechaFin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNuevoMontoTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnNuevaMeta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(226, 226, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtNombreNuevaMeta.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtNombreNuevaMeta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtNombreNuevaMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 40));

        jLabel6.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha Final");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 100, -1));

        txtNuevoFechaFin.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtNuevoFechaFin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtNuevoFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoFechaFinActionPerformed(evt);
            }
        });
        jPanel1.add(txtNuevoFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, 40));

        jLabel5.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Monto Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, -1));

        txtNuevoMontoTotal.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtNuevoMontoTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(txtNuevoMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("NUEVA META");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaMeta.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevaMeta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNuevaMeta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaMeta.setText("CREAR META");
        btnNuevaMeta.setBorderPainted(false);
        btnNuevaMeta.setContentAreaFilled(false);
        btnNuevaMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMetaActionPerformed(evt);
            }
        });
        jPanel6.add(btnNuevaMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNuevoFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoFechaFinActionPerformed
        
    }//GEN-LAST:event_txtNuevoFechaFinActionPerformed

    private void btnNuevaMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMetaActionPerformed
        
    }//GEN-LAST:event_btnNuevaMetaActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaMeta;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtNombreNuevaMeta;
    private javax.swing.JTextField txtNuevoFechaFin;
    private javax.swing.JTextField txtNuevoMontoTotal;
    // End of variables declaration//GEN-END:variables
}
