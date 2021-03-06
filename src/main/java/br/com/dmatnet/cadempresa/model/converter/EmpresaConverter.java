package br.com.dmatnet.cadempresa.model.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dmatnet.cadempresa.model.entities.pessoa.pessoajuridica.EmpresaEntity;
import br.com.dmatnet.cadempresa.model.transfer_objects.pessoaTO.PessoaJuridicaTO.EmpresaTO;

@Component
public class EmpresaConverter {
	
	@Autowired
	ModelMapper modelMapper;
	
	public EmpresaTO toEmpresaTO(EmpresaEntity entity) {
		return modelMapper.map(entity, EmpresaTO.class);
	}
	
	public EmpresaEntity toEmpresaEntity(EmpresaTO to) {
		return modelMapper.map(to, EmpresaEntity.class);
	}

}
