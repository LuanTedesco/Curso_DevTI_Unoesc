package Modulo_2.exerciciosManha2506.src.exercicio3;

public class Principal3 {

  public static void main(String[] args) {
    Conta conta1 = new Conta(001, "Corrente", "Luan", 100);
    Conta conta2 = new Conta(002, "Poupança", "Dely", 700);

    conta1.deposita(100);

    conta2.saca(300);

    conta1.verificarSaldo();
    conta2.verificarSaldo();
  }
}
