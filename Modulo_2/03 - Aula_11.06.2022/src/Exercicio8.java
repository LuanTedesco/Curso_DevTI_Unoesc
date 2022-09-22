package Modulo_2.exercicios1106.src;

import java.util.Scanner;

public class Exercicio8 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a base numero: ");
    double x = scan.nextInt();

    System.out.println("Digite o expoente numero: ");
    double y = scan.nextInt();

    double r = Math.pow(x, y);

    System.out.println("O resultado da função de potencia é: " + r);
    scan.close();
  }
}
