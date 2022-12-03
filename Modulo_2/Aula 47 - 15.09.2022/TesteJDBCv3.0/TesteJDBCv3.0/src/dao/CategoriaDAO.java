package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DbException;
import db.DbIntegridadeException;
import db.FabricaConexao;
import modelo.Categoria;

public class CategoriaDAO implements ICategoriaDAO {
	private Connection conexao;

	public void criarTabela() {
		conexao = FabricaConexao.getConexao();
		
		String sql = """
					CREATE TABLE IF NOT EXISTS categoria (
						id_cat INT AUTO_INCREMENT PRIMARY KEY,
					    nome_cat VARCHAR(40)
					) ENGINE=InnoDB;
				""";

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			conexao.setAutoCommit(false);
			stmt.executeUpdate();
			conexao.commit();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	@Override
	public List<Categoria> listarTodos() {
		conexao = FabricaConexao.getConexao();
		List<Categoria> lista = new ArrayList<>();
		String sql = "SELECT * FROM Categoria";

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
		) {
			while (rs.next()) {
				Categoria p = setaCategoria(rs);
				lista.add(p);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 

		return lista;
	}

	private Categoria setaCategoria(ResultSet rs) throws SQLException {
		Categoria c = new Categoria();

		c.setIdCategoria(rs.getInt("id_cat"));
		c.setNomeCategoria(rs.getString("nome_cat"));
		
		return c;
	}

	@Override
	public void salvar(Categoria p) {
		conexao = FabricaConexao.getConexao();
		String sql;
		
		if (p.getIdCategoria() == null) {
			sql = "INSERT INTO Categoria (nome_cat) VALUES (?)";
		} else {
			sql = "UPDATE Categoria SET nome_cat=? WHERE id_cat=?";
		}
		
		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql,
													Statement.RETURN_GENERATED_KEYS);
		) {
			conexao.setAutoCommit(false);
			
			stmt.setString(1, p.getNomeCategoria());
			
			if (p.getIdCategoria() != null) {
				stmt.setInt(2, p.getIdCategoria());
			}
			
			// Retorna quantos registros foram afetados
			int registrosAfetados = stmt.executeUpdate();
			System.out.println("Registros afetados: " + registrosAfetados);
			
			// Comita os dados no banco
			conexao.commit();
			
			// No caso de inserção, retorna ID gerado
			try (ResultSet rs = stmt.getGeneratedKeys()) {
				if (rs.next()) {
					System.out.println("Chave retornada: " + rs.getInt(1));
				}
			}
		} catch (SQLException e) {
			try {
				conexao.rollback();
				throw new DbException("Transação revertida (rolled back)! " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("ihhh, deu ruim! " + e1.getMessage());
			}
		} 
	}

	@Override
	public boolean excluir(Integer id) {
		conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM Categoria WHERE id_cat=?";

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			conexao.setAutoCommit(false);
			stmt.setInt(1, id);
			int registrosAfetados = stmt.executeUpdate();
			conexao.commit();
			return (registrosAfetados == 1);
		} catch (SQLIntegrityConstraintViolationException e) {
				throw new DbIntegridadeException("Problema de integridade!\n"
											 + "Registro " + id + " não foi excluído!!\n" 
											 + e.getMessage());
		} catch (SQLException e) {
			try {
				conexao.rollback();
				throw new DbException("Transação revertida (rolled back)!\n"
										+ "Registro " + id + " não foi excluído!!\n" 
										+ e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("ihhh, deu ruim! " + e1.getMessage());
			}
		}
	}

	@Override
	public Categoria buscarPorId(Integer id) {
		conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM Categoria WHERE id_cat=?";
		Categoria p = null;

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					p = setaCategoria(rs);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 

		return p;
	}

	@Override
	public List<Categoria> buscarPorNome(String nome) {
		conexao = FabricaConexao.getConexao();
		List<Categoria> lista = new ArrayList<>();
		String sql = "SELECT * FROM Categoria WHERE nome_cat LIKE ?";

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			stmt.setString(1, "%" + nome + "%");
			try (ResultSet rs = stmt.executeQuery()) {  
				while (rs.next()) {
					Categoria p = setaCategoria(rs);
					lista.add(p);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 

		return lista;
	}

	@Override
	public int getNumeroRegistros() {
		conexao = FabricaConexao.getConexao();
		String sql = "SELECT count(*) FROM Categoria";
		int numRegistros = 0;
		
		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
		) {
			if (rs.next()) {
				numRegistros = rs.getInt(1);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 
		
		return numRegistros;
	}
}
