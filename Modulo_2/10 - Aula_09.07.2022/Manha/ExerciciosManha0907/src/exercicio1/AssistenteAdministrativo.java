package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio1;

public class AssistenteAdministrativo extends Assistente {

  public AssistenteAdministrativo(String nome, double salario) {
    super(nome, salario);
  }

  private double adicionalNoturno;

  public double getAdicionalNoturno() {
    return adicionalNoturno;
  }

  public void setAdicionalNoturno(double adicionalNoturno) {
    this.adicionalNoturno = adicionalNoturno;
  }

  public AssistenteAdministrativo(
    String nome,
    double salario,
    int matricula,
    double adicionalNoturno
  ) {
    super(nome, salario + adicionalNoturno, matricula);
    this.adicionalNoturno = adicionalNoturno;
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
      " ]"
    );
  }
}
