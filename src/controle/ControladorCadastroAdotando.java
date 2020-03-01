package controle;

import interfaces.JanelaCadastroAdotando;
import entidade.Adotando;

public class ControladorCadastroAdotando {

    public ControladorCadastroAdotando() {
        new JanelaCadastroAdotando(this).setVisible(true);
    }

    public String inserirAdotando(Adotando adotando) {
        Adotando adotando1 = Adotando.buscarAdotando(adotando.getCpf());
        if (adotando1 == null) {
            return Adotando.inserirAdotando(adotando);
        } else {
            return "Adotando já foi cadastrado anteriormente";
        }
    }

    public String alterarAdotando(Adotando adotando) {
        Adotando adotando1 = Adotando.buscarAdotando(adotando.getCpf());
        if (adotando1 != null) {
            return Adotando.alterarAdotando(adotando);
        } else {
            return "Adotando não existe no BD";
        }
    }

    public String removerAdotando(String cpf) {
        Adotando adotando1 = Adotando.buscarAdotando(cpf);
        if (adotando1 != null) {
            return Adotando.removerAdotando(cpf);
        } else {
            return "Adotando não existe no BD";
        }
    }

}
