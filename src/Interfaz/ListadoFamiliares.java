/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import laboratorio2018.Afiliado;
import laboratorio2018.Sistema;
import laboratorio2018.Familiar;

/**
 *
 * @author Rodrigo
 */
public class ListadoFamiliares extends javax.swing.JFrame {

    private ArrayList<Familiar> familiares = new ArrayList<Familiar>();
    private Sistema sistema;

    public ListadoFamiliares(Sistema c, String dniclave) {
        sistema = c;
        String dni = dniclave;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("LISTADO DE FAMILIARES DEL AFILIADO");

        Familiar familiar = null;
        for (Familiar a : sistema.getFamiliares()) {
            if (!sistema.getAfiliados().isEmpty()) {
                if (a.getClaveFamiliar().equals(dni)) {
                    familiar = a;
                }
            }

        }
        if (familiar != null) {
            Iterator iterador = sistema.getFamiliares().listIterator(); //el objeto iterador te ayuda a recorrer una coleccion.
            while (iterador.hasNext()) {
                jTextAreaListadoFamiliares.append(iterador.next() + "\n\n"); //el objeto jtlistadofamiliares es un JTextArea y el método append agrega el contenido de persona al area de texto
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON FAMILIARES", "LISTA VACIA", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public ListadoFamiliares() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButtonVolverGestionAfiliado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListadoFamiliares = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("LISTADO DE FAMILIARES");

        jButtonVolverGestionAfiliado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolverGestionAfiliado.setText("Volver");
        jButtonVolverGestionAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverGestionAfiliadoActionPerformed(evt);
            }
        });

        jTextAreaListadoFamiliares.setColumns(20);
        jTextAreaListadoFamiliares.setRows(5);
        jScrollPane1.setViewportView(jTextAreaListadoFamiliares);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2)
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVolverGestionAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVolverGestionAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverGestionAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverGestionAfiliadoActionPerformed
        // TODO add your handling code here:
        GestionAfiliados ges = new GestionAfiliados(sistema);
        ges.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverGestionAfiliadoActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoFamiliares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoFamiliares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoFamiliares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoFamiliares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoFamiliares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolverGestionAfiliado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaListadoFamiliares;
    // End of variables declaration//GEN-END:variables
}