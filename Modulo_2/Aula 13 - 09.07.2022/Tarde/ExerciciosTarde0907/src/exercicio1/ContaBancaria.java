package Modulo_2.exercicios0907.ExerciciosTarde0907.ExerciciosTarde0907.src.exercicio1;

public class ContaBancaria {

  private String cliente;
  private int num_conta;
  private double saldo;

  public void sacar(double valor) {
    if (saldo > valor) {
      this.saldo = this.saldo - valor;
    } else {
      System.out.println(
        "O valor a ser sacado é menor que o disponível na conta"
      );
    }
  }

  public void depositar(double valor) {
    this.saldo = this.saldo + valor;
  }

  public ContaBancaria(String cliente, int num_conta, float saldo) {
    this.cliente = cliente;
    this.num_conta = num_conta;
    this.saldo = saldo;
  }

  /**
   * @return String return the cliente
   */
  public String getCliente() {
    return cliente;
  }

  /**
   * @param cliente the cliente to set
   */
  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  /**
   * @return int return the num_conta
   */
  public int getNum_conta() {
    return num_conta;
  }

  /**
   * @param num_conta the num_conta to set
   */
  public void setNum_conta(int num_conta) {
    this.num_conta = num_conta;
  }

  /**
   * @return double return the saldo
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * @param saldo the saldo to set
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
