package Modulo_2.exemplosExplicacoes.src.estruturashomogeneas;

import java.util.Scanner;

public class Vetor {

  public static void main(String[] args) throws Exception {
    try (Scanner ler = new Scanner(System.in)) {
      int[] nota = new int[5];
      int contador;

      for (contador = 0; contador <= 4; contador++) {
        System.out.println("Digite a nota " + (contador + 1));
        nota[contador] = ler.nextInt();
      }

      for (contador = 0; contador <= 4; contador++) {
        System.out.println(nota[contador]);
      }
      ler.close();
    }
  }
}
