package datasnovas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Duracao {

	public static void main(String[] args) {
		Instant hoje = Instant.parse("1985-08-17T01:45:00Z");
		Instant ontem = hoje.minus(1, ChronoUnit.DAYS);
		Instant amanha = hoje.plus(1, ChronoUnit.DAYS);
		
		Duration t1 = Duration.between(hoje, amanha);
		System.out.println("Diferença entre hoje e amanhã: " + t1.toDays() + " dia");
		System.out.println("Diferença entre hoje e amanhã: " + t1.toMinutes() + " minutos");
		
		Duration t2 = Duration.between(hoje, ontem);
		System.out.println("\nDiferença entre hoje e ontem: " + t2.toDays() + " dia");
		
		//-------------
		
		LocalDateTime ldt = LocalDateTime.parse("1985-08-17T17:45:00");
		LocalDateTime horaAnoQueVem = ldt.plusYears(1);
		
		Duration t3 = Duration.between(ldt, horaAnoQueVem);
		System.out.println("\nDiferença entre hoje e ano que vem: " + t3.toDays() + " dias");
		
		//-------------
		
		LocalDate ld = LocalDate.parse("1985-08-17");
		LocalDate semanaQueVem = ld.plusDays(7);
		
		Duration t4 = Duration.between(ld.atStartOfDay(), semanaQueVem.atStartOfDay());
		System.out.println("\nDiferença entre hoje e semana que vem: " + t4.toDays() + " dias");
	}

}
