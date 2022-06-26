package Modulo_2.exerciciosTarde2506.src.exercicio1;

public class Veiculo {

  int ano;
  String modelo;
  String cor;
  double quilometragem;

  public Veiculo(int ano, String modelo, String cor, double quilometragem) {
    this.ano = ano;
    this.modelo = modelo;
    this.cor = cor;
    this.quilometragem = quilometragem;
  }

  String verificarManutencao() {
    if (quilometragem <= 25.000) {
      return "Tudo OK";
    } else if (quilometragem > 25.000 && quilometragem <= 75.000) {
      return "Realizar revisão parcial";
    } else {
      return "Realizar revisão completa";
    }
  }

  void mudarCor(String cor) {
    this.cor = cor;
  }

  String exibirCor() {
    return this.cor;
  }
}
