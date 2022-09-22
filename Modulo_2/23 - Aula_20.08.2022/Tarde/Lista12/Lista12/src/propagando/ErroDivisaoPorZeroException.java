package propagando;

public class ErroDivisaoPorZeroException extends ArithmeticException {
	private int numerador;
	
	public ErroDivisaoPorZeroException(String mensagem, int numerador) {
		super(mensagem);
		this.numerador = numerador;
	}

	public int getNumerador() {
		return numerador;
	} 
}
