package Modulo_2.exercicios0807.src.exercicio1;

public class Tecnico extends Funcionário {

  private String funcao;
  private double horaExtra;

  @Override
  public double calcularSalario() {
    super.setSalario(super.getSalario() + this.getHoraExtra());
    return super.getSalario();
  }

  /**
   * @return String return the funcao
   */
  public String getFuncao() {
    return funcao;
  }

  /**
   * @param funcao the funcao to set
   */
  public void setFuncao(String funcao) {
    this.funcao = funcao;
  }

  /**
   * @return double return the horaExtra
   */
  public double getHoraExtra() {
    return horaExtra;
  }

  /**
   * @param horaExtra the horaExtra to set
   */
  public void setHoraExtra(double horaExtra) {
    this.horaExtra = horaExtra;
  }
}
