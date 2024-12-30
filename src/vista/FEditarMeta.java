package vista;

import java.awt.Image;
import java.awt.Toolkit;

public class FEditarMeta extends javax.swing.JFrame {

    public FEditarMeta() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/Icono.png"));
        this.setIconImage(img);
        this.setTitle("Editar Meta");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtEditarNombreMeta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEditarFechaFin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEditarMontoTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnEditarMeta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(226, 226, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtEditarNombreMeta.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtEditarNombreMeta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtEditarNombreMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarNombreMetaActionPerformed(evt);
            }
        });
        jPanel1.add(txtEditarNombreMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 40));

        jLabel6.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha Final");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 100, -1));

        txtEditarFechaFin.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtEditarFechaFin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtEditarFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarFechaFinActionPerformed(evt);
            }
        });
        jPanel1.add(txtEditarFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, 40));

        jLabel5.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Monto Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, -1));

        txtEditarMontoTotal.setFont(new java.awt.Font("Swis721 Lt BT", 0, 18)); // NOI18N
        txtEditarMontoTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txtEditarMontoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarMontoTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtEditarMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("NUEVA META");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel6.add(btnEditarMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEditarFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarFechaFinActionPerformed

    }//GEN-LAST:event_txtEditarFechaFinActionPerformed

    private void btnEditarMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMetaActionPerformed

    }//GEN-LAST:event_btnEditarMetaActionPerformed

    private void txtEditarNombreMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarNombreMetaActionPerformed
        
    }//GEN-LAST:event_txtEditarNombreMetaActionPerformed

    private void txtEditarMontoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarMontoTotalActionPerformed
        
    }//GEN-LAST:event_txtEditarMontoTotalActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarMeta;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtEditarFechaFin;
    private javax.swing.JTextField txtEditarMontoTotal;
    private javax.swing.JTextField txtEditarNombreMeta;
    // End of variables declaration//GEN-END:variables
}
