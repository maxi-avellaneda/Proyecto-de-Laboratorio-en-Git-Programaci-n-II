
package Interfaz;

import laboratorio2018.Afiliado;
import laboratorio2018.Empleado;
import laboratorio2018.Sistema;

/**
 *
 * @author maxix
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    
    public MenuPrincipal() {
        initComponents();
    }
    
    public MenuPrincipal(Sistema c){
        initComponents();
        sistema=c;
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU PRINCIPAL");
    }
    public MenuPrincipal(Sistema c,Afiliado a,Empleado e) {
        initComponents();
        sistema=c;
        afiliado=a;
        empleado=e;
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU PRINCIPAL");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonMenuGestiones = new javax.swing.JButton();
        jButtonGestionAsistencia = new javax.swing.JButton();
        jButtonSalirMenuPrincipal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonGestionPagos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText(" \"SISTEMA DE EMERGENCIAS MEDICAS\"");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        jLabel2.setText("MENÚ PRINCIPAL");

        jLabel3.setText("INGRESAR A:");

        jLabel4.setText("INGRESAR A:");

        jButtonMenuGestiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMenuGestiones.setText("GESTIONES DEL SISTEMA");
        jButtonMenuGestiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuGestionesActionPerformed(evt);
            }
        });

        jButtonGestionAsistencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGestionAsistencia.setText("ASISTENCIAS MÉDICAS");
        jButtonGestionAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionAsistenciaActionPerformed(evt);
            }
        });

        jButtonSalirMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonSalirMenuPrincipal.setText("Salir");
        jButtonSalirMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirMenuPrincipalActionPerformed(evt);
            }
        });

        jLabel5.setText("INGRESAR A:");

        jButtonGestionPagos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGestionPagos.setText("GESTIONAR PAGOS");
        jButtonGestionPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionPagosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGestionAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addComponent(jButtonMenuGestiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGestionPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))))
                .addContainerGap(128, Short.MAX_VALUE))
            .addComponent(jButtonSalirMenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jButtonMenuGestiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGestionAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGestionPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalirMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuGestionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuGestionesActionPerformed
        // TODO add your handling code here:
        MenuGestiones mg = new MenuGestiones(sistema,afiliado,empleado);
        mg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMenuGestionesActionPerformed

    private void jButtonSalirMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirMenuPrincipalActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirMenuPrincipalActionPerformed

    private void jButtonGestionAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionAsistenciaActionPerformed

        MenuAsistencias menu = new MenuAsistencias(sistema,afiliado,empleado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGestionAsistenciaActionPerformed

    private void jButtonGestionPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionPagosActionPerformed
        GestionPagos ges = new GestionPagos(sistema,afiliado,empleado);
        ges.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGestionPagosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestionAsistencia;
    private javax.swing.JButton jButtonGestionPagos;
    private javax.swing.JButton jButtonMenuGestiones;
    private javax.swing.JButton jButtonSalirMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
