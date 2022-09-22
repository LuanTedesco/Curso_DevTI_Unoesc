package Modulo_2.exemplosExplicacoes.src.estruturaselecaomultipla;

import java.util.Scanner;

public class CondicionalEscolhaCaso {

  public static void main(String[] args) throws Exception {
    int media;

    Scanner scan = new Scanner(System.in);

    System.out.println("Escolha um numero de 1 a 4: ");
    media = scan.nextInt();

    switch (media) {
      case 1:
        System.out.println("Você escolheu 1");
        break;
      case 2:
        System.out.println("Você escolheu 2");
        break;
      case 3:
        System.out.println("Você escolheu 3");
        break;
      case 4:
        System.out.println("Você escolheu 4");
        break;
      default:
        System.out.println("Opção inválida");
    }
    scan.close();
  }
}
