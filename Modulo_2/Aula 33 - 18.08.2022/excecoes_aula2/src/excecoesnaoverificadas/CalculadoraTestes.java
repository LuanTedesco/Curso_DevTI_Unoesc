package excecoesnaoverificadas;

public class CalculadoraTestes {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int soma = 0;
		
		soma = calc.somar(41, 1);
		if (soma == 42) {
			System.out.println("Resultado " + soma + " está correto!");
		} else {
			System.out.println("Problema detectado!");
		}

		// Maior valor inteiro: 2147483647
		// 2147483647 + 1 = 2147483648
		try {
			soma = calc.somar(Integer.MAX_VALUE, 1);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
