package problemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Problemas {
	public static void main(String[] args) {
		int[] arranjo = {1, 2, 3};
		System.out.println(arranjo[2]);
		System.out.println(arranjo[3]); 	// Gera a exce��o 'ArrayIndexOutOfBounds'
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		System.out.println(numeros.get(2));
		System.out.println(numeros.get(3));	 // Lan�a a exce��o 'IndexOutOfBounds'
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um n�mero com parte decimal: ");
		double numero = ler.nextDouble();	 // Dependendo do Locale dar� problema com , ou .
											 // gerando a exce��o InputMismatchException
		System.out.println(numero);
		
		numero = Double.parseDouble("10,5"); // Levanta a exce��o NumberFormatException
		
		System.out.println(10/0);			 // Gera a exce��o ArithmeticException
		
		String frase = null;
	    System.out.println(frase.toUpperCase());  // Lan�a a exce��o NullPointerException
	}
}
