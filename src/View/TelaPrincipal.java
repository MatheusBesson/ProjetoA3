/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author rodri
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal2
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_fechar_TP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ferramentas_TP = new javax.swing.JMenu();
        cadastroprodutos_TP = new javax.swing.JMenu();
        cadastrarteclado_TP = new javax.swing.JMenuItem();
        cadastrar_fonedeouvido_TP = new javax.swing.JMenuItem();
        gerenciar_fone_de_ouvido_TP = new javax.swing.JMenu();
        gerenciarTeclado_TP = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EpicPeriféricos");
        setMinimumSize(new java.awt.Dimension(898, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        B_fechar_TP.setText("FECHAR");
        B_fechar_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_fechar_TPActionPerformed(evt);
            }
        });
        getContentPane().add(B_fechar_TP);
        B_fechar_TP.setBounds(340, 390, 213, 68);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CANVA IMAGEM app (2).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-200, -130, 1330, 770);

        ferramentas_TP.setText("Ferramentas");

        cadastroprodutos_TP.setText("Cadastro Produtos");

        cadastrarteclado_TP.setText("Cadastrar Teclado");
        cadastrarteclado_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarteclado_TPActionPerformed(evt);
            }
        });
        cadastroprodutos_TP.add(cadastrarteclado_TP);

        cadastrar_fonedeouvido_TP.setText("Cadastrar Fone de ouvido");
        cadastrar_fonedeouvido_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_fonedeouvido_TPActionPerformed(evt);
            }
        });
        cadastroprodutos_TP.add(cadastrar_fonedeouvido_TP);

        ferramentas_TP.add(cadastroprodutos_TP);

        jMenuBar1.add(ferramentas_TP);

        gerenciar_fone_de_ouvido_TP.setText("Periféricos");
        gerenciar_fone_de_ouvido_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciar_fone_de_ouvido_TPActionPerformed(evt);
            }
        });

        gerenciarTeclado_TP.setText(" Gerenciar Teclado");
        gerenciarTeclado_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarTeclado_TPActionPerformed(evt);
            }
        });
        gerenciar_fone_de_ouvido_TP.add(gerenciarTeclado_TP);

        jMenuItem1.setText("Gerenciar Fone de Ouvido");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        gerenciar_fone_de_ouvido_TP.add(jMenuItem1);

        jMenuBar1.add(gerenciar_fone_de_ouvido_TP);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B_fechar_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_fechar_TPActionPerformed
        System.exit(0);
    }//GEN-LAST:event_B_fechar_TPActionPerformed

    private void cadastrarteclado_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarteclado_TPActionPerformed
        CadastroTeclado objeto = new CadastroTeclado();
        objeto.setVisible(true);
    }//GEN-LAST:event_cadastrarteclado_TPActionPerformed

    private void gerenciarTeclado_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarTeclado_TPActionPerformed
        GerenciaTeclado objeto = new GerenciaTeclado();
        objeto.setVisible(true);
    }//GEN-LAST:event_gerenciarTeclado_TPActionPerformed

    private void gerenciar_fone_de_ouvido_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciar_fone_de_ouvido_TPActionPerformed

    }//GEN-LAST:event_gerenciar_fone_de_ouvido_TPActionPerformed

    private void cadastrar_fonedeouvido_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_fonedeouvido_TPActionPerformed
        Cadastro_Fone_de_Ouvido objeto = new Cadastro_Fone_de_Ouvido();
        objeto.setVisible(true);
    }//GEN-LAST:event_cadastrar_fonedeouvido_TPActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Gerenciar_Fone objeto = new Gerenciar_Fone();
       objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_fechar_TP;
    private javax.swing.JMenuItem cadastrar_fonedeouvido_TP;
    private javax.swing.JMenuItem cadastrarteclado_TP;
    private javax.swing.JMenu cadastroprodutos_TP;
    private javax.swing.JMenu ferramentas_TP;
    private javax.swing.JMenuItem gerenciarTeclado_TP;
    private javax.swing.JMenu gerenciar_fone_de_ouvido_TP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
