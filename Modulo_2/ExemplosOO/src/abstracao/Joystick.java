package Modulo_2.exemplosOO.src.abstracao;

public class Joystick {

  //atributos
  String modelo;
  String cor;
  int porcentagemBateria;

  //m�todo especial - construtor vazio
  public Joystick() {}

  //m�todo especial - construtor modelo
  public Joystick(String modelo) {
    this.modelo = modelo;
  }

  //m�todo especial - construtor completo
  public Joystick(String modelo, String cor, int porcentagemBateria) {
    this.modelo = modelo;
    this.cor = cor;
    this.porcentagemBateria = porcentagemBateria;
  }

  //m�todos
  void visualizarInfoJoystick() {
    System.out.println("Modelo:" + modelo);
    System.out.println("Cor:" + cor);
    System.out.println("Porcentagem Bateria:" + porcentagemBateria);
    if (porcentagemBateria <= 15) {
      System.out.println("Bateria Fraca");
    } else if (porcentagemBateria <= 50) {
      System.out.println("Bateria pela metade. ATEN��O!!!");
    } else {
      System.out.println("Bateria em n�vel normal!");
    }
  }

  void conectar() {
    System.out.println("Joystick " + modelo + " est� conectado ao v�deo-game");
  }

  void recarregar() {
    System.out.println("Joystick " + modelo + " est� carregando...");
  }
}
