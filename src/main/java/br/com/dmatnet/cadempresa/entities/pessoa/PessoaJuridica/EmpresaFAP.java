package br.com.dmatnet.cadempresa.entities.pessoa.PessoaJuridica;

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
@Table(name = "tbl_empresaFAP")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class EmpresaFAP implements Serializable, Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmpresaFAP;
	private double valorFAP;
	private int tipoProcessoFAP;
	private Long numProcessoFAP;

	private static final long serialVersionUID = 1L;

	@Override
	public EmpresaFAP clone() throws CloneNotSupportedException {
		return (EmpresaFAP) super.clone();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}