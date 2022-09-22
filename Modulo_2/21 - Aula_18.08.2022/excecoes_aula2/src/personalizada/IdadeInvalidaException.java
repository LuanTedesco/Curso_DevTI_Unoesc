package personalizada;

public class IdadeInvalidaException extends Exception {
	private int idade;
	
	public IdadeInvalidaException(String mensagem, int idade) {
		super(mensagem);
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
}
