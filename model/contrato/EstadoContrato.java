package model.contrato;

import java.util.Date;

public class EstadoContrato {

    private Contrato contrato;
    private Long idUsuario;
    private Date dataAlteracao;

    public EstadoContrato(Contrato contrato, Long idUsuario){
        this.contrato = contrato;
        this.dataAlteracao = new Date();
        this.idUsuario = idUsuario;
    }

    public Contrato geContrato(){
        return this.contrato;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }    
}
