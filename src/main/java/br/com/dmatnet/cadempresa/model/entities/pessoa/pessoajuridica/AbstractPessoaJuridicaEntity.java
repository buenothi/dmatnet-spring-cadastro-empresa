package br.com.dmatnet.cadempresa.model.entities.pessoa.pessoajuridica;

import java.io.Serializable;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import br.com.dmatnet.cadempresa.model.entities.pessoa.AbstractPessoaEntity;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class AbstractPessoaJuridicaEntity extends AbstractPessoaEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public AbstractPessoaJuridicaEntity() {
		super();
	}
	
}
