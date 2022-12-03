package polimorfismo.sobreposicaointerface;

public interface Conta {
	
	//também pode ser declarado uma constante
	public double NUMERO = 10;

	public void solicitarDocumentos();
	
	public void calcularTaxa();
	
	public void validarCredito();
	
}
