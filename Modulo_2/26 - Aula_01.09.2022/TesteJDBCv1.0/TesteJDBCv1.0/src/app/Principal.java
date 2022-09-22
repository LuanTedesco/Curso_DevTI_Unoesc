package app;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import dao.ProdutoDAO;
import modelo.Produto;

public class Principal {
	public static void main(String[] args) {
		SimpleDateFormat fd = new SimpleDateFormat("dd.MM.yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();
      
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto prod = new Produto(null, "Smart TV", 
							Date.valueOf("2021-07-25"),
				 			65, 
				 			new BigDecimal("10000.45")); 
//		prod.setIdProd(11);
//		dao.alterar(prod);
//		dao.adicionar(prod);
//		dao.excluir(3);

		prod = dao.buscarPorId(1);
		if (prod != null) {
			System.out.println("Id...........: " + prod.getIdProd());
			System.out.println("Nome produto.: " + prod.getNomeProd());
			System.out.println("Data cadastro: " + fd.format(prod.getDataCadastro()));
			System.out.println("Quantidade...: " + prod.getQuantidade());
			System.out.println("Preço........: " + fm.format(prod.getPreco()));
			System.out.println();
		} else {
			System.out.println("Produto não encontrado!");
		}

//		List<Produto> lista = dao.listarTodos();
//		
//		System.out.println("Lista de Contatos");
//		System.out.println("-----------------");
//
//		for (Produto produto : lista) {
//			System.out.println("Id...........: " + produto.getIdProd());
//			System.out.println("Nome produto.: " + produto.getNomeProd());
//			System.out.println("Data cadastro: " + fd.format(produto.getDataCadastro()));
//			System.out.println("Quantidade...: " + produto.getQuantidade());
//			System.out.println("Preço........: " + fm.format(produto.getPreco()));
//			System.out.println();
//		}
	}
}
