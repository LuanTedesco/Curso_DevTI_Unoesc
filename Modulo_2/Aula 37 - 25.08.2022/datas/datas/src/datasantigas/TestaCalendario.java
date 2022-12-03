package datasantigas;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TestaCalendario {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.YEAR, 1985);
		c.set(Calendar.MONTH, Calendar.AUGUST);
		c.set(Calendar.DAY_OF_MONTH, 17);
		
		System.out.println("Data e hora atuais: " + c.getTime());
		System.out.println("Ano...............: " + c.get(Calendar.YEAR));
		System.out.println("Mês (janeiro=0)...: " + c.get(Calendar.MONTH));
		System.out.println("Dia do mês........: " + c.get(Calendar.DAY_OF_MONTH));

		System.out.println("\nHora do dia...: " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto do dia.: " + c.get(Calendar.MINUTE));
		System.out.println("Segundo do dia: " + c.get(Calendar.SECOND));

		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		c.add(Calendar.HOUR_OF_DAY, 5);
		System.out.println("\nMês (janeiro=0): " + c.get(Calendar.MONTH));
		System.out.println("Dia do mês.....: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora do dia....: " + c.get(Calendar.HOUR_OF_DAY));
		
		Date data = Date.from(Instant.parse("1985-08-17T17:42:06Z"));
		c.setTime(data);
		System.out.println(data);
	}

}
