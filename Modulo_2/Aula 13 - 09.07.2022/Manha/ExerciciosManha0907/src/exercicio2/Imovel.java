package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio2;

public class Imovel {

  private static String endereco;
  private static double preco;

  public Imovel(String endereco, double preco) {
    Imovel.endereco = endereco;
    Imovel.preco = preco;
  }

  /**
   * @return String return the endereco
   */
  public static String getEndereco() {
    return endereco;
  }

  /**
   * @param endereco the endereco to set
   */
  public void setEndereco(String endereco) {
    Imovel.endereco = endereco;
  }

  /**
   * @return double return the preco
   */
  public static double getPreco() {
    return preco;
  }

  /**
   * @param preco the preco to set
   */
  public void setPreco(double preco) {
    Imovel.preco = preco;
  }
}
