package br.com.dmatnet.cadempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica.EmpresaEntity;

public interface PessoaJuridicaRepository extends JpaRepository<EmpresaEntity, Long>{

}
