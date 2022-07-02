package Modulo_2.exemplos0107.src.encapsulamento;

public class Principal {

  public static void main(String[] args) {
    //inst�ncia de Carro
    Carro carro = new Carro();
    Carro carro2 = new Carro();
    Garagem garagem = new Garagem();

    carro.setMarca("Fiat");
    carro.setModelo("Uno");
    carro.setAno(2005);

    carro2.setMarca("Ford");
    carro2.setModelo("Fiesta");
    carro2.setAno(2011);

    garagem.adicionarCarro(carro);
    garagem.adicionarCarro(carro2);
    garagem.visualizarGaragem();
  }
}
