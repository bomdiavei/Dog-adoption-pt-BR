package interfaces;

import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;
import java.util.Vector;
import entidade.Adoção;
import entidade.Adotando;
import entidade.Cachorro;
import entidade.Visão;
import entidade.Endereço;
import entidade.Adoção.Soube;

public class JanelaPesquisarAdoção extends javax.swing.JFrame {

    private DefaultListModel filtro;

    public JanelaPesquisarAdoção() {
        initComponents();
        soubeComboBox.setSelectedIndex(-1);
        inicializarFiltro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        soubeComboBox = new javax.swing.JComboBox();
        nome_adotandoTextField = new javax.swing.JTextField();
        mansoCheckBox = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        limparButton = new javax.swing.JButton();
        pesquisarButton = new javax.swing.JButton();
        todas_adoçõesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filtroList = new javax.swing.JList();
        soubeLabel = new javax.swing.JLabel();
        nome_adotandoLabel = new javax.swing.JLabel();
        filtroLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Adoções");
        setMinimumSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        soubeComboBox.setModel(new DefaultComboBoxModel( Adoção.SOUBE ));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        getContentPane().add(soubeComboBox, gridBagConstraints);

        nome_adotandoTextField.setColumns(18);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        getContentPane().add(nome_adotandoTextField, gridBagConstraints);

        mansoCheckBox.setText("O Cachorro é Manso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        getContentPane().add(mansoCheckBox, gridBagConstraints);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparAdoçãoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(limparButton);

        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarAdoçãoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(pesquisarButton);

        todas_adoçõesButton.setText("Todas Adoções");
        todas_adoçõesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todasAdoçõesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(todas_adoçõesButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        getContentPane().add(jPanel1, gridBagConstraints);

        filtroList.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(filtroList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        soubeLabel.setText("Soube");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 0);
        getContentPane().add(soubeLabel, gridBagConstraints);

        nome_adotandoLabel.setText("Nome do Adotando Começa  Com");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 0);
        getContentPane().add(nome_adotandoLabel, gridBagConstraints);

        filtroLabel.setText("Filtro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 0, 0);
        getContentPane().add(filtroLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarAdoçãoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarAdoçãoButtonActionPerformed
        // TODO 
        Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        if (soubeComboBox.getSelectedIndex() > -1) {
            visões = Adoção.getVisõesFiltradas(Soube.values()[soubeComboBox.getSelectedIndex()],
                    nome_adotandoTextField.getText(),
                    mansoCheckBox.isSelected());
        } else {
            visões = Adoção.getVisõesFiltradas(null,
                    nome_adotandoTextField.getText(),
                    mansoCheckBox.isSelected());
        }
        if (visões == null) {
            filtro.removeAllElements();
        } else {
            filtro.removeAllElements();
            for (Visão<Integer> visão : visões) {
                filtro.addElement(visão);
            }
        }
    }//GEN-LAST:event_pesquisarAdoçãoButtonActionPerformed

    private void limparAdoçãoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparAdoçãoButtonActionPerformed
        // TODO 
        soubeComboBox.setSelectedIndex(-1);
        nome_adotandoTextField.setText("");
        mansoCheckBox.setSelected(false);

    }//GEN-LAST:event_limparAdoçãoButtonActionPerformed

    private void todasAdoçõesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todasAdoçõesButtonActionPerformed
        // TODO
        filtro.removeAllElements();
        Vector<Visão<Integer>> visões = Adoção.getVisões();
        for (Visão<Integer> visão : visões) {
            filtro.addElement(visão);
        }
    }//GEN-LAST:event_todasAdoçõesButtonActionPerformed
    private void inicializarFiltro() {
        filtro = (DefaultListModel) filtroList.getModel();
        Vector<Visão<Integer>> visões = Adoção.getVisões();
        for (Visão<Integer> visão : visões) {
            filtro.addElement(visão);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel filtroLabel;
    private javax.swing.JList filtroList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JCheckBox mansoCheckBox;
    private javax.swing.JLabel nome_adotandoLabel;
    private javax.swing.JTextField nome_adotandoTextField;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JComboBox soubeComboBox;
    private javax.swing.JLabel soubeLabel;
    private javax.swing.JButton todas_adoçõesButton;
    // End of variables declaration//GEN-END:variables
}
