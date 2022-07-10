package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio2;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Imovel casaImovel = new Imovel("Tv Luis Delfino", 500000);

    System.out.println("1 - Novo");
    System.out.println("2 - Velho");
    System.out.println("Digite se o imovel é velho ou novo: ");
    int opcao = scan.nextInt();

    if (opcao == 1) {
      Novo ImovelNovo = new Novo(Imovel.getEndereco(), Imovel.getPreco(), 20);
      ImovelNovo.calcAdicional();
      System.out.println(ImovelNovo.toString());
    } else if (opcao == 2) {
      Velho ImovelVelho = new Velho(
        Imovel.getEndereco(),
        Imovel.getPreco(),
        20
      );
      ImovelVelho.calcDesconto();
      System.out.println(ImovelVelho.toString());
    }
    scan.close();
  }
}
