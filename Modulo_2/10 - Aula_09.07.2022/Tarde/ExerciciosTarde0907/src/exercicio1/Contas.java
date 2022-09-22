package Modulo_2.exercicios0907.ExerciciosTarde0907.ExerciciosTarde0907.src.exercicio1;

public class Contas {

  public static void main(String[] args) {
    ContaPoupanca contaP = new ContaPoupanca("Luis", 0001, 100, 20);
    ContaEspecial contaE = new ContaEspecial("Jorge", 0002, 200, 3000);

    contaE.sacar(30);
    System.out.println(contaE.getSaldo());
    contaE.depositar(40);
    System.out.println(contaE.getSaldo());

    contaP.sacar(100);
    System.out.println(contaP.getSaldo());
    contaP.depositar(5000);
    System.out.println(contaP.getSaldo());
    contaP.calcularNovoSaldo();
    System.out.println(contaP.getSaldo());

    contaP.toString();
  }
}
