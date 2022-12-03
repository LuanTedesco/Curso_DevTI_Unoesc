package excecoes;

public class SaldoInsuficienteContaCorrenteException extends RuntimeException {
	protected double valor;
	
	public SaldoInsuficienteContaCorrenteException(String mensagem, float valor) {
		super(mensagem + valor);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
