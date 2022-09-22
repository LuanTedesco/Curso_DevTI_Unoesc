package polimorfismo.sobreposicaoclasse;

public class ContaCNPJ extends Conta{

	@Override
	public void solicitarDocumentos() {
		System.out.println("Apresentar CNPJ");
		
	}
	@Override
	public void calcularTaxa() {
		super.taxa = 10;
		System.out.println(super.taxa);
	}

}
