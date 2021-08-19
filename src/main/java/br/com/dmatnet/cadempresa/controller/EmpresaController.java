package br.com.dmatnet.cadempresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.dmatnet.cadempresa.model.Converter.EmpresaConverter;
import br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica.EmpresaEntity;
import br.com.dmatnet.cadempresa.model.transferObjects.pessoaTO.PessoaJuridicaTO.EmpresaTO;
import br.com.dmatnet.cadempresa.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	EmpresaRepository empresaRepository;

	@Autowired
	EmpresaConverter empresaConverter;

	@GetMapping
	public ResponseEntity<Stream<Object>> listarEmpresas(
			@RequestParam int pagina,
			@RequestParam String ordenarPor) {

		Pageable paginacao = PageRequest.of(pagina, 10, Sort.by(ordenarPor));

		Page<EmpresaEntity> empresaPaginada = empresaRepository.findAll(paginacao);
		
		if (empresaPaginada.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		List<EmpresaTO> empresaEntities = new ArrayList<>();

		return ResponseEntity.ok(empresaPaginada
				.stream()
				.map(empresa -> empresaEntities
						.add(empresaConverter.toEmpresaTO(empresa))));
	}

	@PostMapping
	@Transactional
	public ResponseEntity<EmpresaTO> criarEmpresa(
			@RequestBody @Valid EmpresaTO empresa) {

		EmpresaEntity empresaCriada = empresaRepository
				.save(empresaConverter.toEmpresaEntity(empresa));
		
		var uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path(Long.toString(empresaCriada.getIdPessoa()))
				.build().toUri();
		
		return ResponseEntity.created(uri).body(null);
	}

	@PutMapping(path = "/{id}", produces = { "application/json" })
	@Transactional
	public ResponseEntity<EmpresaTO> atualizarEmpresa(
			@PathVariable("id") long id,
			@RequestBody @Valid EmpresaTO empresa) {
		
		Optional<EmpresaEntity> empresaToUpdate = empresaRepository.findById(id);
		
		if (empresaToUpdate.isEmpty()) {
			return ResponseEntity.notFound().build(); 
		}
		
		EmpresaEntity empresaAtualizada = empresaRepository
				.save(empresaConverter.toEmpresaEntity(empresa));

		return ResponseEntity.ok(empresaConverter.toEmpresaTO(empresaAtualizada));
	}
	
	@DeleteMapping(path = "/{id}", produces = { "application/json" })
	@Transactional
	public ResponseEntity<EmpresaTO> delete(@PathVariable("id") long id) {
		
		Optional<EmpresaEntity> empresaToDelete = empresaRepository.findById(id);
		
		if (empresaToDelete.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
					
		empresaRepository.delete(empresaToDelete.get());
		
		return ResponseEntity.ok(null);
		
	}

}
