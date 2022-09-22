package bigdecimal;

public class ProblemasFloatDouble {

	public static void main(String[] args) {
		// Problema com números em ponto flutuante
		double a = 0.1;
		double b = 0.2;
		double c = a + b;

		if (c != 0.3) {
			System.out.println("Deu ruim: 0,1 + 0,2 != " + c);
		}

		// Problema com números em ponto flutuante
		float num1 = 0.2f;
		double num2 = 0.2;

		System.out.println("float num1.: " + num1);
		System.out.println("double num2: " + num2);

		if (num1 == num2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}

		double valor = 0.2;
		double total = 0.0;

		for (int i = 0; i < 10; i++) {
			total += valor;
		}

		System.out.println(total);
	}

}
