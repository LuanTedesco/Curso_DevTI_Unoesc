package contastestes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import contas.ContaEspecial;

public class ContaEspecialTest {
	private ContaEspecial ce;
	
	@BeforeEach
	public void inicializa() { ce = new ContaEspecial(5000, 2000); }

	@Test
	public void testDepositoContaEspecial_AtualizaSaldo() {
		ce.depositar(500);
		assertEquals(5500, ce.getSaldo());
	}
	
	@Test
	public void testSaqueContaCorrenteSeHouverSaldo_RetornaTrue() {
		boolean resultado = ce.sacar(1000);
		assertEquals(4000, ce.getSaldo());
		assertEquals(true, resultado);
	}
	
	@Test
	public void testSaqueContaCorrenteSeNaoHouverSaldoMasEstiverNoLimite_RetornaTrue() {
		boolean resultado = ce.sacar(7000);
		assertEquals(-ce.getLimite(), ce.getSaldo());
		assertEquals(true, resultado);
	}
	
	@Test
	public void testSaqueContaCorrenteEstourouLimite_RetornaFalse() {
		boolean resultado = ce.sacar(8000);
		assertEquals(5000, ce.getSaldo());
		assertEquals(false, resultado);
	}
	
	@Test
	public void testSaqueContaCorrenteSeSaqueIgualSaldo_RetornaTrue() {
		boolean resultado = ce.sacar(5000);
		assertEquals(0, ce.getSaldo());
		assertEquals(true, resultado);
	}
}
