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
        jMenuBar1 = new javax.swing.JMenuBar();
        ferramentas_TP = new javax.swing.JMenu();
        cadastroprodutos_TP = new javax.swing.JMenu();
        cadastrarteclado_TP = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        perifericos_TP = new javax.swing.JMenu();
        teclados_TP = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EpicPeriféricos");

        B_fechar_TP.setText("FECHAR");
        B_fechar_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_fechar_TPActionPerformed(evt);
            }
        });

        ferramentas_TP.setText("Ferramentas");

        cadastroprodutos_TP.setText("Cadastro Produtos");

        cadastrarteclado_TP.setText("Cadastrar Teclado");
        cadastrarteclado_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarteclado_TPActionPerformed(evt);
            }
        });
        cadastroprodutos_TP.add(cadastrarteclado_TP);

        jMenuItem2.setText("Novo Produto");
        cadastroprodutos_TP.add(jMenuItem2);

        jMenuItem3.setText("Novo Produto");
        cadastroprodutos_TP.add(jMenuItem3);

        ferramentas_TP.add(cadastroprodutos_TP);

        jMenuBar1.add(ferramentas_TP);

        perifericos_TP.setText("Periféricos");

        teclados_TP.setText("Teclados");
        teclados_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclados_TPActionPerformed(evt);
            }
        });
        perifericos_TP.add(teclados_TP);

        jMenuItem1.setText("Produto");
        perifericos_TP.add(jMenuItem1);

        jMenuItem4.setText("Produto");
        perifericos_TP.add(jMenuItem4);

        jMenuBar1.add(perifericos_TP);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(B_fechar_TP, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(B_fechar_TP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_fechar_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_fechar_TPActionPerformed
        System.exit(0);
    }//GEN-LAST:event_B_fechar_TPActionPerformed

    private void cadastrarteclado_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarteclado_TPActionPerformed
       CadastroTeclado objeto = new CadastroTeclado();
       objeto.setVisible(true);
    }//GEN-LAST:event_cadastrarteclado_TPActionPerformed

    private void teclados_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclados_TPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teclados_TPActionPerformed

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
    private javax.swing.JMenuItem cadastrarteclado_TP;
    private javax.swing.JMenu cadastroprodutos_TP;
    private javax.swing.JMenu ferramentas_TP;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu perifericos_TP;
    private javax.swing.JMenuItem teclados_TP;
    // End of variables declaration//GEN-END:variables
}
