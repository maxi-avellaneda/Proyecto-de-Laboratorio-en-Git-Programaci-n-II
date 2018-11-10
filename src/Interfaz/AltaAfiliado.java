
package Interfaz;

import javax.swing.JOptionPane;
import laboratorio2018.Afiliado;
import laboratorio2018.Sistema;
import Exceptions.VerficarCampoVacioException;
import Exceptions.VerificarDniException;
import Exceptions.VerificarRepetidosException;

/**
 *
 * @author maxix
 */
public class AltaAfiliado extends javax.swing.JFrame {

    private Sistema sistema;
    //private Afiliado afiliado;

    public AltaAfiliado(Sistema c) {
        sistema = c;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Alta Afiliado");
    }

    public AltaAfiliado() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMasculinoFemenino = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        documento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        diaNac = new javax.swing.JTextField();
        jButtonGuardarAfiliado = new javax.swing.JButton();
        jButtonVolverGestionaAfiliados = new javax.swing.JButton();
        MesNac = new javax.swing.JTextField();
        anioNac = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("  Alta Afiliado:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("  Nombre/s:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel3.setText("  Apellido/s:");

        jLabel4.setText("  Sexo:");

        buttonGroupMasculinoFemenino.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        buttonGroupMasculinoFemenino.add(jRadioButtonFemenino);
        jRadioButtonFemenino.setText("Femenino");

        jLabel5.setText("  Documento:");

        jLabel6.setText("  Dirección:");

        jLabel7.setText("  Teléfono:");

        jLabel8.setText("Fecha Nac (d/m/a):");

        diaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaNacActionPerformed(evt);
            }
        });

        jButtonGuardarAfiliado.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonGuardarAfiliado.setText("Guardar");
        jButtonGuardarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarAfiliadoActionPerformed(evt);
            }
        });

        jButtonVolverGestionaAfiliados.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonVolverGestionaAfiliados.setText("Volver");
        jButtonVolverGestionaAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverGestionaAfiliadosActionPerformed(evt);
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(apellido)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFemenino, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                    .addComponent(documento)
                    .addComponent(direccion)
                    .addComponent(telefono)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MesNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anioNac))
                    .addComponent(nombre))
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardarAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolverGestionaAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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
                    .addComponent(jRadioButtonFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolverGestionaAfiliados, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jButtonGuardarAfiliado, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverGestionaAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverGestionaAfiliadosActionPerformed

        AfiliadoFamiliar af = new AfiliadoFamiliar(sistema);
        af.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverGestionaAfiliadosActionPerformed

    private void jButtonGuardarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarAfiliadoActionPerformed
        // TODO add your handling code here:
        try {
            String nom, ape,dire,sex="",doc,tele;
            int dia,mes,anio;
            nom = nombre.getText();
            ape = apellido.getText();
            if (jRadioButtonFemenino.isSelected()) {
                sex = "Femenino";
            }
            if (jRadioButtonMasculino.isSelected()) {
                sex = "Masculino";
            }
            doc = documento.getText();
            dire = direccion.getText();
            tele = telefono.getText();
            dia = Integer.parseInt(diaNac.getText());
            mes = Integer.parseInt(MesNac.getText());
            anio = Integer.parseInt(anioNac.getText());
            System.out.println("nom: "+nom+" \nape: "+ape+" \nsexo: "+sex+" \ndoc: "+doc+" \ndire: "+dire+" \ntele: "+tele+" \ndia: "+dia+" \nmes: "+mes+" \nanio: "+anio);
            sistema.verificarDatos(doc, nom, ape, dire,tele);
            sistema.buscarRepetido(doc);
            Afiliado afi = new Afiliado(nom,ape,sex,doc,dire,tele,dia,mes,anio);
            sistema.setAfiliados(afi);
            this.limpliarTextos();
            JOptionPane.showMessageDialog(null, "Afiliado guardado", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal m = new MenuPrincipal(sistema);
            m.setVisible(true);
            dispose();
            
            
        }catch(VerificarDniException vdni){
           JOptionPane.showMessageDialog(null, "Dni Invalido", "Error!", JOptionPane.OK_OPTION);
       }catch(VerficarCampoVacioException cav){
           JOptionPane.showMessageDialog(null, "Ingreso un campo vacio", "Atencion!", JOptionPane.QUESTION_MESSAGE);
       }catch(VerificarRepetidosException vr){
           JOptionPane.showMessageDialog(null, "El Afiliado ya se encuentra registrado", "Atencion!", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_jButtonGuardarAfiliadoActionPerformed
    
    public void limpliarTextos(){
        nombre.setText(null);
        apellido.setText(null);        
        documento.setText(null);
        direccion.setText(null);        
    }
    
    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed

    private void diaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaNacActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(AltaAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaAfiliado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MesNac;
    private javax.swing.JTextField anioNac;
    private javax.swing.JTextField apellido;
    private javax.swing.ButtonGroup buttonGroupMasculinoFemenino;
    private javax.swing.JTextField diaNac;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField documento;
    private javax.swing.JButton jButtonGuardarAfiliado;
    private javax.swing.JButton jButtonVolverGestionaAfiliados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
