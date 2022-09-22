package Modulo_2.exercicios0807.src.exercicio2;

public class Principal {

  public static void main(String[] args) {
    Gerente gerente = new Gerente("Joelson", 5000, "Vendas");
    Vendedor vendedor = new Vendedor("Wilson", 1500, 10);

    System.out.println(gerente.toString());
    System.out.println(vendedor.toString());
  }
}
