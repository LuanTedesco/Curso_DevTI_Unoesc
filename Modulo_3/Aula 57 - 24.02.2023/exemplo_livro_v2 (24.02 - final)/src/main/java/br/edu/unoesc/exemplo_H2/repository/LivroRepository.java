package br.edu.unoesc.exemplo_H2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.exemplo_H2.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	public List<Livro> findByAutorContainingIgnoreCase(String autor);
	
	@Query("Select l from Livro l where l.paginas >= :paginas")
	public List<Livro> porQtdPaginas(@Param("paginas") Integer paginas);
	
	@Query("Select l from Livro l where upper(l.titulo) like upper(concat('%', :filtro, '%')) order by titulo")
	public List<Livro> findByFiltro(@Param("filtro") String filtro);
}