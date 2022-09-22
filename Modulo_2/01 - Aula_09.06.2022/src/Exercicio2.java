package Modulo_2.exercicios0906.src;

import java.util.Scanner;

public class Exercicio2 {

  public static void main(String[] args) throws Exception {
    float cfabrica, imp;

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o custo de fábrica: ");
    cfabrica = scan.nextFloat();

    imp = (cfabrica * 28 / 100);

    cfabrica = imp + cfabrica;

    imp = (cfabrica * 45 / 100);

    cfabrica = imp + cfabrica;

    System.out.println("O custo final é de $" + cfabrica);
    scan.close();
  }
}
