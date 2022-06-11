package Modulo_2.Exercicios.src.exercicios0906;

import java.util.Scanner;

public class Exercicio3 {

  public static void main(String[] args) throws Exception {
    String genero;

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite F ou M: ");
    genero = scan.nextLine();

    if (genero.equals("F")) {
      System.out.println("Você é do sexo Feminino!");
    } else if (genero.equals("M")) {
      System.out.println("Você é do sexo Masculino!");
    } else {
      System.out.println("Letra inválida, digite F ou M");
    }
    scan.close();
  }
}
