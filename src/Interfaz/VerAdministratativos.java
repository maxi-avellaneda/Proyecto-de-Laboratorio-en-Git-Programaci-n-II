
package Interfaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import laboratorio2018.Administrativo;
import laboratorio2018.Afiliado;
import laboratorio2018.Doctor;
import laboratorio2018.Empleado;
import laboratorio2018.Sistema;

/**
 *
 * @author maxix
 */
public class VerAdministratativos extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    private ArrayList<Administrativo> adminis = new ArrayList<Administrativo>();
    public VerAdministratativos() {
        initComponents();
    }

    public VerAdministratativos(Sistema c, Afiliado a, Empleado e) {
        sistema = c;
        afiliado = a;
        empleado = e;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("DOCTORES DISPONIBLES");
        String estado = "Libre";
        
        for(Administrativo doc: empleado.getAdminis()){
            if(doc.getEstado().equals(estado)){
                adminis.add(doc);
            }
        }
      
        if (adminis.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON DOCTORES", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        }
        for (Administrativo doct : adminis) {

            verAd.append("Administrativo: "+doct.getNombre()+" "+ doct.getApellido()+"\nEstado: "+doct.getEstado()+"\nNro de Legajo: "+doct.getLegajo() + "\n\n");
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        verAd = new javax.swing.JTextArea();
        volverAsignarEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("ADMINISTRATIVOS DISPONIBLES");

        verAd.setColumns(20);
        verAd.setRows(5);
        jScrollPane1.setViewportView(verAd);

        volverAsignarEmpleados.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        volverAsignarEmpleados.setText("Volver");
        volverAsignarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAsignarEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(volverAsignarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volverAsignarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverAsignarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAsignarEmpleadosActionPerformed
        //AsignarEmpleados a = new AsignarEmpleados(sistema, afiliado, empleado);
        //a.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverAsignarEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(VerAdministratativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerAdministratativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerAdministratativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerAdministratativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerAdministratativos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea verAd;
    private javax.swing.JButton volverAsignarEmpleados;
    // End of variables declaration//GEN-END:variables
}
