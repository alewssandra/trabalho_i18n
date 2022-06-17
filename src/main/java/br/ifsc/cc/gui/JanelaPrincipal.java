
package br.ifsc.cc.gui;

import br.ifsc.cc.modelo.Contato;
import java.util.ArrayList;
import javax.swing.*;

public class JanelaPrincipal extends JFrame {

    private ArrayList<Contato> listaContatos;
    
    public JanelaPrincipal() {
        this.listaContatos = new ArrayList<>();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonInsere = new javax.swing.JButton();
        jButtonExclui = new javax.swing.JButton();
        jButtonMostra = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setLocation(new java.awt.Point(300, 250));

        jButtonInsere.setText("Insere");
        jButtonInsere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsereActionPerformed(evt);
            }
        });

        jButtonExclui.setText("Exclui");
        jButtonExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluiActionPerformed(evt);
            }
        });

        jButtonMostra.setText("Mostra");
        jButtonMostra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostraActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInsere)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExclui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jButtonMostra)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsere)
                    .addComponent(jButtonExclui)
                    .addComponent(jButtonMostra))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonMostraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostraActionPerformed
        jTextAreaResultado.setText( this.listaContatos.toString());
    }//GEN-LAST:event_jButtonMostraActionPerformed

    private void jButtonInsereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsereActionPerformed
        InsereContato insereContatoInterface = new InsereContato(null, true);
        insereContatoInterface.setListaContatos( this.listaContatos );
        
        insereContatoInterface.setVisible(true);
    }//GEN-LAST:event_jButtonInsereActionPerformed

    private void jButtonExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluiActionPerformed
        ExcluiContato excluiContato = new ExcluiContato(null, true);
        excluiContato.setListaContato( this.listaContatos );
        
        excluiContato.setVisible(true);
        
    }//GEN-LAST:event_jButtonExcluiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExclui;
    private javax.swing.JButton jButtonInsere;
    private javax.swing.JButton jButtonMostra;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultado;
    // End of variables declaration//GEN-END:variables
}
