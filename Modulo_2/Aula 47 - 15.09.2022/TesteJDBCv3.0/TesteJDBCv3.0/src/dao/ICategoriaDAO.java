package dao;

import java.util.List;

import modelo.Categoria;

public interface ICategoriaDAO {
	void salvar(Categoria c);
	boolean excluir(Integer id);
	List<Categoria> listarTodos();
	Categoria buscarPorId(Integer id);
	List<Categoria> buscarPorNome(String nome);
	int getNumeroRegistros();
}
