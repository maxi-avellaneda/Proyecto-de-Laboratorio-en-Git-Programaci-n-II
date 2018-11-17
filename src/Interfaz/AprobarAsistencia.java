package Interfaz;

import Exceptions.AfiliadoNoEncontradoException;
import Exceptions.VerficarCampoVacioException;
import Exceptions.VerificarDniException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import laboratorio2018.AbonoAfiliados;
import laboratorio2018.Afiliado;
import laboratorio2018.Asistencia;
import laboratorio2018.Empleado;
import laboratorio2018.Familiar;
import laboratorio2018.Sistema;

/**
 *
 * @author Rodrigo
 */
public class AprobarAsistencia extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    private ArrayList<Asistencia> asistencias = new ArrayList<Asistencia>();

    public AprobarAsistencia(Sistema c, Afiliado a, Empleado e) {
        sistema = c;
        empleado = e;
        afiliado = a;

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("APROBAR ASISTENCIA");
    }

    public AprobarAsistencia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonVolverGestionAfiliados = new javax.swing.JButton();
        jButtonBuscarAfiAsistencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDniActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("INGRESE DNI DEL AFILIADO O FAMILIAR:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("BRINDAR ASISTENCIA MÉDICA");

        jButtonVolverGestionAfiliados.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonVolverGestionAfiliados.setText("Volver");
        jButtonVolverGestionAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverGestionAfiliadosActionPerformed(evt);
            }
        });

        jButtonBuscarAfiAsistencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuscarAfiAsistencia.setText("BUSCAR");
        jButtonBuscarAfiAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAfiAsistenciaActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jButtonBuscarAfiAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
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
                .addGap(50, 50, 50)
                .addComponent(jButtonBuscarAfiAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButtonVolverGestionAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDniActionPerformed

    }//GEN-LAST:event_buscarDniActionPerformed

    private void jButtonVolverGestionAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverGestionAfiliadosActionPerformed

        MenuAsistencias mn = new MenuAsistencias(sistema, afiliado, empleado);
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverGestionAfiliadosActionPerformed

    private void jButtonBuscarAfiAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAfiAsistenciaActionPerformed
        try {

            String dni = buscarDni.getText();
            String con = "SIN MORA";
            verificarDatos(dni);
            sistema.buscarAfiliado(dni);
            Afiliado af = null;
            Familiar familiar = null;
            AbonoAfiliados abo = null;
            for (Afiliado a : sistema.getAfiliados()) {
                if (a.getDni().equals(dni)) {
                    af = a;
                }
            }
            //for(Familiar)
            abo = af.getAbono();
            if (abo.fechaPagoAbono().equals(con)) {
                JOptionPane.showMessageDialog(null, "HABILITADO", "PUEDE PEDIR ASISTENCIA MEDICA", JOptionPane.INFORMATION_MESSAGE);
                AsignarEmpleados asig = new AsignarEmpleados(sistema, afiliado, empleado);
                asig.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "MOROSO, TIENE DEUDA", "NO PUEDE PEDIR ASISTENCIA MEDICA!", JOptionPane.INFORMATION_MESSAGE);
                MenuPrincipal me = new MenuPrincipal(sistema, afiliado, empleado);
                me.setVisible(true);
                dispose();
            }

        } catch (VerificarDniException vdni) {
            JOptionPane.showMessageDialog(null, "Dni Invalido", "Error!", JOptionPane.OK_OPTION);
        } catch (AfiliadoNoEncontradoException pnee) {
            JOptionPane.showMessageDialog(null, "No se encontro al afiliado", "Aviso!", JOptionPane.WARNING_MESSAGE);
        } catch (VerficarCampoVacioException cav) {
            JOptionPane.showMessageDialog(null, "Campo Vacio, ingrese de nuevo", "Atencion!", JOptionPane.QUESTION_MESSAGE);
        } finally {
            buscarDni.setText(null);
        }
    }//GEN-LAST:event_jButtonBuscarAfiAsistenciaActionPerformed

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
            java.util.logging.Logger.getLogger(AprobarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AprobarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AprobarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AprobarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AprobarAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarDni;
    private javax.swing.JButton jButtonBuscarAfiAsistencia;
    private javax.swing.JButton jButtonVolverGestionAfiliados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
