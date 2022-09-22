package Modulo_2.exercicios0907.ExerciciosTarde0907.ExerciciosTarde0907.src.exercicio2;

public class Peixe extends Animal {

  private String caracteristica;

  public Peixe(
    String nome,
    int comprimento,
    float velocidade,
    String caracteristica
  ) {
    super(nome, comprimento, velocidade);
    this.caracteristica = caracteristica;
  }

  /**
   * @return String return the caracteristica
   */
  public String getCaracteristica() {
    return caracteristica;
  }

  /**
   * @param caracteristica the caracteristica to set
   */
  public void setCaracteristica(String caracteristica) {
    this.caracteristica = caracteristica;
  }

  @Override
  public String toString() {
    return (
      "Peixe [ambiente=" +
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
      "caracteristica=" +
      caracteristica +
      "]"
    );
  }
}
