package Modulo_2.exercicios0907.ExerciciosTarde0907.ExerciciosTarde0907.src.exercicio2;

public class Animal {

  private String nome;
  private int comprimento;
  private int patas;
  private String cor;
  private String ambiente;
  private float velocidade;

  public Animal(
    String nome,
    int comprimento,
    int patas,
    String cor,
    String ambiente,
    float velocidade
  ) {
    this.nome = nome;
    this.comprimento = comprimento;
    this.patas = patas;
    this.cor = cor;
    this.ambiente = ambiente;
    this.velocidade = velocidade;
  }

  public Animal(String nome, int comprimento, float velocidade) {
    this.nome = nome;
    this.comprimento = comprimento;
    this.velocidade = velocidade;
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
   * @return int return the comprimento
   */
  public int getComprimento() {
    return comprimento;
  }

  /**
   * @param comprimento the comprimento to set
   */
  public void setComprimento(int comprimento) {
    this.comprimento = comprimento;
  }

  /**
   * @return int return the patas
   */
  public int getPatas() {
    return patas;
  }

  /**
   * @param patas the patas to set
   */
  public void setPatas(int patas) {
    this.patas = patas;
  }

  /**
   * @return String return the cor
   */
  public String getCor() {
    return cor;
  }

  /**
   * @param cor the cor to set
   */
  public void setCor(String cor) {
    this.cor = cor;
  }

  /**
   * @return String return the ambiente
   */
  public String getAmbiente() {
    return ambiente;
  }

  /**
   * @param ambiente the ambiente to set
   */
  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  /**
   * @return float return the velocidade
   */
  public float getVelocidade() {
    return velocidade;
  }

  /**
   * @param velocidade the velocidade to set
   */
  public void setVelocidade(float velocidade) {
    this.velocidade = velocidade;
  }

  @Override
  public String toString() {
    return (
      "Animal [ambiente=" +
      ambiente +
      ", comprimento=" +
      comprimento +
      ", cor=" +
      cor +
      ", nome=" +
      nome +
      ", patas=" +
      patas +
      ", velocidade=" +
      velocidade +
      "]"
    );
  }
}
