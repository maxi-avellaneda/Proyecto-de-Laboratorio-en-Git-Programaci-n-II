
package Interfaz;

import Exceptions.VerficarCampoVacioException;
import Exceptions.VerificarDniException;
import javax.swing.JOptionPane;
import laboratorio2018.Afiliado;
import laboratorio2018.Empleado;
import laboratorio2018.Familiar;
import laboratorio2018.Sistema;

/**
 *
 * @author Rodrigo
 */
public class BajaFamiliar extends javax.swing.JFrame {
    
    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;

    public BajaFamiliar(Sistema c,Afiliado a,Empleado e) {
        sistema = c;
        afiliado=a;
        empleado=e;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("BAJA DE FAMILIAR");
    }

    public BajaFamiliar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dniBaja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonVolverGestionAfiliados = new javax.swing.JButton();
        jButtonDarBajaAFamilioar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("INGRESE DNI DEL FAMILIAR:");

        dniBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniBajaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("BAJA DE FAMILIAR");

        jButtonVolverGestionAfiliados.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonVolverGestionAfiliados.setText("Volver");
        jButtonVolverGestionAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverGestionAfiliadosActionPerformed(evt);
            }
        });

        jButtonDarBajaAFamilioar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDarBajaAFamilioar.setText("Dar de Baja");
        jButtonDarBajaAFamilioar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarBajaAFamilioarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVolverGestionAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDarBajaAFamilioar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButtonDarBajaAFamilioar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButtonVolverGestionAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniBajaActionPerformed

    private void jButtonVolverGestionAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverGestionAfiliadosActionPerformed

        GestionAfiliados gs = new GestionAfiliados(sistema,afiliado,empleado);
        gs.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverGestionAfiliadosActionPerformed

    private void jButtonDarBajaAFamilioarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDarBajaAFamilioarActionPerformed
       
        try {
            
            String dni = dniBaja.getText();
            verificarDatos(dni);
            Familiar familiar = null;
            for (Familiar f : afiliado.getFamiliares()) {
                if (f.getDni().equals(dni)) { 
                    familiar=f;
                }
            }   
            if(familiar!=null){
                afiliado.getFamiliares().remove(familiar);
                JOptionPane.showMessageDialog(null, "Familiar dado de baja correctamente", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "FAMILIAR NO REGISTRADO", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
            
            MenuPrincipal m = new MenuPrincipal(sistema,afiliado,empleado);
            m.setVisible(true);
            dispose();
        }catch (VerificarDniException vdni) {
            JOptionPane.showMessageDialog(null, "Dni Invalido", "Error!", JOptionPane.OK_OPTION);
        } /*catch (FamiliarNoEncontradoException pnee) {
            JOptionPane.showMessageDialog(null, "Familiar no registrado", "Aviso!", JOptionPane.WARNING_MESSAGE);
        }*/catch (VerficarCampoVacioException cav) {
            JOptionPane.showMessageDialog(null, "Campo Vacio, ingrese de nuevo", "Atencion!", JOptionPane.QUESTION_MESSAGE);
        }
        finally {
            dniBaja.setText(null);
        }
    }//GEN-LAST:event_jButtonDarBajaAFamilioarActionPerformed

    public void verificarDatos(String dni) throws VerificarDniException, VerficarCampoVacioException {

        if (dni.equals("")) {
            throw new VerficarCampoVacioException();
        }
        if (dni.length() == 8 || dni.length() == 7) {
            int numero = Integer.parseInt(dni);
            if (numero < 1000000) {
                throw new VerificarDniException();
            }
        } else {
            throw new VerificarDniException();
        }
    }
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
            java.util.logging.Logger.getLogger(BajaFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaFamiliar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dniBaja;
    private javax.swing.JButton jButtonDarBajaAFamilioar;
    private javax.swing.JButton jButtonVolverGestionAfiliados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
