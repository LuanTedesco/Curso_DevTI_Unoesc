package personalizada;

public class MenorDeIdadeException extends Exception {
	private int idade;
	
	public MenorDeIdadeException(String mensagem, int idade) {
		super(mensagem);
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
}
