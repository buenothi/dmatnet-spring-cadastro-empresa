package br.com.dmatnet.cadempresa.model.entities.LocalTrabalho;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica.FuncaoEntity;
import br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica.Setor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_LocalTrabalho")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LocalTrabalhoEntity implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idLocalTrabalho;
	private Long codAmbienteEsocial;
	
	private String nomeLocal;
	
	@Temporal(TemporalType.DATE)
	private Date dataInicioValidade;
	
	@Temporal(TemporalType.DATE)
	private Date dataFimValidade;

	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="empresa_ID")
	private List<Setor> setores;

	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="empresa_ID")
	private List<FuncaoEntity> funcoes;
	
	private String descricaoAmbiente;
	
	private int localAmbiente;//conforme eSocial
	
	private int tipoInscricao;//conforme eSocial
	
	private Long numInscricao;

	private static final long serialVersionUID = 1L;

	
}
