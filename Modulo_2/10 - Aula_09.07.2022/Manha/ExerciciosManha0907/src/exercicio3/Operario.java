package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio3;

public class Operario extends Empregado {

  private double valorProducao;
  private double comissao;

  public Operario(
    String nome,
    String endereco,
    String telefone,
    int codigoSetor,
    double salarioBase,
    double imposto
  ) {
    super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
  }

  public double getValorProducao() {
    return valorProducao;
  }

  public void setValorProducao(double valorProducao) {
    this.valorProducao = valorProducao;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + valorProducao + comissao;
  }
}
