package br.edu.iftm.tspi.rastreio_encomenda.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pacote {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String destinatario;
    @OneToOne
    private Endereco enderecoEntrega;
    @Enumerated(EnumType.STRING)
    private StatusPacote statusPacote;
    private Date dataPacote;
    private String localizacaoAtual;

    public Pacote(long id, String destinatario, Endereco enderecoEntrega, StatusPacote statusPacote){
        this.id = id;
        this.destinatario = destinatario;
        this.enderecoEntrega = enderecoEntrega;
        this.statusPacote = StatusPacote.PENDENTE;
        this.localizacaoAtual = "Na empresa";
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

    public void atualizarStatus(StatusPacote novoStatus, Date dataHora, String localizacao){
        this.statusPacote = novoStatus;
        this.dataPacote = dataHora;
        this.localizacaoAtual = localizacao;
    }

    public String consultarInformacoes(){
        return String.format("O pacote identificado como %d, pertence ao destinatário %s, tem como endereço de entrega o endereço: %s , tem como status atual: %s, será entregue em %s, porém encontra-se em %s ", id,destinatario, enderecoEntrega, statusPacote, dataPacote, localizacaoAtual);
    }
}
