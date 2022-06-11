package Modulo_2.Exercicios.src.exercicios1006;

import java.util.Scanner;

public class Exercicio2 {

  public static void main(String[] args) throws Exception {
    int num, contador;

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o numero: ");
    num = scan.nextInt();

    contador = 1;

    while (contador <= 10) {
      System.out.println(num + " x " + contador + " = " + num * contador);
      contador++;
    }
    scan.close();
  }
}
