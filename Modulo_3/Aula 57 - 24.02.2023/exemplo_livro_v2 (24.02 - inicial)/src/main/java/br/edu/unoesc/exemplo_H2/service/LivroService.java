package br.edu.unoesc.exemplo_H2.service;

import java.util.List;
import java.util.Optional;

import br.edu.unoesc.exemplo_H2.model.Livro;

public interface LivroService {
	void popularTabelaInicial();

	Livro incluir(Livro livro);
	Livro alterar(Long id, Livro livro);
	void excluir(Long id);

	List<Livro> listar();
	
	Livro buscar(Long id);
	Livro buscarPorId(Long id); // Retorna um novo objeto Livro caso id não seja encontrado
	Optional<Livro> porId(Long id);
	
	List<Livro> buscarPorTitulo(String titulo);
	List<Livro> buscarPorAutor(String autor);
	List<Livro> buscarPorQtdPaginas(Integer qtdPaginas);
}