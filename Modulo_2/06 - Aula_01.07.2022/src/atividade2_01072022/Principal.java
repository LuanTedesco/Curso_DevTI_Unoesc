package Modulo_2.exemplos0107.src.atividade2_01072022;

public class Principal {

  public static void main(String[] args) {
    ControleRemoto controle = new ControleRemoto();

    controle.aumentarVolume();
    controle.diminuirVolume();

    controle.aumentarCanal();
    controle.diminuirCanal();

    controle.escolherCanal(10);
    controle.infoTv();
  }
}
