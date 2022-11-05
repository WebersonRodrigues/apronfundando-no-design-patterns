package model.calculadora;

public interface IVisitor {
    
    void ImprimirSoma(Soma soma);
    void ImprimirSubtracao(Subtracao subtracao);
    void ImprimirNumero(Numero numero);
}
