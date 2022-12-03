package Modulo_2.exercicios0807.src.exercicio2;

public class Gerente extends Empregado {

  //ATRIBUTOS
  private String departamento;

  //CONSTRUTOR
  public Gerente(String nome, float salario, String departamento) {
    super.setNome(nome);
    super.salario = salario;
    this.departamento = departamento;
  }

  //GETTERS E SETTERS
  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  //TO STRING
  @Override
  public String toString() {
    return (
      "Nome = " +
      super.getNome() +
      "\nSal�rio = " +
      salario +
      "\nDepartamento = " +
      departamento
    );
  }
}
