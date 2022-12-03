package personalizada;

public class TestaExcecaoMenorDeIdade {
	
	private static void verificaIdadeEmpregado(int idade) throws MenorDeIdadeException {
		if (idade < 18) {
			throw new MenorDeIdadeException("Empregado não pode ser menor de idade!", idade);
		}
		
		System.out.println("Idade ok! Pessoa tem " + idade + " anos.");
	}

	private static void testaIdadeEmpregado(int idade) {
		try {
			verificaIdadeEmpregado(idade);
		} catch (MenorDeIdadeException e) {
			System.out.println("\nExceção capturada: " + e.getMessage());
			System.out.println("Idade da pessoa: " + e.getIdade() + " anos.\n");
		}
		
	}

	public static void main(String[] args) {
		testaIdadeEmpregado(42);
		testaIdadeEmpregado(17);
		testaIdadeEmpregado(18);
	}

}
