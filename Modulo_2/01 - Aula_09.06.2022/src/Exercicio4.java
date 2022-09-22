package Modulo_2.exercicios0906.src;

import java.util.Scanner;

public class Exercicio4 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    float nota;

    System.out.println("Digite a nota: ");
    nota = scan.nextFloat();

    if (nota >= 7 && nota <= 10) {
      System.out.println("Aluno Aprovado!!");
    } else if (nota < 7 && nota >= 5) {
      System.out.println("Aluno em Exame!!");
    } else if (nota < 5) {
      System.out.println("Aluno Reprovado :(");
    } else {
      System.out.println("Nota inválida");
    }
    scan.close();
  }
}
