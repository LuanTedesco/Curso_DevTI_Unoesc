package multicatch;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploMulticatch {
	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite um número com parte decimal: ");
			double numero = ler.nextDouble();	 // Dependendo do Locale dará problema com , ou .
												 // gerando a exceção InputMismatchException
			System.out.println(numero);
			
			numero = Double.parseDouble("10,5"); // Levanta a exceção NumberFormatException
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("Entrada/formato de número inválido");
		}
		
		System.out.println("Programa finalizado");
	}
}