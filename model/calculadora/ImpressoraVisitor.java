package model.calculadora;

public class ImpressoraVisitor implements IVisitor {

    @Override
    public void ImprimirSoma(Soma soma) {
        System.out.print("(");

        soma.getEsquerda().imprimir(this);

        System.out.print(" + ");

        soma.getDireita().imprimir(this);

        System.out.print(")");
    }

    @Override
    public void ImprimirSubtracao(Subtracao subtracao) {
        System.out.print("(");

        subtracao.getEsquerda().imprimir(this);

        System.out.print(" - ");
        
        subtracao.getDireita().imprimir(this);

        System.out.print(")");
        
    }

    @Override
    public void ImprimirNumero(Numero numero) {
        System.out.print(numero.avaliar());
    }
    
}
