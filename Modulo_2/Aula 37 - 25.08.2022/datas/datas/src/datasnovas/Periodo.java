package datasnovas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Periodo {

	public static void main(String[] args) {
		LocalDateTime inicio = LocalDateTime.of(2017, 1, 25, 10, 00, 00);
		LocalDateTime termino = LocalDateTime.of(2017, 12, 26, 11, 20, 15);
		Period periodo = Period.between(inicio.toLocalDate(), termino.toLocalDate());
		
		System.out.printf("%s anos, %s meses e %s dias\n", periodo.getYears(), periodo.getMonths(), periodo.getDays());
		// ------------------
		LocalDate flamengoBrasileiro = LocalDate.of(2009, 12, 6);
		LocalDate flamengoCopaDoBrasil = LocalDate.of(2013, 11, 27);
		Period dif = Period.between(flamengoBrasileiro, flamengoCopaDoBrasil);
		System.out.printf("%s anos, %s meses e %s dias\n", dif.getYears(), dif.getMonths(), dif.getDays() );
		// ------------------		
		LocalDate proximaSegundaFeira = LocalDate.of(2017, 12, 1).with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
		LocalDate ultimoDiaMes = LocalDate.of(2016, 2, 1).with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println(proximaSegundaFeira);
		System.out.println(ultimoDiaMes);
		
		Period p1 = Period.ofYears(4);
		Period p2 = p1.plusMonths(6).plusDays(15).minusMonths(3);
		System.out.println(p2);
	}

}
