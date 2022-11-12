package model.integracao;

public class ClienteAdapter {
    
    public static Cliente adaptar(ClienteGol clienteGol){
        return new Cliente(
            clienteGol.getNome(), 
            clienteGol.getCodigoIdentificacao(), 
            clienteGol.getEmailContato(), 
            clienteGol.getTelefoneContato());
    }

    public static ClienteGol adaptar(Cliente cliente){
       return  new ClienteGol(
            cliente.getNome(), 
            cliente.getCpf(), 
            cliente.getTelefone(), 
            cliente.getEmail());
    }
}
