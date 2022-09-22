package multicatch;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploMulticatch {
	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite um n�mero com parte decimal: ");
			double numero = ler.nextDouble();	 // Dependendo do Locale dar� problema com , ou .
												 // gerando a exce��o InputMismatchException
			System.out.println(numero);
			
			numero = Double.parseDouble("10,5"); // Levanta a exce��o NumberFormatException
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("Entrada/formato de n�mero inv�lido");
		}
		
		System.out.println("Programa finalizado");
	}
}