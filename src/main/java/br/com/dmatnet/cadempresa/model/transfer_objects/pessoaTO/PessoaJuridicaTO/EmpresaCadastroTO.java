package br.com.dmatnet.cadempresa.model.transfer_objects.pessoaTO.PessoaJuridicaTO;

import java.io.Serializable;
import java.util.Date;

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
public class EmpresaCadastroTO implements Serializable, Cloneable {

	private long id;
	private long idEventoEsocial;// identificador para o eSocial
	private int tipoEvento;
	private int processoEnvioDados;
	private String versaoApp;
	private int tipoInscricao;
	private String numCNPJ;
	private Date dataInicioCadastro;
	private Date dataFimCadastro;
	private String razaoSocial;
	private EmpresaFAPTO empresaFAP;
	private static final long serialVersionUID = 1L;

	public void setVersaoApp(String versaoApp) {
		this.versaoApp = versaoApp.toUpperCase();
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial.toUpperCase();
	}
	
	@Override
	public EmpresaCadastroTO clone() throws CloneNotSupportedException {
		return (EmpresaCadastroTO) super.clone();
	}

}
