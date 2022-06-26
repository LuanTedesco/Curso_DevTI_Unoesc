package Modulo_2.exercicios1006.src;

import java.util.Scanner;

public class Exercicio3 {

  public static void main(String[] args) throws Exception {
    int num, contador, valor;
    float media;

    Scanner scan = new Scanner(System.in);

    contador = 1;
    valor = 0;
    num = 1;

    while (num != 0) {
      System.out.println("Digite o " + contador + "º numero: ");
      num = scan.nextInt();
      valor = valor + num;
      contador++;
    }

    media = valor / contador;

    System.out.println("A media dos numeros digitados é: " + media);

    System.out.println(valor);

    System.out.println(contador);

    scan.close();
  }
}
