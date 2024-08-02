package br.edu.iftm.tspi.rastreio_encomenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.tspi.rastreio_encomenda.model.Endereco;
import br.edu.iftm.tspi.rastreio_encomenda.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> listarTodos(){
        return enderecoService.listarTodos();
    }

    @PostMapping
    public Endereco salvar(@RequestBody Endereco endereco){
        return enderecoService.salvar(endereco);
    }
    
    @GetMapping("/{id}")
    public Endereco buscarPorId(@PathVariable Long id){
        return enderecoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        enderecoService.deletar(id);
    }
}
