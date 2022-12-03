package modelo;

import java.math.BigDecimal;
import java.sql.Date;

public class Produto {
	private Integer idProd;
	private String nomeProd;
	private Date dataCadastro;
	private Integer quantidade;
	private BigDecimal preco;
	
	public Produto() { }

	public Produto(Integer idProd, String nomeProd, Date dataCadastro, Integer quantidade, BigDecimal preco) {
		super();
		this.idProd = idProd;
		this.nomeProd = nomeProd;
		this.dataCadastro = dataCadastro;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getIdProd() { return idProd; }
	public void setIdProd(Integer idProd) { this.idProd = idProd; }

	public String getNomeProd() { return nomeProd; }
	public void setNomeProd(String nomeProd) { this.nomeProd = nomeProd; }

	public Date getDataCadastro() { return dataCadastro; }
	public void setDataCadastro(Date dataCadastro) { this.dataCadastro = dataCadastro; }

	public Integer getQuantidade() { return quantidade; }
	public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

	public BigDecimal getPreco() { return preco; }
	public void setPreco(BigDecimal preco) { this.preco = preco; }

	@Override
	public String toString() {
		return "Produto [idProd=" + idProd + ", nomeProd=" + nomeProd + ", dataCadastro=" + dataCadastro
				+ ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
}
