package br.com.dmatnet.cadempresa.model.entities.pessoa.pessoajuridica;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_EmpresaLogotipo")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class EmpresaLogotipo implements Serializable, Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmpresaLogotipo;

	@Lob
	private byte[] logotipo;

	private static final long serialVersionUID = 1L;

	@Override
	public EmpresaLogotipo clone() throws CloneNotSupportedException {
		return (EmpresaLogotipo) super.clone();
	}

}
