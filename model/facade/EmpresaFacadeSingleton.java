package model.facade;

public class EmpresaFacadeSingleton {
    
    private static EmpresaFacade facade = new EmpresaFacade();

    public EmpresaFacade obter(){
        return facade;
    }
}
