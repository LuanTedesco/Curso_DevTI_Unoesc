package contascomexcecoes;

import excecoes.SaldoInsuficienteContaCorrenteException;

public class ContaCorrente {
	protected float saldo;
	
	public ContaCorrente() { }
	
	public ContaCorrente(float saldo) {
		super();
		this.saldo = saldo;
	}

	public float getSaldo() { return saldo; }
	public void setSaldo(float saldo) { this.saldo = saldo; }

	public void depositar(float valor) {
		saldo += valor;
	}
	
	public void sacar(float valor) {
		if (valor > saldo) {
			throw new SaldoInsuficienteContaCorrenteException("Saldo insuficiente para sacar o valor de: ", valor);
		}
		
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}
}
