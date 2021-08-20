package br.com.dmatnet.cadempresa.model.entities.pessoa.pessoafisica.usuario;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.dmatnet.cadempresa.model.entities.pessoa.pessoafisica.AbstractPessoaFisicaEntity;
import br.com.dmatnet.cadempresa.model.entities.pessoa.pessoajuridica.EmpresaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_usuarios")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UsuarioEntity extends AbstractPessoaFisicaEntity implements Serializable {

	@Column(unique = true)
	private String login;
	private String senha;

	@ManyToMany
	@JoinTable(name="tbl_usuarioEmpresas_joinTable",
		joinColumns=@JoinColumn(name="usuario_ID"),
		inverseJoinColumns=@JoinColumn(name="empresa_ID"))
	private List<EmpresaEntity> empresasGerenciadas;
	
	private Long idUsuarioPai;

	private static final long serialVersionUID = 1L;

}
