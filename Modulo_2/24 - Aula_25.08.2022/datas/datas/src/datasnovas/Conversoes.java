package datasnovas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Conversoes {
	public static void main(String[] args) {
		Instant insGlobal = Instant.parse("1985-08-17T01:45:00Z");
		
//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		
		// Converter de data global para data local
		LocalDate r1 = LocalDate.ofInstant(insGlobal, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(insGlobal, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(insGlobal, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(insGlobal, ZoneId.of("Portugal"));
		
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		
		System.out.println("r3: " + r3);
		System.out.println("r4: " + r4);
	}
}
