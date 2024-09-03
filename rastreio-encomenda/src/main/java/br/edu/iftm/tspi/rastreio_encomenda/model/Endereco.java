package br.edu.iftm.tspi.rastreio_encomenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;
    private String cidade;
    private String cep;
    private String rua;
    private int numero;

    public Endereco(){}

    public Endereco(String estado, String cidade, String cep, String rua, int numero){
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
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
        return cep;
    }

    //S117 Renomear variável local para seguir padrão regex
    public void setCEP(String cep){
        this.cep = cep;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    //S3457 Alterar padrão de quebra de linhas para seguir padrão da plataforma de \n para %n
    public String getEnderecoCompleto(){
        return String.format("O endereço do cliente é:%nCidade: %s - Estado: %s%nCep: %s%nRua: %s - Número: %d", cidade, estado, cep, rua, numero);
    }
}
