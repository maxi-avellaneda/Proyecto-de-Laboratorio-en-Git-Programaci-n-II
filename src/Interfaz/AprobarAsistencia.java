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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buscarDniAfiliado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonVolverGestionAfiliados = new javax.swing.JButton();
        jButtonBuscarAfiAsistencia = new javax.swing.JButton();
        buscarDniFamiliar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FamiliarSi = new javax.swing.JRadioButton();
        FamiliarNo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buscarDniAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDniAfiliadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("INGRESE DNI DEL AFILIADO:");

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

        buscarDniFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDniFamiliarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("INGRESE DNI DEL FAMILIAR:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("INGRESE DNI DE AFILIADO O FAMILIAR, EN EL CAMPO CORRESPONDIENTE...");

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("SOLO DEBE COMPLETAR UN SOLO CAMPO,DEPENDIENDO QUIEN QUIERE PEDIR LA ASISTENCIA (Afiliado o Familiar)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ES UNA ASISTENCIA  PARA UN FAMILIAR?");

        buttonGroup1.add(FamiliarSi);
        FamiliarSi.setText("SI");

        buttonGroup1.add(FamiliarNo);
        FamiliarNo.setSelected(true);
        FamiliarNo.setText("NO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonBuscarAfiAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(jButtonVolverGestionAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscarDniAfiliado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FamiliarSi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FamiliarNo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarDniFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarDniAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FamiliarSi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FamiliarNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarDniFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVolverGestionAfiliados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarAfiAsistencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarDniAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDniAfiliadoActionPerformed

    }//GEN-LAST:event_buscarDniAfiliadoActionPerformed

    private void jButtonVolverGestionAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverGestionAfiliadosActionPerformed

        MenuAsistencias mn = new MenuAsistencias(sistema, afiliado, empleado);
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverGestionAfiliadosActionPerformed

    private void jButtonBuscarAfiAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAfiAsistenciaActionPerformed
        try {

            String dniAfi = buscarDniAfiliado.getText();
            String dniFami = buscarDniFamiliar.getText();
            String con = "SIN MORA";
            verificarDatos(dniAfi);
            sistema.buscarAfiliado(dniAfi);
            Afiliado af = null;
            Familiar familiar = null;
            AbonoAfiliados abo;
            for (Afiliado a : sistema.getAfiliados()) {
                if (a.getDni().equals(dniAfi)) {
                    af = a;
                }
            }
            System.out.println("af= "+af);
            abo = af.getAbono();
            if (abo.fechaPagoAbono().equals(con)) {
                JOptionPane.showMessageDialog(null, "HABILITADO", "NO HAY DEUDA", JOptionPane.INFORMATION_MESSAGE);
                //AsignarEmpleados asig = new AsignarEmpleados(sistema, afiliado, empleado);
                //asig.setVisible(true);
                //dispose();
            } else {
                JOptionPane.showMessageDialog(null, "MOROSO, TIENE DEUDA", "NO PUEDE PEDIR ASISTENCIA MEDICA!", JOptionPane.WARNING_MESSAGE);
                MenuPrincipal me = new MenuPrincipal(sistema, afiliado, empleado);
                me.setVisible(true);
                dispose();
            }
            if (FamiliarSi.isSelected()) {
                for (Familiar fami : afiliado.getFamiliares()) {
                    if (fami.getDni().equals(dniFami)) {
                        familiar = fami;
                    }

                }
                if (familiar == null) {
                    JOptionPane.showMessageDialog(null, "No se encontro al familiar", "Aviso!", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "SE ENCONTRO AL FAMILIAR", "PUEDE PEDIR ASISTENCIA MEDICA!", JOptionPane.INFORMATION_MESSAGE);
                    AsignarEmpleados asig = new AsignarEmpleados(sistema, afiliado, empleado,af,familiar);
                    asig.setVisible(true);
                    dispose();
                }
            } else {
                if (FamiliarNo.isSelected()) {
                    AsignarEmpleados asig = new AsignarEmpleados(sistema, afiliado, empleado,af,familiar);
                    asig.setVisible(true);
                    dispose();
                }

            }
            /*if (FamiliarNo.isSelected()) {
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
            }*/

        } catch (VerificarDniException vdni) {
            JOptionPane.showMessageDialog(null, "Dni Invalido", "Error!", JOptionPane.OK_OPTION);
        } catch (AfiliadoNoEncontradoException pnee) {
            JOptionPane.showMessageDialog(null, "No se encontro al afiliado", "Aviso!", JOptionPane.WARNING_MESSAGE);
        } catch (VerficarCampoVacioException cav) {
            JOptionPane.showMessageDialog(null, "Campo Vacio, ingrese de nuevo", "Atencion!", JOptionPane.QUESTION_MESSAGE);
        } finally {
            buscarDniAfiliado.setText(null);
        }
    }//GEN-LAST:event_jButtonBuscarAfiAsistenciaActionPerformed

    private void buscarDniFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDniFamiliarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarDniFamiliarActionPerformed

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
    private javax.swing.JRadioButton FamiliarNo;
    private javax.swing.JRadioButton FamiliarSi;
    private javax.swing.JTextField buscarDniAfiliado;
    private javax.swing.JTextField buscarDniFamiliar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBuscarAfiAsistencia;
    private javax.swing.JButton jButtonVolverGestionAfiliados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
