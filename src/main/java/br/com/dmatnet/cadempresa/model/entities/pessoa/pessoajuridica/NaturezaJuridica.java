package br.com.dmatnet.cadempresa.model.entities.pessoa.pessoajuridica;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_naturezajuridica")
@NamedQuery(name = "NaturezaJuridica.findAll", query = "SELECT n FROM NaturezaJuridica n")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class NaturezaJuridica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codiigo;

	private String descricao;

	private String titulo;

}