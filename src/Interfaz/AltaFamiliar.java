package Interfaz;

import Exceptions.AfiliadoNoEncontradoException;
import Exceptions.VerficarCampoVacioException;
import Exceptions.VerificarDniException;
import Exceptions.VerificarRepetidosException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import laboratorio2018.Familiar;
import laboratorio2018.Sistema;
import laboratorio2018.Afiliado;
import laboratorio2018.Asistencia;
import laboratorio2018.Empleado;

/**
 *
 * @author Rodrigo
 */
public class AltaFamiliar extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    private Afiliado afil;
    //private ArrayList<Familiar> familiares= new ArrayList<Familiar>();

    public AltaFamiliar(Sistema c, Afiliado a, Empleado e) {
        sistema = c;
        afiliado = a;
        empleado = e;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Alta Familiar");
    }

    public AltaFamiliar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        diaNac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonGuardarFamiliar = new javax.swing.JButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jButtonVolverGestionaAfiliados = new javax.swing.JButton();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        MesNac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        anioNac = new javax.swing.JTextField();
        documento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        relacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        claveFamiliar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("  Dirección:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("  Alta Familiar:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("  Nombre/s:");

        jLabel7.setText("  Teléfono:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel3.setText("  Apellido/s:");

        jLabel8.setText("Fecha Nac (d/m/a):");

        diaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaNacActionPerformed(evt);
            }
        });

        jLabel4.setText("  Sexo:");

        jButtonGuardarFamiliar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonGuardarFamiliar.setText("Guardar");
        jButtonGuardarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarFamiliarActionPerformed(evt);
            }
        });

        jRadioButtonMasculino.setText("Masculino");
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        jButtonVolverGestionaAfiliados.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonVolverGestionaAfiliados.setText("Volver");
        jButtonVolverGestionaAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverGestionaAfiliadosActionPerformed(evt);
            }
        });

        jRadioButtonFemenino.setText("Femenino");

        jLabel5.setText("  Documento:");

        jLabel9.setText("  Relacion:");

        relacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relacionActionPerformed(evt);
            }
        });

        jLabel10.setText("Clave Afiliado:");

        claveFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveFamiliarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(apellido)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relacion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(documento)
                    .addComponent(direccion)
                    .addComponent(telefono)
                    .addComponent(nombre)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(claveFamiliar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(diaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MesNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anioNac)))
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardarFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolverGestionaAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(documento, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesNac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioNac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarFamiliar, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jButtonVolverGestionaAfiliados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void diaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaNacActionPerformed

    private void jButtonGuardarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarFamiliarActionPerformed
        // TODO add your handling code here:
        try {
            String nom, ape, dire, sex = "", doc, tele, rela, dniFami;
            int dia, mes, anio;
            nom = nombre.getText();
            ape = apellido.getText();
            if (jRadioButtonFemenino.isSelected()) {
                sex = "Femenino";
            }
            if (jRadioButtonMasculino.isSelected()) {
                sex = "Masculino";
            }
            rela = relacion.getText();
            doc = documento.getText();
            dire = direccion.getText();
            tele = telefono.getText();
            dia = Integer.parseInt(diaNac.getText());
            mes = Integer.parseInt(MesNac.getText());
            anio = Integer.parseInt(anioNac.getText());
            dniFami = claveFamiliar.getText();
            sistema.verificarDatos(doc, nom, ape, dire, tele);
            buscarRepetido(dniFami, doc);
            sistema.buscarAfiliado(dniFami);
            Afiliado aux = null;
            for (Afiliado w : sistema.getAfiliados()) {
                if (w.getDni().equals(dniFami)) {
                    aux = w;
                }
            }
            Familiar fam = new Familiar(nom, ape, sex, doc, dire, tele, dia, mes, anio, rela, dniFami);

            aux.setFamiliares(fam);
            JOptionPane.showMessageDialog(null, "Familiar guardado", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);

            this.limpliarTextos();
            //JOptionPane.showMessageDialog(null, "Familiar guardado", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal m = new MenuPrincipal(sistema, afiliado, empleado);
            m.setVisible(true);
            dispose();

        } catch (VerificarDniException vdni) {
            JOptionPane.showMessageDialog(null, "Dni Invalido", "Error!", JOptionPane.OK_OPTION);
        } catch (VerficarCampoVacioException cav) {
            JOptionPane.showMessageDialog(null, "Ingreso un campo vacio", "Atencion!", JOptionPane.QUESTION_MESSAGE);
        } catch (VerificarRepetidosException vr) {
            JOptionPane.showMessageDialog(null, "El Afiliado ya se encuentra registrado", "Atencion!", JOptionPane.WARNING_MESSAGE);
        } catch (AfiliadoNoEncontradoException pnee) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO AL AFILIADO con esa clave familiar", "VERIFIQUE!!!!", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_jButtonGuardarFamiliarActionPerformed

    public void limpliarTextos() {
        nombre.setText(null);
        apellido.setText(null);
        documento.setText(null);
        direccion.setText(null);
    }

    public void buscarRepetido(String clave, String dni) throws VerificarRepetidosException {
        Afiliado a = null;
        for (Afiliado afi : sistema.getAfiliados()) {
            if (afi.getDni().equals(clave)) {
                a = afi;

            }
        }
        Familiar fami = null;
        for (Familiar fa : a.getFamiliares()) {
            if (fa.getDni().equals(dni)) {
                fami = fa;

            }
        }
        if (fami != null) {
            throw new VerificarRepetidosException();
        }
    }

    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed

    private void jButtonVolverGestionaAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverGestionaAfiliadosActionPerformed
        // TODO add your handling code here:
        GestionAfiliados g = new GestionAfiliados(sistema, afiliado, empleado);
        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverGestionaAfiliadosActionPerformed

    private void relacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relacionActionPerformed

    private void claveFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveFamiliarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveFamiliarActionPerformed

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
            java.util.logging.Logger.getLogger(AltaFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaFamiliar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MesNac;
    private javax.swing.JTextField anioNac;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField claveFamiliar;
    private javax.swing.JTextField diaNac;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField documento;
    private javax.swing.JButton jButtonGuardarFamiliar;
    private javax.swing.JButton jButtonVolverGestionaAfiliados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField relacion;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
