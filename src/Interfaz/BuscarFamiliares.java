
package Interfaz;

import Exceptions.AfiliadoNoEncontradoException;
import Exceptions.VerficarCampoVacioException;
import Exceptions.VerificarDniException;
import Exceptions.VerificarRepetidosException;
import java.util.Iterator;
import javax.swing.JOptionPane;
import laboratorio2018.Afiliado;
import laboratorio2018.Sistema;

/**
 *
 * @author Rodrigo
 */
public class BuscarFamiliares extends javax.swing.JFrame {

    private Sistema sistema;
     public BuscarFamiliares(Sistema c) {
        sistema = c;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("BAJA DE FAMILIAR");
    }
    public BuscarFamiliares() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonVolverGestionAfiliados = new javax.swing.JButton();
        jButtonBuscarFamiliar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDniActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("INGRESE DNI DEL AFILIADO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("VER FAMILIARES INSCRIPTOS");

        jButtonVolverGestionAfiliados.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonVolverGestionAfiliados.setText("Volver");
        jButtonVolverGestionAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverGestionAfiliadosActionPerformed(evt);
            }
        });

        jButtonBuscarFamiliar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuscarFamiliar.setText("BUSCAR");
        jButtonBuscarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFamiliarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVolverGestionAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBuscarFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButtonBuscarFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButtonVolverGestionAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarDniActionPerformed

    private void jButtonVolverGestionAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverGestionAfiliadosActionPerformed

        GestionAfiliados gs = new GestionAfiliados(sistema);
        gs.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverGestionAfiliadosActionPerformed

    private void jButtonBuscarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFamiliarActionPerformed
        try {
            String dni = buscarDni.getText();
            verificarDatos(dni);
            sistema.buscarAfiliado(dni);
            Afiliado afiliado = null;
            for (Afiliado a : sistema.getAfiliados()) {
                if (a.getDni().equals(dni)) {
                    afiliado = a;
                }
            }
            if(afiliado != null) {
                ListadoFamiliares l = new ListadoFamiliares(sistema,dni);
                l.setVisible(true);
            }
        } catch (VerificarDniException vdni) {
            JOptionPane.showMessageDialog(null, "Dni Invalido", "Error!", JOptionPane.OK_OPTION);
        } catch (AfiliadoNoEncontradoException pnee) {
            JOptionPane.showMessageDialog(null, "No se encontro al afiliado", "Aviso!", JOptionPane.WARNING_MESSAGE);
        }catch(VerficarCampoVacioException cav){
           JOptionPane.showMessageDialog(null, "Campo Vacio, ingrese de nuevo", "Atencion!", JOptionPane.QUESTION_MESSAGE);
       }
        finally {
            buscarDni.setText(null);
        }
    }//GEN-LAST:event_jButtonBuscarFamiliarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarFamiliares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarFamiliares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarFamiliares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarFamiliares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarFamiliares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarDni;
    private javax.swing.JButton jButtonBuscarFamiliar;
    private javax.swing.JButton jButtonVolverGestionAfiliados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}