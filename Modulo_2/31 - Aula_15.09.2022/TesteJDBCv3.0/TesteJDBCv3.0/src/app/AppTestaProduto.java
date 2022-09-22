package app;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import dao.CategoriaDAO;
import dao.FabricaDAO;
import dao.ProdutoDAO;
import db.FabricaConexao;
import modelo.Categoria;
import modelo.Produto;

public class AppTestaProduto {
	public static void main(String[] args) {
		SimpleDateFormat fd = new SimpleDateFormat("dd.MM.yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();
      
		CategoriaDAO catDao = FabricaDAO.criarCategoriaDAO();
		catDao.criarTabela();
		
		Categoria cat1 = catDao.buscarPorId(1);
		Categoria cat2 = catDao.buscarPorId(2);
		
		ProdutoDAO prodDao = FabricaDAO.criarProdutoDAO();
		prodDao.criarTabela();
		
		Produto prod1 = new Produto("Notebook", 
								   Date.valueOf("2022-09-10"),
								   50, 
								   new BigDecimal("10000"),
								   cat1);
		
		Produto prod2 = new Produto("Mesa", 
								   Date.valueOf("2022-08-11"),
								   20, 
								   new BigDecimal("1000"),
								   cat2);
		
		Produto prod3 = new Produto("iPad", 
								   Date.valueOf("2022-08-12"),
								   30, 
								   new BigDecimal("15000"),
								   cat1);
		
		prod1.setIdProd(1);
		prod1.setNomeProd("Smartphone");
		prodDao.salvar(prod1);
//		prodDao.salvar(prod2);
//		prodDao.salvar(prod3);
		
//		try {
//			if (prodDao.excluir(1)) {
//				System.out.println("Exclusão efetuada com sucesso!");
//			} else {
//				System.out.println("Registro não excluído!");
//			}
//		} catch (DbException e) {
//			System.out.println(e.getMessage());
//		}

//		Produto prod = prodDao.buscarPorId(4);
//		if (prod != null) {
//			System.out.println("Id...........: " + prod.getIdProd());
//			System.out.println("Nome produto.: " + prod.getNomeProd());
//			System.out.println("Data cadastro: " + fd.format(prod.getDataCadastro()));
//			System.out.println("Quantidade...: " + prod.getQuantidade());
//			System.out.println("Preço........: " + fm.format(prod.getPreco()));
//		} else {
//			System.out.println("Produto não encontrado!");
//		}
//		System.out.println();
		
		FabricaConexao.fechaConexao();
		List<Produto> lista = prodDao.listarTodos();
//		List<Produto> lista = prodDao.listarPorCategoria(cat1);
		
//		Scanner sc = new Scanner(System.in);
//		String nome = sc.nextLine();
//		List<Produto> lista = prodDao.buscarPorNome(nome);

//		System.out.println(dao.getNumeroRegistros());
//		
		if (lista.isEmpty()) {
			System.out.println("Tabela está vazia!");
		} else {
			System.out.println("Lista de Contatos - # registros: " + prodDao.getNumeroRegistros());
			System.out.println("----------------------------------");
			
			for (Produto p : lista) {
				System.out.println("Id...........: " + p.getIdProd());
				System.out.println("Nome produto.: " + p.getNomeProd());
				System.out.println("Data cadastro: " + fd.format(p.getDataCadastro()));
				System.out.println("Quantidade...: " + p.getQuantidade());
				System.out.println("Preço........: " + fm.format(p.getPreco()));
				System.out.println("Categoria....: " + p.getCategoria());
				System.out.println();
			}			
		}
		
		FabricaConexao.fechaConexao();
	}
}
