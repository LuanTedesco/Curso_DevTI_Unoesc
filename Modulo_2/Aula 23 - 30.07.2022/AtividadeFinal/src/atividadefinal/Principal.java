package atividadefinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<Produto> listaprodutos = new ArrayList<Produto>();

    Produto arroz = new Produto("Arroz", 5.0, 54);
    Produto feijao = new Produto("Feijão", 2.0, 34);
    Produto carne = new Produto("Carne", 10.0, 10);
    Produto ervilha = new Produto("Ervilha", 7.0, 4);

    listaprodutos.add(arroz);
    listaprodutos.add(feijao);
    listaprodutos.add(carne);
    listaprodutos.add(ervilha);

    int opcaoProduto;

    Venda venda = new Venda();
    Pagamento pagamento = new Pagamento();

    do {
      System.out.println("Digite os produtos que deseja comprar: ");
      System.out.println("1 = Arroz");
      System.out.println("2 = Feijão");
      System.out.println("3 = Carne");
      System.out.println("4 = Ervilha");
      System.out.println("0 = Finalizar compra");
      opcaoProduto = scan.nextInt();
      Produto prod = null;

      if (opcaoProduto == 1) {
        prod = arroz;
      } else if (opcaoProduto == 2) {
        prod = feijao;
      } else if (opcaoProduto == 3) {
        prod = carne;
      } else if (opcaoProduto == 4) {
        prod = ervilha;
      }

      if (prod != null) {
        venda.adicionarItemVenda(prod);
      }
    } while (opcaoProduto != 0);

    System.out.println("Digite a forma de pagamento: ");
    System.out.println("1 = Dinheiro ");
    System.out.println("2 = Cheque");
    System.out.println("3 = Cartão ");
    int pag = scan.nextInt();

    venda.visualizarVenda();

    System.out.println("");

    venda.concluirVenda(pagamento);

    scan.close();
  }
}
