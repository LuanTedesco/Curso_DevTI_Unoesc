package polimorfismo.sobreposicaointerface;

public class ContaCNPJ implements Conta {

	@Override
	public void solicitarDocumentos() {
		System.out.println("Solicitar CNPJ");
		
	}

	@Override
	public void calcularTaxa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validarCredito() {
		// TODO Auto-generated method stub
		
	}

}
