package Modulo_2.Exercicios.src.exercicios1006;

import java.util.Scanner;

public class Exercicio5 {

  static int num1, num2, num3, num4, num5;

  public static void maiormenor() {
    if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
      System.out.println("O numero " + num1 + " é o maior");
    } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
      System.out.println("O numero " + num2 + " é o maior");
    } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
      System.out.println("O numero " + num3 + " é o maior");
    } else if (num4 > num1 && num4 > num3 && num4 > num2 && num4 > num5) {
      System.out.println("O numero " + num4 + " é o maior");
    } else if (num5 > num1 && num5 > num3 && num5 > num4 && num5 > num2) {
      System.out.println("O numero " + num5 + " é o maior");
    } else {
      System.out.println("Opção Inválida");
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    num1 = scan.nextInt();
    System.out.println("Digite o segundo numero: ");
    num2 = scan.nextInt();
    System.out.println("Digite o terceiro numero: ");
    num3 = scan.nextInt();
    System.out.println("Digite o quarto numero: ");
    num4 = scan.nextInt();
    System.out.println("Digite o quinto numero: ");
    num5 = scan.nextInt();

    maiormenor();

    scan.close();
  }
}
