package heranca;

public class JogoTabuleiro extends Jogo {
	//ATRIBUTOS
	private String tamanhoTabuleiro;
	private int quantPecas;
	
	//MÉTODOS
	public void setupTabuleiro() {
		System.out.println("Tabuleiro montado!");
	}
	public void moverPeca() {
		System.out.println("Peça movimentada!");
	}
	public void infoJogoTabuleiro() {		
		super.infoJogo();		
		//COMPLEMENTAR
		System.out.println("Tamanho do Tabuleiro: " + this.getTamanhoTabuleiro());
		System.out.println("Quantidade de Peças: " + this.getQuantPecas());
	}
	
	//GETTERS E SETTERS
	public String getTamanhoTabuleiro() {
		return tamanhoTabuleiro;
	}
	public void setTamanhoTabuleiro(String tamanhoTabuleiro) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
	}
	public int getQuantPecas() {
		return quantPecas;
	}
	public void setQuantPecas(int quantPecas) {
		this.quantPecas = quantPecas;
	}
}
