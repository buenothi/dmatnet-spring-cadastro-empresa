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
public class EmpresaFotoTO implements Serializable, Cloneable {

	private long idEmpresaFoto;
	private byte[] fotoFachada;
	private static final long serialVersionUID = 1L;

	@Override
	public EmpresaFotoTO clone() throws CloneNotSupportedException {
		return (EmpresaFotoTO) super.clone();
	}

}
