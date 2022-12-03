package atividadefinal;

public class Produto {

  private String nome;
  private double preco;
  private int quantidadeEstoque;

  public Produto(String nome, double preco, int quantidadeEstoque) {
    this.nome = nome;
    this.preco = preco;
    this.quantidadeEstoque = quantidadeEstoque;
  }

  public boolean verificarEstoque(Produto prod) {
    if (prod.quantidadeEstoque > 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * @return String return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return double return the preco
   */
  public double getPreco() {
    return preco;
  }

  /**
   * @param preco the preco to set
   */
  public void setPreco(double preco) {
    this.preco = preco;
  }

  /**
   * @return int return the quantidadeEstoque
   */
  public int getQuantidadeEstoque() {
    return quantidadeEstoque;
  }

  /**
   * @param quantidadeEstoque the quantidadeEstoque to set
   */
  public void setQuantidadeEstoque(int quantidadeEstoque) {
    this.quantidadeEstoque = quantidadeEstoque;
  }

  @Override
  public String toString() {
    return (
      "Nome = " +
      nome +
      ", Preco = " +
      preco +
      ", Quantidade Estoque = " +
      quantidadeEstoque
    );
  }
}
