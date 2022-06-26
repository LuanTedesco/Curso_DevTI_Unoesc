package Modulo_2.exerciciosTarde2506.src.exercicio3;

public class Produto {

  String nome;
  double peso;
  double preco;

  public Produto(String nome, double peso, double preco) {
    this.nome = nome;
    this.peso = peso;
    this.preco = preco;
  }

  void aumentarPreco() {
    System.out.println("Preço atual: " + preco);

    if (preco < 50) {
      preco = preco + (preco * 0.20);
    } else {
      preco = preco - (preco * 0.10);
    }

    System.out.println("Preco com o reajuste: " + preco);
  }
}
