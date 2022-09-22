import java.util.Arrays;
import java.util.List;

public class Wrappers {

	public static void main(String[] args) {
		int n1 = 1, n2 = 2, n3 = 3;
		
		List<Integer> numeros = Arrays.asList(n1, n2, n3);
		
		System.out.println("Tipo do primeiro elemento: " + numeros.get(0).getClass());
		
		for (Integer numero : numeros) {
			System.out.print(numero + " ");
		}
	}

}