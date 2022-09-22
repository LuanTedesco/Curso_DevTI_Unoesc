public class Casting {

	public static void main(String[] args) {
		// Casting em literais
		System.out.println("Divisão sem casting: " + 10/3);
		System.out.println("Divisão sem casting: " + (float) 10/3);
		System.out.println();
		
		// Casting em variáveis
		int n1 = 10, n2 = 3;
		double resultado1 = n1 / n2;
		double resultado2 = (double) n1 / n2;
		System.out.println("Sem casting: " + resultado1);
		System.out.println("Com casting: " + resultado2);
		
		// Casting de tipos 'maiores' para 'menores'
		double a = 10.5;
//		int b = a;	// Erro
		int b = (int) a;
		System.out.printf("\nDe double (%.2f) para int (%d)", a, b);
	}

}
