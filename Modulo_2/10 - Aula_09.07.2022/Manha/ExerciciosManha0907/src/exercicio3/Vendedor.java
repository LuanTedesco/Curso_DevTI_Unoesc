package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio3;

public class Vendedor extends Empregado {

  private double valorVendas;
  private double comissao;

  public Vendedor(
    String nome,
    String endereco,
    String telefone,
    int codigoSetor,
    double salarioBase,
    double imposto
  ) {
    super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
  }

  /**
   * @return double return the valorVendas
   */
  public double getValorVendas() {
    return valorVendas;
  }

  /**
   * @param valorVendas the valorVendas to set
   */
  public void setValorVendas(double valorVendas) {
    this.valorVendas = valorVendas;
  }

  /**
   * @return double return the comissao
   */
  public double getComissao() {
    return comissao;
  }

  /**
   * @param comissao the comissao to set
   */
  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + valorVendas + comissao;
  }
}
