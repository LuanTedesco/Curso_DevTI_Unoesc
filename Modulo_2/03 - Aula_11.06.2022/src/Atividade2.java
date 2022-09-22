package Modulo_2.exercicios1106.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      ArrayList<Integer> numeros = new ArrayList<>();
      ArrayList<Integer> numeros2 = new ArrayList<>();
      ArrayList<Integer> numeros3 = new ArrayList<>();
      int contador;

      for (contador = 1; contador <= 5; contador++) {
        System.out.print("Digite um n�mero: ");
        numeros.add(scan.nextInt());
      }
      for (contador = 1; contador <= 5; contador++) {
        System.out.print("Digite um n�mero: ");
        numeros2.add(scan.nextInt());
      }
      for (contador = 0; contador < numeros.size(); contador++) {
        numeros3.add(numeros.get(contador) + numeros2.get(contador));
      }
      numeros.forEach(
        numero -> {
          System.out.print(numero + " ");
        }
      );
      System.out.println("");
      numeros2.forEach(
        numero -> {
          System.out.print(numero + " ");
        }
      );
      System.out.println("");
      numeros3.forEach(
        numero -> {
          System.out.print(numero + " ");
        }
      );
      scan.close();
    }
  }
}
