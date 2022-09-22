package contascomexcecoes;

import excecoes.SaldoInsuficienteContaCorrenteException;
import excecoes.SaldoInsuficienteContaEspecialException;

public class ContasJava {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Fulano");
		
		cliente.adicionarConta(new ContaCorrente(5000));
		cliente.adicionarConta(new ContaEspecial(5000, 2000));
		
		try {
			// Conta corrente
			cliente.getContas().get(0).sacar(6000);	
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo: " + cliente.getContas().get(0));
		} catch (SaldoInsuficienteContaCorrenteException e) {
			System.out.println(e.getMessage() + "\nTente sacar um valor menor!");	
		}
		
		System.out.println();
		
		try {
			// Conta especial
			cliente.getContas().get(1).sacar(8000);		
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Saldo: " + cliente.getContas().get(1));
		} catch (SaldoInsuficienteContaEspecialException e) {
			System.out.println(e.getMessage() + "\nTente sacar um valor menor!");
		}
	}
}
