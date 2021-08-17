package br.com.dmatnet.cadempresa.model.transferObjects.pessoaTO.PessoaJuridicaTO;

import java.io.Serializable;
import java.util.List;

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
public class EmpresaGrupoTO implements Serializable {

	private long idGrupo;
	private String nomeGrupo;
	private String descricaoGrupo;
	private List<EmpresaTO> empresas;

	private static final long serialVersionUID = 1L;

}
