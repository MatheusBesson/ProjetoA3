/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.Mouse;
import View.Mensagens;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.FlowLayout;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class CadastroMouse extends javax.swing.JFrame {
    private Mouse objetoMouse;
    public CadastroMouse() {
    initComponents();
    this.objetoMouse = new Mouse
    
            }
    
    
 

    /**
     * Creates new form CadastroMouse
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nome_CT = new javax.swing.JTextField();
        marca_CT = new javax.swing.JTextField();
        preco_CT = new javax.swing.JTextField();
        qntdeestoque_CT = new javax.swing.JTextField();
        descricao_CT = new javax.swing.JTextField();
        botoes_CT = new javax.swing.JTextField();
        dpi_CT = new javax.swing.JTextField();
        modelo_CT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        b_cancela_CT = new javax.swing.JButton();
        b_cadastro_CT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design sem nome (1) (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_CTActionPerformed(evt);
            }
        });
        getContentPane().add(nome_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));

        marca_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marca_CTActionPerformed(evt);
            }
        });
        getContentPane().add(marca_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 190, -1));

        preco_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco_CTActionPerformed(evt);
            }
        });
        getContentPane().add(preco_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 190, -1));

        qntdeestoque_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntdeestoque_CTActionPerformed(evt);
            }
        });
        getContentPane().add(qntdeestoque_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 190, 20));

        descricao_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricao_CTActionPerformed(evt);
            }
        });
        getContentPane().add(descricao_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 230, 120));

        botoes_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoes_CTActionPerformed(evt);
            }
        });
        getContentPane().add(botoes_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 190, -1));

        dpi_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpi_CTActionPerformed(evt);
            }
        });
        getContentPane().add(dpi_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 190, -1));

        modelo_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo_CTActionPerformed(evt);
            }
        });
        getContentPane().add(modelo_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 190, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 72, -1, -1));

        b_cancela_CT.setText("Cancelar");
        b_cancela_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancela_CTActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancela_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        b_cadastro_CT.setText("Cadastrar");
        b_cadastro_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastro_CTActionPerformed(evt);
            }
        });
        getContentPane().add(b_cadastro_CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 80, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design sem nome (1) (1).png"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_CTActionPerformed

    private void marca_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marca_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marca_CTActionPerformed

    private void preco_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preco_CTActionPerformed

    private void qntdeestoque_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntdeestoque_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qntdeestoque_CTActionPerformed

    private void descricao_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricao_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricao_CTActionPerformed

    private void botoes_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoes_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botoes_CTActionPerformed

    private void dpi_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpi_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpi_CTActionPerformed

    private void modelo_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelo_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelo_CTActionPerformed

    private void b_cancela_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancela_CTActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_b_cancela_CTActionPerformed

    private void b_cadastro_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastro_CTActionPerformed
    try {
                        String nome_mouse = "";
                  String marca_mouse = "";
               String modelo_mouse = "";
            float preco_mouse = 0;
            int qtd_estoque_mouse = 0;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            //String datacadastro_mouse = sdf.format(datacadastro_CT.getDate());
            String descricao_mouse = "";
            int botoes_mouse = 0;
            int dpi_mouse = 0;
            String tipo_mouse ;

            if (this.nome_CT.getText().length() < 2 && this.nome_CT.getText().length() > 45 ) {
                throw new Mensagens("Nome deve conter entre DOIS a QUARENTA E CINCO caracteres!");
            } else {
                nome_mouse = this.nome_CT.getText();
            }
            //if(this.tipo_CT.getSelectedItem() == "Mouse"){
             //   tipo_mouse = this.tipo_CT.getSelectedItem().toString();
            //}else{
                //throw new Mensagens ("Tipo de produto inválido!");
            //}

            if (this.marca_CT.getText().length() < 2 && this.marca_CT.getText().length() > 45) {
                throw new Mensagens("A declaração de marca deve conter entre DOIS a QUARENTA E CINCO caracteres!");
            } else {
                marca_mouse = this.marca_CT.getText();
            }

            if (this.modelo_CT.getText().length() < 2 && this.modelo_CT.getText().length() > 45) {
                throw new Mensagens("A declaração de modelo deve conter entre DOIS a QUARENTA E CINCO caracteres!");
            } else {
                modelo_mouse = this.modelo_CT.getText();
            }
//
            if (this.preco_CT.getText().length() < 1 && this.preco_CT.getText().length() > 50000) {
                throw new Mensagens("O preço não pode ser menor que UM ou maior que CINQUENTA MIL!");
            } else {
                preco_mouse = Float.parseFloat(this.preco_CT.getText());
            }
//
            if (this.qntdeestoque_CT.getText().length() <= 0) {
                throw new Mensagens("O estoque não pode ser ZERO!");

            } else {
                qtd_estoque_mouse = Integer.parseInt(this.qntdeestoque_CT.getText());
            }

            //if (this.datacadastro_CT.getDate() == null) {
                //throw new Mensagens("A data precisa ser selecionada!");}  
            //else {
                //datacadastro_mouse = sdf.format(this.datacadastro_CT.getDate());
            //}
            if (this.descricao_CT.getText().length() > 250) {
                throw new Mensagens("Descrição muito longa! Máximo 250 caracteres!");
            }
            descricao_mouse = this.descricao_CT.getText();
//arrumar
            if (this.botoes_CT.getText().length() < 2) {
                throw new Mensagens("Mouse deve conter pelo menos DOiS botões!");
            } else {
                botoes_mouse = Integer.parseInt(this.botoes_CT.getText());
            }
            //
            if (this.dpi_CT.getText().length() < 4 && this.dpi_CT.getText().length() > 5) {
                throw new Mensagens("O campo de dpi deve conter de Quatro até Cinco caracteres!");
            } else {
                dpi_mouse =Integer.parseInt(this.dpi_CT.getText());
            }                                                                       // 
            //
            //dpi,botoes, id, nome, tipo, preco, descricao, marca, modelo, qtd_estoque, data_cadastro;

            if (this.objetoMouse.InsertMouseBD(botoes_mouse, dpi_mouse, nome_mouse, tipo_mouse, preco_mouse, descricao_mouse, marca_mouse, modelo_mouse, qtd_estoque_mouse, datacadastro_mouse )) {
                JOptionPane.showMessageDialog(rootPane, "Mouse Cadastrado com Sucesso!");

                this.nome_CT.setText("");
                this.marca_CT.setText("");
                this.modelo_CT.setText("");
                this.preco_CT.setText("");
                this.qntdeestoque_CT.setText("");
                this.descricao_CT.setText("");
                this.botoes_CT.setText("");
                this.dpi_CT.setText("");
                //this.tipo_CT.setSelectedItem("Mouse");
            }
            System.out.println(this.objetoMouse.getListaMouse().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Preencha o campo usando números!");
        } 
        catch (NullPointerException erroNull){
            JOptionPane.showMessageDialog(null, "Preencha o campo data!");
        }
        catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CadastroMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

    }//GEN-LAST:event_b_cadastro_CTActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastro_CT;
    private javax.swing.JButton b_cancela_CT;
    private javax.swing.JTextField botoes_CT;
    private javax.swing.JTextField descricao_CT;
    private javax.swing.JTextField dpi_CT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField marca_CT;
    private javax.swing.JTextField modelo_CT;
    private javax.swing.JTextField nome_CT;
    private javax.swing.JTextField preco_CT;
    private javax.swing.JTextField qntdeestoque_CT;
    // End of variables declaration//GEN-END:variables
}