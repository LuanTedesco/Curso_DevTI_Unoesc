package excecoes;

public class SaldoInsuficienteContaEspecialException extends SaldoInsuficienteContaCorrenteException {
	public SaldoInsuficienteContaEspecialException(String mensagem, float valor) {
		super(mensagem, valor);
	}
}
