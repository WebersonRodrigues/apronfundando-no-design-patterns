package model.ecommerce;

import java.util.Date;

public class Pedido {
    
    private String cliente;

    private Double valor;

    private Date dataFinalizacao;

    private EStatus status;

    public Pedido(String cliente, Double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = EStatus.Novo;
    }

    public String getCliente() {
        return cliente;
    }

    public Double getValor() {
        return valor;
    }

    public Date getDataFinalizacao() {
        return dataFinalizacao;
    }

    public EStatus getStatus() {
        return status;
    }
  
    public void efetuarPagamento(){
        this.status = EStatus.Pago;
    }

    public void finalizar(){
        this.status = EStatus.Finalizado;
    }

}
