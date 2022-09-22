package Modulo_2.exemplosExplicacoes.src.estruturascondicionais;

import java.util.Scanner;

public class EstruturaCondicional {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    float numero;
    System.out.println("Digite um numero diferente de 0: ");
    numero = scan.nextFloat();

    if (numero > 0) {
      System.out.println("Este é um numero positivo!");
    } else if (numero < 0) {
      System.out.println("Este é um numero negativo!");
    } else {
      System.out.println("Este é um numero neutro!");
    }
    scan.close();
  }
}
