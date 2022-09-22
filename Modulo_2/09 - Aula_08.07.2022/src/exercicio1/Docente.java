package Modulo_2.exercicios0807.src.exercicio1;

public class Docente extends Funcionário {

  private String titulacao;
  private int nivel;

  @Override
  public double calcularSalario() {
    super.setSalario(super.getSalario() + this.getNivel());
    return super.getSalario();
  }

  /**
   * @return String return the titulacao
   */
  public String getTitulacao() {
    return titulacao;
  }

  /**
   * @param titulacao the titulacao to set
   */
  public void setTitulacao(String titulacao) {
    this.titulacao = titulacao;
  }

  /**
   * @return int return the nivel
   */
  public int getNivel() {
    return nivel;
  }

  /**
   * @param nivel the nivel to set
   */
  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
}
