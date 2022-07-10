package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio3;

public class Empregado extends Pessoa {

  private int codigoSetor;
  private double salarioBase;
  private double imposto;

  public double calcularSalario() {
    return getSalarioBase() - getImposto();
  }

  public Empregado(
    String nome,
    String endereco,
    String telefone,
    int codigoSetor,
    double salarioBase,
    double imposto
  ) {
    super(nome, endereco, telefone);
    this.codigoSetor = codigoSetor;
    this.salarioBase = salarioBase;
    this.imposto = imposto;
  }

  /**
   * @return int return the codigoSetor
   */
  public int getCodigoSetor() {
    return codigoSetor;
  }

  /**
   * @param codigoSetor the codigoSetor to set
   */
  public void setCodigoSetor(int codigoSetor) {
    this.codigoSetor = codigoSetor;
  }

  /**
   * @return double return the salarioBase
   */
  public double getSalarioBase() {
    return salarioBase;
  }

  /**
   * @param salarioBase the salarioBase to set
   */
  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  /**
   * @return double return the imposto
   */
  public double getImposto() {
    return imposto;
  }

  /**
   * @param imposto the imposto to set
   */
  public void setImposto(double imposto) {
    this.imposto = imposto;
  }
}
