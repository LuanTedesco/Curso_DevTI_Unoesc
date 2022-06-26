package Modulo_2.exerciciosTarde2506.src.exercicio2;

import java.util.Scanner;

public class PrincipalCadernoAnotacoes {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int opcao;
    opcao = 0;

    CadernoAnotacoes caderno = new CadernoAnotacoes();

    do {
      System.out.println("1 – Adicionar Anotação");
      System.out.println("2 – Visualizar Caderno de Anotações");
      System.out.println("3 – Apagar Anotações");
      System.out.println("4 – Sair");
      System.out.println("Digite a opção desejada: ");
      opcao = scan.nextInt();

      if (opcao == 1) {
        System.out.println("Digite a anotação: ");
        String anotacao = scan.next();
        caderno.adicionarAnotacao(anotacao);
      } else if (opcao == 2) {
        caderno.visualizarAnotacoes();
      } else if (opcao == 3) {
        caderno.apagarAnotacoes();
      } else if (opcao == 4) {
        System.out.println("Finalizando aplicação");
      } else {
        System.out.println("Opção inválida");
      }
    } while (opcao != 4);
    scan.close();
  }
}
