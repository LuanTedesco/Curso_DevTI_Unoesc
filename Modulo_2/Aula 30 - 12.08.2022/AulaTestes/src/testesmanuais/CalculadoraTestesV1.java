package testesmanuais;

public class CalculadoraTestesV1 {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int soma = 0;
		
		soma = calc.somar(41, 1);
		System.out.println(soma);
		
		soma = calc.somar(10, 0);
		System.out.println(soma);
		
		soma = calc.somar(5, -5);
		System.out.println(soma);
		
		soma = calc.somar(-2, -3);
		System.out.println(soma);
	}

}
