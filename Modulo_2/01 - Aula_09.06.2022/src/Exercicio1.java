package Modulo_2.exercicios0906.src;

import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    float hora, quant, salario;

    System.out.println("Digite o seu salário por hora: ");
    hora = scan.nextFloat();
    System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
    quant = scan.nextFloat();

    salario = hora * quant;

    System.out.println("O seu salário do mês é de $" + salario);
    scan.close();
  }
}
