package model.calculadora;

public interface IExpressao {
    
    Integer avaliar();

    void imprimir(IVisitor impressora);
}
