package Modulo_2.exercicios1006.src;

import java.util.Scanner;

public class Exercicio4 {

  static double volume, raio;

  public static double volume(double x) {
    double aux, r;

    aux = 3;

    r = Math.pow(x, aux);

    return aux = 4 / 3 * 3.14 * r;
  }

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o raio da esfera: ");
    raio = scan.nextDouble();

    volume = volume(raio);
    System.out.println(volume);

    scan.close();
  }
}
