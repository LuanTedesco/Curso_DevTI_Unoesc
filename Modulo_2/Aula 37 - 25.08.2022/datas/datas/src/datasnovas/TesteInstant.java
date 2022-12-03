package datasnovas;

import java.time.Instant;

public class TesteInstant {

	public static void main(String[] args) {
		Instant insGMT1 = Instant.now();
		Instant insGMT2 = Instant.parse("1985-08-17T20:00:00Z");	  // Especifica horário GMT
		Instant insGMT3 = Instant.parse("1985-08-17T20:00:00-03:00"); // Formato ISO 8601 com fuso diferente

		System.out.println("Data/hora global: " + insGMT1);
		System.out.println("Data/hora global: " + insGMT2);
		System.out.println("Data/hora global: " + insGMT3);
	}

}
