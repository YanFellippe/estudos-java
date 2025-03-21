/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package abastecimentocarro;

import javax.swing.JOptionPane;

/**
 *
 * @author Yan53961666
 */
public class carroAbastecimento extends javax.swing.JFrame {

    private int velocidade;
    public carroAbastecimento() {
        initComponents();
        velocidade = 0;
        txtAbastecer.setText("não");
        txtLigar.setText("não");
        txtAumentar.setText("não");
        txtReduzir.setText("não");
        txtDesligar.setText("não");
        carroAcoes.setText("Abastecer carro: " + txtAbastecer.getText() + "\n" 
                + "Ligar carro: " + txtLigar.getText() + "\n"
                + "Aumentar velocidade: " + txtAumentar.getText() + "\n"
                + "Reduzir velocidade: " + txtReduzir.getText() + "\n"
                + "Desligar carro: " + txtDesligar.getText() + "\n"
                + "Velocidade: " + velocidade
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        carroAcoes = new javax.swing.JTextArea();
        btnAbastecer = new javax.swing.JButton();
        btnLigar = new javax.swing.JButton();
        btnAumentar = new javax.swing.JButton();
        btnReduzir = new javax.swing.JButton();
        btnDesligar = new javax.swing.JButton();
        txtAbastecer = new javax.swing.JTextField();
        txtLigar = new javax.swing.JTextField();
        txtAumentar = new javax.swing.JTextField();
        txtReduzir = new javax.swing.JTextField();
        txtDesligar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        carroAcoes.setColumns(20);
        carroAcoes.setRows(5);
        jScrollPane1.setViewportView(carroAcoes);

        btnAbastecer.setText("Abastecer Carro");
        btnAbastecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbastecerMouseClicked(evt);
            }
        });
        btnAbastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbastecerActionPerformed(evt);
            }
        });

        btnLigar.setText("Ligar Carro");
        btnLigar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLigarMouseClicked(evt);
            }
        });

        btnAumentar.setText("Aumentar Velocidade");
        btnAumentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAumentarMouseClicked(evt);
            }
        });

        btnReduzir.setText("Reduzir Velocidade");
        btnReduzir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReduzirMouseClicked(evt);
            }
        });

        btnDesligar.setText("Desligar Carro");
        btnDesligar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesligarMouseClicked(evt);
            }
        });

        txtAbastecer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAbastecer.setText("não");

        txtLigar.setText("não");

        txtAumentar.setText("não");

        txtReduzir.setText("não");

        txtDesligar.setText("não");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesligar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnReduzir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAbastecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLigar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAumentar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAumentar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLigar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbastecer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReduzir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesligar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAbastecer)
                            .addComponent(txtAbastecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLigar)
                            .addComponent(txtLigar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAumentar)
                            .addComponent(txtAumentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReduzir)
                            .addComponent(txtReduzir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDesligar)
                            .addComponent(txtDesligar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbastecerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbastecerActionPerformed

    private void btnAbastecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbastecerMouseClicked
        if(txtAbastecer.getText().equals("não")){
            txtAbastecer.setText("sim");
            carroAcoes.setText("Abastecer carro: " + txtAbastecer.getText() + "\n" 
                + "Ligar carro: " + txtLigar.getText() + "\n"
                + "Aumentar velocidade: " + txtAumentar.getText() + "\n"
                + "Reduzir velocidade: " + txtReduzir.getText() + "\n"
                + "Desligar carro: " + txtDesligar.getText() + "\n"
                + "Velocidade: " + velocidade
            );
        } else {
            JOptionPane.showMessageDialog(null, "Combustível cheio!");
        }
    }//GEN-LAST:event_btnAbastecerMouseClicked

    private void btnLigarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLigarMouseClicked
        if(txtAbastecer.getText().equals("sim")){
            txtLigar.setText("sim");
            txtDesligar.setText("não");
            carroAcoes.setText("Abastecer carro: " + txtAbastecer.getText() + "\n" 
                + "Ligar carro: " + txtLigar.getText() + "\n"
                + "Aumentar velocidade: " + txtAumentar.getText() + "\n"
                + "Reduzir velocidade: " + txtReduzir.getText() + "\n"
                + "Desligar carro: " + txtDesligar.getText() + "\n"
                + "Velocidade: " + velocidade
            );
        } else {
            JOptionPane.showMessageDialog(null, "O carro precisa estar abastecido!");
        }
    }//GEN-LAST:event_btnLigarMouseClicked

    private void btnAumentarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAumentarMouseClicked
        if(txtLigar.getText().equals("sim") && velocidade <= 150){
            while(velocidade <= 150){
                velocidade = velocidade + 10;
            }
            txtAumentar.setText("sim");
            carroAcoes.setText("Abastecer carro: " + txtAbastecer.getText() + "\n" 
                + "Ligar carro: " + txtLigar.getText() + "\n"
                + "Aumentar velocidade: " + txtAumentar.getText() + "\n"
                + "Reduzir velocidade: " + txtReduzir.getText() + "\n"
                + "Desligar carro: " + txtDesligar.getText() + "\n"
                + "Velocidade: " + velocidade
            );
        } else if(txtLigar.getText().equals("não")){
            JOptionPane.showMessageDialog(null, "O carro está desligado!");
        } else {
            JOptionPane.showMessageDialog(null, "O carro está na velocidade máxima!");
        }
    }//GEN-LAST:event_btnAumentarMouseClicked

    private void btnReduzirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReduzirMouseClicked
        if(txtLigar.getText().equals("sim") && velocidade != 0){
            while(velocidade >= 0){
                velocidade = velocidade - 10;
            }
            txtReduzir.setText("sim");
            txtAumentar.setText("não");
            carroAcoes.setText("Abastecer carro: " + txtAbastecer.getText() + "\n" 
                + "Ligar carro: " + txtLigar.getText() + "\n"
                + "Aumentar velocidade: " + txtAumentar.getText() + "\n"
                + "Reduzir velocidade: " + txtReduzir.getText() + "\n"
                + "Desligar carro: " + txtDesligar.getText() + "\n"
                + "Velocidade: " + velocidade
            );
        } else if (velocidade == 0){
            JOptionPane.showMessageDialog(null, "O carro está parado!");
        } 
    }//GEN-LAST:event_btnReduzirMouseClicked

    private void btnDesligarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesligarMouseClicked
        if(velocidade == 0){
            txtDesligar.setText("sim");
            carroAcoes.setText("Abastecer carro: " + txtAbastecer.getText() + "\n" 
                + "Ligar carro: " + txtLigar.getText() + "\n"
                + "Aumentar velocidade: " + txtAumentar.getText() + "\n"
                + "Reduzir velocidade: " + txtReduzir.getText() + "\n"
                + "Desligar carro: " + txtDesligar.getText() + "\n"
                + "Velocidade: " + velocidade
            );
        } else {
            JOptionPane.showMessageDialog(null, "O carro foi desligado!");
        }
    }//GEN-LAST:event_btnDesligarMouseClicked

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
            java.util.logging.Logger.getLogger(carroAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carroAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carroAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carroAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carroAbastecimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbastecer;
    private javax.swing.JButton btnAumentar;
    private javax.swing.JButton btnDesligar;
    private javax.swing.JButton btnLigar;
    private javax.swing.JButton btnReduzir;
    private javax.swing.JTextArea carroAcoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAbastecer;
    private javax.swing.JTextField txtAumentar;
    private javax.swing.JTextField txtDesligar;
    private javax.swing.JTextField txtLigar;
    private javax.swing.JTextField txtReduzir;
    // End of variables declaration//GEN-END:variables
}
