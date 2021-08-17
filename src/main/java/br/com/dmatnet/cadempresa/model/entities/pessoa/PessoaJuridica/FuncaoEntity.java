package br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_TrabalhadorFuncao")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class FuncaoEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
