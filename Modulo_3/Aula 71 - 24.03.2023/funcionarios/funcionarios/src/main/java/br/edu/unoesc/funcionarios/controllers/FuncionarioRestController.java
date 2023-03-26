package br.edu.unoesc.funcionarios.controllers;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.edu.unoesc.funcionarios.model.Funcionario;
import br.edu.unoesc.funcionarios.service.FuncionarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "API REST de Funcionários")
@RequestMapping("/api/funcionarios")
@ApiResponses(value = {
    @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
    @ApiResponse(code = 401, message = "Não autorizado"),
    @ApiResponse(code = 403, message = "Sem permissão para acessar este recurso"),
    @ApiResponse(code = 404, message = "Funcionário não encontrado"),
    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
})
public class FuncionarioRestController {
	@Autowired 
	private FuncionarioService servico;
	
	@ApiOperation(value = "Retorna todos os funcionários")
	@GetMapping
	public ResponseEntity<Iterable<Funcionario>> listar() {
		List<Funcionario> funcionarios = servico.listar();
		
		if (funcionarios.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		System.out.println(funcionarios);
		return ResponseEntity.ok(funcionarios);
	}

	@ApiOperation(value = "Retorna um único funcionário através do seu 'id'")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, 
				    produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Funcionario> porId(@PathVariable Long id) {
		Optional<Funcionario> funcionario = servico.porId(id);
		
		if (funcionario.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(funcionario.get());
	}
	
	@ApiOperation(value = "Retorna em XML um único funcionário através do seu 'id'")
	@RequestMapping(value = "/xml/{id}", headers = "Accept=application/xml")
	public ResponseEntity<Funcionario> porIdXML(@PathVariable Long id) {
		Funcionario funcionario;
		
		try {
			funcionario = servico.buscar(id);
			return ResponseEntity.ok(funcionario);
		} catch (ObjectNotFoundException e) {
			System.out.println("Erro 404!");
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@ApiOperation(value = "Retorna uma lista de funcionários que contenham no nome uma parte da string (case insensitive) buscada")
	@GetMapping("/buscar")
	public ResponseEntity<List<Funcionario>> porNome(@RequestParam("nome") String nome) {
		List<Funcionario> funcionarios = servico.buscarPorNome(nome);
		
		if (funcionarios.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(funcionarios); 
	}
	
	@ApiOperation(value = "Retorna uma lista de funcionários estejam dentro da faixa salarial informada")
	@GetMapping(value = "/faixa-salarial")
	public ResponseEntity<List<Funcionario>> porFaixaSalarial(@RequestParam("minimo") Optional<BigDecimal> minimo,
														      @RequestParam("maximo") Optional<BigDecimal> maximo) {
		List<Funcionario> funcionarios = servico.buscarPorFaixaSalarial(
													minimo.orElse(BigDecimal.ZERO),
													maximo.orElse(new BigDecimal("9999999999")));
		
		if (funcionarios.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(funcionarios); 
	}
	
	@ApiOperation(value = "Retorna uma lista de funcionários que contenham dependentes")
	@GetMapping(value = "/dependentes")
	public ResponseEntity<List<Funcionario>> possuiDependentes(@RequestParam("numDep") Optional<Integer> numDep) {
		List<Funcionario> funcionarios = servico.buscarPossuiDependentes(numDep.orElse(0));
		
		if (funcionarios.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(funcionarios); 
	}
	
	@ApiOperation(value = "Inclui um funcionário")
    @PostMapping()
    public ResponseEntity<Void> incluir(@RequestBody Funcionario funcionario) {
    	funcionario = servico.incluir(funcionario);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        									 .path("/{id}")
        									 .buildAndExpand(funcionario.getId())
        									 .toUri();
        
        System.out.println(uri.toString());
        
        return ResponseEntity.created(uri).build();
    }
    
	@ApiOperation(value = "Atualiza os dados de um funcionário")
    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable("id") Long id, @RequestBody Funcionario funcionario) {
    	if (servico.porId(id).isEmpty()) {
    		return ResponseEntity.notFound().build();
    	}
    	
        return ResponseEntity.ok(servico.alterar(id, funcionario));
    }
 
	@ApiOperation(value = "Exclui um funcionário")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
    	try {
    		servico.excluir(id);   		
    	} catch (ObjectNotFoundException e) {
    		return ResponseEntity.notFound().build();
    	}
    	
    	return ResponseEntity.noContent().build();
    }
}