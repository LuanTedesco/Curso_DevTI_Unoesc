package Modulo_2.exemplos0107.src.atividade2_01072022;

public class Televisao {

  private int canal;
  private int volume;

  public int getCanal() {
    return canal;
  }

  public void setCanal(int canal) {
    this.canal = canal;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  @Override
  public String toString() {
    return "Televisao [canal=" + canal + ", volume=" + volume + "]";
  }
}
