package Modulo_2.exerciciosTarde2506.src.exercicio1;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Veiculo veiculo1 = new Veiculo(1990, "GT", "Preto", 40.000);

    System.out.println(veiculo1.verificarManutencao());
    System.out.println(veiculo1.exibirCor());
    veiculo1.mudarCor("Branco");
    System.out.println(veiculo1.exibirCor());

    scan.close();
  }
}
