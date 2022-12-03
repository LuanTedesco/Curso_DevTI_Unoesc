public class TestaReferencia {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Zé", 100);
		Pessoa p2 = p1;
		
		if (p1 == p2) {
			System.out.println("São iguais!\n");
		}
		
		p2.setNome("Ana");
		if (p1 == p2) {
			System.out.println("Pessoas continuam iguais!");
			System.out.println("Nome p1 = " + p1.getNome());
			System.out.println("Nome p2 = " + p2.getNome());
		}
	}
	
}
