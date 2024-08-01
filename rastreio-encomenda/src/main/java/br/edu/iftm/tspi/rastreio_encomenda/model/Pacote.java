package br.edu.iftm.tspi.rastreio_encomenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pacote {
    
    @Id
    private long id;
    @OneToOne
    private String destinatario;
    @OneToOne
    private Endereco enderecoEntrega;
    private StatusPacote statusPacote;

    public Pacote(long id, String destinatario, Endereco enderecoEntrega, StatusPacote statusPacote){
        this.id = id;
        this.destinatario = destinatario;
        this.enderecoEntrega = enderecoEntrega;
        this.statusPacote = StatusPacote.PENDENTE;
    }

    public long getIdPacote(){
        return id;
    }

    public void setIdPacote(long id){
        this.id = id;
    }

    public String getDestinatario(){
        return destinatario;
    }

    public Endereco getEndereco(){
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega){
        this.enderecoEntrega = enderecoEntrega;
    }

    public StatusPacote getStatusPacote(){
        return statusPacote;
    }

    public void setStatusPacote(StatusPacote statusPacote){
        this.statusPacote = statusPacote;
    }
}
