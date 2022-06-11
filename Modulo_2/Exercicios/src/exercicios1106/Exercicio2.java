package Modulo_2.Exercicios.src.exercicios1106;

import java.util.Scanner;

public class Exercicio2 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int km, litros, consumo;

    System.out.println("Digite a quilômetragem: ");
    km = scan.nextInt();
    System.out.println("Digite o total de combustível: ");
    litros = scan.nextInt();

    consumo = (km / litros);

    System.out.println("O consumo do combvustivel foi de " + consumo);

    scan.close();
  }
}
