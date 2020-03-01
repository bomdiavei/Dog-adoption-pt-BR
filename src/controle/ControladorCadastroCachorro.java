package controle;

import interfaces.JanelaCadastroCachorro;
import entidade.Cachorro;

public class ControladorCadastroCachorro {

    public ControladorCadastroCachorro() {
        new JanelaCadastroCachorro(this).setVisible(true);
    }

    public String inserirCachorro(Cachorro cachorro) {
        return Cachorro.inserirCachorro(cachorro);
    }

    public String alterarCachorro(Cachorro cachorro) {
        Cachorro cachorro1 = Cachorro.consultarCachorro(cachorro.getSequencial());
        if (cachorro1 != null) {
            return Cachorro.alterarCachorro(cachorro);
        } else {
            return "Cachorro não existe no banco de dados";
        }
    }

    public String removerCachorro(int sequencial) {
        Cachorro cachorro = Cachorro.consultarCachorro(sequencial);
        if (cachorro != null) {
            return Cachorro.removerCachorro(sequencial);
        } else {
            return "Cachorro não existe no banco de dados";
        }
    }

}
