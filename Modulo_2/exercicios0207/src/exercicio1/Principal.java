package Modulo_2.exercicios0207.src.exercicio1;

public class Principal {

  public static void main(String[] args) {
    Agenda agenda = new Agenda();

    int retorno;

    agenda.armazenaPessoa("Pedro", 20, 180);

    agenda.armazenaPessoa("Luan", 21, 178);

    agenda.imprimeAgenda();

    // agenda.removePessoa("Pedro");

    agenda.imprimeAgenda();

    retorno = agenda.buscaPessoa("Pedro");
    System.out.println(retorno);
  }
}
