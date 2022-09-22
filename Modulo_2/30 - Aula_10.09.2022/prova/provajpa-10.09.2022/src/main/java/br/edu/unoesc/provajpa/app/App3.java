package br.edu.unoesc.provajpa.app;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.edu.unoesc.provajpa.dao.DaoFuncionario;
import br.edu.unoesc.provajpa.modelo.Funcionario;

public class App3 {

	public static void main(String[] args) {
		DaoFuncionario daoFuncionario = new DaoFuncionario();
		
		Funcionario funcionario1 = new Funcionario("Fulano",
			    java.sql.Date.valueOf(LocalDate.now()),
			    new BigDecimal("200.0"));

		Funcionario funcionario2 = new Funcionario("Beltrana",
						java.sql.Date.valueOf("2022-12-25"),
						new BigDecimal("300.0"));
		
		Funcionario funcionario3 = new Funcionario("Sicrano",
						java.sql.Date.valueOf("2022-12-25"),
						new BigDecimal("400.0"));

		System.out.println(daoFuncionario
							.salvar(funcionario1)
							.salvar(funcionario2)
							.salvar(funcionario3)
							.obterTodos());
		
		for (Funcionario p : daoFuncionario.buscarPorNome("ano")) {
			System.out.println(p.getNome() + " - "
								+ p.getSalario());
		}
			
		daoFuncionario.fechar();
	}

}
