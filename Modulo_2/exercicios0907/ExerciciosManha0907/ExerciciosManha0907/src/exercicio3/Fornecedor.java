package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio3;

public class Fornecedor extends Pessoa {

  private double valorCredito;
  private double valorDivida;

  public void obterSaldo() {
    System.out.println(getValorCredito());
    System.out.println(getValorDivida());
  }

  public Fornecedor(
    String nome,
    String endereco,
    String telefone,
    double valorCredito,
    double valorDivida
  ) {
    super(nome, endereco, telefone);
    this.valorCredito = valorCredito;
    this.valorDivida = valorDivida;
  }

  /**
   * @return double return the valorCredito
   */
  public double getValorCredito() {
    return valorCredito;
  }

  /**
   * @param valorCredito the valorCredito to set
   */
  public void setValorCredito(double valorCredito) {
    this.valorCredito = valorCredito;
  }

  /**
   * @return double return the valorDivida
   */
  public double getValorDivida() {
    return valorDivida;
  }

  /**
   * @param valorDivida the valorDivida to set
   */
  public void setValorDivida(double valorDivida) {
    this.valorDivida = valorDivida;
  }
}
