package interfaces;

import controle.ControladorCadastroAdoção;
import entidade.Adoção;
import entidade.Adotando;
import entidade.Cachorro;
import entidade.Adoção.Soube;
import entidade.Visão;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.Vector;
import util.Data;

public class JanelaCadastroAdoção extends javax.swing.JFrame {

    private static Vector<Visão<String>> adotandos_cadastrados = new Vector<Visão<String>>();
    private static Vector<Visão<Integer>> cachorros_cadastrados = new Vector<Visão<Integer>>();
    private static DefaultListModel adoções_cadastradas;
    private static ControladorCadastroAdoção controlador;

    public JanelaCadastroAdoção(ControladorCadastroAdoção controlador) {
        this.controlador = controlador;
        adotandos_cadastrados = Adotando.getVisões();
        cachorros_cadastrados = Cachorro.getVisões();
        initComponents();
        soubeComboBox.setSelectedIndex(-1);
        adotandoComboBox.setSelectedIndex(-1);
        cachorroComboBox.setSelectedIndex(-1);
        inicializarCachorrosCadastrados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        adoções_cadastradasList = new javax.swing.JList();
        adoções_cadastradasLabel = new javax.swing.JLabel();
        identificador_sequencialTextField = new javax.swing.JTextField();
        identificador_sequencialLabel = new javax.swing.JLabel();
        adoção_dataTextField = new javax.swing.JTextField();
        adoção_dataLabel = new javax.swing.JLabel();
        soubeComboBox = new javax.swing.JComboBox();
        soubeLabel = new javax.swing.JLabel();
        adotandoComboBox = new javax.swing.JComboBox();
        cachorroComboBox = new javax.swing.JComboBox();
        adotandoLabel = new javax.swing.JLabel();
        cachorroLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        limparButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        inserirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro da Adoção");
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        adoções_cadastradasList.setModel(new DefaultListModel());
        adoções_cadastradasList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(adoções_cadastradasList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 7, 7);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        adoções_cadastradasLabel.setText("Adoções Cadastradas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 7, 0);
        getContentPane().add(adoções_cadastradasLabel, gridBagConstraints);

        identificador_sequencialTextField.setEditable(false);
        identificador_sequencialTextField.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 7, 7);
        getContentPane().add(identificador_sequencialTextField, gridBagConstraints);

        identificador_sequencialLabel.setText("Identificador Sequencial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 7, 0);
        getContentPane().add(identificador_sequencialLabel, gridBagConstraints);

        adoção_dataTextField.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 7, 7);
        getContentPane().add(adoção_dataTextField, gridBagConstraints);

        adoção_dataLabel.setText("Data da Adoção");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 7, 0);
        getContentPane().add(adoção_dataLabel, gridBagConstraints);

