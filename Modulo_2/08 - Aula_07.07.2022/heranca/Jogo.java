package heranca;

public class Jogo {
	//ATRIBUTOS
	private String nome;
	private String distribuidora;
	private int nrJogadores;
	private int faixaEtaria;
	
	//MÉTODOS
	public void infoJogo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Distribuidora: " + this.getDistribuidora());
		System.out.println("Número de Jogadores: " + this.getNrJogadores());
		System.out.println("Faixa Etária: " + this.getFaixaEtaria());
	}
	public void jogar() {
		System.out.println("Você está jogando!");
	}
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	public int getNrJogadores() {
		return nrJogadores;
	}
	public void setNrJogadores(int nrJogadores) {
		this.nrJogadores = nrJogadores;
	}
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
}
