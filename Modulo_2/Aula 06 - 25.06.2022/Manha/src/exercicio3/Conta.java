package Modulo_2.exerciciosManha2506.src.exercicio3;

public class Conta {

  //atributos
  int numeroConta;
  String tipoConta;
  String titularConta;
  double saldo;

  //construtor
  public Conta(
    int numeroConta,
    String tipoConta,
    String titularConta,
    double saldo
  ) {
    this.numeroConta = numeroConta;
    this.tipoConta = tipoConta;
    this.titularConta = titularConta;
    this.saldo = saldo;
  }

  //metodos

  double deposita(double valor) {
    return this.saldo = this.saldo + valor;
  }

  double saca(double valor) {
    if (this.saldo > valor) {
      return this.saldo = this.saldo - valor;
    } else {
      return this.saldo = (this.saldo + 1) - 1;
    }
  }

  void verificarSaldo() {
    System.out.println("Numero da conta: " + numeroConta);
    System.out.println("Tipo da conta: " + tipoConta);
    System.out.println("Titular da conta: " + titularConta);
    System.out.println("Saldo: " + saldo);
  }
}
