package app;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import dao.CategoriaDAO;
import dao.FabricaDAO;
import db.FabricaConexao;
import modelo.Categoria;

public class TestaPool {
	public static void main(String[] args) {
//		Connection conexao = null;
//		int numConexoes = 0;
//		
//		for (int i = 1; i <= 4; i++) {		
//			if (numConexoes == 5) {
//				numConexoes--;
//				try {
//					conexao.close();
//					System.out.println("Conexão #" + (i - 5) + " fechada!");
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			} 
//
//			conexao = FabricaConexao.getConexao();
//			numConexoes++;
//			System.out.println("Conexão #" + i);
//		}
		
		SimpleDateFormat fd = new SimpleDateFormat("dd.MM.yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();
      
		Categoria cat1 = new Categoria("Eletrônicos");
		Categoria cat2 = new Categoria("Móveis");
		
		CategoriaDAO catDao = FabricaDAO.criarCategoriaDAO();
		catDao.salvar(cat1);
		catDao.salvar(cat2);
		
//		ProdutoDAO daoProd = FabricaDAO.criarProdutoDAO();
//		Produto prod1 = daoProd.buscarPorId(1);
//		Produto prod2 = daoProd.buscarPorId(2);
//		System.out.println(prod1);
//		System.out.println(prod2);
		
//		Produto prod = new Produto("Notebook", 
//								   Date.valueOf("2022-09-10"),
//								   50, 
//								   new BigDecimal("10000"),
//								   cat1);
		
//		prod.setIdProd(4);
//		dao.salvar(prod);
		
//		try {
//			if (dao.excluir(4)) {
//				System.out.println("Exclusão efetuada com sucesso!");
//			} else {
//				System.out.println("Registro não excluído!");
//			}
//		} catch (DbException e) {
//			System.out.println(e.getMessage());
//		}

//		prod = dao.buscarPorId(4);
//		if (prod != null) {
//			System.out.println("Id...........: " + prod.getIdProd());
//			System.out.println("Nome produto.: " + prod.getNomeProd());
//			System.out.println("Data cadastro: " + fd.format(prod.getDataCadastro()));
//			System.out.println("Quantidade...: " + prod.getQuantidade());
//			System.out.println("Preço........: " + fm.format(prod.getPreco()));
//			System.out.println();
//		} else {
//			System.out.println("Produto não encontrado!");
//		}
		
//		List<Produto> lista = dao.listarTodos();
		
//		Scanner sc = new Scanner(System.in);
//		String nome = sc.nextLine();
//		List<Produto> lista = dao.buscarPorNome(nome);

//		System.out.println(dao.getNumeroRegistros());
//		
//		if (lista.isEmpty()) {
//			System.out.println("Tabela está vazia!");
//		} else {
//			System.out.println("Lista de Contatos - # registros: " + dao.getNumeroRegistros());
//			System.out.println("----------------------------------");
//			
//			for (Produto produto : lista) {
//				System.out.println("Id...........: " + produto.getIdProd());
//				System.out.println("Nome produto.: " + produto.getNomeProd());
//				System.out.println("Data cadastro: " + fd.format(produto.getDataCadastro()));
//				System.out.println("Quantidade...: " + produto.getQuantidade());
//				System.out.println("Preço........: " + fm.format(produto.getPreco()));
//				System.out.println();
//			}			
//		}
		
		FabricaConexao.fechaConexao();
	}
}
