package Modulo_2.exerciciosManha2506.src.exercicio2;

public class Aluno {

  //atributos
  String nome;
  int idade;
  double media;

  //construtor
  public Aluno(String nome, int idade, double media) {
    this.nome = nome;
    this.idade = idade;
    this.media = media;
  }

  //metodos
  double calcularMedia(double n1, double n2, double n3) {
    return media = (n1 + n2 + n3) / 3;
  }

  String verificarAprovacao() {
    if (media >= 7 && media <= 10) {
      return "Aprovado";
    } else if (media < 7 && media >= 5) {
      return "Em exame";
    } else if (media < 5 && media >= 0) {
      return "Reprovado";
    } else {
      return "Nota inválida";
    }
  }
}
