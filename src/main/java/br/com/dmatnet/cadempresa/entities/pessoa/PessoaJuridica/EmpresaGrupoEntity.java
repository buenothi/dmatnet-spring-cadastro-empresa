package br.com.dmatnet.cadempresa.entities.pessoa.PessoaJuridica;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_EmpresaGrupo")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class EmpresaGrupoEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGrupo;
	private String nomeGrupo;
	private String descricaoGrupo;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "grupo")
	private List<EmpresaEntity> empresas;

	private static final long serialVersionUID = 1L;

}
