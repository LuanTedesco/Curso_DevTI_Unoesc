package exercicio5Tarde;

import java.util.ArrayList;

public class CadernoAnotacoes {

  ArrayList<String> listaAnotacoes = new ArrayList<String>();

  void adicionarAnotacao(String anotacao) {
    listaAnotacoes.add(anotacao);
  }

  void visualizarAnotacoes() {
    System.out.println(listaAnotacoes);
  }

  void apagarAnotacoes() {
    listaAnotacoes.clear();
  }
}
