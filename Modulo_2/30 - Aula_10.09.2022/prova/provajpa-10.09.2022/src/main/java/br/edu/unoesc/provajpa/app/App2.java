package br.edu.unoesc.provajpa.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.edu.unoesc.provajpa.modelo.Cargo;
import br.edu.unoesc.provajpa.modelo.Funcionario;
import br.edu.unoesc.provajpa.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class App2 {
	private static EntityManager em;
	
	public static void main(String[] args) {
		em = JPAUtil.getEntityManager();

		Cargo d1 = new Cargo("TI");
		Cargo d2 = new Cargo("Marketing");
		Cargo d3 = new Cargo("Vendas");
		
		Funcionario funcionario1 = new Funcionario("Marcelo",
								    java.sql.Date.valueOf(LocalDate.now()),
								    new BigDecimal("2000.0"), d1);

		Funcionario funcionario2 = new Funcionario("Jão",
									java.sql.Date.valueOf("1995-01-10"),
									new BigDecimal("3500.0"), d2);
		
		Funcionario funcionario3 = new Funcionario("Gutin",
									java.sql.Date.valueOf("2022-12-25"),
									new BigDecimal("5000.0"), d3);
		
		Funcionario funcionario4 = new Funcionario("Tilapia",
									java.sql.Date.valueOf("2022-08-08"),
									new BigDecimal("1337.6"), d3);
		
		System.out.println(funcionario2.getNome() + " - " + funcionario2.getCargo().getNome());
		
		em.getTransaction().begin();
		em.persist(d1);
		em.persist(d2);
		em.persist(d3);
		
		em.persist(funcionario1);
		em.persist(funcionario2);
		em.persist(funcionario3);
		em.persist(funcionario4);
		em.getTransaction().commit();
		
		System.out.println(em.find(Funcionario.class, 2));
		
		String jpql = "SELECT p FROM Funcionario p WHERE p.cargo.nome = :nome";
		List<Funcionario> funcionarios = em.createQuery(jpql, Funcionario.class)
								 .setParameter("nome", "TI")
								 .getResultList();
		
		if (funcionarios.isEmpty()) {
			System.out.println("Lista vazia");
		} else {
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario.getNome() + " - " + funcionario.getCargo().getNome());
			}
		}
		
		Cargo dep = em.find(Cargo.class, 1);
		jpql = "SELECT p FROM Funcionario p WHERE p.cargo = :cargo";
		funcionarios = em.createQuery(jpql, Funcionario.class)
					.setParameter("cargo", dep)
					.getResultList();
		
		if (funcionarios.isEmpty()) {
			System.out.println("Lista vazia");
		} else {
			System.out.println("\nFuncionario\t\tCargo");
			System.out.println("----------------------------");
			funcionarios.forEach(p -> System.out.println(p.getNome() + "\t\t" + p.getCargo().getNome()));
		}
		
		jpql = "SELECT p.salario FROM Funcionario p WHERE p.id = :id";
		BigDecimal salario = em.createQuery(jpql, BigDecimal.class)
						  		.setParameter("id", 1)
						  		.getSingleResult();
		System.out.println("Salário do Fulano: " + salario);
		
		em.close();
		JPAUtil.closeEntityManagerFactory();
	}

}






