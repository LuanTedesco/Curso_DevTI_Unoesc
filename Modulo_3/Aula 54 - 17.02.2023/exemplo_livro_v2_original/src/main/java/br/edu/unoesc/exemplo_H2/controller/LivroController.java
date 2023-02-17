package br.edu.unoesc.exemplo_H2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.exemplo_H2.model.Livro;
import br.edu.unoesc.exemplo_H2.repository.LivroRepository;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
	@Autowired
	private LivroRepository repositorio;
	
	@GetMapping
	public Iterable<Livro> listarTudo() {
		return repositorio.findAll();
	}

	@GetMapping("/find")
	List<Livro> listarComFiltro(@RequestParam("filtro") String filtro) {
		return repositorio.findByFiltro(filtro);
	}
	
	@GetMapping("/paginas/{paginas}")
	public List<Livro> porQdtPaginas(@PathVariable Integer paginas) {
		return repositorio.porQtdPaginas(paginas);
	}
	
    @PostMapping()
    public Livro incluir(@RequestBody Livro livro) {
        return repositorio.save(livro);
    }
 
    @PutMapping("/{id}")
    public Livro atualizar(@PathVariable("id") Long id, @RequestBody Livro livro) {
    	// Versão mais simplificada, não faz uso do id nem testa se o recurso existe
        return repositorio.save(livro);
    }
 
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id) {
		repositorio.deleteById(id);
    }
}
