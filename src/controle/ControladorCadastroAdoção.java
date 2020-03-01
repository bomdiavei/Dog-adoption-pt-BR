package controle;

import interfaces.JanelaCadastroAdoção;
import entidade.Adoção;
import entidade.Adotando;
import entidade.Cachorro;

public class ControladorCadastroAdoção {

    public ControladorCadastroAdoção() {
        new JanelaCadastroAdoção(this).setVisible(true);
    }

    public String inserirAdoção(Adoção adoção) {
        if (Adoção.foiAdotado(adoção.getCachorro().getSequencial())) {
            return "Esse cachorro já foi adotado";
        } else {
            return Adoção.inserirAdoção(adoção);
        }
    }

    public String alterarAdoção(Adoção adoção) {
        Adoção adoção1 = Adoção.consultarAdoção(adoção.getSequencial());
        if (adoção1 != null) {
            return Adoção.alterarAdoção(adoção);
        } else {
            return "Adoção com o seguinte sequencial nao foi encontrada: " + adoção.getSequencial();
        }
    }

    public String removerAdoção(int sequencial) {
        Adoção adoção = Adoção.consultarAdoção(sequencial);
        if (adoção != null) {
            return Adoção.removerAdoção(sequencial);
        } else {
            return "Adoção não existe no banco de dados";
        }
    }

}
