package br.com.dmatnet.cadempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dmatnet.cadempresa.entities.pessoa.PessoaJuridica.AbstractPessoaJuridicaEntity;

public interface PessoaJuridicaRepository extends JpaRepository<AbstractPessoaJuridicaEntity, Long>{

}
