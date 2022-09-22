package Modulo_2.exercicios1106.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade3 {

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      ArrayList<Integer> numeros = new ArrayList<>();
      int contador;

      for (contador = 1; contador <= 10; contador++) {
        System.out.print("Digite um n�mero: ");
        numeros.add(scan.nextInt());
      }
      System.out.println(
        "O maior valor da lista �: " + Collections.max(numeros)
      );
      System.out.println(
        "O menor valor da lista �: " + Collections.min(numeros)
      );
    }
  }
}
