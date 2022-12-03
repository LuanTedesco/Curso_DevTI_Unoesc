package Modulo_2.exercicios0207.src.exercicio1;

public class Pessoa {

  private String nome;
  private int idade;
  private double altura;

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

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
   * @return int return the idade
   */
  public int getIdade() {
    return idade;
  }

  /**
   * @param idade the idade to set
   */
  public void setIdade(int idade) {
    this.idade = idade;
  }

  /**
   * @return double return the altura
   */
  public double getAltura() {
    return altura;
  }

  /**
   * @param altura the altura to set
   */
  public void setAltura(double altura) {
    this.altura = altura;
  }
}
