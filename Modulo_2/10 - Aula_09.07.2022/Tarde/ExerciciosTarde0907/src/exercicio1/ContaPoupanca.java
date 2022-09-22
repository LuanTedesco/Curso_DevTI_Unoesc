package Modulo_2.exercicios0907.ExerciciosTarde0907.ExerciciosTarde0907.src.exercicio1;

public class ContaPoupanca extends ContaBancaria {

  private int diaDeRendimento;

  public void calcularNovoSaldo() {
    this.setSaldo(this.getSaldo() + 50);
  }

  public ContaPoupanca(
    String cliente,
    int num_conta,
    float saldo,
    int diaDeRendimento
  ) {
    super(cliente, num_conta, saldo);
    this.diaDeRendimento = diaDeRendimento;
  }

  @Override
  public void sacar(double valor) {
    super.setSaldo(getSaldo() - valor);
  }

  /**
   * @return int return the diaDeRendimento
   */
  public int getDiaDeRendimento() {
    return diaDeRendimento;
  }

  /**
   * @param diaDeRendimento the diaDeRendimento to set
   */
  public void setDiaDeRendimento(int diaDeRendimento) {
    this.diaDeRendimento = diaDeRendimento;
  }

  @Override
  public String toString() {
    return (
      "Cliente: " +
      super.getCliente() +
      " Numero Conta: " +
      super.getNum_conta() +
      " Saldo: " +
      super.getSaldo()
    );
  }
}