        soubeComboBox.setModel(new DefaultComboBoxModel (Adoção.SOUBE));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 7, 7);
        getContentPane().add(soubeComboBox, gridBagConstraints);

        soubeLabel.setText("Como Soube do Canil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 7, 0);
        getContentPane().add(soubeLabel, gridBagConstraints);

        adotandoComboBox.setModel(new DefaultComboBoxModel (adotandos_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 7, 7);
        getContentPane().add(adotandoComboBox, gridBagConstraints);

        cachorroComboBox.setModel(new DefaultComboBoxModel (cachorros_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 7, 7);
        getContentPane().add(cachorroComboBox, gridBagConstraints);

        adotandoLabel.setText("Adotando");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 7, 0);
        getContentPane().add(adotandoLabel, gridBagConstraints);

        cachorroLabel.setText("Cachorro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 7, 0);
        getContentPane().add(cachorroLabel, gridBagConstraints);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });
        jPanel1.add(limparButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removerButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(alterarButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(consultarButton);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(inserirButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 7, 7);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirButtonActionPerformed
        // TODO
        String menssagem_erro = null;
        Adoção adoção = obterAdoção();
        if (adoção != null) {
            menssagem_erro = controlador.inserirAdoção(adoção);
        } else {
            menssagem_erro = "Algum campo nao está preenchido";
        }
        if (menssagem_erro == null) {
            Visão<Integer> visão = adoção.getVisão();
            adoções_cadastradas.addElement(visão);
            adoções_cadastradasList.ensureIndexIsVisible(adoções_cadastradas.getSize());
            identificador_sequencialTextField.setText(adoção.getSequencial() + "");
        } else {
            JOptionPane.showMessageDialog(this, menssagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inserirButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        // TODO
        Visão<Integer> visão;
        Adoção adoção = null;
        String mensagem_erro = null;
        if (adoções_cadastradasList.getSelectedValue() != null) {
            visão = (Visão<Integer>) adoções_cadastradasList.getSelectedValue();
            adoção = Adoção.consultarAdoção(visão.getChave());
            if (adoção == null) {
                mensagem_erro = "Adoção não encontrada no banco de dados";
            }
        } else {
            mensagem_erro = "Nenhuma adoção selecionada";
        }
        if (mensagem_erro == null) {
            Visão<String> visão1 = getAdotandosCadastradosVisão(adoção.getAdotando().getCpf());
            visão = getCachorrosCadastradosVisão(adoção.getCachorro().getSequencial());
            identificador_sequencialTextField.setText(adoção.getSequencial() + "");
            adoção_dataTextField.setText(adoção.getAdoçãoData().toString());
            soubeComboBox.setSelectedIndex(adoção.getSoube().ordinal());
            adotandoComboBox.setSelectedItem(visão1);
            cachorroComboBox.setSelectedItem(visão);
        } else {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed
        // TODO
        String menssagem_erro = null;
        Adoção adoção = obterAdoção();
        if(adoção != null){
            menssagem_erro = controlador.alterarAdoção(adoção);
        } else {
            menssagem_erro = "Algum campo não está preenchido";
        }
        if(menssagem_erro == null){
            Visão<Integer> visão = getAdoçõesCadastradasVisão(adoção.getSequencial());
            visão.setInfo(adoção.getVisão().getInfo());
            adoções_cadastradasList.updateUI();
            adoções_cadastradasList.ensureIndexIsVisible(adoções_cadastradas.getSize());            
        } else {
            JOptionPane.showMessageDialog(this,menssagem_erro,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        // TODO
        String menssagem_erro = null;
        Visão<Integer> visão = null;
        if (adoções_cadastradasList.getSelectedValue() != null){
            visão = (Visão<Integer>) adoções_cadastradasList.getSelectedValue();
            menssagem_erro = controlador.removerAdoção(visão.getChave());
        } else {
            menssagem_erro = "Nenhum cachorro foi selecionado";
        }
        if (menssagem_erro == null) {
            adoções_cadastradas.removeElement(visão);
            if (adoções_cadastradas.size() > 0) {
                adoções_cadastradasList.ensureIndexIsVisible(0);
            }
        } else {
            JOptionPane.showMessageDialog(this, menssagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }         
    }//GEN-LAST:event_removerButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        // TODO
        identificador_sequencialTextField.setText("");
        adoção_dataTextField.setText("");
        soubeComboBox.setSelectedIndex(-1);
        adotandoComboBox.setSelectedIndex(-1);
        cachorroComboBox.setSelectedIndex(-1);
    }//GEN-LAST:event_limparButtonActionPerformed

    private Adoção obterAdoção() {
        int identificador_sequencial;
        if (identificador_sequencialTextField.getText().isEmpty()) {
            identificador_sequencial = 0;
        } else {
            identificador_sequencial = Integer.parseInt(identificador_sequencialTextField.getText());
        }
        Data adoçãoData;
        if (adoção_dataTextField.getText().isEmpty()) {
            return null;
        } else {
            adoçãoData = Data.toData(adoção_dataTextField.getText());
        }
        Soube soube;
        if (soubeComboBox.getSelectedItem() == null) {
            return null;
        } else {
            soube = Soube.values()[soubeComboBox.getSelectedIndex()];
        }
        Adotando adotando = null;
        if (adotandoComboBox.getSelectedItem() == null) {
            return null;
        } else {
            Visão<String> visão = (Visão<String>) adotandoComboBox.getSelectedItem();
            adotando = Adotando.buscarAdotando(visão.getChave());
        }
        Cachorro cachorro = null;
        if (cachorroComboBox.getSelectedItem() == null) {
            return null;
        } else {
            Visão<Integer> visão = (Visão<Integer>) cachorroComboBox.getSelectedItem();
            cachorro = Cachorro.consultarCachorro(visão.getChave());
        }
        return new Adoção(identificador_sequencial, adoçãoData, soube, adotando, cachorro);
    }

    private Visão<Integer> getAdoçõesCadastradasVisão(int sequencial) {
        //TODO
        for (int i = 0; i < adoções_cadastradas.getSize(); i++) {
            Visão<Integer> visão = (Visão<Integer>) adoções_cadastradas.getElementAt(i);
            if (visão.getChave() == sequencial) {
                return visão;
            }
        }
        return null;
    }

    private Visão<String> getAdotandosCadastradosVisão(String cpf) {
        for (Visão<String> visão : adotandos_cadastrados) {
            if (visão.getChave().equals(cpf)) {
                return visão;
            }
        }
        return null;
    }

    private Visão<Integer> getCachorrosCadastradosVisão(int sequencial_cachorro) {
        for (Visão<Integer> visão : cachorros_cadastrados) {
            if (visão.getChave() == sequencial_cachorro) {
                return visão;
            }
        }
        return null;
    }

    private void inicializarCachorrosCadastrados() {
        adoções_cadastradas = (DefaultListModel) adoções_cadastradasList.getModel();
        Vector<Visão<Integer>> visões = Adoção.getVisões();
        for (Visão<Integer> visão : visões) {
            adoções_cadastradas.addElement(visão);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox adotandoComboBox;
    private javax.swing.JLabel adotandoLabel;
    private javax.swing.JLabel adoção_dataLabel;
    private javax.swing.JTextField adoção_dataTextField;
    private javax.swing.JLabel adoções_cadastradasLabel;
    private javax.swing.JList adoções_cadastradasList;
    private javax.swing.JButton alterarButton;
    private javax.swing.JComboBox cachorroComboBox;
    private javax.swing.JLabel cachorroLabel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel identificador_sequencialLabel;
    private javax.swing.JTextField identificador_sequencialTextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JButton removerButton;
    private javax.swing.JComboBox soubeComboBox;
    private javax.swing.JLabel soubeLabel;
    // End of variables declaration//GEN-END:variables
}
