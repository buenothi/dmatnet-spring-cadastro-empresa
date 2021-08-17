package br.com.dmatnet.cadempresa.model.transferObjects.pessoaTO;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = { "enderecos", "telefones", "emails", "dataCadastroPessoa"})
public abstract class AbstractPessoaTO implements Serializable {

	private long idPessoa;
	private String nome;
	private Set<EnderecoTO> enderecos;
	private Set<TelefoneTO> telefones;
	private Set<EmailTO> emails;
	private Date dataCadastroPessoa;
	private static final long serialVersionUID = 1L;

}
