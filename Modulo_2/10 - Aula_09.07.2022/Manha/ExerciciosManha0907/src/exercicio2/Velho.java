package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio2;

public class Velho extends Imovel {

  private double desconto;

  public double calcDesconto() {
    setPreco((getPreco() - desconto));
    return getPreco();
  }

  public Velho(String endereco, double preco, double desconto) {
    super(endereco, preco);
    this.desconto = desconto;
  }

  /**
   * @return double return the desconto
   */
  public double getDesconto() {
    return desconto;
  }

  /**
   * @param desconto the desconto to set
   */
  public void setDesconto(double desconto) {
    this.desconto = desconto;
  }

  @Override
  public String toString() {
    return "Novo [Preco = " + getPreco() + "]";
  }
}
