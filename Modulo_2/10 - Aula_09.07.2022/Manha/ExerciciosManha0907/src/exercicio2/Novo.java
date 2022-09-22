package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio2;

public class Novo extends Imovel {

  private double adicional;

  public double calcAdicional() {
    setPreco((getPreco() + adicional));
    return getPreco();
  }

  public Novo(String endereco, double preco, double adicional) {
    super(endereco, preco);
    this.adicional = adicional;
  }

  /**
   * @return double return the adicional
   */
  public double getAdicional() {
    return adicional;
  }

  /**
   * @param adicional the adicional to set
   */
  public void setAdicional(double adicional) {
    this.adicional = adicional;
  }

  @Override
  public String toString() {
    return "Novo [Preco = " + getPreco() + "]";
  }
}
