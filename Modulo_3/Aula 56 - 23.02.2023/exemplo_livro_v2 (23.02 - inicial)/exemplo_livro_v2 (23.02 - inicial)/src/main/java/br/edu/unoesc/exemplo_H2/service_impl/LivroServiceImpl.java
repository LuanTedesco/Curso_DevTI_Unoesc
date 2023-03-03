package br.edu.unoesc.exemplo_H2.service_impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoesc.exemplo_H2.model.Livro;
import br.edu.unoesc.exemplo_H2.repository.LivroRepository;
import br.edu.unoesc.exemplo_H2.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService {
	@Autowired
	private LivroRepository repositorio;
	
	@Override
	public void popularTabelaInicial() {
		repositorio.saveAll(List.of(
				new Livro(null, "O hobbit 1", 1, "J.R.R.Tolkien"),
				new Livro(null, "O hobbit 2", 2, "J.R.R.Tolkien"),
				new Livro(null, "O hobbit 3", 3, "J.R.R.Tolkien"),
				new Livro(null, "O hobbit 4", 4, "J.R.R.Tolkien"),
				new Livro(null, "O hobbit 5", 5, "J.R.R.Tolkien"),
				new Livro(null, "O hobbit 6", 6, "J.R.R.Tolkien"),
				new Livro(null, "O hobbit 7", 7, "J.R.R.Tolkien"),
				new Livro(null, "O hobbit 8", 8, "J.R.R.Tolkien"),
				new Livro(null, "O hobbit 9", 9, "J.R.R.Tolkien"),				
				new Livro(null, "O hobbit 10", 10, "J.R.R.Tolkien"),			
				new Livro(null, "O hobbit 11", 11, "J.R.R.Tolkien"),			
				new Livro(null, "O hobbit 12", 12, "J.R.R.Tolkien"),			
				new Livro(null, "O hobbit 13", 13, "J.R.R.Tolkien"),			
				new Livro(null, "O hobbit 14", 14, "J.R.R.Tolkien")		
			)
		);
		
		Livro l = new Livro(null, "O Senhor dos anéis", 42, "Tolkien");
		l = repositorio.save(l);
	}

	@Override
	public Livro incluir(Livro livro) {
		return null;
	}

	@Override
	public Livro alterar(Long id, Livro livro) {
		return null;
	}

	@Override
	public void excluir(Long id) {

	}

	@Override
	public List<Livro> listar() {
		return null;
	}

	@Override
	public Livro buscar(Long id) {
		return null;
	}

	@Override
	public Livro buscarPorCodigo(Long id) {
		return null;
	}

	@Override
	public Optional<Livro> porCodigo(Long id) {
		return Optional.empty();
	}

	@Override
	public List<Livro> buscarPorTitulo(String titulo) {
		return null;
	}

	@Override
	public List<Livro> buscarPorAutor(String autor) {
		return null;
	}

	@Override
	public List<Livro> buscarPorQtdPaginas(Integer qtdPaginas) {
		return null;
	}

}
