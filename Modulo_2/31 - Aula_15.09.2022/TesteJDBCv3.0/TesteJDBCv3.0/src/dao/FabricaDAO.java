package dao;

public class FabricaDAO {
	public static CategoriaDAO criarCategoriaDAO() {
		return new CategoriaDAO();
	}
	
	public static ProdutoDAO criarProdutoDAO() {
		return new ProdutoDAO();
	}
}
