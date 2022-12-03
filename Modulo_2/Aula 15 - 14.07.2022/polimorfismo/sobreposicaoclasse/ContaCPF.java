package polimorfismo.sobreposicaoclasse;

public class ContaCPF extends Conta {

	@Override
	public void solicitarDocumentos() {
		System.out.println("Apresentar CPF");
	}
}
