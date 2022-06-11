package Modulo_2.ExemplosExplicacoes.src.estruturascondicionais;

import java.util.Scanner;

public class OperadorE {

  public static void main(String[] args) throws Exception {
    String aluno;
    float media, frequencia;
    Scanner ler = new Scanner(System.in);
    System.out.println("Qual é o numero do aluno?");
    aluno = ler.nextLine();
    System.out.println("Qual é a média do aluno?");
    media = ler.nextFloat();
    System.out.println("Qual é a frequencia do aluno?");
    frequencia = ler.nextFloat();

    if (media >= 7 && frequencia >= 75) {
      System.out.println(aluno + " Você está aprovado!");
    } else {
      System.out.println(aluno + " Você está reprovado!");
    }
    ler.close();
  }
}
