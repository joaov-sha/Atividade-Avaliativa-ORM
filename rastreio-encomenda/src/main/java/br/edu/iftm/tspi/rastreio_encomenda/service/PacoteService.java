package br.edu.iftm.tspi.rastreio_encomenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.tspi.rastreio_encomenda.model.Pacote;
import br.edu.iftm.tspi.rastreio_encomenda.repository.PacoteRepository;

@Service
public class PacoteService {
    
    @Autowired
    private PacoteRepository pacoteRepository;

    public List<Pacote> listarTodos(){
        return pacoteRepository.findAll();
    }

    public Pacote salvar(Pacote pacote){
        return pacoteRepository.save(pacote);
    }

    public Pacote buscarPorId(Long id){
        return pacoteRepository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        pacoteRepository.deleteById(id);
    }
}
