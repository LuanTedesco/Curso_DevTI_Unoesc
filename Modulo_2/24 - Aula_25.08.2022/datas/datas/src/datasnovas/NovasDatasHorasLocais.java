package datasnovas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class NovasDatasHorasLocais {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now();
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println("Data local......: " + ld1);
		System.out.println("Data/hora local.: " + ldt1);
		System.out.println();
		
		LocalDate ld2 = LocalDate.of(1985, 8, 17);
		LocalDateTime ldt2 = LocalDateTime.of(1985, 8, 17, 17, 45, 0);
		System.out.println("Data local.........: " + ld2);
		System.out.println("Data/hora local....: " + ldt2);
		System.out.printf("Dia/mês/ano........: %02d/%02d/%04d\n", ldt2.getDayOfMonth(), 
														   ldt2.getMonth().getValue(), 
														   ldt2.getYear());
		System.out.printf("Hora:minuto:segundo: %02d:%02d:%02d\n", ldt2.getHour(), 
																   ldt2.getMinute(), 
																   ldt2.getSecond());

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ldFmt1 = LocalDate.parse("17/08/1985", fmt1);
		System.out.println("\nldFmt1 padrão...: " + ldFmt1);
		System.out.println("ldFmt1 formatada: " + ldFmt1.format(fmt1));
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime ldFmt2 = LocalDateTime.parse("17/08/1985 17:45", fmt2);
		System.out.println("\nldFmt2 padrão...: " + ldFmt2);
		System.out.println("ldFmt2 formatada: " + ldFmt2.format(fmt2));
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
									.withZone(ZoneId.systemDefault());
		Instant insFmt3 = Instant.parse("1985-08-17T17:45:00Z");
		System.out.println("\nInstant padrão...: " + insFmt3);
		System.out.println("Instant formatada: " + fmt3.format(insFmt3));
	}

}
