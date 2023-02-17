package br.edu.unoesc.exemplo_H2.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.exemplo_H2.model.Aluno;
import br.edu.unoesc.exemplo_H2.repository.AlunoRepository;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
	@Autowired
	private AlunoRepository repositorio;

	@GetMapping("/find")
			List<Aluno> listarComFiltro(@RequestParam("filtro") String filtro) {
			List<Aluno> alunos = repositorio.findByNomeContainingIgnoreCase(filtro);
			if(filtro != null && filtro.matches("[-+]?[0-9]*\\,?[0-9]*")) {
				alunos.addAll(repositorio.porSalario(new BigDecimal(filtro)));
				
			}
				
		return alunos;
	}

	@GetMapping
	public Iterable<Aluno> listarTudo() {
		return repositorio.findAll();
	}
}
