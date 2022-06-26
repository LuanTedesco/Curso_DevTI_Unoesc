package Modulo_2.exerciciosManha2506.src.exercicio2;

import java.util.Scanner;

public class Principal2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double n1;
    double n2;
    double n3;
    double media;
    String aprovacao;

    System.out.println("Digite a primeira nota: ");
    n1 = scan.nextDouble();
    System.out.println("Digite a segunda nota: ");
    n2 = scan.nextDouble();
    System.out.println("Digite a terceira nota: ");
    n3 = scan.nextDouble();

    media = 0;
    Aluno aluno1 = new Aluno("Luan", 21, media);

    media = aluno1.calcularMedia(n1, n2, n3);

    System.out.println("A media do aluno é: " + media);

    aprovacao = aluno1.verificarAprovacao();

    System.out.println("O Aluno está: " + aprovacao);

    scan.close();
  }
}
