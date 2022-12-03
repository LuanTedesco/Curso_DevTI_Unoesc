package model;

import interfaces.ICamareira;
import interfaces.IRecepcionista;

public class Gerente extends Pessoa implements IRecepcionista, ICamareira {
	
	public Gerente() {
		super();
	}

	public Gerente(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public void atender() {
		System.out.println("Atendo os clientes mais ou menos..");
	}
	
	@Override
	public void falarIngles() {
		System.out.println("Falo inglês muito bem!");
	}
	
	@Override
	public String toString() {
		return "Gerente [" + nome + "]";
	}

	@Override
	public void arrumarACama() {
		System.out.println("Também arrumo camas...");
	}

	@Override
	public void limparQuarto() {
		System.out.println("Também limpo quartos...");
	}

	
}
