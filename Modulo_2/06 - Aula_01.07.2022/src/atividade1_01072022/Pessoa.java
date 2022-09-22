package Modulo_2.exemplos0107.src.atividade1_01072022;

public class Pessoa {
	private String nome;
	private int anoNasc;
	private double altura;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, int anoNasc, double altura) {
		super();
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", anoNasc=" + anoNasc + ", altura=" + altura + "]";
	}
	
	public void exibirPessoa() {
		System.out.println(nome);
		System.out.println(anoNasc);
		System.out.println(altura);
	}
	
	public void calcularIdade() {
		int idade;
		idade = 2022 - anoNasc;
		System.out.println("A idade de "+nome+" � de: "+idade);
	}
	
	
}
