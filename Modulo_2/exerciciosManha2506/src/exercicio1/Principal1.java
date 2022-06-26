package Modulo_2.exerciciosManha2506.src.exercicio1;

import java.util.Scanner;

public class Principal1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double n1;
    double n2;

    System.out.println("Digite o primeiro numero: ");
    n1 = scan.nextDouble();
    System.out.println("Digite o segundo numero: ");
    n2 = scan.nextDouble();

    Calculadora c1 = new Calculadora();

    System.out.println(
      "A soma dos numeros " + n1 + " + " + n2 + " é: " + c1.somar(n1, n2)
    );

    System.out.println(
      "A subtração dos numeros " +
      n1 +
      " - " +
      n2 +
      " é: " +
      c1.subtrair(n1, n2)
    );

    System.out.println(
      "A multiplicação dos numeros " +
      n1 +
      " * " +
      n2 +
      " é: " +
      c1.multiplicar(n1, n2)
    );

    System.out.println(
      "A divisão dos numeros " + n1 + " / " + n2 + " é: " + c1.dividir(n1, n2)
    );
    scan.close();
  }
}
      n1 +
      " - " +
      n2 +
      " é: " +
      c1.subtrair(n1, n2)
    );

    System.out.println(
      "A multiplicação dos numeros " +
      n1 +
      " * " +
      n2 +
      " é: " +
      c1.multiplicar(n1, n2)
    );

    System.out.println(
      "A divisão dos numeros " + n1 + " / " + n2 + " é: " + c1.dividir(n1, n2)
    );
    scan.close();
  }
}
