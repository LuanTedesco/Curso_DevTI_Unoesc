package Modulo_2.ExemplosExplicacoes.src.estruturashomogeneas;

import java.util.ArrayList;

public class Listas {

  public static void main(String[] args) throws Exception {
    ArrayList<Integer> notas = new ArrayList<>();
    int contador;
    notas.add(10);
    notas.add(7);

    for (contador = 0; contador < notas.size(); contador++);
    {
      System.out.println(notas.get(contador));
    }
    notas.forEach(
      x -> {
        System.out.println(x);
      }
    );
  }
}
