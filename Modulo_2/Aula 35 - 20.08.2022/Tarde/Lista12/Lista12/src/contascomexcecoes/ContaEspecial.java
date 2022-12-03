package contascomexcecoes;

import excecoes.SaldoInsuficienteContaEspecialException;

public class ContaEspecial extends ContaCorrente {
	float limite;
	
	public ContaEspecial() { }
	
	public ContaEspecial(float saldo, float limite) {
		super(saldo);
		this.limite = limite;
	}

	public float getLimite() { return limite; }
	public void setLimite(float limite) { this.limite = limite; }

	@Override
	public void sacar(float valor) {
		if (valor > saldo + limite) {
			throw new SaldoInsuficienteContaEspecialException("Saldo além do limite para sacar o valor de: ", valor);
		}
		
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", saldo=" + saldo + "]";
	}
}
