package br.edu.iftm.tspi.rastreio_encomenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.tspi.rastreio_encomenda.model.Pacote;
import br.edu.iftm.tspi.rastreio_encomenda.service.PacoteService;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {
    
    @Autowired
    private PacoteService pacoteService;

    @GetMapping
    public List<Pacote> listarTodos(){
        return pacoteService.listarTodos();
    }

    @PostMapping
    public Pacote salvar(@RequestBody Pacote pacote){
        return pacoteService.salvar(pacote);
    }

    @GetMapping("/{id}")
    public Pacote buscarPorId(@PathVariable Long id){
        return pacoteService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Pacote atualizar(@PathVariable Long id, @RequestBody Pacote pacote){
        Pacote existente = pacoteService.buscarPorId(id);
        if(existente != null){
            existente.setDestinatario(pacote.getDestinatario());
            existente.setEnderecoEntrega(pacote.getEndereco());
            existente.setStatusPacote(pacote.getStatusPacote());
            return pacoteService.salvar(existente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        pacoteService.deletar(id);
    }
}
