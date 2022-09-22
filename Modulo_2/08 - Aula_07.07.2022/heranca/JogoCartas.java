package heranca;

public class JogoCartas extends Jogo{
	private String tamanhoCartas;
	private int quantCartas;
	
	public void comprarCarta(){
		System.out.println("Carta comprada!");
	}
	public void descartarCarta() {
		System.out.println("Carta descartada!");
	}
	public void jogarCarta() {
		System.out.println("Carta jogada!");
	}
	
	public void infoJogoCartas() {		
		super.infoJogo();		
		//COMPLEMENTAR
		System.out.println("Tamanho da carta: " + this.getTamanhoCartas());
		System.out.println("Quantidade de Cartas: " + this.getQuantCartas());
	}
	
	public String getTamanhoCartas() {
		return tamanhoCartas;
	}
	public void setTamanhoCartas(String tamanhoCartas) {
		this.tamanhoCartas = tamanhoCartas;
	}
	public int getQuantCartas() {
		return quantCartas;
	}
	public void setQuantCartas(int quantCartas) {
		this.quantCartas = quantCartas;
	}
}
