package dominio;

import excecoes.LeilaoSemLanceException;

public class Avaliador {
	private double maiorLance = Double.NEGATIVE_INFINITY;
	private double menorLance = Double.POSITIVE_INFINITY;

	public void avalia(Leilao leilao) {
		if (leilao.getLances().size() == 0) {
			throw new LeilaoSemLanceException("Não se pode avaliar os lances de um leilão sem lances");
		}
		
		for (Lance lance : leilao.getLances()) {
			if (lance.getValor() > maiorLance) {
				maiorLance = lance.getValor();
			}

			if (lance.getValor() < menorLance) {
				menorLance = lance.getValor();
			}
		}
	}

	public double getMaiorLance() {
		return maiorLance;
	}

	public double getMenorLance() {
		return menorLance;
	}
}
