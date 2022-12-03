package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DbException;
import db.FabricaConexao;
import modelo.Categoria;
import modelo.Produto;

public class ProdutoDAO implements IProdutoDAO {
	private Connection conexao;

	public ProdutoDAO() {
		conexao = FabricaConexao.getConexao();
	}
	
	public void criarTabela() {
		String sql = """
					CREATE TABLE IF NOT EXISTS produto (
						id_prod INT AUTO_INCREMENT PRIMARY KEY,
						nome_prod VARCHAR(40) NOT NULL,
					    data_cadastro DATE NOT NULL,
					    quantidade INT NOT NULL CHECK(quantidade>=0),
					    preco DECIMAL(12, 2) NOT NULL CHECK(preco>=0),
					    id_cat INT NOT NULL,
					    FOREIGN KEY (id_cat) REFERENCES categoria (id_cat)
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
	public List<Produto> listarTodos() {
		List<Produto> lista = new ArrayList<>();
		String sql = "SELECT * FROM produto p " + 
			 	 	 "INNER JOIN categoria c USING(id_cat) " + 
			 	 	 "ORDER BY id_prod";

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
		) {
			Map<Integer, Categoria> categorias = new HashMap<>();
			
			while (rs.next()) {
				Categoria c = categorias.get(rs.getInt("id_cat")); 
				if (c == null) {
					c = setaCategoria(rs);
					categorias.put(rs.getInt("id_cat"), c);
				}
				
				Produto p = setaProduto(rs, c);
				lista.add(p);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 

		return lista;
	}
	
	@Override
	public List<Produto> listarPorCategoria(Categoria cat) {
		String sql = "SELECT p.*, c.nome_cat FROM produto p " + 
				 	 "INNER JOIN categoria c USING(id_cat) " + 
				 	 "WHERE id_cat=?";
		List<Produto> lista = new ArrayList<>();
	
		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			stmt.setInt(1, cat.getIdCategoria());
			try (ResultSet rs = stmt.executeQuery()) {
				Map<Integer, Categoria> categorias = new HashMap<>();
				
				while (rs.next()) {
					Categoria c = categorias.get(rs.getInt("id_cat")); 
					if (c == null) {
						c = setaCategoria(rs);
						categorias.put(rs.getInt("id_cat"), c);
					}
					
					Produto p = setaProduto(rs, c);
					
					lista.add(p);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 
	
		return lista;
	}

	@Override
	public Produto buscarPorId(Integer id) {
		String sql = "SELECT p.*, c.nome_cat FROM produto p " + 
					 "INNER JOIN categoria c USING(id_cat) " + 
					 "WHERE id_prod=?";
		Produto p = null;

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					Categoria c = setaCategoria(rs); 
					p = setaProduto(rs, c);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} 

		return p;
	}

	@Override
	public List<Produto> buscarPorNome(String nome) {
		List<Produto> lista = new ArrayList<>();
		String sql = "SELECT * FROM produto " + 
					 "INNER JOIN categoria c USING(id_cat) " + 
					 "WHERE nome_prod LIKE ?";

		try (
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
		) {
			stmt.setString(1, "%" + nome + "%");
			try (ResultSet rs = stmt.executeQuery()) {
				Map<Integer, Categoria> categorias = new HashMap<>();
				while (rs.next()) {
					Categoria c = categorias.get(rs.getInt("id_cat")); 
					if (c == null) {
						c = setaCategoria(rs);
						categorias.put(rs.getInt("id_cat"), c);
					}
					Produto p = setaProduto(rs, c);
					lista.add(p);
				}
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

	private Produto setaProduto(ResultSet rs, Categoria categoria) throws SQLException {
		Produto p = new Produto();

		p.setIdProd(rs.getInt("id_prod"));
		p.setNomeProd(rs.getString("nome_prod"));
		p.setDataCadastro(rs.getDate("data_cadastro"));
		p.setQuantidade(rs.getInt("quantidade"));
		p.setPreco(rs.getBigDecimal("preco"));
		p.setCategoria(categoria);
		
		return p;
	}

	@Override
	public void salvar(Produto p) {
		String sql;
		
		if (p.getIdProd() == null) {
			sql = "INSERT INTO produto (nome_prod, data_cadastro, quantidade, preco, id_cat) " 
					+ "VALUES (?, ?, ?, ?, ?);";
		} else {
			sql = "UPDATE produto SET nome_prod=?, data_cadastro=?, quantidade=?, preco=?, id_cat=? "
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
			stmt.setInt(5, p.getCategoria().getIdCategoria());
			
			if (p.getIdProd() != null) {
				stmt.setInt(6, p.getIdProd());
			}
			
			// Retorna quantos registros foram afetados
			int registrosAfetados = stmt.executeUpdate();
			System.out.println("Registros afetados: " + registrosAfetados);
			
			if (registrosAfetados > 0) {
				// Comita os dados no banco
				conexao.commit();
				
				// No caso de inserção, retorna ID gerado
				try (ResultSet rs = stmt.getGeneratedKeys()) {
					if (rs.next()) {
						System.out.println("Chave retornada: " + rs.getInt(1));
					}
				}
			} else {
				throw new DbException("Erro inesperado! Nenhum registro afetado!");
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
	public int getNumeroRegistros() {
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
