package dao;

import java.util.List;

import modelo.Categoria;
import modelo.Produto;

public interface IProdutoDAO {
	void salvar(Produto p);
	boolean excluir(Integer id);
	List<Produto> listarTodos();
	List<Produto> listarPorCategoria(Categoria cat);
	Produto buscarPorId(Integer id);
	List<Produto> buscarPorNome(String nome);
	int getNumeroRegistros();
}
