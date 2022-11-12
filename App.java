import java.util.Date;

import Factory.GoogleApiFactory;
import model.calculadora.IExpressao;
import model.calculadora.ImpressoraVisitor;
import model.calculadora.Numero;
import model.calculadora.Soma;
import model.calculadora.Subtracao;
import model.contrato.Contrato;
import model.contrato.HistoricoContrato;
import model.contrato.TipoContrato;
import model.ecommerce.FilaProcessamento;
import model.ecommerce.FinalizarPedido;
import model.ecommerce.PagarPedido;
import model.ecommerce.Pedido;
import model.facade.Cobranca;
import model.facade.ContatoCliente;
import model.facade.EmpresaFacade;
import model.facade.EmpresaFacadeSingleton;
import model.facade.Fatura;
import model.facade.TipoCobranca;
import model.integracao.Cliente;
import model.integracao.ClienteAdapter;
import model.integracao.ClienteGol;
import service.GoogleApi;

public class App {
    public static void main(String[] args) {
        System.out.println("Aprofundando conhecimento em design patterns");
        System.out.println();

        // GoogleApi googleApi = new GoogleApiFactory().getGoogleApi();

        // var agendamentos = googleApi.getSchedules();
        // var conatos = googleApi.getContacts();

        // =========================================
        // Exemplo 2

        // HistoricoContrato historico = new HistoricoContrato();
        // Contrato contrato = new Contrato(new Date(), "Weberson", TipoContrato.Novo);
        // historico.adicionar(contrato.salvarEstado());

        // contrato.avancar();
        // contrato.setCliente("Weberson Rodrigues");
        // historico.adicionar(contrato.salvarEstado());

        // contrato.avancar();
        // contrato.setCliente("Weberson Rodrigues de Araujo");
        // historico.adicionar(contrato.salvarEstado());

        // // Pegando o contrato no primeiro estado
        // var primeiroEstado = historico.obter(0).geContrato();

        // var segundoEstado = historico.obter(1).geContrato();

        // var terceiroEstado = historico.obter(2).geContrato();
        // =======================================================
        // Exemplo 3

        // (30 + 10) + (20 - 10) // Expressão
        // IExpressao esquerda = new Soma(new Numero(30), new Numero(10));
        // IExpressao direita = new Subtracao(new Numero(20), new Numero(10));

        // IExpressao soma = new Soma(esquerda, direita);
        // System.out.println(soma.avaliar());

         // (( 5 + 3) - 1) + (20 - (10 + 4))  =  13 // Expressão

        // IExpressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(3)), new Numero(1));
        // IExpressao direita = new Subtracao(new Numero(20), new Soma(new Numero(10), new Numero(4)));

        // IExpressao soma = new Soma(esquerda, direita);

        // ImpressoraVisitor impressora = new ImpressoraVisitor();

        // System.out.println("Resultado: " + soma.avaliar());
        // soma.imprimir(impressora);

        // ==========================================
    //     FilaProcessamento filaProcessamento = new FilaProcessamento();

    //     Pedido pedido1 = new Pedido("Fulano", 150.0);
    //     Pedido pedido2 = new Pedido("Ciclano", 250.0);

    //     // Nesse momento ele ja esta executando o comando.
    //    // pedido1.efetuarPagamento(); //Comando

    //     filaProcessamento.adicionar(new PagarPedido(pedido1));
    //     filaProcessamento.adicionar(new PagarPedido(pedido2));

    //     filaProcessamento.adicionar(new FinalizarPedido(pedido1));
    //     filaProcessamento.adicionar(new FinalizarPedido(pedido2));

    //     // Eu posso fazer um milhão de coisas sem executare os comandos..

    //     // ée neste momento que todos os comando serão executados.
    //     filaProcessamento.processar();

    // =========================================

    // Cliente cliente = new Cliente(
    //     "Fulano", 
    //     "12345678901", 
    //     "Fulano@gmail.com", 
    //     "(021) 91111-1111");

    // // ClienteGol clienteGol = new ClienteGol(
    // //     cliente.getNome(), 
    // //     cliente.getCpf(), 
    // //     cliente.getTelefone(), 
    // //     cliente.getEmail());
    
    // // Cliente cliente1 = new Cliente(
    // //         clienteGol.getNome(), 
    // //         clienteGol.getCodigoIdentificacao(), 
    // //         clienteGol.getEmailContato(), 
    // //         clienteGol.getTelefoneContato());

    // ClienteGol clienteGol = ClienteAdapter.adaptar(cliente);

    // Cliente cliente1 = ClienteAdapter.adaptar(clienteGol);

    // ================================================

    // Aqui poderia ser um lugar global onde eu poderia receber essa instancia em qualquer lugar.
    EmpresaFacadeSingleton facadeSingleton =  new EmpresaFacadeSingleton();

    EmpresaFacade facade = facadeSingleton.obter();
    EmpresaFacade facade1 = facadeSingleton.obter();
    EmpresaFacade facade2 = facadeSingleton.obter();

    String email = "Fulano@gmail.com";


    // EmpresaFacade facade = new EmpresaFacade();

    // // 1° Obter o cliente.
    // Cliente cliente = new ClienteDAO().obterPorEmail(email);
    Cliente cliente = facade.obterCliente(email);
    
    // // 2° Faturar esse cliente.
    // Fatura fatura = new Fatura(cliente, 1000.0);
    Fatura fatura = facade.criarFatura(cliente, 1000.0);

    // // 3° Cobranca para este cliente
    // Cobranca cobranca = new Cobranca(TipoCobranca.Boleto, fatura);
    // cobranca.emitir();
    Cobranca cobranca = facade.gerarCobranca(TipoCobranca.Boleto, fatura);

    // // 4° Gerar contato para esse.
    // ContatoCliente contato = new ContatoCliente(cliente, cobranca);
    // contato.enviar();
    ContatoCliente contato = facade.efetuarContato(cliente, cobranca);
    

    }
}
