package heranca;

public abstract class JogoAbstrato {
	//ATRIBUTOS
	private String nome;
	private String distribuidora;
	private int nrJogadores;
	private int faixaEtaria;
	//M�TODO ABSTRATO N�O PODE SER IMPLEMENTADO NA CLASSE M�E
	//ELE OBRIGA QUE A CLASSE FILHA IMPLEMENTE O M�TODO
	public abstract void infoJogo();
	//IMPEDE QUE CLASSES FILHAS SOBRESCREVAM O M�TODO
	public final void jogar() {
		System.out.println("Voc� est� jogando");
	}
}
