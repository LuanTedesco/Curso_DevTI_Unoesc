package propagando;

public class Calculadora2 {
	public static int dividir(int numero1, int numero2) {
		if (numero2 == 0) {
			throw new ErroDivisaoPorZeroException("Erro de divisão por zero!", numero1);
		}
		
		int resultado = numero1 / numero2;
		
		return resultado;
	}
}
