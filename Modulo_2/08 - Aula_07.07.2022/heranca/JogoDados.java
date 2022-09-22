package heranca;

public class JogoDados extends Jogo {
	private String tipoDado;
	private int quantDados;
	
	public void arremessarDado() {
		System.out.println("Dado arremessado!");
	}
	
	public void infoJogoDados() {		
		super.infoJogo();		
		//COMPLEMENTAR
		System.out.println("Tipo de Dado: " + this.getTipoDado());
		System.out.println("Quantidade de Dados: " + this.getQuantDados());
	}
	
	public String getTipoDado() {
		return tipoDado;
	}
	public void setTipoDado(String tipoDado) {
		this.tipoDado = tipoDado;
	}
	public int getQuantDados() {
		return quantDados;
	}
	public void setQuantDados(int quantDados) {
		this.quantDados = quantDados;
	}
}
