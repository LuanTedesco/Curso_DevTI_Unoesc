package datasantigas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaDate {
	
	public static void main(String[] args)  {
		Date dataHoraAtuais = new Date();
		
		System.out.println("Data/hora atuais: " + dataHoraAtuais);
		
		System.out.println();
		System.out.println(new Date(0L)); 					// 31 dezembro de 1969, 21h
		System.out.println(new Date(1000L * 60 * 60 * 3));	// 1o. janeiro de 1970, meia-noite
		
		System.out.println();
		Date dataHora1 = new Date(85, 7, 17, 17, 45, 0);	// Janeiro = 0, agosto = 7
		Date dataHora2 = new Date("08/17/85 05:45:00 PM");
		Date dataHora3 = new Date("08/17/985 05:45:00 PM");
		Date dataHora4 = new Date("08/17/1985 05:45:00 PM");
		Date dataHora5 = new Date(1950, 6, 16, 12, 0, 0);	// Julho = 6
		System.out.println(dataHora1);
		System.out.println(dataHora2);
		System.out.println(dataHora3);
		System.out.println(dataHora4);
		System.out.println(dataHora5);
		
		System.out.println();
		DateFormat df = new SimpleDateFormat("d MMM yyyy G, HH:mm:ss.S Z");
        System.out.println(df.format(new Date(Long.MIN_VALUE)));
        System.out.println(df.format(new Date(1000L * 60 * 60 * 3)));
        System.out.println(df.format(new Date(Long.MAX_VALUE)));
	}
	
}
