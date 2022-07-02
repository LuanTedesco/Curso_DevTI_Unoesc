package Modulo_2.exemplos0107.src.atividade2_01072022;

public class ControleRemoto {

  Televisao tv = new Televisao();

  public void aumentarVolume() {
    tv.setVolume(tv.getVolume() + 1);
    System.out.println("O volume atual � de: " + tv.getVolume());
  }

  public void diminuirVolume() {
    tv.setVolume(tv.getVolume() - 1);
    System.out.println("O volume atual � de: " + tv.getVolume());
  }

  public void aumentarCanal() {
    tv.setCanal(tv.getCanal() + 1);
    System.out.println("O canal atual � de: " + tv.getCanal());
  }

  public void diminuirCanal() {
    tv.setCanal(tv.getCanal() - 1);
    System.out.println("O canal atual � de: " + tv.getCanal());
  }

  public void escolherCanal(int canal) {
    tv.setCanal(canal);
    System.out.println("O canal atual � de: " + tv.getCanal());
  }

  public void infoTv() {
    System.out.println("Canal atual: " + tv.getCanal());
    System.out.println("Volume atual: " + tv.getVolume());
  }
}
