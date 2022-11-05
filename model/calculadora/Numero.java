package model.calculadora;

public class Numero implements IExpressao {
    
    private Integer valor;

    public Numero(Integer valor){
        this.valor = valor;
    }

    @Override
    public Integer avaliar() {
        return this.valor;
    }

    @Override
    public void imprimir(IVisitor impressora) {
       impressora.ImprimirNumero(this);
    }
}
