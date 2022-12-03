package Modulo_2.exercicios0907.ExerciciosTarde0907.ExerciciosTarde0907.src.exercicio2;

public class Mamifero extends Animal {

  private String alimento;

  public Mamifero(
    String nome,
    int comprimento,
    int patas,
    String cor,
    String ambiente,
    float velocidade,
    String alimento
  ) {
    super(nome, comprimento, patas, cor, ambiente, velocidade);
    this.alimento = alimento;
  }

  /**
   * @return String return the alimento
   */
  public String getAlimento() {
    return alimento;
  }

  /**
   * @param alimento the alimento to set
   */
  public void setAlimento(String alimento) {
    this.alimento = alimento;
  }

  @Override
  public String toString() {
    return (
      "Mamifero [ambiente=" +
      getAmbiente() +
      ", comprimento=" +
      getComprimento() +
      ", cor=" +
      getCor() +
      ", nome=" +
      getNome() +
      ", patas=" +
      getPatas() +
      ", velocidade=" +
      getVelocidade() +
      "alimento=" +
      alimento +
      "]"
    );
  }
}
