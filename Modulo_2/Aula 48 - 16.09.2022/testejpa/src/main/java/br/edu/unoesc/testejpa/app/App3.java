package br.edu.unoesc.testejpa.app;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.edu.unoesc.testejpa.dao.DaoPessoa;
import br.edu.unoesc.testejpa.modelo.Pessoa;

public class App3 {

	public static void main(String[] args) {
		DaoPessoa daoPessoa = new DaoPessoa();
		
		Pessoa pessoa1 = new Pessoa("Fulano",
			    java.sql.Date.valueOf(LocalDate.now()),
			    new BigDecimal("200.0"));

		Pessoa pessoa2 = new Pessoa("Beltrana",
						java.sql.Date.valueOf("2022-12-25"),
						new BigDecimal("300.0"));
		
		Pessoa pessoa3 = new Pessoa("Sicrano",
						java.sql.Date.valueOf("2022-12-25"),
						new BigDecimal("400.0"));

		System.out.println(daoPessoa
							.salvar(pessoa1)
							.salvar(pessoa2)
							.salvar(pessoa3)
							.obterTodos());
		
		for (Pessoa p : daoPessoa.buscarPorNome("ano")) {
			System.out.println(p.getNome() + " - "
								+ p.getSalario());
		}
			
		daoPessoa.fechar();
	}

}
