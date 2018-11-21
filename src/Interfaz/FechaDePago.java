
package Interfaz;

import javax.swing.JOptionPane;
import laboratorio2018.AbonoAfiliados;
import laboratorio2018.Afiliado;
import laboratorio2018.Empleado;
import laboratorio2018.Sistema;

/**
 *
 * @author maxix
 */
public class FechaDePago extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    private String dni;
    public FechaDePago() {
        initComponents();
    }

    public FechaDePago(Sistema c,Afiliado a,Empleado e, String d) {
        sistema=c;
        afiliado=a;
        empleado=e;
        dni=d;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU PRINCIPAL");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        aniodepago = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        menuPrinci = new javax.swing.JButton();
        pagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        diadepago = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mesdepago = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cantFam = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("AÑO:");

        jLabel5.setText("PAGO:");

        menuPrinci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuPrinci.setText("Volver");
        menuPrinci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrinciActionPerformed(evt);
            }
        });

        pagar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        pagar.setText("PAGAR");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("COMPLETE LA FECHA DE PAGO:");

        jLabel2.setText("DIA:");

        jLabel3.setText("MES:");

        jLabel6.setText("Cant Familiares:");

        cantFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantFamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantFam))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(diadepago))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mesdepago))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(aniodepago))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(monto))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(menuPrinci, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diadepago, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mesdepago, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aniodepago, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monto, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(menuPrinci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantFam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPrinciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrinciActionPerformed
        MenuPrincipal m = new MenuPrincipal(sistema,afiliado,empleado);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuPrinciActionPerformed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        int diapago,mespago,aniopago,cantidadfami;
        float abono,aux1,aux2;
        diapago = Integer.parseInt(diadepago.getText());
        mespago = Integer.parseInt(mesdepago.getText());
        aniopago = Integer.parseInt(aniodepago.getText());
        cantidadfami = Integer.parseInt(cantFam.getText());
        aux1=Float.parseFloat(monto.getText());
        aux2=aux1/4;
        if(cantidadfami==0){
            abono = aux1;
        }else{
            abono = aux1 + (aux2*cantidadfami) ;  
        }
        System.out.println("abono final: "+abono);
        AbonoAfiliados ab = new AbonoAfiliados(diapago,mespago,aniopago,abono);
        String condi=ab.fechaPagoAbono();
        //AbonoAfiliados ab = new AbonoAfiliados(diapago,mespago,aniopago,abono);
        //String condi=ab.fechaPagoAbono();
        
        //AbonoAfiliados aux = new AbonoAfiliados(condi);
        AbonoAfiliados aux3= new AbonoAfiliados(diapago,mespago,aniopago,abono,condi);
      //  afiliado.setAbono(ab);
      // sistema.setAfiliados(afiliado);
        Afiliado afi=null;
            for(Afiliado a: sistema.getAfiliados()){
                if(a.getDni().equals(dni)){
                    afi=a;
                }
            }
            if (afi!=null){
                afi.setAbono(aux3);
                sistema.setAfiliados(afi);
            }
            else{
                System.out.println("El pago vino nulo");
            }
        this.limpliarTextos();
        JOptionPane.showMessageDialog(null, "Pago de afiliado guardado", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
        MenuPrincipal m = new MenuPrincipal(sistema,afiliado,empleado);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_pagarActionPerformed

    private void cantFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantFamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantFamActionPerformed

    public void limpliarTextos(){
        diadepago.setText(null);
        mesdepago.setText(null);
        aniodepago.setText(null);
        monto.setText(null);
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
            java.util.logging.Logger.getLogger(FechaDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FechaDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FechaDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FechaDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FechaDePago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aniodepago;
    private javax.swing.JTextField cantFam;
    private javax.swing.JTextField diadepago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton menuPrinci;
    private javax.swing.JTextField mesdepago;
    private javax.swing.JTextField monto;
    private javax.swing.JButton pagar;
    // End of variables declaration//GEN-END:variables
}
