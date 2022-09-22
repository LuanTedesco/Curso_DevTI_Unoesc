package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio1;

public class Funcionário {

  private String nome;
  private double salario;

  public Funcionário(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public double addAumento(double valor) {
    salario = salario + valor;
    return salario;
  }

  public void ganhoAnual() {
    salario = salario * 12;
  }

  public String exibeDados() {
    return "Funcionário [nome=" + nome + ", salario=" + salario + "]";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
