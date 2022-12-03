package principal;

import dominio.Avaliador;
import dominio.Leilao;
import excecoes.LeilaoSemLanceException;

public class Principal {
	
	public static void main(String[] args) {
		Leilao leilao = new Leilao("PlayStation 5");

		Avaliador avaliador = new Avaliador();
		try {
			avaliador.avalia(leilao);	
			System.out.println(avaliador.getMaiorLance());
			System.out.println(avaliador.getMenorLance());
		} catch (LeilaoSemLanceException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
