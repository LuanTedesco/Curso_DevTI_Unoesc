package Modulo_2.exerciciosTarde2506.src.exercicio3;

public class PrincipalProduto {

  public static void main(String[] args) {
    Produto produto1 = new Produto("Arroz", 5, 10.00);
    Produto produto2 = new Produto("Feijão", 2, 15.00);
    Produto produto3 = new Produto("Batata", 3, 17.00);
    Produto produto4 = new Produto("Guiabinha", 9, 12.00);
    Produto produto5 = new Produto("Tomate", 50, 19.00);

    produto1.aumentarPreco();
    produto2.aumentarPreco();
    produto3.aumentarPreco();
    produto4.aumentarPreco();
    produto5.aumentarPreco();
  }
}
