package br.com.dmatnet.cadempresa.model.transferObjects.pessoaTO.PessoaJuridicaTO;

import java.io.Serializable;
import java.util.Set;

import br.com.dmatnet.cadempresa.model.entities.LocalTrabalho.LocalTrabalhoEntity;
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
@EqualsAndHashCode(callSuper = false)
public class EmpresaTO extends AbstractPessoaJuridicaTO implements Serializable {

	private long codESocialEmpresa;
	private EmpresaGrupoTO grupo;
	private Set<EmpresaCadastroTO> cadastros;
	private Set<LocalTrabalhoEntity> locais;
	private EmpresaFotoTO empresaFotoFachada;
	private EmpresaLogotipoTO empresaLogotipo;
	private String tipoEstabelecimento;
	private static final long serialVersionUID = 1L;

}
