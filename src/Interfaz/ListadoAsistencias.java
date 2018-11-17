package Interfaz;

import java.util.Iterator;
import javax.swing.JOptionPane;
import laboratorio2018.Afiliado;
import laboratorio2018.Asistencia;
import laboratorio2018.Empleado;
import laboratorio2018.Sistema;

/**
 *
 * @author Rodrigo
 */
public class ListadoAsistencias extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    String dia, mes, anio;

    public ListadoAsistencias() {
        initComponents();
    }

    public ListadoAsistencias(Sistema c, Afiliado a, Empleado e,String d,String m,String an) {
        sistema = c;
        afiliado = a;
        empleado = e;
        dia = d;
        mes = m;
        anio = an;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ASISTENCIA");

        Asistencia as = null;
        for (Asistencia asis : sistema.getAsistencias()) {
            if (asis.getDia().equals(dia) && asis.getMes().equals(mes) && asis.getAnio().equals(anio)) {
                as = asis;
            }
        }
      
        if(as!=null){
            JOptionPane.showMessageDialog(null, "SE ENCONTRO LA ASISTENCIA", "Operacion Exitosa!!!!", JOptionPane.INFORMATION_MESSAGE);
            asistencias.append(as.toString());
        }else{
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO LA ASISTENCIA", "VERIFIQUE!!!!", JOptionPane.OK_OPTION);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        asistencias = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButtonVolverGestionAfiliado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        asistencias.setColumns(20);
        asistencias.setRows(5);
        jScrollPane1.setViewportView(asistencias);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("LISTADO DE ASISTENCIAS");

        jButtonVolverGestionAfiliado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolverGestionAfiliado.setText("Volver");
        jButtonVolverGestionAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverGestionAfiliadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVolverGestionAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVolverGestionAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverGestionAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverGestionAfiliadoActionPerformed
        // TODO add your handling code here:
        MenuAsistencias menu = new MenuAsistencias(sistema, afiliado, empleado);
        menu.setVisible(true);
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
            java.util.logging.Logger.getLogger(ListadoAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoAsistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoAsistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea asistencias;
    private javax.swing.JButton jButtonVolverGestionAfiliado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
