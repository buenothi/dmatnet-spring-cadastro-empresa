package br.com.dmatnet.cadempresa.model.transfer_objects.pessoaTO;

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
public class EmailTipoTO implements Serializable {

	private long idEmailTipo;
	private String tipo;
	private static final long serialVersionUID = 1L;

}
