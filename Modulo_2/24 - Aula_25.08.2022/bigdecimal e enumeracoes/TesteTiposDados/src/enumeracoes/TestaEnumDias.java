package enumeracoes;

import java.util.EnumSet;
import java.util.Random;

public class TestaEnumDias {
	// Criando uma enumeração como uma subclasse
	private enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public static void main(String[] args) {
		// Tipo da constante da enumeração
		System.out.println(DiasSemana.SEGUNDA.getClass());
		System.out.println();
		
		// Atribuição e teste simples
		DiasSemana diaDaSemana = DiasSemana.DOMINGO;
		if (diaDaSemana == DiasSemana.DOMINGO) {
			System.out.println("Acertou!");
		}
		
		// Métodos mais comuns
		System.out.println(DiasSemana.SEXTA.ordinal());
		System.out.println(DiasSemana.SEXTA.name());
		System.out.println(DiasSemana.valueOf("SEGUNDA"));
		
		// Transformando enumeração em array
		DiasSemana diasSemana[] = DiasSemana.values();
		System.out.println("\nExemplo com arrays: " + diasSemana[4]);
		
		// Criando um subconjunto a partir da enumeração
		EnumSet<DiasSemana> diasUteis = EnumSet.range(DiasSemana.SEGUNDA, DiasSemana.SEXTA);
		System.out.println("\nDias úteis:" + diasUteis);
		
		// Escolhendo uma constante da enumeração de forma aleatória
		Random aleatorio = new Random();
		int dia = aleatorio.nextInt(diasSemana.length);
		DiasSemana diaSemana = diasSemana[dia];
			
		switch (diaSemana) {
			case SEGUNDA:
			case TERCA:
			case QUARTA:
			case QUINTA:
			case SEXTA:
				System.out.println("Dia útil 👨‍🏭👩‍🏭!");
				break;
			case SABADO:
			case DOMINGO:
				System.out.println("Finde 🥳");
				break;
		}
		
		// Utilizando 'switch expressions', disponível a partir do Java 14
		String resultado = switch (diaSemana) {
			case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> "Dia útil 👨‍🏭👩‍🏭!";
			case SABADO, DOMINGO -> "Finde 🥳";
		};
		
		System.out.println(resultado);
	}
}
