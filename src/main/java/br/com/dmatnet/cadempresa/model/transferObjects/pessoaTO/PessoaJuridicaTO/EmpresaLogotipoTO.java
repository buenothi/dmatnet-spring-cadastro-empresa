package br.com.dmatnet.cadempresa.model.transferObjects.pessoaTO.PessoaJuridicaTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class EmpresaLogotipoTO implements Serializable, Cloneable {

	private long idEmpresaLogotipo;
	private byte[] logotipo;
	private static final long serialVersionUID = 1L;

	@Override
	public EmpresaLogotipoTO clone() throws CloneNotSupportedException {
		return (EmpresaLogotipoTO) super.clone();
	}

}
