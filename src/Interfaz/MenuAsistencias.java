
package Interfaz;

import laboratorio2018.Afiliado;
import laboratorio2018.Empleado;
import java.util.ArrayList;
import laboratorio2018.Afiliado;
import laboratorio2018.Empleado;
import laboratorio2018.Familiar;
import laboratorio2018.Sistema;

/**
 *
 * @author Rodrigo
 */
public class MenuAsistencias extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    //Afiliado afi = null;
    private ArrayList<Familiar> familiares = new ArrayList<Familiar>();
    
    public MenuAsistencias(Sistema c,Afiliado a,Empleado e) {
        sistema=c;
        afiliado=a;
        empleado=e;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU ASISTENCIAS MEDICAS");
    }
   
    public MenuAsistencias() {

        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalirMenuPrincipal = new javax.swing.JButton();
        jButtonVerAsistencias = new javax.swing.JButton();
        jButtonBrindarAsistencia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonDefinirDiagnostico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSalirMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonSalirMenuPrincipal.setText("VOLVER");
        jButtonSalirMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirMenuPrincipalActionPerformed(evt);
            }
        });

        jButtonVerAsistencias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVerAsistencias.setText("VER ASISTENCIAS POR INTERVALO DE TIEMPO");
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

        jButtonDefinirDiagnostico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDefinirDiagnostico.setText("DEFINIR DIAGNOSTICO");
        jButtonDefinirDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDefinirDiagnosticoActionPerformed(evt);
            }
        });

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
                            .addComponent(jButtonBrindarAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addComponent(jButtonDefinirDiagnostico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBrindarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerAsistencias, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDefinirDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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

        ComprobarAsistencia b = new ComprobarAsistencia(sistema,afiliado,empleado);
        b.setVisible(true);
        dispose();
        

    }//GEN-LAST:event_jButtonVerAsistenciasActionPerformed
 
    private void jButtonBrindarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrindarAsistenciaActionPerformed
        
        AprobarAsistencia aa = new AprobarAsistencia(sistema,afiliado,empleado);
        aa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBrindarAsistenciaActionPerformed

    private void jButtonDefinirDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDefinirDiagnosticoActionPerformed
        BuscarAsistencia ba = new BuscarAsistencia(sistema,afiliado,empleado);
        ba.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonDefinirDiagnosticoActionPerformed

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
    private javax.swing.JButton jButtonDefinirDiagnostico;
    private javax.swing.JButton jButtonSalirMenuPrincipal;
    private javax.swing.JButton jButtonVerAsistencias;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
