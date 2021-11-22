package br.com.dmatnet.cadempresa.model.transfer_objects.pessoaTO.PessoaJuridicaTO;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	
	@NotNull
	@Size(min = 3)
	private String nomeGrupo;
	private String descricaoGrupo;
	private List<EmpresaTO> empresas;

	private static final long serialVersionUID = 1L;

}
