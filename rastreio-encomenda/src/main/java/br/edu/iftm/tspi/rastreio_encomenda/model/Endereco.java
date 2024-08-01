package br.edu.iftm.tspi.rastreio_encomenda.model;

public class Endereco {
    
    private String estado;
    private String cidade;
    private String CEP;
    private String rua;
    private int numero;

    public Endereco(String estado, String cidade, String CEP, String rua, int numero){
        this.estado = estado;
        this.cidade = cidade;
        this.CEP = CEP;
        this.rua = rua;
        this.numero = numero;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getCEP(){
        return CEP;
    }

    public void setCEP(String CEP){
        this.CEP = CEP;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
}
