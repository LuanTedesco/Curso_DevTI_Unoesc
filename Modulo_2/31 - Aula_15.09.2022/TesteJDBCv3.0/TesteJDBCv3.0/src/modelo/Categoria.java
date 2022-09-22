package modelo;

public class Categoria {
	private Integer idCategoria;
	private String nomeCategoria;
	
	public Categoria() { }
	
	public Categoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + 
				", nomeCategoria=" + nomeCategoria + "]";
	}
}
