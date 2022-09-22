package bigdecimal;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class TipoBigDecimal {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
		DecimalFormat df = new java.text.DecimalFormat("#,##0.00");
		
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal bigResult = big1.add(big2);

		if (bigResult.compareTo(BigDecimal.valueOf(0.3)) == 0) {
			System.out.println("Deu boa: 0,1 + 0,2 == " + df.format(bigResult.doubleValue()));
		}
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(new BigDecimal("1234.56")));

		System.out.println("\nSoma.........: " + new BigDecimal("2.00").add(new BigDecimal("1.2")));
		System.out.println("Subtração....: " + new BigDecimal("2.00").subtract(new BigDecimal("1.1")));
		System.out.println("Multiplicação: " + new BigDecimal("2.00").multiply(new BigDecimal("1.8")));

		try {
			System.out.println("Divisão......: " + new BigDecimal("10.00").divide(new BigDecimal("3")));
		} catch (ArithmeticException e) {
			System.out.println("\n" + e.getMessage());
		}

		System.out.println("\nComparação 2 = 2: " + new BigDecimal("2.0").compareTo(new BigDecimal("2.0")));
		System.out.println("Comparação 3 = 2: " + new BigDecimal("3.0").compareTo(new BigDecimal("2.0")));
		System.out.println("Comparação 2 = 3: " + new BigDecimal("2.0").compareTo(new BigDecimal("3.0")));
	}

}
