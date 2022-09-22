import junit.framework.Assert;
import org.junit.Test;

public class CalculadoraTest {

  // Adição
  @Test
  public void deveriaSomarDoisNumerosPositivos() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(41, 1);
    Assert.assertEquals(42, soma);
  }

  @Test
  public void deveriaSomarUmNumerosPositivoEZero() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(42, 0);
    Assert.assertEquals(42, soma);
  }

  @Test
  public void deveriaSomarUmNumeroPositivoEUmNegativo() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(5, -5);
    Assert.assertEquals(0, soma);
  }

  @Test
  public void deveriaSomarDoisNumerosNegativos() {
    Calculadora calc = new Calculadora();
    int soma = calc.somar(-2, -3);
    Assert.assertEquals(-5, soma);
  }

  // Subtração
  @Test
  public void deveriasubtrairDoisNumerosPositivos() {
    Calculadora calc = new Calculadora();
    int subtrai = calc.subtrai(41, 1);
    Assert.assertEquals(40, subtrai);
  }

  @Test
  public void deveriasubtrairUmNumerosPositivoEZero() {
    Calculadora calc = new Calculadora();
    int subtrai = calc.subtrai(42, 0);
    Assert.assertEquals(42, subtrai);
  }

  @Test
  public void deveriasubtrairUmNumeroPositivoEUmNegativo() {
    Calculadora calc = new Calculadora();
    int subtrai = calc.subtrai(5, -5);
    Assert.assertEquals(10, subtrai);
  }

  @Test
  public void deveriasubtrairDoisNumerosNegativos() {
    Calculadora calc = new Calculadora();
    int subtrai = calc.subtrai(-2, -3);
    Assert.assertEquals(1, subtrai);
  }

  // Multiplicação
  @Test
  public void deveriamultiplicarDoisNumerosPositivos() {
    Calculadora calc = new Calculadora();
    int multiplica = calc.multiplica(41, 1);
    Assert.assertEquals(41, multiplica);
  }

  @Test
  public void deveriamultiplicarUmNumerosPositivoEZero() {
    Calculadora calc = new Calculadora();
    int multiplica = calc.multiplica(42, 0);
    Assert.assertEquals(0, multiplica);
  }

  @Test
  public void deveriamultiplicarUmNumeroPositivoEUmNegativo() {
    Calculadora calc = new Calculadora();
    int multiplica = calc.multiplica(5, -5);
    Assert.assertEquals(-25, multiplica);
  }

  @Test
  public void deveriamultiplicarDoisNumerosNegativos() {
    Calculadora calc = new Calculadora();
    int multiplica = calc.multiplica(-2, -3);
    Assert.assertEquals(6, multiplica);
  }

  // Divisão
  @Test
  public void deveriadividirDoisNumerosPositivos() {
    Calculadora calc = new Calculadora();
    int divide = calc.divide(41, 1);
    Assert.assertEquals(41, divide);
  }

  @Test
  public void deveriadividirUmNumeroPositivoEUmNegativo() {
    Calculadora calc = new Calculadora();
    int divide = calc.divide(5, -5);
    Assert.assertEquals(-1, divide);
  }

  @Test
  public void deveriadividirDoisNumerosNegativos() {
    Calculadora calc = new Calculadora();
    int divide = calc.divide(-2, -3);
    Assert.assertEquals(0, divide);
  }
}
