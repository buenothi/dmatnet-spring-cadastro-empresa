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
public class TelefoneTipoTO implements Serializable {

	private long idTelefoneTipo;
	private String tipo;
	private static final long serialVersionUID = 1L;

}
