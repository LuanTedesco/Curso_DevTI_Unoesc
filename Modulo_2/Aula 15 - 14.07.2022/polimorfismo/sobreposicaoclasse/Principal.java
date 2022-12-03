package polimorfismo.sobreposicaoclasse;

public class Principal {
	public static void main(String[] args) {
	
		ContaCPF cpf = new ContaCPF();
		ContaCNPJ cnpj = new ContaCNPJ();
		
		//POLIMORFISMO DE SOBREPOSIÇÃO
		//Não pode realizar alterações nos parâmetros
		//Os métodos não podem coexistir. Um método sobrepõe o outro
		//Implementação na subclasse de um método da superclasse.
		cpf.calcularTaxa();
		cnpj.calcularTaxa();
		
	}
}
