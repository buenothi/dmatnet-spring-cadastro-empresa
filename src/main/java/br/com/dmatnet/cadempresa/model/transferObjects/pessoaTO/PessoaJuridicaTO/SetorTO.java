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
public class SetorTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private long idSetores;
	private String setorNome;

	public void setSetorNome(String setorNome) {
		this.setorNome = setorNome.toUpperCase();
	}

}
