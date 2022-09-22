package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio1;

public class AssistenteTecnico extends Assistente {

  public AssistenteTecnico(String nome, double salario) {
    super(nome, salario);
  }

  private double bonusSalarial;

  public double getBonusSalarial() {
    return bonusSalarial;
  }

  public void setBonusSalarial(double bonusSalarial) {
    this.bonusSalarial = bonusSalarial;
  }

  public AssistenteTecnico(
    String nome,
    double salario,
    int matricula,
    double bonusSalarial
  ) {
    super(nome, salario + bonusSalarial, matricula);
    this.bonusSalarial = bonusSalarial;
  }

  @Override
  public String toString() {
    return (
      "AssistenteTecnico [ matricula = " +
      getMatricula() +
      " nome = " +
      getNome() +
      " salario = " +
      getSalario() +
      "] "
    );
  }
}
