
package Interfaz;

<<<<<<< HEAD
import laboratorio2018.Afiliado;
import laboratorio2018.Empleado;
=======
import java.util.ArrayList;
import laboratorio2018.Afiliado;
import laboratorio2018.Empleado;
import laboratorio2018.Familiar;
>>>>>>> 850cd290e44c0fc94ef4c89b726ed5f19444446e
import laboratorio2018.Sistema;

/**
 *
 * @author Rodrigo
 */
public class MenuAsistencias extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
<<<<<<< HEAD
    
    public MenuAsistencias(Sistema c,Afiliado a,Empleado e) {
        sistema=c;
        afiliado=a;
        empleado=e;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU ASISTENCIAS MEDICAS");
    }
    public MenuAsistencias(){
=======
    public Afiliado afi = null;
      private ArrayList<Familiar> familiares = new ArrayList<Familiar>();

    public MenuAsistencias(Sistema c) {
        sistema = c;
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("BAJA DE FAMILIAR");
    }

    public MenuAsistencias(Sistema c, Afiliado a,Empleado e) {
        sistema = c;
        afiliado = a;
        empleado=e;
        //System.out.println("Familiares: "+afiliado.getFamiliares());
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("BAJA DE FAMILIAR");
    }

    public MenuAsistencias() {
>>>>>>> 850cd290e44c0fc94ef4c89b726ed5f19444446e
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalirMenuPrincipal = new javax.swing.JButton();
        jButtonVerAsistencias = new javax.swing.JButton();
        jButtonBrindarAsistencia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSalirMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonSalirMenuPrincipal.setText("VOLVER");
        jButtonSalirMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirMenuPrincipalActionPerformed(evt);
            }
        });

        jButtonVerAsistencias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVerAsistencias.setText("VER ASISTENCIAS ");
        jButtonVerAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerAsistenciasActionPerformed(evt);
            }
        });

        jButtonBrindarAsistencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBrindarAsistencia.setText("BRINDAR UNA ASISTENCIA");
        jButtonBrindarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrindarAsistenciaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        jLabel2.setText("MENÚ DE ASISTENCIAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSalirMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonVerAsistencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBrindarAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBrindarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerAsistencias, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(82, 82, 82)
                .addComponent(jButtonSalirMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirMenuPrincipalActionPerformed
        // TODO add your handling code here:
        MenuPrincipal m = new MenuPrincipal(sistema,afiliado,empleado);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSalirMenuPrincipalActionPerformed

    private void jButtonVerAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerAsistenciasActionPerformed
<<<<<<< HEAD
        

    }//GEN-LAST:event_jButtonVerAsistenciasActionPerformed

    private void jButtonBrindarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrindarAsistenciaActionPerformed
        
=======
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerAsistenciasActionPerformed

    private void jButtonBrindarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrindarAsistenciaActionPerformed
        // TODO add your handling code here:
        AprobarAsistencia aa = new AprobarAsistencia(sistema,afiliado,empleado);
        aa.setVisible(true);
>>>>>>> 850cd290e44c0fc94ef4c89b726ed5f19444446e
        dispose();
    }//GEN-LAST:event_jButtonBrindarAsistenciaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAsistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBrindarAsistencia;
    private javax.swing.JButton jButtonSalirMenuPrincipal;
    private javax.swing.JButton jButtonVerAsistencias;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
