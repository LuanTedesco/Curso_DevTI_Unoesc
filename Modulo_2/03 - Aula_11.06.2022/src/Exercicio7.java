package Modulo_2.exercicios1106.src;

import java.util.Scanner;

public class Exercicio7 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    int anos;
    int alturachico, alturaze;

    alturachico = 150;
    alturaze = 110;
    anos = 0;

    while (alturaze <= alturachico) {
      anos++;
      alturaze += 3;
      alturachico += 2;
    }

    System.out.println(
      "O Zé vai demorar " + anos + " ano para chegar na altura do Chico"
    );
    scan.close();
  }
}
