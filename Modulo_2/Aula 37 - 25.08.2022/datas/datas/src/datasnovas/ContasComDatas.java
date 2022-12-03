package datasnovas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContasComDatas {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.parse("1985-08-17");
		LocalDate semanaPassada = ld.minusDays(7);
		LocalDate semanaQueVem = ld.plusDays(7);
		
		System.out.println(semanaPassada);
		System.out.println(ld);
		System.out.println(semanaQueVem);
		//-------------
		LocalDateTime ldt = LocalDateTime.parse("1985-08-17T17:45:00");
		LocalDateTime horaAnoPassado = ldt.minusHours(1).minusYears(1);
		LocalDateTime horaAnoQueVem = ldt.plusHours(1).plusYears(1);
		
		System.out.println(horaAnoPassado);
		System.out.println(ldt);
		System.out.println(horaAnoQueVem);
	}

}
