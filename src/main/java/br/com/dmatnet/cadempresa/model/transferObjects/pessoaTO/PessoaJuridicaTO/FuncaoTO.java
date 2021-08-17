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
public class FuncaoTO implements Serializable {

	private long id;
	private Long codFuncaoEsocial; // Código eSocial do Cargo
	private String funcaoNome;
	private String funcaoDescricao;
	private Long cbo;

	private static final long serialVersionUID = 1L;

	public void setFuncaoNome(String funcaoNome) {
		this.funcaoNome = funcaoNome.toUpperCase();
	}

	public void setFuncaoDescricao(String funcaoDescricao) {
		this.funcaoDescricao = funcaoDescricao.toUpperCase();
	}

}
