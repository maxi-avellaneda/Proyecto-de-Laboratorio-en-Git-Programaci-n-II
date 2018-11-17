/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import laboratorio2018.Afiliado;
import laboratorio2018.Asistencia;
import laboratorio2018.Diagnostico;
import laboratorio2018.Empleado;
import laboratorio2018.Sistema;

/**
 *
 * @author Rodrigo
 */
public class AgregarDiagnostico extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    String dia, mes, anio;
    private ArrayList<Asistencia> asistencias = new ArrayList<Asistencia>();

    public AgregarDiagnostico(Sistema c, Afiliado a, Empleado e, String d, String m, String an) {
        sistema = c;
        empleado = e;
        afiliado = a;

        dia = d;
        mes = m;
        anio = an;

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("AGREGAR DIAGNOSTICO");
    }

    public AgregarDiagnostico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        diagnostico = new java.awt.TextField();
        GuardarDiagnostico = new javax.swing.JButton();
        VolverMenuAsistencias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("DEFINIR TRATAMIENTO-DIAGNOSTICO");

        diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosticoActionPerformed(evt);
            }
        });

        GuardarDiagnostico.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        GuardarDiagnostico.setText("Guardar Diagnostico");
        GuardarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDiagnosticoActionPerformed(evt);
            }
        });

        VolverMenuAsistencias.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        VolverMenuAsistencias.setText("Volver");
        VolverMenuAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverMenuAsistenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(GuardarDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(VolverMenuAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(104, 104, 104))))
            .addComponent(diagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(VolverMenuAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GuardarDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosticoActionPerformed

    }//GEN-LAST:event_diagnosticoActionPerformed

    private void GuardarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDiagnosticoActionPerformed

        String diag;
        diag = diagnostico.getText();
        Diagnostico d = new Diagnostico(diag);
        Asistencia as = null;
        for (Asistencia asis : sistema.getAsistencias()) {
            if (asis.getDia().equals(dia) && asis.getMes().equals(mes) && asis.getAnio().equals(anio)) {
                as = asis;
                as.setDiagnostico(d);
            }
        }
        if (as != null) {
            JOptionPane.showMessageDialog(null, "DIAGNOSTICO GUARDADO", "Operacion Exitosa!!!!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "FALLO RARO", "VERIFIQUE!!!!", JOptionPane.OK_OPTION);
        }

        MenuAsistencias mn = new MenuAsistencias(sistema, afiliado, empleado);
        mn.setVisible(true);
        dispose();

    }//GEN-LAST:event_GuardarDiagnosticoActionPerformed

    private void VolverMenuAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverMenuAsistenciasActionPerformed
        MenuAsistencias me = new MenuAsistencias(sistema, afiliado, empleado);
        me.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverMenuAsistenciasActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarDiagnostico;
    private javax.swing.JButton VolverMenuAsistencias;
    private java.awt.TextField diagnostico;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
