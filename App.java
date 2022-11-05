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

        IExpressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(3)), new Numero(1));
        IExpressao direita = new Subtracao(new Numero(20), new Soma(new Numero(10), new Numero(4)));

        IExpressao soma = new Soma(esquerda, direita);

        ImpressoraVisitor impressora = new ImpressoraVisitor();

        System.out.println("Resultado: " + soma.avaliar());
        soma.imprimir(impressora);
    }
}
