package app;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import dao.ProdutoDAO;
import db.DbException;
import modelo.Produto;

public class Principal {
	public static void main(String[] args) {
//		Connection conexao = FabricaConexao.getConexao();
		
		SimpleDateFormat fd = new SimpleDateFormat("dd.MM.yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();
      
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto prod = new Produto(null, "TV", 
							Date.valueOf("2021-05-28"),
				 			50, 
				 			new BigDecimal("12342.42")); 
//		prod.setIdProd(4);
		dao.salvar(prod);
		
		try {
			if (dao.excluir(2)) {
				System.out.println("Exclusão efetuada com sucesso!");
			} else {
				System.out.println("Registro não excluído!");
			}
		} catch (DbException e) {
			System.out.println(e.getMessage());
		}

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
		
		List<Produto> lista = dao.listarTodos();
		
//		Scanner sc = new Scanner(System.in);
//		String nome = sc.nextLine();
//		List<Produto> lista = dao.buscarPorNome(nome);

		System.out.println(dao.getNumeroRegistros());
		
		if (lista.isEmpty()) {
			System.out.println("Tabela está vazia!");
		} else {
			System.out.println("Lista de Contatos - # registros: " + dao.getNumeroRegistros());
			System.out.println("----------------------------------");
			
			for (Produto produto : lista) {
				System.out.println("Id...........: " + produto.getIdProd());
				System.out.println("Nome produto.: " + produto.getNomeProd());
				System.out.println("Data cadastro: " + fd.format(produto.getDataCadastro()));
				System.out.println("Quantidade...: " + produto.getQuantidade());
				System.out.println("Preço........: " + fm.format(produto.getPreco()));
				System.out.println();
			}			
		}

//		FabricaConexao.fechaConexao();
	}
}
