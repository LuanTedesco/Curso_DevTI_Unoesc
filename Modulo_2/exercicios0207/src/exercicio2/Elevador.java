package Modulo_2.exercicios0207.src.exercicio2;

public class Elevador {

  private int andar;
  private int totalAndares;
  private int capacidade;
  private int quantPessoas;

  public Elevador(int totalAndares, int capacidade) {
    this.totalAndares = totalAndares;
    this.capacidade = capacidade;
  }

  /**
   * @return int return the andar
   */
  public int getAndar() {
    return andar;
  }

  /**
   * @param andar the andar to set
   */
  public void setAndar(int andar) {
    this.andar = andar;
  }

  /**
   * @return int return the totalAndares
   */
  public int getTotalAndares() {
    return totalAndares;
  }

  /**
   * @param totalAndares the totalAndares to set
   */
  public void setTotalAndares(int totalAndares) {
    this.totalAndares = totalAndares;
  }

  /**
   * @return int return the capacidade
   */
  public int getCapacidade() {
    return capacidade;
  }

  /**
   * @param capacidade the capacidade to set
   */
  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public void inicializa(int capacidade, int totalAndares) {
    this.capacidade = capacidade;
    this.totalAndares = totalAndares;
  }

  public void entra() {
    if (capacidade > quantPessoas) {
      quantPessoas += 1;
      System.out.println("Tem " + quantPessoas + " pessoas no elevador");
    } else {
      System.out.println("Capacidade cheia");
    }
  }

  public void sai() {
    if (quantPessoas > capacidade) {
      quantPessoas -= 1;
      System.out.println("Tem " + quantPessoas + " pessoas no elevador");
    } else {
      System.out.println("Elevador Vazio");
    }
  }

  public void sobe() {
    if (andar <= totalAndares) {
      andar += 1;
      System.out.println("Você está no andar: " + andar);
    } else {
      System.out.println("Não é possível subir mais");
    }
  }

  public void desce() {
    if (andar > 0) {
      andar -= 1;
      System.out.println("Você está no andar: " + andar);
    } else {
      System.out.println("Você já está no terreo");
    }
  }
}
