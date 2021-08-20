package br.com.dmatnet.cadempresa.model.entities.pessoa.pessoajuridica;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.dmatnet.cadempresa.model.entities.LocalTrabalho.LocalTrabalhoEntity;
import br.com.dmatnet.cadempresa.model.entities.pessoa.pessoafisica.usuario.UsuarioEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_Empresa")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class EmpresaEntity extends AbstractPessoaJuridicaEntity implements Serializable {

	private long codESocialEmpresa;
	
	@ManyToOne
	@JoinColumn(name = "grupo_ID")
	private EmpresaGrupoEntity grupo;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE,
			CascadeType.MERGE }, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "empresa_ID")
	private Set<EmpresaCadastroEntity> cadastros;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE,
			CascadeType.MERGE }, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "empresa_ID")
	private Set<LocalTrabalhoEntity> locais;
	
	@ManyToMany(mappedBy = "empresasGerenciadas", fetch = FetchType.EAGER)
	private List<UsuarioEntity> usuarios;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE,
			CascadeType.MERGE }, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "empresaFoto_ID")
	private EmpresaFoto empresaFotoFachada;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE,
			CascadeType.MERGE }, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "empresaLogotipo_ID")
	private EmpresaLogotipo empresaLogotipo;

	private String tipoEstabelecimento;

	private static final long serialVersionUID = 1L;

}
