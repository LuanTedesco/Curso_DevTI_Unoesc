package Modulo_2.Exercicios.src.exercicios1106;

import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int num;

    System.out.println("Digite o numero: ");
    num = scan.nextInt();

    num = (num + 1);

    System.out.println("O numero antecessor é " + num);

    scan.close();
  }
}
