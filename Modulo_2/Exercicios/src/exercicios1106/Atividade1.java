package Modulo_2.Exercicios.src.exercicios1106;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1 {

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      ArrayList<Integer> numeros = new ArrayList<>();
      int contador;

      for (contador = 1; contador <= 5; contador++) {
        System.out.print("Digite um n�mero: ");
        numeros.add(scan.nextInt());
      }
      Collections.sort(numeros);
      numeros.forEach(
        numero -> {
          System.out.print(numero + " ");
        }
      );
      System.out.println("");
      Collections.reverse(numeros);
      numeros.forEach(
        numero -> {
          System.out.print(numero + " ");
        }
      );
      scan.close();
    }
  }
}
