package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dominio.Avaliador;
import dominio.Lance;
import dominio.Leilao;
import dominio.Usuario;
import excecoes.LeilaoSemLanceException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvaliadorTest {

  @Test
  public void testarLancesOrdemCrescente() {
    // Parte 1: Cen�rio
    Usuario joao = new Usuario("Jo�o");
    Usuario jose = new Usuario("Jos�");
    Usuario maria = new Usuario("Maria");

    Leilao leilao = new Leilao("PlayStation 5");

    leilao.propoe(new Lance(maria, 2500.0));
    leilao.propoe(new Lance(joao, 3000.0));
    leilao.propoe(new Lance(jose, 4000.0));

    // Parte 2: A��o
    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

    // Parte 3: Verifica��o
    double maiorLanceEsperado = 4000;
    double menorLanceEsperado = 2500;

    assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
    assertEquals(menorLanceEsperado, avaliador.getMenorLance());
  }

  @Test
  public void testarLancesOrdemDecrescente() {
    // Parte 1: Cen�rio
    Usuario joao = new Usuario("Jo�o");
    Usuario jose = new Usuario("Jos�");
    Usuario maria = new Usuario("Maria");

    Leilao leilao = new Leilao("PlayStation 5");

    leilao.propoe(new Lance(maria, 2500.0));
    leilao.propoe(new Lance(joao, 3000.0));
    leilao.propoe(new Lance(jose, 4000.0));

    // Parte 2: A��o
    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

    // Parte 3: Verifica��o
    double maiorLanceEsperado = 4000;
    double menorLanceEsperado = 2500;

    assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
    assertEquals(menorLanceEsperado, avaliador.getMenorLance());
  }

  @Test
  public void testarLancesOrdemAleatoria() {
    // Parte 1: Cen�rio
    Usuario joao = new Usuario("Jo�o");
    Usuario jose = new Usuario("Jos�");
    Usuario maria = new Usuario("Maria");

    Leilao leilao = new Leilao("PlayStation 5");

    leilao.propoe(new Lance(joao, 3000.0));
    leilao.propoe(new Lance(maria, 2500.0));
    leilao.propoe(new Lance(jose, 4000.0));

    // Parte 2: A��o
    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

    // Parte 3: Verifica��o
    double maiorLanceEsperado = 4000;
    double menorLanceEsperado = 2500;

    assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
    assertEquals(menorLanceEsperado, avaliador.getMenorLance());
  }

  @Test
  public void testarLancesMesmoValor() {
    // Parte 1: Cen�rio
    Usuario joao = new Usuario("Jo�o");
    Usuario jose = new Usuario("Jos�");
    Usuario maria = new Usuario("Maria");

    Leilao leilao = new Leilao("PlayStation 5");

    leilao.propoe(new Lance(joao, 3000.0));
    leilao.propoe(new Lance(maria, 3000.0));
    leilao.propoe(new Lance(jose, 3000.0));

    // Parte 2: A��o
    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

    // Parte 3: Verifica��o
    double maiorLanceEsperado = 3000;
    double menorLanceEsperado = 3000;

    assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
    assertEquals(menorLanceEsperado, avaliador.getMenorLance());
  }

  @Test
  public void testarLancesApenasUmLance() {
    // Parte 1: Cen�rio
    Usuario joao = new Usuario("Jo�o");

    Leilao leilao = new Leilao("PlayStation 5");

    leilao.propoe(new Lance(joao, 3000.0));

    // Parte 2: A��o
    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

    // Parte 3: Verifica��o
    double maiorLanceEsperado = 3000;
    double menorLanceEsperado = 3000;

    assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
    assertEquals(menorLanceEsperado, avaliador.getMenorLance());
  }

  @Test
  public void testarLancesNenhumLance() {
    // Parte 3: Verifica��o
    Assertions.assertThrows(
      LeilaoSemLanceException.class,
      () -> {
        // Parte 1: Cen�rio
        Leilao leilao = new Leilao("PlayStation 5");

        // Parte 2: A��o
        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);
      }
    );
  }
}
