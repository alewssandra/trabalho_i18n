package br.ifsc.cc.gui;

import br.ifsc.cc.modelo.Contato;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 *
 * @author Alessandra e Carla
 */
public class InsereContato extends javax.swing.JDialog {

    private ArrayList<Contato> listaContatos;

    public void setListaContatos(ArrayList<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelusuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel2Email = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonVolta = new javax.swing.JButton();
        jButtonInsere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insere contato");
        setLocation(new java.awt.Point(300, 200));

        jLabelusuario.setText("Usuário");

        jLabel2Email.setText("E-mail");

        jButtonVolta.setText("Volta");
        jButtonVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltaActionPerformed(evt);
            }
        });

        jButtonInsere.setText("Insere");
        jButtonInsere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2Email)
                            .addComponent(jLabelusuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUsuario)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButtonVolta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(jButtonInsere)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelusuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Email)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolta)
                    .addComponent(jButtonInsere))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ResourceBundle traducao;

    public InsereContato(java.awt.Frame parent, boolean modal, ResourceBundle traducoes) {
        super(parent, modal);
        initComponents();
        this.traducao = traducoes;

        //mudando para outro idioma
        this.jButtonInsere.setText(traducao.getString("access_insert"));
        this.jButtonVolta.setText(traducao.getString("access_return"));
        this.jLabel2Email.setText(traducao.getString("access_email"));
        this.jLabelusuario.setText(traducao.getString("access_user"));

    }
    private void jButtonVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltaActionPerformed

    private void jButtonInsereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsereActionPerformed
        String nomeUsuario = jTextFieldUsuario.getText();
        String emailUsuario = jTextFieldEmail.getText();

        Contato contato = new Contato(nomeUsuario, emailUsuario);
        this.listaContatos.add(contato);

        this.dispose();
    }//GEN-LAST:event_jButtonInsereActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInsere;
    private javax.swing.JButton jButtonVolta;
    private javax.swing.JLabel jLabel2Email;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
