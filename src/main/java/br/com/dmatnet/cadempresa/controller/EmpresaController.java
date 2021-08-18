package br.com.dmatnet.cadempresa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica.AbstractPessoaJuridicaEntity;
import br.com.dmatnet.cadempresa.model.entities.pessoa.PessoaJuridica.EmpresaEntity;
import br.com.dmatnet.cadempresa.model.transferObjects.pessoaTO.PessoaJuridicaTO.EmpresaTO;
import br.com.dmatnet.cadempresa.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	EmpresaRepository empresaRepository;
	
	ModelMapper mapper = new ModelMapper();

	@GetMapping
	public ResponseEntity<Stream<Object>> listarEmpresas(int pagina, String ordenarPor) {
		
		Pageable paginacao = PageRequest.of(pagina, 10, Sort.by(ordenarPor));
		
		Page<EmpresaEntity> empresaPaginada = empresaRepository.findAll(paginacao);
		if (empresaPaginada.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		List<EmpresaTO> empresaEntities = new ArrayList<>();
		
		return ResponseEntity.ok(empresaPaginada
				.stream()
				.map(empresa -> empresaEntities
						.add(mapper.map(empresa, EmpresaTO.class))));
	}

	@PostMapping
	public ResponseEntity<EmpresaTO> criarEmpresa(
			@RequestBody EmpresaTO empresa) {
		/*
		 * EmpresaEntity empresaNova = mapper.map(empresa, EmpresaEntity.class);
		 * 
		 * AbstractPessoaJuridicaEntity empresaCriada =
		 * pessoaJuridicaRepository.save(empresaNova); var uri =
		 * ServletUriComponentsBuilder.fromCurrentRequest().path(Long.toString(
		 * empresaCriada.getIdPessoa())) .build().toUri(); return
		 * ResponseEntity.created(uri).body(null);
		 */
		
		return null;
	}

	@PutMapping(path = "/{id}", produces = { "application/json" })
	public ResponseEntity<EmpresaTO> atualizarEmpresa(@PathVariable("id") long id,
			@RequestBody AbstractPessoaJuridicaEntity empresa) {

		return null;
	}

}
