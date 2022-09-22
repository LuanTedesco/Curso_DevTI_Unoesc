package Modulo_2.exercicios1106.src;

import java.util.Scanner;

public class Exercicio4 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    int num1, num2;

    System.out.println("Digite o primeiro numero: ");
    num1 = scan.nextInt();

    System.out.println("Digite o segundo numero: ");
    num2 = scan.nextInt();

    if (num1 > num2) {
      System.out.println("O numero " + num1 + " é maior que o numero " + num2);
    } else if (num2 > num1) {
      System.out.println("O numero " + num2 + " é maior que o numero " + num1);
    } else {
      System.out.println("Opção inválida");
    }

    scan.close();
  }
}
