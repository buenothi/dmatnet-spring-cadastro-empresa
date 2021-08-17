package br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_EmpresaCadastro")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class EmpresaCadastroEntity implements Serializable, Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long idEventoEsocial;// identificador para o eSocial
	private int tipoEvento;
	private int processoEnvioDados;
	private String versaoApp;
	private int tipoInscricao;
	private String numCNPJ;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicioCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFimCadastro;

	private String razaoSocial;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE,
			CascadeType.MERGE }, orphanRemoval = true)
	@JoinColumn(name = "empresaFAP_ID")
	private EmpresaFAP empresaFAP;

	private static final long serialVersionUID = 1L;

	public void setVersaoApp(String versaoApp) {
		this.versaoApp = versaoApp.toUpperCase();
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial.toUpperCase();
	}
	
	@Override
	public EmpresaCadastroEntity clone() throws CloneNotSupportedException {
		return (EmpresaCadastroEntity) super.clone();
	}

}
