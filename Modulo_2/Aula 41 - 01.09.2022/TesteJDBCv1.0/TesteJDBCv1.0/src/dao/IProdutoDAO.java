package dao;

import java.util.List;

import modelo.Produto;

public interface IProdutoDAO {
	void adicionar(Produto p);
	void alterar(Produto p);
	void excluir(Integer id);
	List<Produto> listarTodos();
	Produto buscarPorId(Integer id);
}
