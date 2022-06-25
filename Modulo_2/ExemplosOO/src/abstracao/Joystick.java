package Modulo_2.ExemplosOO.src.abstracao;

public class Joystick {

  // atributos
  String modelo;
  String cor;
  int porcentagemBateria;

  // metodos
  void visualizarInfJoystick() {
    System.out.println("Modelo: " + modelo);
    System.out.println("Cor: " + cor);
    System.out.println("Porcentagem da Bateria: " + porcentagemBateria);
  }

  void conectar() {
    System.out.println("Joystick " + modelo + " está conectado ao vodeo-game");
  }

  void recarregar() {
    System.out.println("Joystick " + modelo + " está carregando...");
  }
}
