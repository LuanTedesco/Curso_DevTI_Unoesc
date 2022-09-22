package contas;

public class ContasJava {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Fulano");
		boolean statusOperacao;
		
		cliente.adicionarConta(new ContaCorrente(5000));
		cliente.adicionarConta(new ContaEspecial(5000, 2000));
			
		statusOperacao = cliente.getContas().get(0).sacar(4000);
		if (statusOperacao) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo: " + cliente.getContas().get(0));
		} else {
			System.out.println("Problema: Não foi possível realizar saque da conta corrente!" + 
						       "\nTente sacar um valor menor!");
		}
		
		System.out.println();
		
		statusOperacao = cliente.getContas().get(1).sacar(8000);
		if (statusOperacao) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo: " + cliente.getContas().get(1));
		} else {
			System.out.println("Problema: Não foi possível realizar saque da conta especial!" + 
					           "\nTente sacar um valor menor!");
		}
	}
}
