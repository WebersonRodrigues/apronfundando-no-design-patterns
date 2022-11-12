package model.ecommerce;

public class FinalizarPedido implements IComando {
    
    private Pedido pedido;

    public FinalizarPedido(Pedido pedido){
        this.pedido = pedido;
    }
    
    @Override
    public void executar() {
        System.out.println("Finalizando pedido do cliente: " + pedido.getCliente());
        this.pedido.finalizar();
    }
}
