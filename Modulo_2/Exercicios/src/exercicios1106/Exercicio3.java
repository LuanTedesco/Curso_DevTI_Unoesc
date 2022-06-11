package Modulo_2.Exercicios.src.exercicios1106;

import java.util.Scanner;

public class Exercicio3 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int anos;
    float preco, ncigarros;

    System.out.println("Digite o nº de anos que você fuma: ");
    anos = scan.nextInt();
    System.out.println("Digite o numero de cigarros consumidos por dia: ");
    ncigarros = scan.nextInt();
    System.out.println("Digite o preço da carteira de cigarros: ");
    preco = scan.nextFloat();

    anos = anos * 365;

    preco = preco / 20;

    ncigarros = (ncigarros * preco);

    preco = (ncigarros * anos);

    System.out.println("Você já gastou $" + preco + " com cigarro");
    System.out.println("Cuidado você vai morrer!!");

    scan.close();
  }
}
