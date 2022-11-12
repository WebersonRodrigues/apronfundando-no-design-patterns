package model.integracao;

public class ClienteGol {
    
    private String nome;
    
    private String codigoIdentificacao;

    private String telefoneContato;

    private String emailContato;

    public ClienteGol(String nome, String codigoIdentificacao, String telefoneContato, String emailContato) {
        this.nome = nome;
        this.codigoIdentificacao = codigoIdentificacao;
        this.telefoneContato = telefoneContato;
        this.emailContato = emailContato;
    }

    public ClienteGol() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public void setCodigoIdentificacao(String codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    
}
