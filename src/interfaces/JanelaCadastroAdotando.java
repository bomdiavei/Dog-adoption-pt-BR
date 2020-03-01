package interfaces;

import javax.swing.JOptionPane;
import controle.ControladorCadastroAdotando;
import entidade.Adotando;
import java.util.Vector;
import entidade.Visão;
import javax.swing.DefaultComboBoxModel;
import util.Data;
import entidade.Endereço;

public class JanelaCadastroAdotando extends javax.swing.JFrame {

    private static ControladorCadastroAdotando controlador;
    private static Vector<Visão<String>> adotandos_cadastrados = new Vector<Visão<String>>();

    public JanelaCadastroAdotando(ControladorCadastroAdotando controlador) {
        this.controlador = controlador;
        adotandos_cadastrados = Adotando.getVisões();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        sexoButtonGroup = new javax.swing.ButtonGroup();
        nomeTextField = new javax.swing.JTextField();
        telefoneTextField = new javax.swing.JTextField();
        data_de_nascimentoTextField = new javax.swing.JTextField();
        logradouroTextField = new javax.swing.JTextField();
        númeroTextField = new javax.swing.JTextField();
        complementoTextField = new javax.swing.JTextField();
        bairroTextField = new javax.swing.JTextField();
        cidadeTextField = new javax.swing.JTextField();
        cepTextField = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        data_de_nascimentoLabel = new javax.swing.JLabel();
        logradouroLabel = new javax.swing.JLabel();
        númeroLabel = new javax.swing.JLabel();
        complementoLabel = new javax.swing.JLabel();
        bairroLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        cpfTextField = new javax.swing.JTextField();
        endereçoLabel = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        adotandos_cadastradosLabel = new javax.swing.JLabel();
        adotandos_cadastradosComboBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        masculinoRadioButton = new javax.swing.JRadioButton();
        femininoRadioButton = new javax.swing.JRadioButton();
        sexoLabel = new javax.swing.JLabel();

        jScrollPane4.setViewportView(jTextPane4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro do Adotando");
        setPreferredSize(new java.awt.Dimension(1000, 450));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nomeTextField.setColumns(50);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(nomeTextField, gridBagConstraints);

        telefoneTextField.setColumns(12);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(telefoneTextField, gridBagConstraints);

        data_de_nascimentoTextField.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(data_de_nascimentoTextField, gridBagConstraints);

        logradouroTextField.setColumns(50);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(logradouroTextField, gridBagConstraints);

        númeroTextField.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(númeroTextField, gridBagConstraints);

        complementoTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(complementoTextField, gridBagConstraints);

        bairroTextField.setColumns(50);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(bairroTextField, gridBagConstraints);

        cidadeTextField.setColumns(40);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(cidadeTextField, gridBagConstraints);

        cepTextField.setColumns(9);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 7, 0);
        getContentPane().add(cepTextField, gridBagConstraints);

        cpfLabel.setText("CPF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(cpfLabel, gridBagConstraints);

        nomeLabel.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(nomeLabel, gridBagConstraints);

        telefoneLabel.setText("Telefone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(telefoneLabel, gridBagConstraints);

        data_de_nascimentoLabel.setText("Data de Nascimento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(data_de_nascimentoLabel, gridBagConstraints);

        logradouroLabel.setText("Logradouro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(logradouroLabel, gridBagConstraints);

        númeroLabel.setText("Número");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(númeroLabel, gridBagConstraints);

        complementoLabel.setText("Complemento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(complementoLabel, gridBagConstraints);

        bairroLabel.setText("Bairro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(bairroLabel, gridBagConstraints);

        cidadeLabel.setText("Cidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(cidadeLabel, gridBagConstraints);

        cepLabel.setText("CEP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(cepLabel, gridBagConstraints);

        cpfTextField.setColumns(14);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 0);
        getContentPane().add(cpfTextField, gridBagConstraints);

        endereçoLabel.setText("Endereço");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        getContentPane().add(endereçoLabel, gridBagConstraints);

        Panel.setBorder(null);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirButtonActionPerformed(evt);
            }
        });
        Panel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });
        Panel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
            }
        });
        Panel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });
        Panel.add(removerButton);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });
        Panel.add(limparButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        getContentPane().add(Panel, gridBagConstraints);

        adotandos_cadastradosLabel.setText("Adotandos Cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(adotandos_cadastradosLabel, gridBagConstraints);

        adotandos_cadastradosComboBox.setModel(new DefaultComboBoxModel (adotandos_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(adotandos_cadastradosComboBox, gridBagConstraints);

        jPanel1.setBorder(null);

        sexoButtonGroup.add(masculinoRadioButton);
        masculinoRadioButton.setText("Masculino");
        jPanel1.add(masculinoRadioButton);

        sexoButtonGroup.add(femininoRadioButton);
        femininoRadioButton.setText("Feminino");
        jPanel1.add(femininoRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        sexoLabel.setText("Sexo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(sexoLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirButtonActionPerformed
        // TODO
        Adotando adotando = obterAdotando();
        String menssagem_erro = null;
        if (adotando != null) {
            menssagem_erro = controlador.inserirAdotando(adotando);
        } else {
            menssagem_erro = "Algum campo importante não foi informado";
        }
        if (menssagem_erro == null) {
            Visão<String> visão = adotando.getVisão();
            adotandos_cadastradosComboBox.addItem(visão);
            adotandos_cadastradosComboBox.setSelectedItem(visão);
        } else {
            JOptionPane.showMessageDialog(this, menssagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inserirButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        // TODO
        String menssagem_erro = null;
        Visão<String> visão = null;
        Adotando adotando = null;
        if (adotandos_cadastradosComboBox.getSelectedItem() != null) {
            visão = (Visão<String>) adotandos_cadastradosComboBox.getSelectedItem();
            adotando = Adotando.buscarAdotando(visão.getChave());
            if (adotando == null) {
                menssagem_erro = "Adotando não encontrado no banco de dados";
            }
        } else {
            menssagem_erro = "Nenhum adotando foi selecionado.";
        }
        if (menssagem_erro == null) {
            cpfTextField.setText(adotando.getCpf());
            nomeTextField.setText(adotando.getNome());
            telefoneTextField.setText(adotando.getTelefone());
            if (adotando.getSexo().equals("m")) {
                masculinoRadioButton.setSelected(true);
            } else {
                femininoRadioButton.setSelected(true);
            }
            data_de_nascimentoTextField.setText(adotando.getNascimentoData().toString());
            logradouroTextField.setText(adotando.getEndereço().getLogradouro());
            númeroTextField.setText(adotando.getEndereço().getNúmero() + "");
            complementoTextField.setText(adotando.getEndereço().getComplemento());
            bairroTextField.setText(adotando.getEndereço().getBairro());
            cidadeTextField.setText(adotando.getEndereço().getCidade());
            cepTextField.setText(adotando.getEndereço().getCep());
        } else {
            JOptionPane.showMessageDialog(this, menssagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed
        // TODO
        Adotando adotando = obterAdotando();
        String mensagem_erro = null;
        if (adotando != null) {
            mensagem_erro = controlador.alterarAdotando(adotando);
        } else {
            mensagem_erro = "Algum campo importante não foi preenchido.";
        }
        if (mensagem_erro == null) {
            Visão<String> visão = getAdotandosCadastradosVisão(adotando.getCpf());
            visão.setInfo(adotando.getVisão().getInfo());
            adotandos_cadastradosComboBox.updateUI();
            adotandos_cadastradosComboBox.setSelectedItem(visão);
        } else {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        // TODO
        Visão<String> visão = null;
        String mensagem_erro = null;
        if (adotandos_cadastradosComboBox.getSelectedItem() != null) {
            visão = (Visão<String>) adotandos_cadastradosComboBox.getSelectedItem();
            mensagem_erro = controlador.removerAdotando(visão.getChave());
        } else {
            mensagem_erro = "Nenhum adotando foi selecionado";
        }
        if (mensagem_erro == null) {
            adotandos_cadastrados.remove(visão);
            if (adotandos_cadastrados.size() > 0) {
                adotandos_cadastradosComboBox.setSelectedIndex(0);
            } else {
                adotandos_cadastradosComboBox.setSelectedIndex(-1);
            }
        } else {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        // TODO
        cpfTextField.setText("");
        nomeTextField.setText("");
        telefoneTextField.setText("");
        sexoButtonGroup.clearSelection();
        data_de_nascimentoTextField.setText("");
        logradouroTextField.setText("");
        númeroTextField.setText("");
        complementoTextField.setText("");
        bairroTextField.setText("");
        cidadeTextField.setText("");
        cepTextField.setText("");
    }//GEN-LAST:event_limparButtonActionPerformed

    private Adotando obterAdotando() {
        String cpf = cpfTextField.getText();
        if (cpf.isEmpty()) {
            return null;
        }
        String nome = nomeTextField.getText();
        if (nome.isEmpty()) {
            return null;
        }
        String telefone = telefoneTextField.getText();
        if (telefone.isEmpty()) {
            return null;
        }
        String sexo = null;
        if (masculinoRadioButton.isSelected()) {
            sexo = "m";
        } else if (femininoRadioButton.isSelected()) {
            sexo = "f";
        } else {
            return null;
        }//getSelection().getActionCommand()
        Data data_de_nascimento;
        if (data_de_nascimentoTextField.getText().isEmpty()) {
            return null;
        } else {
            data_de_nascimento = Data.toData(data_de_nascimentoTextField.getText());
        }
        String logradouro = logradouroTextField.getText();
        if (logradouro.isEmpty()) {
            return null;
        }
        int número;
        if (númeroTextField.getText().isEmpty()) {
            return null;
        } else {
            número = Integer.parseInt(númeroTextField.getText());
        }
        String complemento = complementoTextField.getText();
        String bairro = bairroTextField.getText();
        if (bairro.isEmpty()) {
            return null;
        }
        String cidade = cidadeTextField.getText();
        if (cidade.isEmpty()) {
            return null;
        }
        String cep = cepTextField.getText();
        if (cep.isEmpty()) {
            return null;
        }
        Endereço endereço = new Endereço(logradouro, número, complemento, bairro, cidade, cep);
        return new Adotando(cpf, nome, telefone, sexo, data_de_nascimento, endereço);
    }

    private Visão<String> getAdotandosCadastradosVisão(String cpf) {
        for (Visão<String> visão : adotandos_cadastrados) {
            if (visão.getChave().equals(cpf)) {
                return visão;
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JComboBox adotandos_cadastradosComboBox;
    private javax.swing.JLabel adotandos_cadastradosLabel;
    private javax.swing.JButton alterarButton;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JTextField bairroTextField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cepTextField;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JLabel complementoLabel;
    private javax.swing.JTextField complementoTextField;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JLabel data_de_nascimentoLabel;
    private javax.swing.JTextField data_de_nascimentoTextField;
    private javax.swing.JLabel endereçoLabel;
    private javax.swing.JRadioButton femininoRadioButton;
    private javax.swing.JButton inserirButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel logradouroLabel;
    private javax.swing.JTextField logradouroTextField;
    private javax.swing.JRadioButton masculinoRadioButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel númeroLabel;
    private javax.swing.JTextField númeroTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.ButtonGroup sexoButtonGroup;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
