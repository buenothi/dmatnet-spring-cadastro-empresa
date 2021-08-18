package br.com.dmatnet.cadempresa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica.EmpresaEntity;

public interface EmpresaRepository extends PagingAndSortingRepository<EmpresaEntity, Long>{

}
