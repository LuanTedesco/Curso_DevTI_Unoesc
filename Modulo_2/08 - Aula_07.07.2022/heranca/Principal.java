package heranca;

public class Principal {

	public static void main(String[] args) {
		JogoTabuleiro tabuleiro = new JogoTabuleiro();
		JogoCartas carta = new JogoCartas();
		JogoDados dado = new JogoDados();
		JogoFinal jf = new JogoFinal();
		
		tabuleiro.setNome("Catan");
		tabuleiro.setDistribuidora("Devir");
		tabuleiro.setNrJogadores(4);
		tabuleiro.setFaixaEtaria(10);
		tabuleiro.setTamanhoTabuleiro("40x40");
		tabuleiro.setQuantPecas(60);
		//MÉTODOS DA SUPERCLASSE
		tabuleiro.infoJogoTabuleiro();
		tabuleiro.jogar();
		//MÉTODOS DA SUBCLASSE
		tabuleiro.setupTabuleiro();
		tabuleiro.moverPeca();
		
		carta.setNome("Taco Gato");
		carta.setDistribuidora("Paper Games");
		carta.setNrJogadores(8);
		carta.setFaixaEtaria(6);
		carta.setTamanhoCartas("Padrão");
		carta.setQuantCartas(60);
		carta.infoJogoCartas();
		carta.comprarCarta();
		carta.descartarCarta();
		carta.jogarCarta();
		
		dado.setNome("Bang Dice Game");
		dado.setDistribuidora("Galápagos Jogos");
		dado.setNrJogadores(8);
		dado.setFaixaEtaria(12);
		dado.setTipoDado("d6");
		dado.setQuantDados(6);
		dado.infoJogoDados();
		dado.arremessarDado();
		
	}

}
