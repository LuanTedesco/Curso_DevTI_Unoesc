package polimorfismo.sobreposicaointerface;

public class Principal {
	public static void main(String[] args) {
		ContaCPF cpf = new ContaCPF();
		ContaCNPJ cnpj = new ContaCNPJ();
		
		cpf.solicitarDocumentos();
		cnpj.solicitarDocumentos();
	}

}
