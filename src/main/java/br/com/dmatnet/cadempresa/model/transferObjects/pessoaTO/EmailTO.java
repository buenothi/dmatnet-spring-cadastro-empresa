package br.com.dmatnet.cadempresa.model.transferObjects.pessoaTO;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

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
@EqualsAndHashCode(exclude = {"tipoEmail", "isEmailPrincipal"})
public class EmailTO implements Serializable, Cloneable, Comparable<EmailTO> {

	private long idEmail;

	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String nomeEmail;
	private boolean isEmailPrincipal;
	private EmailTipoTO tipoEmail;
	private static final long serialVersionUID = 1L;

	public void setNomeEmail(String nomeEmail) {
		this.nomeEmail = nomeEmail.toUpperCase();
	}
	
	@Override
	protected EmailTO clone() throws CloneNotSupportedException {
		return (EmailTO) super.clone();
	}

	@Override
	public int compareTo(EmailTO outroEmail) {
		if (outroEmail.getNomeEmail() == this.nomeEmail) {
			return 0;
		}
		return -1;
	}

}
