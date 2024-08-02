package br.edu.iftm.tspi.rastreio_encomenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.tspi.rastreio_encomenda.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
  
} 