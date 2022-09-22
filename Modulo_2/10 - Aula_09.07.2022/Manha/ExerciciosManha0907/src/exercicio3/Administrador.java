package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio3;

public class Administrador extends Empregado {

  private double ajudaDeCusto;

  public Administrador(
    String nome,
    String endereco,
    String telefone,
    int codigoSetor,
    double salarioBase,
    double imposto,
    double ajudaDeCusto
  ) {
    super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
    this.ajudaDeCusto = ajudaDeCusto;
  }

  /**
   * @return double return the ajudaDeCusto
   */
  public double getAjudaDeCusto() {
    return ajudaDeCusto;
  }

  /**
   * @param ajudaDeCusto the ajudaDeCusto to set
   */
  public void setAjudaDeCusto(double ajudaDeCusto) {
    this.ajudaDeCusto = ajudaDeCusto;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + ajudaDeCusto;
  }
}
