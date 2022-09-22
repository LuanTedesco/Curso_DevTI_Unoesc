package dominio;

public class Avaliador {

  private double maiorLance = Double.NEGATIVE_INFINITY;
  private double menorLance = Double.POSITIVE_INFINITY;

  public void avalia(Leilao leilao) {
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
