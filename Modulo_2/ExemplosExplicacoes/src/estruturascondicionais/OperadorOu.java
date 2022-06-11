package Modulo_2.ExemplosExplicacoes.src.estruturascondicionais;

import java.util.Scanner;

public class OperadorOu {

  public static void main(String[] args) throws Exception {
    String aluno, curso;

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: ");
    aluno = ler.nextLine();
    System.out.println("Digite o nome do curso: ");
    curso = ler.nextLine();

    if (curso.equals("Eng. de Produção") || curso.equals("Eng. Elétrica")) {
      System.out.println("Aluno Aprovado" + aluno);
    } else {
      System.out.println("Aluno Reprovado" + aluno);
    }
    ler.close();
  }
}
