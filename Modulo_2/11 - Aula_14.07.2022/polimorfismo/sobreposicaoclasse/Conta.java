package polimorfismo.sobreposicaoclasse;

public abstract class Conta {
	
	double taxa;
	
	//obriga a implementa��o do m�todo nas subclasses
	public abstract void solicitarDocumentos();
	
	public void calcularTaxa() {
		taxa = 5;
		System.out.println(taxa);
	}
}
