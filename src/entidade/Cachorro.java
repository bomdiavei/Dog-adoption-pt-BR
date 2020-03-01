package entidade;

import java.util.Vector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import persistência.BD;

public class Cachorro {

    public static String inserirCachorro(Cachorro cachorro) {
        String sql = "INSERT INTO Cachorros(Nome_cachorro,Raça,Manso) VALUES(?,?,?)";
        String menssagem_erro = null;
        int manso = cachorro.isManso() ? 1 : 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cachorro.getNome());
            comando.setString(2, cachorro.getRaça().ordinal() + "");
            comando.setString(3, manso + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            menssagem_erro = "Erro ao inserir no banco de dados";
        }

        sql = "SELECT MAX(Sequencial_cachorro) AS Sequencial_cachorro FROM Cachorros";
        ResultSet lista_resultados;
        int sequencial_cachorro = -1;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial_cachorro = lista_resultados.getInt("Sequencial_cachorro");
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            menssagem_erro = "Erro ao buscar sequencial do cachorro no banco de dados";
        }
        if (sequencial_cachorro > -1) {
            cachorro.setSequencial(sequencial_cachorro);
        }
        return menssagem_erro;
    }

    public static Cachorro consultarCachorro(int sequencial_cachorro) {
        String sql = "SELECT Nome_cachorro,Raça,Manso FROM Cachorros WHERE Sequencial_cachorro = ?";
        ResultSet lista_resultados = null;
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
            cachorro = null;
        }
        return cachorro;
    }

    public static String alterarCachorro(Cachorro cachorro) {
        String sql = "UPDATE Cachorros SET Nome_cachorro = ?,Raça = ?,Manso = ? WHERE Sequencial_cachorro = ? ";
        int manso = cachorro.isManso() ? 1 : 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cachorro.getNome());
            comando.setString(2, cachorro.getRaça().ordinal() + "");
            comando.setString(3, manso + "");
            comando.setString(4, cachorro.getSequencial() + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao alterar no banco de dados";
        }
        return null;
    }

    public static String removerCachorro(int sequencial_cachorro) {
        String sql = "SELECT Cachorro_id FROM Adoções WHERE Cachorro_id = ?";
        ResultSet lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial_cachorro + "");
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                if (lista_resultados.getInt("Cachorro_id") == sequencial_cachorro) {
                    return "Esse cachorro não pode ser removido, pois existe um registro de adoção dele";
                }
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar verificar se existe adoção cadastrada com esse cachorro";
        }
        sql = "DELETE FROM Cachorros WHERE Sequencial_cachorro = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial_cachorro + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar excluir cachorro do banco de dados";
        }
        return null;
    }

    public static Vector<Visão<Integer>> getVisões() {
        String sql = "SELECT Sequencial_cachorro,Nome_cachorro,Manso FROM Cachorros";
        Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        ResultSet lista_resultados = null;
        String manso;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                if (lista_resultados.getBoolean("Manso")) {
                    manso = " - Manso";
                } else {
                    manso = "";
                }
                visões.addElement(new Visão<Integer>(
                        lista_resultados.getInt("Sequencial_cachorro"),
                        lista_resultados.getInt("Sequencial_cachorro") + " - "
                        + lista_resultados.getString("Nome_cachorro")
                        + manso));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return visões;
    }

    public enum Raça {
        Dachshund, Dalmata, Pitbull, Poodle, Chihuahua, Pug, Boxer, Bulldog, Nenhuma
    };

    public static final Raça[] RAÇAS = Raça.values();

    private int sequencial_cachorro;
    private String nome;
    private Raça raça;
    private Boolean manso;

    public Cachorro(int sequencial_cachorro, String nome, Raça raça, Boolean manso) {
        this.sequencial_cachorro = sequencial_cachorro;
        this.nome = nome;
        this.raça = raça;
        this.manso = manso;
    }

    public Visão<Integer> getVisão() {
        String manso_string;
        if (manso) {
            manso_string = " - Manso";
        } else {
            manso_string = "";
        }
        return new Visão<Integer>(sequencial_cachorro, sequencial_cachorro + " - " + nome + manso_string);
    }

    public int getSequencial() {
        return sequencial_cachorro;
    }

    public void setSequencial(int sequencial_cachorro) {
        this.sequencial_cachorro = sequencial_cachorro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raça getRaça() {
        return raça;
    }

    public void setRaça(Raça raça) {
        this.raça = raça;
    }

    public Boolean isManso() {
        return manso;
    }

    public void setManso(Boolean manso) {
        this.manso = manso;
    }

}
