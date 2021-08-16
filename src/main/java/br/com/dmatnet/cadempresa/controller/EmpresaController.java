package br.com.dmatnet.cadempresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.dmatnet.cadempresa.entities.pessoa.PessoaJuridica.AbstractPessoaJuridicaEntity;
import br.com.dmatnet.cadempresa.repository.PessoaJuridicaRepository;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	PessoaJuridicaRepository pessoaJuridicaRepository;

	@GetMapping
	public ResponseEntity<List<AbstractPessoaJuridicaEntity>> listarEmpresas() {
		if (pessoaJuridicaRepository.findAll().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(pessoaJuridicaRepository.findAll());
	}

	@PostMapping
	public ResponseEntity<AbstractPessoaJuridicaEntity> criarEmpresa(
			@RequestBody AbstractPessoaJuridicaEntity empresa) {
		AbstractPessoaJuridicaEntity empresaCriada = pessoaJuridicaRepository.save(empresa);
		var uri = ServletUriComponentsBuilder.fromCurrentRequest().path(Long.toString(empresaCriada.getIdPessoa()))
				.build().toUri();
		return ResponseEntity.created(uri).body(null);
	}

	@PutMapping(path = "/{id}", produces = { "application/json" })
	public ResponseEntity<AbstractPessoaJuridicaEntity> atualizarEmpresa(@PathVariable("id") long id,
			@RequestBody AbstractPessoaJuridicaEntity empresa) {

		return null;
	}

}
