package polimorfismo.sobreposicaointerface;

public class ContaCPF implements Conta{

	@Override
	public void solicitarDocumentos() {
		System.out.println("Solicitar CPF");
		
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
