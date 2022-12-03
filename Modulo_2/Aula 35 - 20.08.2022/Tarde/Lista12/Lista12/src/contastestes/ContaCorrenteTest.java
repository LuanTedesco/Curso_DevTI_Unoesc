package contastestes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import contas.ContaCorrente;

public class ContaCorrenteTest {
	static final float SALDO_INICIAL = 1000.0f;
	private ContaCorrente cc;
	
	@BeforeEach
	public void inicializa() { 
		cc = new ContaCorrente(SALDO_INICIAL);
	}

	@Test
	public void testDepositoContaCorrente_AtualizaSaldo() {
		cc.depositar(500.0f);
		assertEquals(1500.f, cc.getSaldo());
	}
	
	@Test
	public void testSaqueContaCorrenteSeHouverSaldo_RetornaTrue() {
		boolean resultado = cc.sacar(500);
		assertEquals(500, cc.getSaldo());
		assertEquals(true, resultado);
	}
	
	@Test
	public void testSaqueContaCorrenteSeNaoHouverSaldo_RetornaFalse() {
		float saldoAnterior = cc.getSaldo();
		boolean resultado = cc.sacar(1500);
		assertEquals(saldoAnterior, cc.getSaldo());
		assertEquals(false, resultado);
	}
	
	@Test
	public void testSaqueContaCorrenteSeSaqueIgualSaldo_RetornaTrue() {
		boolean resultado = cc.sacar(1000);
		assertEquals(0, cc.getSaldo());
		assertEquals(true, resultado);
	}
}
