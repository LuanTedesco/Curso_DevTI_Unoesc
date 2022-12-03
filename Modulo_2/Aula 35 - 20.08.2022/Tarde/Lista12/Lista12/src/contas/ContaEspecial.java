package contas;

public class ContaEspecial extends ContaCorrente {
	float limite;
	
	public ContaEspecial() { }
	
	public ContaEspecial(float saldo, float limite) {
		super(saldo);
		this.limite = limite;
	}

	public float getLimite() { return limite; }
	public void setLimite(float limite) { this.limite = limite; }

	public boolean sacar(float valor) {
		if (valor > saldo + limite) {
			return false;
		}
		
		saldo -= valor;
		return true;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", saldo=" + saldo + "]";
	}
}
