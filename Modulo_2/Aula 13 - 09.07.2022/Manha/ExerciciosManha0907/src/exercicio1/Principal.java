package Modulo_2.exercicios0907.ExerciciosManha0907.ExerciciosManha0907.src.exercicio1;

public class Principal {

  public static void main(String[] args) {
    AssistenteTecnico AssistenteT = new AssistenteTecnico(
      "Marcelo",
      3000,
      0001,
      30
    );

    AssistenteAdministrativo AssistenteADM = new AssistenteAdministrativo(
      "Luan",
      7000,
      0002,
      20
    );

    System.out.println(AssistenteT.toString());

    System.out.println(AssistenteADM.toString());
  }
}
