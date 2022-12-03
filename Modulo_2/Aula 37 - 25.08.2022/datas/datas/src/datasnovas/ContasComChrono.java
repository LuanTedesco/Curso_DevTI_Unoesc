package datasnovas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContasComChrono {

	public static void main(String[] args) {
		Instant hoje = Instant.parse("1985-08-17T01:45:00Z");
		Instant ontem = hoje.minus(1, ChronoUnit.DAYS);
		Instant amanha = hoje.plus(1, ChronoUnit.DAYS);
		
		System.out.println(ontem);
		System.out.println(hoje);
		System.out.println(amanha);
		
		LocalDate independencia = LocalDate.of(2022, 9, 7);
		LocalDate republica = LocalDate.of(2022, 11, 15);

		long dias = ChronoUnit.DAYS.between(independencia, republica);
		System.out.printf("\nSão %s dias de diferença.", dias);

		long meses = ChronoUnit.MONTHS.between(independencia, republica);
		System.out.printf("\nSão %s meses de diferença.", meses);
	}

}
