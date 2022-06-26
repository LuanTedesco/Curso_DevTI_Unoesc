package Modulo_2.exercicios1006.src;

import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) throws Exception {
    int num;
    float preco, func, vip;

    Scanner scan = new Scanner(System.in);

    System.out.println("1 - Comum ");
    System.out.println("2 - Funcionário ");
    System.out.println("3 - Vip ");
    System.out.println("Digite numero equivalente: ");
    num = scan.nextInt();
    System.out.println("Digite o valor da compra: ");
    preco = scan.nextFloat();

    switch (num) {
      case 1:
        System.out.println("O preço a pagar é $" + preco);
        break;
      case 2:
        func = (preco * 10 / 100);
        preco = (preco + func);
        System.out.println("O preço a pagar é $" + preco);
        break;
      case 3:
        vip = (preco * 5 / 100);
        preco = (preco + vip);
        System.out.println("O preço a pagar é $" + preco);
        break;
      default:
        System.out.println("Numero inválido");
        break;
    }
    scan.close();
  }
}
