package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio1;

public class Assistente extends Funcionário {

  public Assistente(String nome, double salario) {
    super(nome, salario);
  }

  private int matricula;

  @Override
  public String toString() {
    return (
      "Assistente [matricula=" +
      matricula +
      "nome=" +
      getNome() +
      ", salario=" +
      getSalario() +
      "]"
    );
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public Assistente(String nome, double salario, int matricula) {
    super(nome, salario);
    this.matricula = matricula;
  }
}
