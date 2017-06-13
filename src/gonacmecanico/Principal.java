/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gonacmecanico;

/**
 *
 * @author Mao
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuUsuarios = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuAlta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCamAlta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuGenerar = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Jefe de Mecanica");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/pie.png"))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/sistema.png"))); // NOI18N
        jMenu1.setText("Sistema");

        mnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/usuarios.png"))); // NOI18N
        mnuUsuarios.setText("Usuarios");
        mnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuUsuarios);

        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/salir.png"))); // NOI18N
        mnuSalir.setText("Salir del sistema");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/mecanicos.png"))); // NOI18N
        jMenu2.setText("Mecanicos");

        mnuAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/personal.png"))); // NOI18N
        mnuAlta.setText("Administración");
        mnuAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAlta);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/camion.png"))); // NOI18N
        jMenu3.setText("Vehículos");

        mnuCamAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/gestionCam.png"))); // NOI18N
        mnuCamAlta.setText("Administración");
        mnuCamAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCamAltaActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCamAlta);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/estados.png"))); // NOI18N
        jMenu4.setText("Estados");

        mnuGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/generar.png"))); // NOI18N
        mnuGenerar.setText("Generar");
        mnuGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGenerarActionPerformed(evt);
            }
        });
        jMenu4.add(mnuGenerar);

        jMenuBar1.add(jMenu4);

        mnuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/Sin nombre.png"))); // NOI18N
        mnuReportes.setText("Reportes");

        jMenuItem2.setText("General");
        mnuReportes.add(jMenuItem2);

        jMenuItem3.setText("Mecanicos");
        mnuReportes.add(jMenuItem3);

        jMenuItem4.setText("Camiones");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem4);

        jMenuItem5.setText("Mecanico");
        mnuReportes.add(jMenuItem5);

        jMenuItem6.setText("Camion");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem6);

        jMenuBar1.add(mnuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 386, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuariosActionPerformed
      altaPersonal frm=new altaPersonal(); 
      frm.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_mnuUsuariosActionPerformed

    private void mnuAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaActionPerformed
       altaMecanico frm=new altaMecanico();
       frm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_mnuAltaActionPerformed

    private void mnuCamAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCamAltaActionPerformed
       altaCamion frm=new altaCamion();
       frm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_mnuCamAltaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mnuGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGenerarActionPerformed
       generarEstado frm=new generarEstado();
       frm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_mnuGenerarActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem mnuAlta;
    private javax.swing.JMenuItem mnuCamAlta;
    private javax.swing.JMenuItem mnuGenerar;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
