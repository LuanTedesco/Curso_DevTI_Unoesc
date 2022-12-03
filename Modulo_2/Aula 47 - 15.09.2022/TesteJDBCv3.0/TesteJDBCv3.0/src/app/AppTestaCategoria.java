package app;

import java.sql.SQLException;
import java.util.List;

import dao.CategoriaDAO;
import dao.FabricaDAO;
import db.DbException;
import db.DbIntegridadeException;
import db.FabricaConexao;
import modelo.Categoria;

public class AppTestaCategoria {
	public static void main(String[] args) throws SQLException {
		Categoria cat1 = new Categoria("Eletrônicos");
		Categoria cat2 = new Categoria("Moveis");
		
		CategoriaDAO daoCat = FabricaDAO.criarCategoriaDAO();
		daoCat.salvar(cat1);
		daoCat.salvar(cat2);
		
		cat2.setIdCategoria(2);
		cat2.setNomeCategoria("Móveis");
		daoCat.salvar(cat2);
		
		try {
			if (daoCat.excluir(3)) {
				System.out.println("Exclusão efetuada com sucesso!");
			} else {
				System.out.println("Registro não excluído!");
			}
		} catch (DbException | DbIntegridadeException e) {
			System.out.println(e.getMessage());
		}

		Categoria cat = daoCat.buscarPorId(1);
		if (cat != null) {
			System.out.println("Id............: " + cat.getIdCategoria());
			System.out.println("Nome categoria: " + cat.getNomeCategoria());
			System.out.println();
		} else {
			System.out.println("Categoria não encontrada!");
		}
		
		List<Categoria> lista = daoCat.listarTodos();
		
//		Scanner sc = new Scanner(System.in);
//		String nome = sc.nextLine();
//		List<Categoria> lista = daoCat.buscarPorNome(nome);

//		System.out.println(daoCat.getNumeroRegistros() + " registros!\n");
		
		if (lista.isEmpty()) {
			System.out.println("Tabela está vazia!");
		} else {
			System.out.println("Lista de Contatos - # registros: " + daoCat.getNumeroRegistros());
			System.out.println("----------------------------------");
			
			for (Categoria c : lista) {
				System.out.println("Id............: " + c.getIdCategoria());
				System.out.println("Nome categoria: " + c.getNomeCategoria());
				System.out.println();
			}			
		}
		
		FabricaConexao.fechaConexao();
	}
}
