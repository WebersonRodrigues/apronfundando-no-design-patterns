package model.contrato;

import java.util.Date;

public class Contrato {

    private Date data;

    private String cliente;

    private TipoContrato tipo;

    public Contrato(Date data, String cliente, TipoContrato tipo) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public TipoContrato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContrato tipo) {
        this.tipo = tipo;
    }

    public void avancar(){
        if(this.tipo == TipoContrato.Novo)
            this.tipo = TipoContrato.EmAndamento;
        else if(this.tipo == TipoContrato.EmAndamento)
            this.tipo = TipoContrato.Aprovado;
        else if(this.tipo == TipoContrato.Aprovado)
            this.tipo = TipoContrato.Concluido;
        else 
            throw new RuntimeException("Contratos concluidos não podem ser avançados.");
    }
    
    public EstadoContrato salvarEstado(){
        
        return new EstadoContrato(new Contrato(this.data, this.cliente, this.tipo), 1L);
    }

}
