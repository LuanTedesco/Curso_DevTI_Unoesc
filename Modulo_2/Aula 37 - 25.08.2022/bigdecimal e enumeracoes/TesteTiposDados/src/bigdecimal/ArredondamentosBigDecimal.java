package bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ArredondamentosBigDecimal {

	public static void main(String[] args) {
		BigDecimal numerador = new BigDecimal("1.00");
		BigDecimal denominador = new BigDecimal("1.30");
		
		System.out.println("Divisão (UP).......: " + numerador.divide(denominador, 2, RoundingMode.UP));
		System.out.println("Divisão (DOWN).....: " + numerador.divide(denominador, 2, RoundingMode.DOWN));
		System.out.println("Divisão (CEILING)..: " + numerador.divide(denominador, 2, RoundingMode.CEILING));
		System.out.println("Divisão (FLOOR)....: " + numerador.divide(denominador, 2, RoundingMode.FLOOR));
		System.out.println("Divisão (HALF-UP)..: " + numerador.divide(denominador, 2, RoundingMode.HALF_UP));
		System.out.println("Divisão (HALF-DOWN): " + numerador.divide(denominador, 2, RoundingMode.HALF_DOWN));
		System.out.println("Divisão (HALF-EVEN): " + numerador.divide(denominador, 2, RoundingMode.HALF_EVEN));

		BigDecimal resultado = new BigDecimal("2.00").pow(10, new MathContext(5, RoundingMode.HALF_EVEN));
		System.out.println("\nPotência: " + resultado);

		MathContext mc = new MathContext(5, RoundingMode.HALF_EVEN);
		BigDecimal potencia = new BigDecimal("2.00").pow(10);
		BigDecimal arredondado = potencia.round(mc);
		System.out.println("Potência: " + arredondado);
	}

}
