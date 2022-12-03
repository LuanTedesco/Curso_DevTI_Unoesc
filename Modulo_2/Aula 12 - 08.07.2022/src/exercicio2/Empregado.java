package Modulo_2.exercicios0807.src.exercicio2;

public class Empregado {

  //ATRIBUTOS
  private String nome;
  protected float salario;

  //GETTERS E SETTERS
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  //TO STRING
  @Override
  public String toString() {
    return "Empregado [nome=" + nome + ", salario=" + salario + "]";
  }
}
