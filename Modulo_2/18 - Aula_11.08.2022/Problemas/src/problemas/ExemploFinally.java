package problemas;

import java.util.Scanner;

public class ExemploFinally {

	public static void main(String[] args) {
		final int NUMERADOR = 42;	// Criação de constante com final
		Scanner ler = new Scanner(System.in);
		
		try {
			System.out.print("Digite o denominador: ");
			int denominador = ler.nextInt();
			
			int resultado = NUMERADOR / denominador;
			
			System.out.printf("\nResultado de 42 / %d = %d\n\n", denominador, resultado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fechando o Scanner...");
			ler.close();
		}
		
		System.out.println("Fim do programa!");
	}

}
