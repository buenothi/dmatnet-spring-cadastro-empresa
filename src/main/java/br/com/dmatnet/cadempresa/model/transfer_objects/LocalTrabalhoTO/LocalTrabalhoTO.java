package br.com.dmatnet.cadempresa.model.transfer_objects.LocalTrabalhoTO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import br.com.dmatnet.cadempresa.model.entities.pessoa.pessoajuridica.FuncaoEntity;
import br.com.dmatnet.cadempresa.model.entities.pessoa.pessoajuridica.Setor;
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
public class LocalTrabalhoTO implements Serializable{

	private long idLocalTrabalho;
	private Long codAmbienteEsocial;
	private String nomeLocal;
	private Date dataInicioValidade;
	private Date dataFimValidade;
	private List<Setor> setores;
	private List<FuncaoEntity> funcoes;
	private String descricaoAmbiente;
	private int localAmbiente;//conforme eSocial
	private int tipoInscricao;//conforme eSocial
	private Long numInscricao;
	private static final long serialVersionUID = 1L;

}
