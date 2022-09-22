package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.FabricaConexao;
import modelo.Produto;

public class ProdutoDAO implements IProdutoDAO {
	private Connection conexao;

	@Override
	public List<Produto> listarTodos() {
		conexao = FabricaConexao.getConexao();
		List<Produto> lista = new ArrayList<>();
				
		try {
			String sql = "SELECT * FROM produto";
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
				
				p.setIdProd(rs.getInt("id_prod"));
				p.setNomeProd(rs.getString("nome_prod"));
				p.setDataCadastro(rs.getDate("data_cadastro"));
				p.setQuantidade(rs.getInt("quantidade"));
				p.setPreco(rs.getBigDecimal("preco"));
				
				lista.add(p);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
		
		return lista;
	}
	
	@Override
	public Produto buscarPorId(Integer id) { 
		conexao = FabricaConexao.getConexao();
		
		Produto p = null;
		
		try {
			String sql = "SELECT * FROM produto WHERE id_prod=?";
			
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				p = new Produto();
				
				p.setIdProd(rs.getInt("id_prod"));
				p.setNomeProd(rs.getString("nome_prod"));
				p.setDataCadastro(rs.getDate("data_cadastro"));
				p.setQuantidade(rs.getInt("quantidade"));
				p.setPreco(rs.getBigDecimal("preco"));	
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
		
		return p;
	}
	
	@Override
	public void adicionar(Produto p) {
		conexao = FabricaConexao.getConexao();
		
		try {
			String sql = "INSERT INTO produto (nome_prod, data_cadastro, quantidade, preco) "
						 + "VALUES (?, ?, ?, ?);";

			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1, p.getNomeProd());
			stmt.setDate(2, p.getDataCadastro());
			stmt.setInt(3, p.getQuantidade());
			stmt.setBigDecimal(4, p.getPreco());
			
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
	}

	@Override
	public void alterar(Produto p) {
		conexao = FabricaConexao.getConexao();
		
		try {
			String sql = "UPDATE produto SET nome_prod=?, data_cadastro=?, quantidade=?, preco=? " + 
						 "WHERE id_prod=?";
		
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setString(1, p.getNomeProd());
			stmt.setDate(2, p.getDataCadastro());
			stmt.setInt(3, p.getQuantidade());
			stmt.setBigDecimal(4, p.getPreco());
			
			stmt.setInt(5, p.getIdProd());
			
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
	}

	@Override
	public void excluir(Integer id) {
		conexao = FabricaConexao.getConexao();
		
		try {
			String sql = "DELETE FROM produto WHERE id_prod=?";
			
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
	}
}
