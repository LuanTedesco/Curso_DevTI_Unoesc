package atividade1;

public class Pessoa {

  //atributos
  String nome;
  int idade;

  //construtor
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  //m�todos
  void exibirInfo() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}
