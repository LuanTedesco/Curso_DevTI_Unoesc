package Modulo_2.exercicios0207.src.exercicio1;

import java.util.ArrayList;

public class Agenda {

  private ArrayList<Pessoa> listapessoas = new ArrayList<>();

  /**
   * @return ArrayList<Pessoa> return the listapessoas
   */
  public ArrayList<Pessoa> getListapessoas() {
    return listapessoas;
  }

  /**
   * @param listapessoas the listapessoas to set
   */
  public void setListapessoas(ArrayList<Pessoa> listapessoas) {
    this.listapessoas = listapessoas;
  }

  public void armazenaPessoa(String nome, int idade, float altura) {
    if (listapessoas.size() < 10) {
      listapessoas.add(new Pessoa(nome, idade, altura));
    }
  }

  public void removePessoa(String nome) {
    for (int cont = 0; cont < listapessoas.size(); cont++) {
      if (listapessoas.get(cont).getNome().equals(nome)) {
        listapessoas.remove(cont);
        System.out.println("Registro Removido");
      } else {
        System.out.println("Nome não encontrado");
      }
    }
  }

  public int buscaPessoa(String nome) {
    for (int cont = 0; cont < listapessoas.size(); cont++) {
      if (listapessoas.get(cont).getNome().equals(nome)) {
        return cont + 1;
      }
    }
    return 0;
  }

  public void imprimeAgenda() {
    for (int cont = 0; cont < listapessoas.size(); cont++) {
      System.out.println(
        "Id " +
        (cont + 1) +
        " | Nome: " +
        listapessoas.get(cont).getNome() +
        " | Idade: " +
        listapessoas.get(cont).getIdade() +
        " | Altura: " +
        listapessoas.get(cont).getAltura()
      );
    }
  }

  public void imprimePessoa(int index) {
    System.out.println(
      "Id " +
      (index) +
      " | Nome: " +
      listapessoas.get(index - 1).getNome() +
      " | Idade: " +
      listapessoas.get(index - 1).getIdade() +
      " | Altura: " +
      listapessoas.get(index - 1).getAltura()
    );
  }
}
