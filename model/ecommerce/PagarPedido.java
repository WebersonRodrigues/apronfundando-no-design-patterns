package model.ecommerce;

public class PagarPedido implements IComando {

    private Pedido pedido;

    public PagarPedido(Pedido pedido){
        this.pedido = pedido;
    }
    
    @Override
    public void executar() {
        System.out.println("Efetuando pagamento do cliente: " + pedido.getCliente());
        this.pedido.efetuarPagamento();
    }
    
}
