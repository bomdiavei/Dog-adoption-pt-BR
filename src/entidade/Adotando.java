package entidade;

import persistência.BD;
import util.Data;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;

public class Adotando {

    public static Adotando buscarAdotando(String cpf) {
        String sql = "SELECT Nome_adotando,Telefone,Sexo,Nascimento,Logradouro, Número, "
                + "Complemento, Bairro, Cidade, Cep FROM Adotandos,Endereços WHERE Cpf = ? AND Endereço_id = Sequencial_endereço";
        Adotando adotando = null;
        Data data = null;
        Endereço endereço;
        ResultSet lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                data = Data.toData(lista_resultados.getString("Nascimento"));
                endereço = new Endereço(
                        lista_resultados.getString("Logradouro"),
                        lista_resultados.getInt("Número"),
                        lista_resultados.getString("Complemento"),
                        lista_resultados.getString("Bairro"),
                        lista_resultados.getString("Cidade"),
                        lista_resultados.getString("Cep"));
                adotando = new Adotando(
                        cpf,
                        lista_resultados.getString("Nome_adotando"),
                        lista_resultados.getString("Telefone"),
                        lista_resultados.getString("Sexo"),
                        data, endereço);
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            adotando = null;
        }
        return adotando;
    }

    public static String inserirAdotando(Adotando adotando) {
        String sql2 = "INSERT INTO Endereços(Logradouro,Número,Complemento,Bairro,Cidade,Cep)"
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql2);
            comando.setString(1, adotando.getEndereço().getLogradouro());
            comando.setString(2, adotando.getEndereço().getNúmero() + "");
            comando.setString(3, adotando.getEndereço().getComplemento());
            comando.setString(4, adotando.getEndereço().getBairro());
            comando.setString(5, adotando.getEndereço().getCidade());
            comando.setString(6, adotando.getEndereço().getCep());
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao inserir na tabela Endereços do banco de dados.";
        }
        String sql3 = "SELECT Sequencial_endereço FROM Endereços WHERE Sequencial_endereço = (SELECT MAX(Sequencial_endereço)"
                + "FROM Endereços)";
        ResultSet lista_resultados = null;
        String sequencial_endereço = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql3);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial_endereço = lista_resultados.getInt("Sequencial_endereço") + "";
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar capturar a chave de Endereços.";
        }
        String sql = "INSERT INTO Adotandos(Cpf,Nome_adotando,Telefone,Sexo,Nascimento,Endereço_id) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, adotando.getCpf());
            comando.setString(2, adotando.getNome());
            comando.setString(3, adotando.getTelefone());
            comando.setString(4, adotando.getSexo());
            comando.setString(5, adotando.getNascimentoData().toString());
            comando.setString(6, sequencial_endereço);
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao inserir na tabela Adotandos do banco de dados.";
        }
        return null;
    }

    public static String removerAdotando(String cpf) {
        String sql = "SELECT Adotando_id FROM Adoções WHERE Adotando_id = ?";
        ResultSet lista_resultado;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            lista_resultado = comando.executeQuery();
            while (lista_resultado.next()) {
                if (lista_resultado.getString("Adotando_id").equals(cpf)) {
                    return "Não é possível remover, pois existe uma adoção com esse cpf";
                }
            }
            lista_resultado.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar conferir se existe adoção no cpf";
        }
        sql = "SELECT Endereço_id FROM Adotandos WHERE Cpf = ?";
        ResultSet lista_resultados = null;
        String sequencial_endereço = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial_endereço = lista_resultados.getInt("Endereço_id") + "";
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar obter o Id da tabela Endereços no banco de dados";
        }
        sql = "DELETE FROM Adotandos WHERE Cpf = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar deletar adotando do banco de dados";
        }
        sql = "DELETE FROM Endereços WHERE Sequencial_endereço = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial_endereço);
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar deletar endereço do adotando do banco de dados";
        }
        return null;
    }

    public static String alterarAdotando(Adotando adotando) {
        //TODO
        String sql = "UPDATE Adotandos SET Nome_adotando = ?,Telefone = ?,Sexo = ?,Nascimento = ? WHERE Cpf = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, adotando.getNome());
            comando.setString(2, adotando.getTelefone());
            comando.setString(3, adotando.getSexo());
            comando.setString(4, adotando.getNascimentoData().toString());
            comando.setString(5, adotando.getCpf());
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        String sql2 = "SELECT Sequencial_endereço FROM Endereços,Adotandos WHERE Cpf = ? "
                + "AND Endereço_id = Sequencial_endereço";
        String sequencial_endereço = null;
        ResultSet lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql2);
            comando.setString(1, adotando.getCpf());
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial_endereço = lista_resultados.getInt("Sequencial_endereço") + "";
            }
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        String sql3 = "UPDATE Endereços SET Logradouro = ?, Número = ?, Complemento = ?, Bairro = ?, "
                + "Cidade = ?, Cep = ? WHERE Sequencial_endereço = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql3);
            comando.setString(1, adotando.getEndereço().getLogradouro());
            comando.setString(2, adotando.getEndereço().getNúmero() + "");
            comando.setString(3, adotando.getEndereço().getComplemento());
            comando.setString(4, adotando.getEndereço().getBairro());
            comando.setString(5, adotando.getEndereço().getCidade());
            comando.setString(6, adotando.getEndereço().getCep());
            comando.setString(7, sequencial_endereço);
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return null;
    }

    public static Vector<Visão<String>> getVisões() {
        String sql = "SELECT Cpf, Nome_adotando FROM Adotandos";
        ResultSet lista_resultados = null;
        Vector<Visão<String>> visões = new Vector<Visão<String>>();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                visões.addElement(new Visão(
                        lista_resultados.getString("Cpf"),
                        lista_resultados.getString("Cpf") + " - "
                        + lista_resultados.getString("Nome_adotando")));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return visões;
    }

    private String cpf, nome, telefone, sexo;
    private Data nascimentoData;
    private Endereço endereço;

    public Adotando(String cpf, String nome, String telefone, String sexo,
            Data nascimentoData, Endereço endereço) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.nascimentoData = nascimentoData;
        this.endereço = endereço;
    }

    public Visão<String> getVisão() {
        return new Visão<String>(cpf, cpf + " - " + nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Data getNascimentoData() {
        return nascimentoData;
    }

    public void setNascimentoData(Data nascimentoData) {
        this.nascimentoData = nascimentoData;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public String toString() {
        return "CPF: " + cpf + " Nome: " + nome + " Telefone: " + telefone + "\nData: " + nascimentoData.toString()
                + "\nEndereço: " + endereço.toString();
    }

}
