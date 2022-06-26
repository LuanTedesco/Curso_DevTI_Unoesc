package Modulo_2.exercicios1106.src;

import java.util.Scanner;

public class Exercicio6 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    int idade;

    System.out.println("Digite a idade: ");
    idade = scan.nextInt();

    if (idade >= 18 && idade <= 67) {
      System.out.println("Você pode doar sangue!");
    } else {
      System.out.println("Você não pode doar sangue");
    }
    scan.close();
  }
}
