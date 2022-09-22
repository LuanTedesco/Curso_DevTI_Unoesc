package Modulo_2.exemplosExplicacoes.src.exemplo;

import java.util.Scanner;

public class OperadoresBasicos {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float num1, num2, soma, sub, mult, div;
    System.out.println("Digite o primeiro numero");
    num1 = ler.nextFloat();
    System.out.println("Digite o segundo numero");
    num2 = ler.nextFloat();

    soma = num1 + num2;
    sub = num1 - num2;
    mult = num1 * num2;
    div = num1 / num2;

    System.out.println("O valor da soma é " + soma);
    System.out.println("O valor da subtração é " + sub);
    System.out.println("O valor da multiplicação é " + mult);
    System.out.println("O valor da divisão é " + div);

    ler.close();
  }
}
