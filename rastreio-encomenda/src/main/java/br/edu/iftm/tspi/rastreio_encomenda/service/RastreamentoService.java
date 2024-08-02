package br.edu.iftm.tspi.rastreio_encomenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.tspi.rastreio_encomenda.model.Rastreamento;
import br.edu.iftm.tspi.rastreio_encomenda.repository.RastreamentoRepository;

@Service
public class RastreamentoService {
    
    @Autowired
    private RastreamentoRepository rastreamentoRepository;

    public List<Rastreamento> listarTodos(){
        return rastreamentoRepository.findAll();
    }

    public Rastreamento salvar(Rastreamento rastreamento){
        return rastreamentoRepository.save(rastreamento);
    }

    public Rastreamento buscarPorId(Long id){
        return rastreamentoRepository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        rastreamentoRepository.deleteById(id);
    }
}
