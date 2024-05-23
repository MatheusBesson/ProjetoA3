/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Fone_de_Ouvido;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.text.DateFormatter;
import View.Mensagens;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Cadastro_Fone_de_Ouvido extends javax.swing.JFrame {

    private Fone_de_Ouvido objFone; //Cria vinculo com o Fone
//    private JDateChooser c_data;

    public Cadastro_Fone_de_Ouvido() {
        initComponents();
        this.objFone = new Fone_de_Ouvido(); //Cria um vinculo e carrega objeto vazio de Fone de Ouvido
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_preco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_descricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        c_marca = new javax.swing.JTextField();
        c_modelo = new javax.swing.JTextField();
        c_qtd_estoque = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c_material = new javax.swing.JTextField();
        c_conectividade = new javax.swing.JComboBox<>();
        b_cancelar = new javax.swing.JButton();
        b_cadastrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        c_tipo = new javax.swing.JComboBox<>();
        c_data = new com.toedter.calendar.JDateChooser();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setTitle("Cadastro Fone de Ouvido");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/Imagem Fone de Ouvido.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 300, 260));

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(c_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 298, -1));

        c_preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_precoActionPerformed(evt);
            }
        });
        getContentPane().add(c_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 76, -1));

        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Preço:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 37, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Descrição(Opcicional):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, -1));
        getContentPane().add(c_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 210, 73));

        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Marca:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 51, -1));

        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Modelo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 52, -1));

        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("Quantidade em Estoque:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        getContentPane().add(c_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 280, -1));
        getContentPane().add(c_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, -1));

        c_qtd_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_qtd_estoqueActionPerformed(evt);
            }
        });
        getContentPane().add(c_qtd_estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 120, -1));

        jLabel11.setForeground(new java.awt.Color(255, 102, 51));
        jLabel11.setText("Conectividade do Fone:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(new java.awt.Color(255, 102, 51));
        jLabel12.setText("Material:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 60, -1));

        c_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_materialActionPerformed(evt);
            }
        });
        getContentPane().add(c_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 188, -1));

        c_conectividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Com fio", "Sem fio" }));
        c_conectividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_conectividadeActionPerformed(evt);
            }
        });
        getContentPane().add(c_conectividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 150, -1));

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 92, 33));

        b_cadastrar.setText("Cadastrar");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 102, 33));

        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("Épic Perifericos @");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 110, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CANVA IMAGEM app (3).png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 830, 480));

        c_tipo.setBackground(new java.awt.Color(255, 102, 51));
        c_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fone de Ouvido" }));
        c_tipo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                c_tipoComponentAdded(evt);
            }
        });
        c_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_tipoActionPerformed(evt);
            }
        });
        getContentPane().add(c_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 130, -1));

        c_data.setDateFormatString("dd '/' MM '/' y");
        c_data.setMinSelectableDate(new java.util.Date(-62135755087000L));
        getContentPane().add(c_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 110, -1));
        c_data.setVisible(false);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed

        try {
            //recebendo e validando dados da interface gráfica.
            String nome = "";
            String tipo = "";
            float preco = 0;
            String descricao = "";
            String marca = "";
            String modelo = "";
            int qtd_estoque = 0;
            String data_cadastro = "";
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String data_cadastro = sdf.format(c_data.getDate());
            String conectividade_do_fone = "";
            String material = "";

            if (this.c_nome.getText().length() < 2 || this.c_nome.getText().length() > 45) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }
            if (this.c_tipo.getSelectedItem() == "Fone de Ouvido") {
                tipo = this.c_tipo.getSelectedItem().toString();
            } else {
                throw new Mensagens("Tipo de produto inválido!");
            }
            try {
                float preco2 = Float.parseFloat(this.c_preco.getText());

                if (preco2 < 0 || preco2 > 50000) {
                    throw new Mensagens("O preço não pode ser menor que ZERO ou maior que CINQUENTA MIL!");
                } else {
                    preco = Float.parseFloat(this.c_preco.getText());
                }
            } catch (NumberFormatException e) {
                throw new Mensagens("O valor inserido não é um número válido!");
            }
            if (this.c_descricao.getText().length() < 5 || this.c_descricao.getText().length() > 250) {
                throw new Mensagens("Descrição deve conter ao menos 5 caracteres e menos de 250 caracteres.");
            } else {
                descricao = this.c_descricao.getText();
            }
            data_cadastro = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//            if (this.c_data.getDate() == null) { 
//                throw new Mensagens("Insira uma data valida");
//            } else {
//                data_cadastro = sdf.format(this.c_data.getDate());                
//            }
            try {
                qtd_estoque = Integer.parseInt(this.c_qtd_estoque.getText());
                if (qtd_estoque < 0) {
                    throw new Mensagens("Estoque não pode ser negativo");
                }
            } catch (NumberFormatException e) {
                throw new Mensagens("Quantidade em estoque deve ser um número válido");
            }
            if (this.c_marca.getText().length() < 2 || this.c_marca.getText().length() > 45) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                marca = this.c_marca.getText();
            }
            if (this.c_modelo.getText().length() < 2 || this.c_modelo.getText().length() > 45) {
                throw new Mensagens("Modelo deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                modelo = this.c_modelo.getText();
            }
            if (this.c_conectividade.getSelectedItem().toString().length() < 2 || this.c_conectividade.getSelectedItem().toString().length() > 45) {
                throw new Mensagens("Conectividade deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                conectividade_do_fone = this.c_conectividade.getSelectedItem().toString();
            }
            if (this.c_material.getText().length() < 2 || this.c_material.getText().length() > 45) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres e menos de 45 caracteres.");
            } else {
                material = this.c_material.getText();
            }

            // envia os dados para o Controlador cadastrar
            if (this.objFone.InsertFoneBD(conectividade_do_fone, material, nome, tipo, preco, descricao, marca, modelo, qtd_estoque, data_cadastro)) {
                JOptionPane.showMessageDialog(rootPane, "Fone de Ouvido Cadastrado com Sucesso!");

                // limpa campos da interface
                this.c_nome.setText("");
                this.c_tipo.setSelectedItem("Fone de Ouvido");
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
        } catch (NullPointerException erroNull) {
            JOptionPane.showMessageDialog(null, "Preencha o campo data!");
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Fone_de_Ouvido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_cadastrarActionPerformed

    private void c_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_tipoActionPerformed

    private void c_qtd_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_qtd_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_qtd_estoqueActionPerformed

    private void c_tipoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_c_tipoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_c_tipoComponentAdded

    private void c_conectividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_conectividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_conectividadeActionPerformed

    private void c_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_materialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_materialActionPerformed

    private void c_precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_precoActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Fone_de_Ouvido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Fone_de_Ouvido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Fone_de_Ouvido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Fone_de_Ouvido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Fone_de_Ouvido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
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
    private javax.swing.JComboBox<String> c_tipo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
