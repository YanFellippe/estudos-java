/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sistemacursosonline;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroCurso extends javax.swing.JInternalFrame {

    public CadastroCurso() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        turma = new javax.swing.JTextField();
        qtdAluno = new javax.swing.JTextField();
        cargaHoraria = new javax.swing.JTextField();
        cadCurso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        situacao = new javax.swing.JTextField();
        dataFim = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Cursos");

        jLabel1.setText("Descrição:");

        jLabel2.setText("Turma:");

        jLabel3.setText("Quantidade de Alunos:");

        jLabel4.setText("Carga Horária:");

        jLabel6.setText("Data Fim");

        cadCurso.setText("CADASTRAR CURSO");
        cadCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadCursoMouseClicked(evt);
            }
        });
        cadCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCursoActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "TURMA", "QTD ALUNOS", "CARGA HORÁRIA", "DATA INÍCIO", "DATA FIM", "SITUAÇÃO"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel7.setText("Situação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(dataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(situacao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(qtdAluno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cargaHoraria))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(329, 329, 329))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadCurso)
                        .addGap(458, 458, 458))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qtdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(cadCurso)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadCursoMouseClicked
                                        
            try {
                SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
                String data = dataFormatada.format(dataFim.getDate());
                int qtdAlunos = Integer.parseInt(qtdAluno.getText());
                Connection con = BancoClass.conexaoBanco();
                String sql = "INSERT INTO curso(descricao, turma, qtd_alunos, carga_horaria, data_fim, situacao) VALUES(?,?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, descricao.getText());
                stmt.setString(2, turma.getText());
                stmt.setInt(3, qtdAlunos);
                stmt.setString(4, cargaHoraria.getText());
                stmt.setTimestamp(5, new java.sql.Timestamp(dataFim.getDate().getTime()));
                stmt.setString(6, situacao.getText());
                stmt.execute();
                con.close();
                
                JOptionPane.showMessageDialog(rootPane, "Curso cadastrado com sucesso!");
                descricao.setText(null);
                turma.setText(null);
                qtdAluno.setText(null);
                cargaHoraria.setText(null);
                situacao.setText(null);
                dataFim.setDate(null);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroCurso.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Curso não cadastrado!");
            }
        try {  
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM curso ORDER BY id_curso DESC;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
            modeloTabela.setNumRows(0);
            while(rs.next()){
                Object [] dados = {
                    rs.getString("id_curso"),
                    rs.getString("descricao"),
                    rs.getString("turma"),
                    rs.getString("qtd_alunos"),
                    rs.getString("carga_horaria"),
                    rs.getString("data_inicio"),
                    rs.getString("data_fim"),
                    rs.getString("situacao")};
                modeloTabela.addRow(dados);
            }
            stmt.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCurso.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Curso não registrado!");

        }
    }//GEN-LAST:event_cadCursoMouseClicked

    private void cadCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadCurso;
    private javax.swing.JTextField cargaHoraria;
    private com.toedter.calendar.JDateChooser dataFim;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qtdAluno;
    private javax.swing.JTextField situacao;
    private javax.swing.JTable table;
    private javax.swing.JTextField turma;
    // End of variables declaration//GEN-END:variables
}
