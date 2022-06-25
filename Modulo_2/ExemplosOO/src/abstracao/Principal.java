package Modulo_2.ExemplosOO.src.abstracao;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Joystick js = new Joystick();
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o modelo do Joystick");
    js.modelo = ler.nextLine();
    System.out.println("Digite a cor do Joystick");
    js.cor = ler.nextLine();
    System.out.println("Digite a porcentagem da bateria");
    js.porcentagemBateria = ler.nextInt();

    js.visualizarInfJoystick();
    js.conectar();
    js.recarregar();

    ler.close();
  }
}
