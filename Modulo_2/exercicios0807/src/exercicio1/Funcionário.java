package Modulo_2.exercicios0807.src.exercicio1;

public abstract class Funcionário {

  private String nome;
  private double salario;

  public abstract double calcularSalario();

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
   * @return double return the salario
   */
  public double getSalario() {
    return salario;
  }

  /**
   * @param salario the salario to set
   */
  public void setSalario(double salario) {
    this.salario = salario;
  }
}
