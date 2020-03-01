package entidade;

import entidade.Cachorro.Raça;
import java.util.Vector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import persistência.BD;
import util.Data;

public class Adoção {

    public static String inserirAdoção(Adoção adoção) {
        String sql = "INSERT INTO Adoções(Data_adoção,Soube,Adotando_id,Cachorro_id) VALUES(?,?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, adoção.getAdoçãoData().toString());
            comando.setString(2, adoção.getSoube().ordinal() + "");
            comando.setString(3, adoção.getAdotando().getCpf());
            comando.setString(4, adoção.getCachorro().getSequencial() + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao inserir adoção no banco de dados";
        }

        sql = "SELECT MAX(Sequencial_adoção) AS Sequencial_adoção FROM Adoções";
        ResultSet lista_resultados;
        int sequencial_adoção = -1;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial_adoção = lista_resultados.getInt("Sequencial_adoção");
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao buscar sequencial da adoção no banco de dados";
        }
        if (sequencial_adoção > -1) {
            adoção.setSequencial(sequencial_adoção);
        }

        return null;
    }

    public static Adoção consultarAdoção(int sequencial_adoção) {
        String sql = "SELECT Data_adoção,Soube,Adotando_id,Cachorro_id FROM Adoções WHERE Sequencial_adoção = ?";
        Data adoçãoData = null;
        Soube soube = null;
        String cpf = "";
        int sequencial_cachorro = -1;
        ResultSet lista_resultados;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial_adoção + "");
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                adoçãoData = Data.toData(lista_resultados.getString("Data_adoção"));
                soube = Soube.values()[lista_resultados.getInt("Soube")];
                cpf = lista_resultados.getString("Adotando_id");
                sequencial_cachorro = lista_resultados.getInt("Cachorro_id");
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return null;
        }
        Adoção adoção;
        sql = "SELECT Nome_adotando,Telefone,Sexo,Nascimento,Logradouro, Número, "
                + "Complemento, Bairro, Cidade, Cep FROM Adotandos,Endereços WHERE Cpf = ? AND Endereço_id = Sequencial_endereço";
        Adotando adotando = null;
        Data data = null;
        Endereço endereço;
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
            return null;
        }
        sql = "SELECT Nome_cachorro,Raça,Manso FROM Cachorros WHERE Sequencial_cachorro = ?";
        Cachorro cachorro = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial_cachorro + "");
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                cachorro = new Cachorro(sequencial_cachorro,
                        lista_resultados.getString("Nome_cachorro"),
                        Raça.values()[lista_resultados.getInt("Raça")],
                        lista_resultados.getBoolean("Manso"));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return null;
        }
        return new Adoção(sequencial_adoção, adoçãoData, soube, adotando, cachorro);
    }

    public static String alterarAdoção(Adoção adoção) {
        String sql = "UPDATE Adoções SET Data_adoção = ?, Soube = ?, Adotando_id = ?, Cachorro_id = ? "
                + "WHERE Sequencial_adoção = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, adoção.getAdoçãoData().toString());
            comando.setString(2, adoção.getSoube().ordinal() + "");
            comando.setString(3, adoção.getAdotando().getCpf());
            comando.setString(4, adoção.getCachorro().getSequencial() + "");
            comando.setString(5, adoção.getSequencial() + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar alterar adoção no banco de dados";
        }
        return null;
    }

    public static String removerAdoção(int sequencial_adoção) {
        String sql = "DELETE FROM Adoções WHERE Sequencial_adoção = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial_adoção + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar excluir adoção do banco de dados";
        }
        return null;
    }

    public static Boolean foiAdotado(int sequencial_cachorro) {
        String sql = "SELECT Cachorro_id FROM Adoções";
        ResultSet lista_resultados;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                if (lista_resultados.getInt("Cachorro_id") == sequencial_cachorro) {
                    return true;
                }
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return false;
    }

    public static Vector<Visão<Integer>> getVisões() {
        String sql = "SELECT Sequencial_adoção,Data_adoção,Cpf,Nome_adotando,Sequencial_cachorro,Nome_cachorro\n"
                + "FROM Adoções,Adotandos,Cachorros \n"
                + "WHERE Adotando_id = Cpf AND Cachorro_id = Sequencial_cachorro";
        Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        ResultSet lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                visões.addElement(new Visão<Integer>(
                        lista_resultados.getInt("Sequencial_adoção"),
                        lista_resultados.getInt("Sequencial_adoção") + " - "
                        + lista_resultados.getString("Data_adoção") + " - "
                        + lista_resultados.getString("Cpf") + " - "
                        + lista_resultados.getString("Nome_adotando") + " adotou "
                        + lista_resultados.getInt("Sequencial_cachorro") + " - "
                        + lista_resultados.getString("Nome_cachorro")));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return visões;
    }

    public static Vector<Visão<Integer>> getVisõesFiltradas(Soube soube, String nome_adotando, Boolean manso) {
        String sql = "SELECT Sequencial_adoção, Data_adoção, Nome_adotando, Nome_cachorro, Soube, Manso "
                + "FROM Adoções,Adotandos,Cachorros "
                + "WHERE Cpf = Adotando_id AND Cachorro_id = Sequencial_cachorro";
        ResultSet lista_resultados;
        String manso_string = "";
        Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        int sou = 0, man = 0;
        if (soube != null) {
            sou = 1;
            sql = sql + " AND Soube = ?";
        }
        sql = sql + " AND Manso = ?";
        if (sou == 0) {
            man = 1;
        } else {
            man = 2;
        }
        if (!nome_adotando.isEmpty()) {
            sql = sql + " AND Nome_adotando LIKE '" + nome_adotando + "%'";
        }
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            if (sou > 0) {
                comando.setString(sou, soube.ordinal() + "");
            }
            if (manso) {
                comando.setString(man, "1");
            } else {
                comando.setString(man, "0");
            }
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                if (lista_resultados.getInt("Manso") == 1) {
                    manso_string = " - Manso";
                }
                visões.addElement(new Visão<Integer>(
                        lista_resultados.getInt("Sequencial_adoção"),
                        lista_resultados.getInt("Sequencial_adoção") + " - "
                        + lista_resultados.getString("Data_adoção") + " - "
                        + lista_resultados.getString("Nome_adotando") + " adotou "
                        + lista_resultados.getString("Nome_cachorro") + " - "
                        + Soube.values()[lista_resultados.getInt("Soube")]
                        + manso_string));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return visões;
    }

    public enum Soube {
        Rádio, Jornal, Televisão, Redes_Sociais
    };

    public static final Soube[] SOUBE = Soube.values();
    private int sequencial;
    private Data adoçãoData;
    private Soube soube;
    private Adotando adotando;
    private Cachorro cachorro;

    public Adoção(int sequencial, Data adoçãoData, Soube soube, Adotando adotando, Cachorro cachorro) {
        this.sequencial = sequencial;
        this.adoçãoData = adoçãoData;
        this.soube = soube;
        this.adotando = adotando;
        this.cachorro = cachorro;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public Data getAdoçãoData() {
        return adoçãoData;
    }

    public void setAdoçãoData(Data adoçãoData) {
        this.adoçãoData = adoçãoData;
    }

    public Soube getSoube() {
        return soube;
    }

    public void setSoube(Soube soube) {
        this.soube = soube;
    }

    public Adotando getAdotando() {
        return adotando;
    }

    public void setAdotando(Adotando adotando) {
        this.adotando = adotando;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public Visão<Integer> getVisão() {
        return new Visão<Integer>(sequencial, sequencial + " - "
                + adoçãoData.toString() + " - " + adotando.getCpf() + " - " + adotando.getNome()
                + " adotou " + cachorro.getSequencial() + " - " + cachorro.getNome());
    }

}
