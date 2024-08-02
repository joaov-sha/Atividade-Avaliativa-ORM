package br.edu.iftm.tspi.rastreio_encomenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.tspi.rastreio_encomenda.model.Endereco;
import br.edu.iftm.tspi.rastreio_encomenda.repository.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository EnderecoRepository;

    public List<Endereco> listarTodos(){
        return EnderecoRepository.findAll();
    }

    public Endereco salvar(Endereco endereco){
        return EnderecoRepository.save(endereco);
    }

    public Endereco buscarPorId(Long id){
        return EnderecoRepository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        EnderecoRepository.deleteById(id);
    }
}
