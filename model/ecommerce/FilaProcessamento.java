package model.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class FilaProcessamento {
    
    private List<IComando> comandos;

    public FilaProcessamento() {
        this.comandos = new ArrayList<IComando>();
    }

    public void adicionar(IComando comando){
        this.comandos.add(comando);
    }

    public void processar(){
        for (IComando comando : comandos) {
            comando.executar();
        }
    }

    
}
