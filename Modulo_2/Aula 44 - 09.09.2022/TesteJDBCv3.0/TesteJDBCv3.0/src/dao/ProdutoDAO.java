package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DbException;
import db.FabricaConexao;
import modelo.Produto;

public class ProdutoDAO implements IProdutoDAO {
	private Connection conexao;

	@Override
	public List<Produto> listarTodos() {
		conexao = FabricaConexao.getConexao();
		List<Produto> lista = new ArrayList<>();
		String sql = "SELECT * FROM produto";

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
		) {
			while (rs.next()) {
				Produto p = setaProduto(rs);
				lista.add(p);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 

		return lista;
	}

	private Produto setaProduto(ResultSet rs) throws SQLException {
		Produto p = new Produto();

		p.setIdProd(rs.getInt("id_prod"));
		p.setNomeProd(rs.getString("nome_prod"));
		p.setDataCadastro(rs.getDate("data_cadastro"));
		p.setQuantidade(rs.getInt("quantidade"));
		p.setPreco(rs.getBigDecimal("preco"));
		
		return p;
	}

	@Override
	public void salvar(Produto p) {
		conexao = FabricaConexao.getConexao();
		String sql;
		
		if (p.getIdProd() == null) {
			sql = "INSERT INTO produto (nome_prod, data_cadastro, quantidade, preco) " 
					+ "VALUES (?, ?, ?, ?);";
		} else {
			sql = "UPDATE produto SET nome_prod=?, data_cadastro=?, quantidade=?, preco=? "
					+ "WHERE id_prod=?";
		}
		
		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql,
													Statement.RETURN_GENERATED_KEYS);
		) {
			conexao.setAutoCommit(false);
			
			stmt.setString(1, p.getNomeProd());
			stmt.setDate(2, p.getDataCadastro());
			stmt.setInt(3, p.getQuantidade());
			stmt.setBigDecimal(4, p.getPreco());
			
			if (p.getIdProd() != null) {
				stmt.setInt(5, p.getIdProd());
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
		String sql = "DELETE FROM produto WHERE id_prod=?";

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			conexao.setAutoCommit(false);
			stmt.setInt(1, id);
			int registrosAfetados = stmt.executeUpdate();
			
			//if (1 == 1) {
			//	throw new SQLException();				
			//}
			
			conexao.commit();
			return (registrosAfetados == 1);
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
	public Produto buscarPorId(Integer id) {
		conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM produto WHERE id_prod=?";
		Produto p = null;

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					p = setaProduto(rs);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 

		return p;
	}

	@Override
	public List<Produto> buscarPorNome(String nome) {
		conexao = FabricaConexao.getConexao();
		List<Produto> lista = new ArrayList<>();
		String sql = "SELECT * FROM produto WHERE nome_prod LIKE ?";

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			stmt.setString(1, "%" + nome + "%");
			try (ResultSet rs = stmt.executeQuery()) {  
				while (rs.next()) {
					Produto p = setaProduto(rs);
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
		String sql = "SELECT count(*) FROM produto";
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
