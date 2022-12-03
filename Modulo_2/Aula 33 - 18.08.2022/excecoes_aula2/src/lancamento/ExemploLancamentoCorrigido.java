package lancamento;

public class ExemploLancamentoCorrigido {
	public static void main(String[] args) {
		sacar(600);
	}

	private static void sacar(double valor) {
		if (valor > 500) {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		} 
	}
}
