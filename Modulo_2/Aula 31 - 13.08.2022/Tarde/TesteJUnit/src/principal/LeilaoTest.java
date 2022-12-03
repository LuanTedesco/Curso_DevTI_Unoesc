package principal;

import static org.junit.Assert.assertEquals;

import dominio.Avaliador;
import dominio.Lance;
import dominio.Leilao;
import dominio.Usuario;
import org.junit.Test;

public class LeilaoTest {

  @Test
  public void testarLancesOrdemCrescente() {
    // Parte 1
    Usuario joao = new Usuario("João");
    Usuario jose = new Usuario("José");
    Usuario maria = new Usuario("Maria");

    System.out.println("Inicio do Leilão");
    System.out.println("================");

    Leilao leilao = new Leilao("PlayStation 5");

    leilao.propoe(new Lance(jose, 4000.0));
    leilao.propoe(new Lance(joao, 3000.0));
    leilao.propoe(new Lance(maria, 2500.0));

    // Parte 2
    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

    // Parte 3
    double maiorLanceEsperado = 4000;
    double menorLanceEsperado = 2500;

    assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
    assertEquals(menorLanceEsperado, avaliador.getMenorLance());
  }
}
