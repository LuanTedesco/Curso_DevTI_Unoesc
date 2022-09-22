package Modulo_2.exercicios0807.src.exercicio2;

public class Vendedor extends Empregado {

  //ATRIBUTOS
  private float percentualComissao;

  //CONSTRUTOR
  public Vendedor(String nome, float salario, float percentualComissao) {
    super.setNome(nome);
    super.salario = salario;
    this.percentualComissao = percentualComissao;
  }

  //METODO CALCULAR SALARIO
  public float calcularSalario() {
    super.setSalario(
      super.getSalario() + (super.getSalario() * getPercentualComissao() / 100)
    );
    return super.getSalario();
  }

  //GETTERS E SETTERS
  public float getPercentualComissao() {
    return percentualComissao;
  }

  public void setPercentualComissao(float percentualComissao) {
    this.percentualComissao = percentualComissao;
  }

  //TO STRING
  @Override
  public String toString() {
    return (
      "Nome = " +
      super.getNome() +
      "\nSal�rio sem comiss�o = " +
      salario +
      "\nSal�rio com comiss�o = " +
      this.calcularSalario() +
      "\nPercentual comiss�o = " +
      percentualComissao +
      "%"
    );
  }
}
