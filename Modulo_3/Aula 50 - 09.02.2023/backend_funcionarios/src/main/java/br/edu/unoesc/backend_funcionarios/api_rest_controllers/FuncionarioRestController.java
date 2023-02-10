package br.edu.unoesc.backend_funcionarios.api_rest_controllers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.backend_funcionarios.model.Funcionario;

@RestController
@RequestMapping(value = "/api")
public class FuncionarioRestController {
	// Versão com LocalDateTime
//	Funcionario f1 = new Funcionario(1L, "Fulano", 1, new BigDecimal("3.33"), LocalDateTime.now());
//	Funcionario f2 = new Funcionario(2L, "Beltrano", 2, new BigDecimal("33.33"), LocalDateTime.of(1975, 6, 6, 0, 0, 0));
	
	// Versão com LocalDate
	Funcionario f1 = new Funcionario(1L, "Fulano", 1, new BigDecimal("3.33"), LocalDate.now(ZoneId.of("America/Sao_Paulo")));
	Funcionario f2 = new Funcionario(2L, "Beltrano", 2, new BigDecimal("33.33"), LocalDate.of(1975, 6, 6));
	
	List<Funcionario> funcionarios;
	
	public FuncionarioRestController() {
		funcionarios = new ArrayList<Funcionario>();
		System.out.println(f1.getNascimento());
		funcionarios.add(f1);
		funcionarios.add(f2);
		
		System.out.println("Data formatada 1: " + DateTimeFormatter.ISO_LOCAL_DATE.format(f1.getNascimento()));
		System.out.println("Data formatada 2: " + f1.getNascimento().format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(f1);
	}
	
	// Incluir funcionário
	@PostMapping("/funcionarios")
	public Funcionario salvarFuncionario(@RequestBody Funcionario funcionario) {
		System.out.println("Inserindo um novo funcionario...");
		System.out.println(funcionario);
		
		funcionarios.add(funcionario);
		
		System.out.println(this.listarFuncionarios());
		
		return funcionario;
	}
	
	// Alterar funcionário
	@PutMapping("/funcionarios")
	public Funcionario atualizarFuncionario(@RequestBody Funcionario funcionario) {
		Funcionario f = findById(funcionario.getId());
		System.out.println(f);
		
		f.setNome(funcionario.getNome());
		f.setNumDep(funcionario.getNumDep());
		f.setSalario(funcionario.getSalario());
		
		System.out.println("Atualizando o funcionario...");
		System.out.println(f);
		
		System.out.println(this.listarFuncionarios());
		
		return f;
	}
	
	// Excluir funcionário
	@DeleteMapping(value = "/funcionarios/{id}")
	public void deletarFuncionario(@PathVariable Long id) {
		Funcionario p = findById(id);
		System.out.println(p);
		
		funcionarios.remove(p);
		
		System.out.println("Excluindo funcionario [" + id + "]...");
		
		System.out.println(this.listarFuncionarios());
	}
	
	@GetMapping(value = "/funcionarios")
	public List<Funcionario> listarFuncionarios() {
		return funcionarios;
	}
	
	@GetMapping(value = "/funcionarios/{id}")
	public Funcionario findById(@PathVariable Long id) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId().equals(id)) {
				return funcionario;
			}
		}
		
		return null;
	}
}
