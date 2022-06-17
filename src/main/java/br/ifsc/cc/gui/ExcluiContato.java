
package br.ifsc.cc.gui;

import br.ifsc.cc.modelo.Contato;
import java.util.ArrayList;


public class ExcluiContato extends javax.swing.JDialog {

    private ArrayList<Contato> listaContatos;

    public void setListaContato(ArrayList<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }
    
    
    public ExcluiContato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVolta = new javax.swing.JButton();
        jButtonExclui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonVolta.setText("Volta");
        jButtonVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltaActionPerformed(evt);
            }
        });

        jButtonExclui.setText("Exclui");
        jButtonExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluiActionPerformed(evt);
            }
        });

        jLabel1.setText("Qual contato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVolta)
                        .addGap(66, 66, 66)
                        .addComponent(jButtonExclui)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolta)
                    .addComponent(jButtonExclui))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltaActionPerformed

    private void jButtonExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluiActionPerformed
        String numTxt = jTextFieldNumero.getText();
        int num = Integer.parseInt(numTxt);
        
        this.listaContatos.remove( num );
        
        this.dispose();
    }//GEN-LAST:event_jButtonExcluiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExclui;
    private javax.swing.JButton jButtonVolta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
