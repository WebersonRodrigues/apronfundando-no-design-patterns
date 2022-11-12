package model.facade;

import model.integracao.Cliente;

public class EmpresaFacade {
    

    public  Cliente obterCliente(String email){
        // Aqui poderia ter vários passos da regra de negocio do sistema.
        return new ClienteDAO().obterPorEmail(email);
    }

    public Fatura criarFatura(Cliente cliente, Double valor){
        return new Fatura(cliente, valor);
    }


    public Cobranca gerarCobranca(TipoCobranca tipo, Fatura fatura){

        Cobranca cobranca = new Cobranca(tipo, fatura);
        cobranca.emitir();
        return cobranca;
    }

    public ContatoCliente efetuarContato(Cliente cliente, Cobranca cobranca){
        
        ContatoCliente contato = new ContatoCliente(cliente, cobranca);
        contato.enviar();
        return contato;
    }


}
