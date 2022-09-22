package datasantigas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TestaDatesFormatadas {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d1 = sdf1.parse("17/08/1985");
		Date d2 = sdf2.parse("17/08/1985 17:42:06");
		
		System.out.println("d1 padrão...: " + d1);
		System.out.println("d2 padrão...: " + d2);
		
		System.out.println("d1 formatado: " + sdf1.format(d1));
		System.out.println("d2 formatado: " + sdf2.format(d2));
		System.out.println();
		
		SimpleDateFormat sdfGMT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdfGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println(sdfGMT.format(new Date(0L)));				  // 31 dezembro de 1969, 21h
		System.out.println(sdfGMT.format(new Date(1000L * 60 * 60 * 3))); // 1o. janeiro de 1970, 5 da manhã
		System.out.println();
		
		Date data = Date.from(Instant.parse("1985-08-17T17:42:06Z"));
		System.out.println(data);
		System.out.println(sdfGMT.format(data));
		
		Locale localBR = new Locale("pt", "BR");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localBR);
		System.out.println(df.format(new Date()));
	}
	
}
