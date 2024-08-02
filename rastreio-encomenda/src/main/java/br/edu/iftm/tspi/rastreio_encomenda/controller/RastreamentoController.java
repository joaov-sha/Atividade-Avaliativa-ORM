package br.edu.iftm.tspi.rastreio_encomenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.tspi.rastreio_encomenda.model.Rastreamento;
import br.edu.iftm.tspi.rastreio_encomenda.service.RastreamentoService;


@RestController
@RequestMapping("/rastreamentos")
public class RastreamentoController {
    
    @Autowired
    private RastreamentoService rastreamentoService;

    @PostMapping
    public Rastreamento salvar(@RequestBody Rastreamento rastreamento) {
        return rastreamentoService.salvar(rastreamento);
    }
    
    @GetMapping("/{id}")
    public Rastreamento buscarPorId(@PathVariable Long id) {
        return rastreamentoService.buscarPorId(id);
    }
    
    @GetMapping
    public List<Rastreamento> listarTodos(){
        return rastreamentoService.listarTodos();
    }
    
}
