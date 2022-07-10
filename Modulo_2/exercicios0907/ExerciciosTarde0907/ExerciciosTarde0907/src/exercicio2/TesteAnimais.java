package Modulo_2.exercicios0907.ExerciciosTarde0907.ExerciciosTarde0907.src.exercicio2;

public class TesteAnimais {

  public static void main(String[] args) {
    Mamifero Camelo = new Mamifero(
      "Camelo",
      150,
      4,
      "Amarelo",
      "Terra",
      2,
      "Grama"
    );

    Peixe Tubarao = new Peixe("Tubarão", 300, 1, "Barbatanas e calda");

    Mamifero UrsoDoCanadá = new Mamifero(
      "Urso-Do-Canadá",
      180,
      4,
      "Vermelho",
      "Terra",
      5,
      "Mel"
    );

    Tubarao.setCor("Cinzento");
    Tubarao.setAmbiente("Mar");

    System.out.println("Zoo: ");
    System.out.println("-------------------------------------");
    System.out.println("Animal: " + Camelo.getNome());
    System.out.println("Comprimento: " + Camelo.getComprimento());
    System.out.println("Patas: " + Camelo.getPatas());
    System.out.println("Cor: " + Camelo.getCor());
    System.out.println("Ambiente: " + Camelo.getAmbiente());
    System.out.println("Velocidade: " + Camelo.getVelocidade());
    System.out.println("-------------------------------------");
    System.out.println("Animal: " + Tubarao.getNome());
    System.out.println("Comprimento: " + Tubarao.getComprimento());
    System.out.println("Patas: " + Tubarao.getPatas());
    System.out.println("Cor: " + Tubarao.getCor());
    System.out.println("Ambiente: " + Tubarao.getAmbiente());
    System.out.println("Velocidade: " + Tubarao.getVelocidade());
    System.out.println("Caracteristica: " + Tubarao.getCaracteristica());
    System.out.println("-------------------------------------");
    System.out.println("Animal: " + UrsoDoCanadá.getNome());
    System.out.println("Comprimento: " + UrsoDoCanadá.getComprimento());
    System.out.println("Patas: " + UrsoDoCanadá.getPatas());
    System.out.println("Cor: " + UrsoDoCanadá.getCor());
    System.out.println("Ambiente: " + UrsoDoCanadá.getAmbiente());
    System.out.println("Velocidade: " + UrsoDoCanadá.getVelocidade());
    System.out.println("Alimento: " + UrsoDoCanadá.getAlimento());
    System.out.println("-------------------------------------");
  }
}
