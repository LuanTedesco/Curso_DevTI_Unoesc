package propagando;

public class Calculadora {
	public static int dividir(int numero1, int numero2) {
		if (numero2 == 0) {
			throw new ArithmeticException("Erro de divisão por zero!");
		}
		
		int resultado = numero1 / numero2;
		
		return resultado;
	}
}
