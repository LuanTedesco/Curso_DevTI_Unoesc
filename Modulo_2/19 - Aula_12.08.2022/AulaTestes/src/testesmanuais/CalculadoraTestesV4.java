package testesmanuais;

public class CalculadoraTestesV4 {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int soma = 0;

		soma = calc.somar(41, 1);
		if (soma == 42) {
			System.out.println("Resultado " + soma + " está correto!");
		} else {
			System.out.println("Problema detectado!");
		}

		soma = calc.somar(10, 0);
		if (soma == 10) {
			System.out.println("Resultado " + soma + " está correto!");
		} else {
			System.out.println("Problema detectado!");
		}

		soma = calc.somar(5, -5);
		if (soma == 0) {
			System.out.println("Resultado " + soma + " está correto!");
		} else {
			System.out.println("Problema detectado!");
		}

		soma = calc.somar(-2, -3);
		if (soma == -5) {
			System.out.println("Resultado " + soma + " está correto!");
		} else {
			System.out.println("Problema detectado!");
		}

		soma = calc.somar(2147483647, 1);
		if (soma == 2147483648L) {
			System.out.println("Resultado " + soma + " está correto!");
		} else {
			System.out.println("Problema detectado!");
		}
	}
}
