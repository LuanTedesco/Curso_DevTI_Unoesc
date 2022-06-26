package Modulo_2.exemplosOO.src.atividade1;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Pessoa p1 = new Pessoa("Pedro", 20);
    Pessoa p2 = new Pessoa("Maria", 15);

    p1.exibirInfo();
    p2.exibirInfo();

    ler.close();
  }
}
