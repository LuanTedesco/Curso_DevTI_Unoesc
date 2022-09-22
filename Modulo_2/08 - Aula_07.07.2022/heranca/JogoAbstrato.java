package heranca;

public abstract class JogoAbstrato {
	//ATRIBUTOS
	private String nome;
	private String distribuidora;
	private int nrJogadores;
	private int faixaEtaria;
	//MÉTODO ABSTRATO NÃO PODE SER IMPLEMENTADO NA CLASSE MÃE
	//ELE OBRIGA QUE A CLASSE FILHA IMPLEMENTE O MÉTODO
	public abstract void infoJogo();
	//IMPEDE QUE CLASSES FILHAS SOBRESCREVAM O MÉTODO
	public final void jogar() {
		System.out.println("Você está jogando");
	}
}
