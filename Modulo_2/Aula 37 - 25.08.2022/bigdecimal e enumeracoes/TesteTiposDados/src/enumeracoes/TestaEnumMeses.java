package enumeracoes;

import java.time.LocalDate;

public class TestaEnumMeses {

	public static void main(String[] args) {
		String mensagem;
		
		for (Meses mes : Meses.values()) {
			if (mes == Meses.FEVEREIRO) {
				LocalDate dataAtual = LocalDate.now();
				
				mensagem = String.format("%s é o %dº mês do ano e em %d tem %d dias", 
						mes.getNome(), 
						mes.getNumero(),
						dataAtual.getYear(),
						dataAtual.isLeapYear() ? 29 : 28);
			} else {
				mensagem = String.format("%s é o %dº mês do ano tem %d dias", 
										mes.getNome(), 
										mes.getNumero(),
										mes.getDias());
			}
			
			System.out.println(mensagem); 
		}
	}

}
