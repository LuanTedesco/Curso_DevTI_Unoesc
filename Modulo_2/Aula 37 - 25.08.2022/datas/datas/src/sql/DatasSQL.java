package sql;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class DatasSQL {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		java.sql.Date sqlDate = new Date(now);

		System.out.println("currentTimeMillis: " + now);
		System.out.println("SqlDate..........: " + sqlDate);
		System.out.println("SqlDate.getTime(): " + sqlDate.getTime());

		System.out.println();

		java.sql.Date sqlDate1 = Date.valueOf("1975-12-25");
		System.out.println("SqlDate1: " + sqlDate1);

		java.sql.Date sqlDate2 = Date.valueOf(LocalDate.of(1975, Month.DECEMBER, 25));
		System.out.println("SqlDate2: " + sqlDate2);

		java.util.Date dataUtil = new java.util.Date();
		System.out.println("\nData do pacote util: " + dataUtil);

		// Convertendo de java.util.Date para java.sql.Date
		java.sql.Date dataSQL1 = new java.sql.Date(dataUtil.getTime());
		System.out.println("Data do pacote SQL.: " + dataSQL1);
		
		// Convertendo de java.util.Date para java.sql.Date com SimpleDataFormat() e valueOf()
		java.util.Date data = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fd = sdf.format(data);
        java.sql.Date dataSQL2 = java.sql.Date.valueOf(fd);
        System.out.println("Data SQL...........: " + dataSQL2);
        
		// Convertendo para Instant
		Calendar cln = Calendar.getInstance();  
		cln.set(Calendar.MONTH, 07);  
		cln.set(Calendar.DATE, 12);  
		cln.set(Calendar.YEAR, 2021);  
		java.util.Date d = cln.getTime();  
		Instant inst = d.toInstant();  
		System.out.println("\nData original.: " + d.toString());  
		System.out.println("Objeto Instant: " + inst);  
	}

}
