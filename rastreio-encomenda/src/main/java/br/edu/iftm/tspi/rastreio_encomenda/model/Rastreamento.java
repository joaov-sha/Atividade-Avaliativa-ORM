package br.edu.iftm.tspi.rastreio_encomenda.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Rastreamento {
    
    @Id
    private long id;
    @OneToOne
    private Pacote pacote;
    private Date envioPacote;
    private StatusPacote statusPacote;
    private String localizacaoAtual;

    public Rastreamento(long id, Pacote pacote, Date envioPacote, StatusPacote statusPacote){
        this.id = id;
        this.pacote = pacote;
        this.envioPacote = envioPacote;
        this.statusPacote = pacote.getStatusPacote();
    }

    public Rastreamento(long id, Pacote pacote, Date envioPacote, StatusPacote statusPacote, String localizacaoAtual){
        this.id = id;
        this.pacote = pacote;
        this.envioPacote = envioPacote;
        this.statusPacote = pacote.getStatusPacote();
        this.localizacaoAtual = localizacaoAtual;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public Pacote getPacote(){
        return pacote;
    }

    public Date getDataPacote(){
        return envioPacote;
    }

    public void setDataPacote(Date envioPacote){
        this.envioPacote = envioPacote;
    }

    public StatusPacote getStatusPacote(){
        return statusPacote;
    }

    public String getLocalizacaoAtual(){
        return localizacaoAtual;
    }

    public String getResumo(){
        return String.format("id: %d\npacote: %s\ndata de envio: %s\nstatus do pacote: %s\n localizacao: %s\n", id, pacote.getIdPacote(), envioPacote.toString(), statusPacote, localizacaoAtual);
    }
}
