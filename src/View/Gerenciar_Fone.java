package View;

import Model.Fone_de_Ouvido;
import java.util.Date;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Gerenciar_Fone extends javax.swing.JFrame {

    private Fone_de_Ouvido objFone; // cria o vinculo com o objFone
    
    public Gerenciar_Fone() {
        initComponents();
        this.objFone = new Fone_de_Ouvido(); //Carrega Fone do Objeto
        this.carregaTabela();
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
        jTableFone = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        c_marca = new javax.swing.JTextField();
        c_modelo = new javax.swing.JTextField();
        c_qtd_estoque = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_material = new javax.swing.JTextField();
        c_tipo = new javax.swing.JTextField();
        c_preco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        b_cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        b_alterar = new javax.swing.JButton();
        c_descricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        b_apagar = new javax.swing.JButton();
        c_data = new com.toedter.calendar.JDateChooser();
        c_conectividade = new javax.swing.JComboBox<>();

        setTitle("Gerenciamento Fone de Ouvido");

        jTableFone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Tipo", "Preço", "Descrição", "Marca", "Modelo", "Qtd. Estoque", "Data Cadastro", "Conectividade do fone", "Material"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFoneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFone);

        jLabel6.setText("Modelo:");

        jLabel7.setText("Quantidade em Estoque:");

        jLabel8.setText("Data de Cadastro:");

        jLabel11.setText("conectividade do fone:");

        jLabel12.setText("Material:");

        jLabel1.setText("Nome:");

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo:");

        jLabel3.setText("Preço:");

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Descrição:");

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        jLabel5.setText("Marca:");

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });

        c_data.setDateFormatString("dd '/' MM '/' y");

        c_conectividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Com fio", "Sem fio" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(c_conectividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_material, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(c_data, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(c_qtd_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(c_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(c_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(c_qtd_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(c_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(c_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(c_conectividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(c_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void jTableFoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFoneMouseClicked
        if (this.jTableFone.getSelectedRow() != -1) {

            String nome = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 1).toString();
            String tipo = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 2).toString();
            String preco = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 3).toString();
            String descricao  = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 4).toString();
            String marca = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 5).toString();
            String modelo = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 6).toString();
            String qtd_estoque = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 7).toString();
            String data_cadastroString = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 8).toString();          
            String conectividade_do_fone = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 9).toString();
            String material = this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 10).toString();
            Date data_cadastro = null;

            this.c_nome.setText(nome);
            this.c_tipo.setText(tipo);
            this.c_preco.setText(preco);
            this.c_descricao.setText(descricao);
            this.c_marca.setText(marca);
            this.c_modelo.setText(modelo);
            this.c_qtd_estoque.setText(qtd_estoque);
            try {
                data_cadastro = new SimpleDateFormat("dd/MM/yyyy").parse(data_cadastroString);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao converter a data: ");               
            }
            this.c_data.setDate(data_cadastro);
            this.c_conectividade.setSelectedItem(conectividade_do_fone);
            this.c_material.setText(material);

        }
    }//GEN-LAST:event_jTableFoneMouseClicked

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed
        try {
            //recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            String tipo = "";
            float preco = 0;
            String descricao = "";
            String marca = "";
            String modelo = "";
            int qtd_estoque =  0;       
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String data_cadastro = sdf.format(c_data.getDate());           
            String conectividade_do_fone = "";
            String material = "";
            
            
            
            if (this.c_nome.getText().length() < 2 || this.c_nome.getText().length() > 45 ) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }
            if (this.c_tipo.getText().length() < 2) {
                throw new Mensagens("Tipo deve conter ao menos 2 caracteres.");
            } else {
                tipo = this.c_tipo.getText();
            }
            if (this.c_preco.getText().length() <= 0) {
                throw new Mensagens("Preço deve ser maior ou igual a zero.");
            } else {
                preco = Float.parseFloat(this.c_preco.getText());
            }
            if (this.c_descricao.getText().length() < 5 || this.c_descricao.getText().length() >250) {
                throw new Mensagens("Descrição deve conter ao menos 5 caracteres e menos de 250 caracteres.");
            } else {
                descricao = this.c_descricao.getText();
            }
            if (this.c_data.getDate() == null) { //if (dateChooser.getDate() == null) { testar assim
                throw new Mensagens("Insira uma data valida");
            } else {
                data_cadastro = sdf.format(this.c_data.getDate());                  
            }
            if (this.c_qtd_estoque.getText().length() <0) {  
               throw new Mensagens("Estoque não pode ser negativo");
            } else {
                qtd_estoque = Integer.parseInt(this.c_qtd_estoque.getText());
            } 
            if (this.c_marca.getText().length() < 2 || this.c_marca.getText().length() > 45 ) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                marca = this.c_marca.getText();
            }
            if (this.c_modelo.getText().length() < 2 || this.c_modelo.getText().length() > 45 ) {
                throw new Mensagens("Modelo deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                modelo = this.c_modelo.getText();
            }
            if (this.c_conectividade.getSelectedItem().toString().length() < 2 || this.c_conectividade.getSelectedItem().toString().length() > 45 ) {
                throw new Mensagens("conectividade do fone deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                conectividade_do_fone = this.c_conectividade.getSelectedItem().toString();
            }
            if (this.c_material.getText().length() < 2 || this.c_material.getText().length() > 45 ) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                material = this.c_material.getText();
            }
            
            if (this.jTableFone.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Fone para Alterar");
            } else {
                id = Integer.parseInt(this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 0).toString());
            }
            // envia os dados para o Fone processar
            if (this.objFone.UpdateFoneBD(conectividade_do_fone, material, id, nome, tipo, preco, descricao, marca, modelo, qtd_estoque, data_cadastro)) {
                JOptionPane.showMessageDialog(rootPane, "Fone de Ouvido Alterado com Sucesso!");
                
            // limpa campos da interface
                this.c_nome.setText("");
                this.c_tipo.setText("");
                this.c_preco.setText("");
                this.c_descricao.setText("");
                this.c_marca.setText("");
                this.c_modelo.setText("");
                this.c_qtd_estoque.setText("");
                this.c_data.setDate(null);               
                this.c_conectividade.setSelectedItem("");           
                this.c_material.setText("");
               
                
        
        }  
            System.out.println(this.objFone.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um numero.");
        } finally {
            carregaTabela(); //Atualiza a tabela
        }      
    }//GEN-LAST:event_b_alterarActionPerformed

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
          try {
            // validando dados da interface grafica.
            int id = 0;
            if (this.jTableFone.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Fone de Ouvido para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableFone.getValueAt(this.jTableFone.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Fone de Ouvido ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Fone de Ouvido processar
                if (this.objFone.DeleteFoneBD(id)) {

                    // limpa os campos
                    this.c_nome.setText("");
                this.c_tipo.setText("");
                this.c_preco.setText("");
                this.c_descricao.setText("");
                this.c_marca.setText("");
                this.c_modelo.setText("");
                this.c_qtd_estoque.setText("");
                this.c_data.setDate(null);    
                this.c_conectividade.setSelectedItem("");
                this.c_material.setText("");               
                    JOptionPane.showMessageDialog(rootPane, "Fone de Ouvido Apagado com Sucesso!");

                }

            }

            System.out.println(this.objFone.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed
    public void carregaTabela() {
     DefaultTableModel modelo = (DefaultTableModel) this.jTableFone.getModel();
     modelo.setNumRows(0);
     
      ArrayList<Fone_de_Ouvido> minhalista = new ArrayList<>();
        minhalista = objFone.getMinhaLista();

        for (Fone_de_Ouvido a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTipo(),
                a.getPreco(),
                a.getDescricao(),
                a.getMarca(),
                a.getModelo(),
                a.getQtd_estoque(),
                a.getData_cadastro(),              
                a.getConectividade_do_fone(),
                a.getMaterial(),  
            });
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
            java.util.logging.Logger.getLogger(Gerenciar_Fone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerenciar_Fone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerenciar_Fone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerenciar_Fone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerenciar_Fone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JComboBox<String> c_conectividade;
    private com.toedter.calendar.JDateChooser c_data;
    private javax.swing.JTextField c_descricao;
    private javax.swing.JTextField c_marca;
    private javax.swing.JTextField c_material;
    private javax.swing.JTextField c_modelo;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_preco;
    private javax.swing.JTextField c_qtd_estoque;
    private javax.swing.JTextField c_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFone;
    // End of variables declaration//GEN-END:variables
}
