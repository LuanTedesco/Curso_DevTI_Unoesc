package contas;

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
	
	public boolean sacar(float valor) {
		if (valor > saldo) {
			return false;
		}
		
		saldo -= valor;
		return true;		
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}
}
