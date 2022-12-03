package datasnovas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ContasComDatasHoras {

	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		System.out.println("Ano bissexto.........: " + (data.isLeapYear() ? "Sim" : "N�o"));
		System.out.println("N�mero de dias do m�s: " + data.lengthOfMonth());
		System.out.println("N�mero de dias do ano: " + data.lengthOfYear());
		
		LocalDate anoNovo = LocalDate.of(2022, 1, 1);
		LocalDate natal = LocalDate.of(2022, 12, 25);
		
		System.out.println("\nAno novo antes do Natal? " + (anoNovo.isBefore(natal) ? "Sim" : "N�o"));
		System.out.println("Ano novo depois do Natal? " + (anoNovo.isAfter(natal) ? "Sim" : "N�o"));
		System.out.println("Ano novo na mesma data do Natal? " + (anoNovo.isEqual(natal) ? "Sim" : "N�o"));

		LocalTime almoco = LocalTime.of(12, 0);
		LocalTime jantar = LocalTime.of(20, 30);
		
		LocalDateTime anoNovoAlmoco = LocalDateTime.of(anoNovo, almoco);
		LocalDateTime natalJantar = LocalDateTime.of(natal, jantar);

		System.out.println("\nAlmo�o antes da janta? " + (anoNovoAlmoco.isBefore(natalJantar) ? "Sim" : "N�o"));
		System.out.println("Almo�o antes da janta? " + (anoNovoAlmoco.isAfter(natalJantar) ? "Sim" : "N�o"));
		System.out.println("Almo�o na mesma hora da janta? " + (anoNovoAlmoco.equals(natalJantar) ? "Sim" : "N�o"));
	}

}
