package Modulo_2.exercicios0907.ExerciciosTarde0907.ExerciciosTarde0907.src.exercicio1;

public class ContaEspecial extends ContaBancaria {

  private float limite;

  public ContaEspecial(
    String cliente,
    int num_conta,
    float saldo,
    float limite
  ) {
    super(cliente, num_conta, saldo);
    this.limite = limite;
  }

  @Override
  public void sacar(double valor) {
    super.setSaldo(getSaldo() - valor);
  }

  /**
   * @return float return the limite
   */
  public float getLimite() {
    return limite;
  }

  /**
   * @param limite the limite to set
   */
  public void setLimite(float limite) {
    this.limite = limite;
  }
}
