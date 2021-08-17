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
@Table(name = "tbl_EmpresaSetores")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Setor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSetores;
	private String setorNome;

	public void setSetorNome(String setorNome) {
		this.setorNome = setorNome.toUpperCase();
	}

}
