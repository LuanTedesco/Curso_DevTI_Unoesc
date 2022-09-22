package bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ArredondamentosBigDecimal {

	public static void main(String[] args) {
		BigDecimal numerador = new BigDecimal("1.00");
		BigDecimal denominador = new BigDecimal("1.30");
		
		System.out.println("Divis�o (UP).......: " + numerador.divide(denominador, 2, RoundingMode.UP));
		System.out.println("Divis�o (DOWN).....: " + numerador.divide(denominador, 2, RoundingMode.DOWN));
		System.out.println("Divis�o (CEILING)..: " + numerador.divide(denominador, 2, RoundingMode.CEILING));
		System.out.println("Divis�o (FLOOR)....: " + numerador.divide(denominador, 2, RoundingMode.FLOOR));
		System.out.println("Divis�o (HALF-UP)..: " + numerador.divide(denominador, 2, RoundingMode.HALF_UP));
		System.out.println("Divis�o (HALF-DOWN): " + numerador.divide(denominador, 2, RoundingMode.HALF_DOWN));
		System.out.println("Divis�o (HALF-EVEN): " + numerador.divide(denominador, 2, RoundingMode.HALF_EVEN));

		BigDecimal resultado = new BigDecimal("2.00").pow(10, new MathContext(5, RoundingMode.HALF_EVEN));
		System.out.println("\nPot�ncia: " + resultado);

		MathContext mc = new MathContext(5, RoundingMode.HALF_EVEN);
		BigDecimal potencia = new BigDecimal("2.00").pow(10);
		BigDecimal arredondado = potencia.round(mc);
		System.out.println("Pot�ncia: " + arredondado);
	}

}
