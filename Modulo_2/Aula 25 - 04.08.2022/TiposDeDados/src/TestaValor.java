public class TestaValor {

	public static void main(String[] args) {
		int n1 = 42;
		int n2 = n1;
		
		if (n1 == n2) {
			System.out.printf("n1=%d, n2=%d - variáveis possuem o mesmo valor!\n", n1, n2);
		}
		
		n2 = 666;
		if (n1 != n2) {
			System.out.printf("n1=%d, n2=%d - variáveis não possuem o mesmo valor!\n", n1, n2);
		}
	}

}
