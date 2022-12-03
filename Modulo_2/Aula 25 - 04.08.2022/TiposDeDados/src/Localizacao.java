import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Localizacao {
	public static void main(String[] args) {
		// O Locale é preciso estar antes do Scanner
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número real (com ponto decimal): ");
		double valor = sc.nextDouble();
		
		System.out.print(NumberFormat.getCurrencyInstance().format(valor));
		System.out.printf(" || %.5f\n\n", valor);
		
		// Padrão alemão
		Locale.setDefault(Locale.GERMANY);	
		sc = new Scanner(System.in);
		
		System.out.print("Digite um número real (com vírgula decimal): ");
		valor = sc.nextDouble();
		
		System.out.print(NumberFormat.getCurrencyInstance().format(valor));
		System.out.printf(" || %.2f\n\n", valor);
		
		// Padrão nacional
		Locale.setDefault(new Locale("pt", "BR"));
		sc = new Scanner(System.in);
		
		System.out.print("Digite um número real (com vírgula decimal): ");
		valor = sc.nextDouble();
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
//		nf.setGroupingUsed(false); // Agrupamento de dígitos
		String resultado = nf.format(valor);
		
		System.out.print(resultado);
		System.out.printf(" || R$ %.2f\n", valor);
		
		sc.close();
	}
}
