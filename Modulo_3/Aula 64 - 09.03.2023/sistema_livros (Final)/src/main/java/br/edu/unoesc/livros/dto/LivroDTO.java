package br.edu.unoesc.livros.dto;

import java.io.Serializable;

import br.edu.unoesc.livros.model.Livro;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
public class LivroDTO implements Serializable {
	Long id;
	String titulo;
	Integer paginas;
	String autor;
	
	public LivroDTO(Livro livro) {
		this.id = livro.getId();
		this.titulo = livro.getTitulo();
		this.paginas = livro.getPaginas();
		this.autor = livro.getAutor();
	}
}