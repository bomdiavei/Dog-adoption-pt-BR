package interfaces;

import controle.ControladorCadastroCachorro;
import entidade.Cachorro;
import entidade.Cachorro.Raça;
import entidade.Visão;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.Vector;

public class JanelaCadastroCachorro extends javax.swing.JFrame {

    private static ControladorCadastroCachorro controlador;
    private static DefaultListModel cachorros_cadastrados;

    public JanelaCadastroCachorro(ControladorCadastroCachorro controlador) {
        this.controlador = controlador;
        initComponents();
        raçaComboBox.setSelectedIndex(-1);
        inicializarCachorrosCadastrados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cachorros_cadastradosLabel = new javax.swing.JLabel();
        identificador_sequencialTextField = new javax.swing.JTextField();
        identificador_sequencialLabel = new javax.swing.JLabel();
        raçaLabel = new javax.swing.JLabel();
        raçaComboBox = new javax.swing.JComboBox();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        mansoCheckBox = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        ultimas_consultasTextArea = new javax.swing.JTextArea();
        ultimas_consultasLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        limparButton = new javax.swing.JButton();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        cachorros_cadastradosList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro do Cachorro");
        setPreferredSize(new java.awt.Dimension(500, 570));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        cachorros_cadastradosLabel.setText("Cachorros Cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        getContentPane().add(cachorros_cadastradosLabel, gridBagConstraints);

        identificador_sequencialTextField.setEditable(false);
        identificador_sequencialTextField.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 3, 0);
        getContentPane().add(identificador_sequencialTextField, gridBagConstraints);

        identificador_sequencialLabel.setText("Identificador Sequencial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        getContentPane().add(identificador_sequencialLabel, gridBagConstraints);

        raçaLabel.setText("Raça");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        getContentPane().add(raçaLabel, gridBagConstraints);

        raçaComboBox.setModel(new DefaultComboBoxModel (Cachorro.RAÇAS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 3, 0);
        getContentPane().add(raçaComboBox, gridBagConstraints);

        nomeLabel.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        getContentPane().add(nomeLabel, gridBagConstraints);

        nomeTextField.setColumns(17);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 3, 0);
        getContentPane().add(nomeTextField, gridBagConstraints);

        mansoCheckBox.setText("O cachorro é manso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 3, 0);
        getContentPane().add(mansoCheckBox, gridBagConstraints);

        jScrollPane3.setBorder(null);

        ultimas_consultasTextArea.setColumns(20);
        ultimas_consultasTextArea.setRows(7);
        jScrollPane3.setViewportView(ultimas_consultasTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 3, 0);
        getContentPane().add(jScrollPane3, gridBagConstraints);

        ultimas_consultasLabel.setText("Últimas Consultas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 7);
        getContentPane().add(ultimas_consultasLabel, gridBagConstraints);

        jPanel1.setBorder(null);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });
        jPanel1.add(limparButton);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removerButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 10, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        cachorros_cadastradosList.setModel(new DefaultListModel());
        cachorros_cadastradosList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(cachorros_cadastradosList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 3, 0);
        getContentPane().add(jScrollPane5, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirButtonActionPerformed
        // TODO
        Cachorro cachorro = obterCachorro();
        String menssagem_erro = null;
        if (cachorro != null) {
            menssagem_erro = controlador.inserirCachorro(cachorro);
        } else {
            menssagem_erro = "Algum campo não foi preenchido";
        }
        if (menssagem_erro == null) {
            Visão<Integer> visão = cachorro.getVisão();
            cachorros_cadastrados.addElement(visão);
            cachorros_cadastradosList.ensureIndexIsVisible(cachorros_cadastrados.getSize()-1);
            identificador_sequencialTextField.setText(cachorro.getSequencial() + "");         
            cachorros_cadastradosList.setSelectedIndex(cachorros_cadastrados.getSize() - 1);
        } else {
            JOptionPane.showMessageDialog(this, menssagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inserirButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        // TODO
        Visão<Integer> visão;
        Cachorro cachorro = null;
        String mensagem_erro = null;
        if (cachorros_cadastradosList.getSelectedValue() != null) {
            visão = (Visão<Integer>) cachorros_cadastradosList.getSelectedValue();
            cachorro = Cachorro.consultarCachorro(visão.getChave());
            if (cachorro == null) {
                mensagem_erro = "Cachorro não encontrado no banco de dados";
            }
        } else {
            mensagem_erro = "Nenhum cachorro selecionado";
        }
        if (mensagem_erro == null) {
            identificador_sequencialTextField.setText(cachorro.getSequencial() + "");
            nomeTextField.setText(cachorro.getNome());
            raçaComboBox.setSelectedIndex(cachorro.getRaça().ordinal());
            mansoCheckBox.setSelected(cachorro.isManso());
            ultimas_consultasTextArea.append(cachorro.getVisão().toString()+"\n");
        } else {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed
        // TODO
        Cachorro cachorro = obterCachorro();
        String mensagem_erro = null;
        if (cachorro != null) {
            mensagem_erro = controlador.alterarCachorro(cachorro);
        } else {
            mensagem_erro = "Algum campo não foi preenchido.";
        }
        if (mensagem_erro == null) {
            Visão<Integer> visão = getCachorrosCadastradosVisão(cachorro.getSequencial());
            visão.setInfo(cachorro.getVisão().getInfo());
            cachorros_cadastradosList.updateUI();
            cachorros_cadastradosList.ensureIndexIsVisible(getCachorrosCadastradosVisãoIndex(visão));
            cachorros_cadastradosList.setSelectedIndex(getCachorrosCadastradosVisãoIndex(visão));
        } else {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        // TODO
        String menssagem_erro = null;
        Visão<Integer> visão = null;
        if (cachorros_cadastradosList.getSelectedValue() != null){
            visão = (Visão<Integer>) cachorros_cadastradosList.getSelectedValue();
            menssagem_erro = controlador.removerCachorro(visão.getChave());
        } else {
            menssagem_erro = "Nenhum cachorro foi selecionado";
        }
        if (menssagem_erro == null) {
            cachorros_cadastrados.removeElement(visão);
            if (cachorros_cadastrados.size() > 0) {
                cachorros_cadastradosList.ensureIndexIsVisible(0);
            }
        } else {
            JOptionPane.showMessageDialog(this, menssagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_removerButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        identificador_sequencialTextField.setText("");
        nomeTextField.setText("");
        raçaComboBox.setSelectedIndex(-1);
        mansoCheckBox.setSelected(false);
    }//GEN-LAST:event_limparButtonActionPerformed

    private Cachorro obterCachorro() {
        int sequencial;
        if (identificador_sequencialTextField.getText().isEmpty()) {
            sequencial = 0;
        } else {
            sequencial = Integer.parseInt(identificador_sequencialTextField.getText());
        }
        String nome = nomeTextField.getText();
        if (nome.isEmpty()) {
            return null;
        }
        Raça raça = Raça.values()[raçaComboBox.getSelectedIndex()];
        if (raça == null) {
            return null;
        }
        Boolean manso = mansoCheckBox.isSelected();
        return new Cachorro(sequencial, nome, raça, manso);
    }

    private Visão<Integer> getCachorrosCadastradosVisão(int sequencial) {
        //TODO
        for(int i = 0; i< cachorros_cadastrados.getSize();i++){
            Visão<Integer> visão = (Visão<Integer>) cachorros_cadastrados.getElementAt(i);
            if( visão.getChave() == sequencial)
                return visão;
        }
        return null;
    }
    private int getCachorrosCadastradosVisãoIndex(Visão<Integer> visão) {
        //TODO
        for(int i = 0; i< cachorros_cadastrados.getSize();i++){
            Visão<String> visão1 = (Visão<String>) cachorros_cadastrados.getElementAt(i);
            if(visão.getChave().equals(visão1.getChave()))
                return i;
        }
        return -1;
    }
    private void inicializarCachorrosCadastrados() {
        cachorros_cadastrados = (DefaultListModel) cachorros_cadastradosList.getModel();
        Vector<Visão<Integer>> visões = Cachorro.getVisões();
        for (Visão<Integer> visão : visões) {
            cachorros_cadastrados.addElement(visão);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JLabel cachorros_cadastradosLabel;
    private javax.swing.JList cachorros_cadastradosList;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel identificador_sequencialLabel;
    private javax.swing.JTextField identificador_sequencialTextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton limparButton;
    private javax.swing.JCheckBox mansoCheckBox;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JComboBox raçaComboBox;
    private javax.swing.JLabel raçaLabel;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel ultimas_consultasLabel;
    private javax.swing.JTextArea ultimas_consultasTextArea;
    // End of variables declaration//GEN-END:variables
}
