/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Teclado;
import View.Mensagens;
import com.toedter.calendar.JDateChooser;
import java.awt.FlowLayout;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rodri
 */
public class CadastroTeclado extends javax.swing.JFrame {

    private Teclado objTeclado;

    public CadastroTeclado() {
        initComponents();
        this.objTeclado = new Teclado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        Label_nomeTeclado_CT = new javax.swing.JLabel();
        nome_CT = new javax.swing.JTextField();
        Label_marcaTeclado_CT = new javax.swing.JLabel();
        marca_CT = new javax.swing.JTextField();
        Label_modeloTeclado_CT = new javax.swing.JLabel();
        modelo_CT = new javax.swing.JTextField();
        Label_precoTeclado_CT = new javax.swing.JLabel();
        preco_CT = new javax.swing.JTextField();
        Label_qtdestoqueTeclado_CT = new javax.swing.JLabel();
        qtdestoque_CT = new javax.swing.JTextField();
        Label_descricaoTeclado_CT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao_CT = new javax.swing.JTextArea();
        Label_dimensaoTeclado_CT = new javax.swing.JLabel();
        Label_conectividadeTeclado_CT = new javax.swing.JLabel();
        dimensao_CT = new javax.swing.JTextField();
        conectividade_CT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        b_cancelar_CT = new javax.swing.JButton();
        b_cadastrar_CT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        TECLADOIMAGE_CT = new javax.swing.JLabel();
        BACKGROUND_CT = new javax.swing.JLabel();
        tipo_CT = new javax.swing.JComboBox<>();
        datacadastro_CT = new com.toedter.calendar.JDateChooser();

        jInternalFrame1.setVisible(true);

        jLabel1.setText("jLabel1");
        jInternalFrame1.getContentPane().add(jLabel1, java.awt.BorderLayout.LINE_START);

        setTitle("Cadastrar Teclado");
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(null);

        Label_nomeTeclado_CT.setForeground(new java.awt.Color(255, 255, 255));
        Label_nomeTeclado_CT.setText("Nome do Produto:");
        getContentPane().add(Label_nomeTeclado_CT);
        Label_nomeTeclado_CT.setBounds(29, 36, 114, 16);

        nome_CT.setBackground(new java.awt.Color(204, 204, 204));
        nome_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_CTActionPerformed(evt);
            }
        });
        getContentPane().add(nome_CT);
        nome_CT.setBounds(29, 70, 310, 22);

        Label_marcaTeclado_CT.setForeground(new java.awt.Color(255, 255, 255));
        Label_marcaTeclado_CT.setText("Marca:");
        getContentPane().add(Label_marcaTeclado_CT);
        Label_marcaTeclado_CT.setBounds(29, 105, 60, 16);

        marca_CT.setBackground(new java.awt.Color(204, 204, 204));
        marca_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marca_CTActionPerformed(evt);
            }
        });
        getContentPane().add(marca_CT);
        marca_CT.setBounds(29, 128, 275, 22);

        Label_modeloTeclado_CT.setForeground(new java.awt.Color(255, 255, 255));
        Label_modeloTeclado_CT.setText("Modelo:");
        getContentPane().add(Label_modeloTeclado_CT);
        Label_modeloTeclado_CT.setBounds(29, 163, 53, 16);

        modelo_CT.setBackground(new java.awt.Color(204, 204, 204));
        modelo_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo_CTActionPerformed(evt);
            }
        });
        getContentPane().add(modelo_CT);
        modelo_CT.setBounds(29, 186, 275, 22);

        Label_precoTeclado_CT.setForeground(new java.awt.Color(255, 255, 255));
        Label_precoTeclado_CT.setText("Preço:");
        getContentPane().add(Label_precoTeclado_CT);
        Label_precoTeclado_CT.setBounds(29, 221, 42, 16);

        preco_CT.setBackground(new java.awt.Color(204, 204, 204));
        preco_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco_CTActionPerformed(evt);
            }
        });
        getContentPane().add(preco_CT);
        preco_CT.setBounds(29, 244, 145, 22);

        Label_qtdestoqueTeclado_CT.setForeground(new java.awt.Color(255, 255, 255));
        Label_qtdestoqueTeclado_CT.setText("Quant. Estoque:");
        getContentPane().add(Label_qtdestoqueTeclado_CT);
        Label_qtdestoqueTeclado_CT.setBounds(29, 282, 95, 16);

        qtdestoque_CT.setBackground(new java.awt.Color(204, 204, 204));
        qtdestoque_CT.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        qtdestoque_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdestoque_CTActionPerformed(evt);
            }
        });
        getContentPane().add(qtdestoque_CT);
        qtdestoque_CT.setBounds(141, 279, 120, 22);

        Label_descricaoTeclado_CT.setForeground(new java.awt.Color(255, 255, 255));
        Label_descricaoTeclado_CT.setText("Descrição(Opcional):");
        getContentPane().add(Label_descricaoTeclado_CT);
        Label_descricaoTeclado_CT.setBounds(20, 330, 122, 16);

        descricao_CT.setBackground(new java.awt.Color(204, 204, 204));
        descricao_CT.setColumns(20);
        descricao_CT.setRows(5);
        jScrollPane1.setViewportView(descricao_CT);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 330, 222, 102);

        Label_dimensaoTeclado_CT.setForeground(new java.awt.Color(255, 255, 255));
        Label_dimensaoTeclado_CT.setText("Dimensão:");
        getContentPane().add(Label_dimensaoTeclado_CT);
        Label_dimensaoTeclado_CT.setBounds(410, 320, 65, 16);

        Label_conectividadeTeclado_CT.setForeground(new java.awt.Color(255, 255, 255));
        Label_conectividadeTeclado_CT.setText("Conectividade:");
        getContentPane().add(Label_conectividadeTeclado_CT);
        Label_conectividadeTeclado_CT.setBounds(410, 370, 87, 16);

        dimensao_CT.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(dimensao_CT);
        dimensao_CT.setBounds(480, 320, 199, 22);

        conectividade_CT.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(conectividade_CT);
        conectividade_CT.setBounds(500, 370, 177, 22);

        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Épic Perifericos @");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 490, 130, 16);

        b_cancelar_CT.setText("Cancelar");
        b_cancelar_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelar_CTActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar_CT);
        b_cancelar_CT.setBounds(450, 440, 90, 30);

        b_cadastrar_CT.setText("Cadastrar");
        b_cadastrar_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrar_CTActionPerformed(evt);
            }
        });
        getContentPane().add(b_cadastrar_CT);
        b_cadastrar_CT.setBounds(600, 440, 90, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 30, 120, 30);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 100, 60, 20);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 160, 70, 20);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 220, 60, 20);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel5);
        jPanel5.setBounds(20, 280, 100, 20);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel7);
        jPanel7.setBounds(10, 330, 130, 20);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel8);
        jPanel8.setBounds(400, 320, 70, 20);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel9);
        jPanel9.setBounds(400, 370, 100, 20);

        TECLADOIMAGE_CT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tecladotrabalho (1).jpg"))); // NOI18N
        getContentPane().add(TECLADOIMAGE_CT);
        TECLADOIMAGE_CT.setBounds(390, 130, 330, 140);

        BACKGROUND_CT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FundoCadastroTeclados (1).jpg"))); // NOI18N
        getContentPane().add(BACKGROUND_CT);
        BACKGROUND_CT.setBounds(0, 0, 800, 520);

        tipo_CT.setBackground(new java.awt.Color(102, 0, 51));
        tipo_CT.setForeground(new java.awt.Color(255, 255, 255));
        tipo_CT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teclado" }));
        tipo_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_CTActionPerformed(evt);
            }
        });
        getContentPane().add(tipo_CT);
        tipo_CT.setBounds(650, 70, 100, 22);
        tipo_CT.setVisible(false);

        datacadastro_CT.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(datacadastro_CT);
        datacadastro_CT.setBounds(10, 480, 103, 22);
        datacadastro_CT.setVisible(false);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NomeTeclado_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTeclado_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTeclado_CTActionPerformed

    private void MarcaTeclado_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaTeclado_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaTeclado_CTActionPerformed

    private void ModeloTeclado_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloTeclado_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeloTeclado_CTActionPerformed

    private void PrecoTeclado_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecoTeclado_CTActionPerformed

    }//GEN-LAST:event_PrecoTeclado_CTActionPerformed

    private void QuantidadeEstoque_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeEstoque_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeEstoque_CTActionPerformed

    private void nome_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_CTActionPerformed

    private void marca_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marca_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marca_CTActionPerformed

    private void modelo_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelo_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelo_CTActionPerformed

    private void preco_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preco_CTActionPerformed

    private void b_cadastrar_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrar_CTActionPerformed

        try {
            // recebendo e validando dados da interface gr�fica.
            String nome_teclado = "";
            String marca_teclado = "";
            String modelo_teclado = "";
            float preco_teclado = 0;
            int qtd_estoque_teclado = 0;
            
          /*  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dataAtual = dateFormat.format(new Date());
            datacadastro_CT.setDate(new Date(dataAtual)); */
            String datacadastro_teclado = "";
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String datacadastro_teclado = sdf.format(datacadastro_CT.getDate());
          
            String descricao_teclado = "";
            String dimensao_teclado = "";
            String conectividade_teclado = "";
            String tipo_teclado;

            if (this.nome_CT.getText().length() < 2 || this.nome_CT.getText().length() > 45) {
                throw new Mensagens("Nome deve conter entre DOIS a QUARENTA E CINCO caracteres!");
            } else {
                nome_teclado = this.nome_CT.getText();
            }
            if (this.tipo_CT.getSelectedItem() == "Teclado") {
                tipo_teclado = this.tipo_CT.getSelectedItem().toString();
            } else {
                throw new Mensagens("Tipo de produto inválido!");
            }

            if (this.marca_CT.getText().length() < 2 || this.marca_CT.getText().length() > 45) {
                throw new Mensagens("A declaração de marca deve conter entre DOIS a QUARENTA E CINCO caracteres!");
            } else {
                marca_teclado = this.marca_CT.getText();
            }

            if (this.modelo_CT.getText().length() < 2 || this.modelo_CT.getText().length() > 45) {
                throw new Mensagens("A declaração de modelo deve conter entre DOIS a QUARENTA E CINCO caracteres!");
            } else {
                modelo_teclado = this.modelo_CT.getText();
            }

          /*  try {
                float preco_CT = Float.parseFloat(this.preco_CT.getText());

                if (preco_CT < 0 || preco_CT > 50000) {
                    throw new Mensagens("O preço não pode ser menor que ZERO ou maior que CINQUENTA MIL!");
                }
            } catch (NumberFormatException e) {
                throw new Mensagens("O valor inserido não é um número válido!");
            }    */
            
            
            try {
                float preco2 = Float.parseFloat(this.preco_CT.getText());

                if (preco2 < 0 || preco2 > 50000) {
                    throw new Mensagens("O preço não pode ser menor que ZERO ou maior que CINQUENTA MIL!");
                } else {
                   preco_teclado = Float.parseFloat(this.preco_CT.getText());
                }
            } catch (NumberFormatException e) {
                throw new Mensagens("O valor inserido não é um número válido!");
            }
            
            

            /*    if (this.preco_CT.getText().length() > 1 && this.preco_CT.getText().length() < 50000) {
                throw new Mensagens("O preço não pode ser menor que UM ou maior que CINQUENTA MIL!");
            } else {
                preco_teclado = Float.parseFloat(this.preco_CT.getText());
            } */
                
            if (this.qtdestoque_CT.getText().length() <= 0) {
                throw new Mensagens("O estoque não pode ser ZERO!");

            } else {
                qtd_estoque_teclado = Integer.parseInt(this.qtdestoque_CT.getText());
            }
            
            datacadastro_teclado = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//            if (this.datacadastro_CT.getDate() == null) {
//                throw new Mensagens("A data precisa ser selecionada!");
//
//            } else {
//                datacadastro_teclado = sdf.format(this.datacadastro_CT.getDate());
//            }
            if (this.descricao_CT.getText().length() > 250) {
                throw new Mensagens("Descrição muito longa! Máximo 250 caracteres!");
            }
            descricao_teclado = this.descricao_CT.getText();

            if (this.dimensao_CT.getText().length() < 1 || this.dimensao_CT.getText().length() > 50) {
                throw new Mensagens("O campo de dimensão não pode ser nulo ou maior que 50 caracteres!");
            } else {
                dimensao_teclado = this.dimensao_CT.getText();
            }
            if (this.conectividade_CT.getText().length() < 1 || this.dimensao_CT.getText().length() > 100) {
                throw new Mensagens("O campo de conectividade não pode ser nulo ou maior que 50 caracteres!");
            } else {
                conectividade_teclado = this.conectividade_CT.getText();
            }                                                                       // dimensao, conectividade, id, nome, tipo, preco, descricao, marca, modelo, qtd_estoque, data_cadastro;

            if (this.objTeclado.InsertTecladoBD(dimensao_teclado, conectividade_teclado, nome_teclado, tipo_teclado, preco_teclado, descricao_teclado, marca_teclado, modelo_teclado, qtd_estoque_teclado, datacadastro_teclado)) {
                JOptionPane.showMessageDialog(rootPane, "Teclado Cadastrado com Sucesso!");

                this.nome_CT.setText("");
                this.marca_CT.setText("");
                this.modelo_CT.setText("");
                this.preco_CT.setText("");
                this.qtdestoque_CT.setText("");
                this.datacadastro_CT.setDate(null);
                this.descricao_CT.setText("");
                this.dimensao_CT.setText("");
                this.conectividade_CT.setText("");
                this.tipo_CT.setSelectedItem("Teclado");
            }
            System.out.println(this.objTeclado.getListaTeclado().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Preencha o campo usando números!");
//        } catch (NullPointerException erroNull) {
//            JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s)!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CadastroTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /*catch (SQLException ex) {
Logger.getLogger(CadastroTeclado.class.getName()).log(Level.SEVERE, null, ex);
}*/

    }//GEN-LAST:event_b_cadastrar_CTActionPerformed

    private void b_cancelar_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelar_CTActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelar_CTActionPerformed

    private void linguagem_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linguagem_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linguagem_CTActionPerformed

    private void qtdestoque_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdestoque_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdestoque_CTActionPerformed

    private void tipo_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_CTActionPerformed

    }//GEN-LAST:event_tipo_CTActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTeclado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND_CT;
    private javax.swing.JLabel Label_conectividadeTeclado_CT;
    private javax.swing.JLabel Label_descricaoTeclado_CT;
    private javax.swing.JLabel Label_dimensaoTeclado_CT;
    private javax.swing.JLabel Label_marcaTeclado_CT;
    private javax.swing.JLabel Label_modeloTeclado_CT;
    private javax.swing.JLabel Label_nomeTeclado_CT;
    private javax.swing.JLabel Label_precoTeclado_CT;
    private javax.swing.JLabel Label_qtdestoqueTeclado_CT;
    private javax.swing.JLabel TECLADOIMAGE_CT;
    private javax.swing.JButton b_cadastrar_CT;
    private javax.swing.JButton b_cancelar_CT;
    private javax.swing.JTextField conectividade_CT;
    private com.toedter.calendar.JDateChooser datacadastro_CT;
    private javax.swing.JTextArea descricao_CT;
    private javax.swing.JTextField dimensao_CT;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marca_CT;
    private javax.swing.JTextField modelo_CT;
    private javax.swing.JTextField nome_CT;
    private javax.swing.JTextField preco_CT;
    private javax.swing.JTextField qtdestoque_CT;
    private javax.swing.JComboBox<String> tipo_CT;
    // End of variables declaration//GEN-END:variables
}
