package br.com.dmatnet.cadempresa.model.transferObjects.pessoaTO;

import java.io.Serializable;

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
public class TelefoneTO implements Serializable, Cloneable, Comparable<TelefoneTO> {

	private long idTelefone;
	private String numeroTelefone;
	private TelefoneTipoTO tipoTelefone;
	private static final long serialVersionUID = 1L;
	
	public TelefoneTO clone() throws CloneNotSupportedException {
		return (TelefoneTO) super.clone();
	}

	@Override
	public int compareTo(TelefoneTO outroTelefone) {
		if(outroTelefone.getNumeroTelefone() == this.getNumeroTelefone()) {		
			return 0;
		}
		return -1;
	}
}
