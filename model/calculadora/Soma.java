package model.calculadora;

public class Soma implements IExpressao {
    
    private IExpressao esquerda;

    private IExpressao direita;

    public Soma(IExpressao esquerda, IExpressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public Integer avaliar() {
        return this.esquerda.avaliar() + this.direita.avaliar();
    }

    public IExpressao getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(IExpressao esquerda) {
        this.esquerda = esquerda;
    }

    public IExpressao getDireita() {
        return direita;
    }

    public void setDireita(IExpressao direita) {
        this.direita = direita;
    }

    @Override
    public void imprimir(IVisitor impressora) {
      impressora.ImprimirSoma(this);
    }
   
    
}
