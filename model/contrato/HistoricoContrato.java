package model.contrato;

import java.util.ArrayList;
import java.util.List;

public class HistoricoContrato {
    
    private List<EstadoContrato> estados;

    public HistoricoContrato() {
        this.estados = new ArrayList<EstadoContrato>();
    }

    public void adicionar(EstadoContrato estado){
        this.estados.add(estado);
    }

    public EstadoContrato obter(Integer posicao){
        return this.estados.get(posicao);
    }
    
}
