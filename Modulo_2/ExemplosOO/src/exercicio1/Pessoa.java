package Modulo_2.ExemplosOO.src.exercicio1;

public class Pessoa {

  //atributos
  String nome;
  int idade;

  //construtor
  public Pessoa(String nome, int idade) {
    super();
    this.nome = nome;
    this.idade = idade;
  }

  //métodos
  void exibirInfo() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}
