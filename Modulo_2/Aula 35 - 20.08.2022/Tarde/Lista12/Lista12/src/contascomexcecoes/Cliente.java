package contascomexcecoes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<ContaCorrente> contas = new ArrayList<>();
	
	public Cliente() { }
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public void setContas(List<ContaCorrente> contas) {
		this.contas = contas;
	}

	public List<ContaCorrente> getContas() {
		return contas;
	}

	public void adicionarConta(ContaCorrente conta) {
		this.contas.add(conta);
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
}
