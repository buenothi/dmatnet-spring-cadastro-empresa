package br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica;

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
@Table(name = "tbl_EmpresaFoto")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class EmpresaFoto implements Serializable, Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmpresaFoto;

	@Lob
	private byte[] fotoFachada;

	private static final long serialVersionUID = 1L;

	@Override
	public EmpresaFoto clone() throws CloneNotSupportedException {
		return (EmpresaFoto) super.clone();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
