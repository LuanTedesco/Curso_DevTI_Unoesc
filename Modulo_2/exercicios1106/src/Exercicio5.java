package Modulo_2.exercicios1106.src;

import java.util.Scanner;

public class Exercicio5 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    int num;

    System.out.println("Digite a idade: ");
    num = scan.nextInt();

    if (num < 16) {
      System.out.println("Não pode votar!");
    } else {
      System.out.println("Apto a votar!");
    }
    scan.close();
  }
}
