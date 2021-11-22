package br.com.dmatnet.cadempresa.model.transfer_objects.pessoaTO.PessoaJuridicaTO;

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
public class EmpresaFAPTO implements Serializable, Cloneable {

	private long idEmpresaFAP;
	private double valorFAP;
	private int tipoProcessoFAP;
	private Long numProcessoFAP;
	private static final long serialVersionUID = 1L;

	@Override
	public EmpresaFAPTO clone() throws CloneNotSupportedException {
		return (EmpresaFAPTO) super.clone();
	}
	
}