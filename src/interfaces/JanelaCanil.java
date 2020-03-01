package interfaces;

import javax.swing.JOptionPane;
import persistência.BD;

public class JanelaCanil extends javax.swing.JFrame {

    public JanelaCanil() {
        BD.criaConexão();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastrarAdotandoMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadastrarCachorroMenuItem = new javax.swing.JMenuItem();
        adoçãoMenu = new javax.swing.JMenu();
        cadastrarAdoçãoMenuItem = new javax.swing.JMenuItem();
        pesquisarMenuItem = new javax.swing.JMenuItem();
        serviço_indisponívelMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Canil da Ki");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                terminarSistema(evt);
            }
        });

        jMenu1.setText("Adotando");

        cadastrarAdotandoMenuItem.setText("Cadastrar");
        cadastrarAdotandoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAdotando(evt);
            }
        });
        jMenu1.add(cadastrarAdotandoMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cachorro");

        cadastrarCachorroMenuItem.setText("Cadastrar");
        cadastrarCachorroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCachorroMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(cadastrarCachorroMenuItem);

        jMenuBar1.add(jMenu2);

        adoçãoMenu.setText("Adoção");

        cadastrarAdoçãoMenuItem.setText("Cadastrar");
        cadastrarAdoçãoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAdoçãoMenuItemActionPerformed(evt);
            }
        });
        adoçãoMenu.add(cadastrarAdoçãoMenuItem);

        pesquisarMenuItem.setText("Pesquisar");
        pesquisarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarMenuItemActionPerformed(evt);
            }
        });
        adoçãoMenu.add(pesquisarMenuItem);

        serviço_indisponívelMenuItem.setText("Serviço Indisponível");
        serviço_indisponívelMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviço_indisponívelMenuItemActionPerformed(evt);
            }
        });
        adoçãoMenu.add(serviço_indisponívelMenuItem);

        jMenuBar1.add(adoçãoMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void terminarSistema(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_terminarSistema
        // TODO
        BD.fechaConexão();
        System.exit(1);
    }//GEN-LAST:event_terminarSistema

    private void informaServiçoIndisponível(){
        JOptionPane.showMessageDialog(this,"Serviço indisponível!",
                "Informação",JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void cadastrarAdotando(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAdotando
        // TODO 
        new controle.ControladorCadastroAdotando();
    }//GEN-LAST:event_cadastrarAdotando

    private void cadastrarCachorroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCachorroMenuItemActionPerformed
        // TODO
        new controle.ControladorCadastroCachorro();

    }//GEN-LAST:event_cadastrarCachorroMenuItemActionPerformed

    private void cadastrarAdoçãoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAdoçãoMenuItemActionPerformed
        // TODO
        new controle.ControladorCadastroAdoção();
    }//GEN-LAST:event_cadastrarAdoçãoMenuItemActionPerformed

    private void pesquisarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarMenuItemActionPerformed
        // TODO
        new JanelaPesquisarAdoção().setVisible(true);
    }//GEN-LAST:event_pesquisarMenuItemActionPerformed

    private void serviço_indisponívelMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviço_indisponívelMenuItemActionPerformed
        // TODO
        informaServiçoIndisponível();
    }//GEN-LAST:event_serviço_indisponívelMenuItemActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaCanil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCanil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCanil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCanil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCanil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adoçãoMenu;
    private javax.swing.JMenuItem cadastrarAdotandoMenuItem;
    private javax.swing.JMenuItem cadastrarAdoçãoMenuItem;
    private javax.swing.JMenuItem cadastrarCachorroMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem pesquisarMenuItem;
    private javax.swing.JMenuItem serviço_indisponívelMenuItem;
    // End of variables declaration//GEN-END:variables
}
