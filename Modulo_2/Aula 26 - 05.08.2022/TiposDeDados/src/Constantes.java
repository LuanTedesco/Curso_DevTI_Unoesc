public class Constantes {
	// Floats literais exigem o sufixo 'f'
	final static float NUMERO = 42.42f;
	
	// Longs exigem o sufixo 'L'
	final static long NUMERO_LONGO = 10_550_430_001L;
	
	final static double PI = 3.14159;
	final boolean STATUS = true;

	public static void main(String[] args) {
		System.out.println(Constantes.NUMERO);
		System.out.println(Constantes.NUMERO_LONGO);
		System.out.println(Constantes.PI);

		System.out.println(new Constantes().STATUS);

		// Definição de constantes locais
		final String UNIVERSIDADE = "Unoesc";

		// UNIVERSIDADE = "Unoutra"; // *** ERRO ***

		System.out.println(UNIVERSIDADE);
	}

}
