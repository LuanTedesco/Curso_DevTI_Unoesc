public class OperacoesNumerosReais {

	public static void main(String[] args) {
		// Divisões											Resultado
		System.out.println("10/3 é igual a " + 10/3);		// 3
		System.out.println("10./3 é igual a " + 10./3);		// 3.3333333333333335
		System.out.println("10/3. é igual a " + 10/3.);		// 3.3333333333333335
		System.out.println("10./3. é igual a " + 10./3.);	// 3.3333333333333335
		
		double n1 = 10;
		double n2 = 3;
		double resultado = n1/n2;
		
		System.out.println("Divisão de 'doubles': " + resultado);	// 3.3333333333333335
	}

}
