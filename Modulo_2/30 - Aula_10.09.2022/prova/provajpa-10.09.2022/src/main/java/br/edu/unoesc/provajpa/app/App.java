package br.edu.unoesc.provajpa.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.edu.unoesc.provajpa.modelo.Funcionario;
import br.edu.unoesc.provajpa.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class App {
	private static EntityManager em;
	
	private List<Funcionario> buscarTodos() {
		String jpql = "SELECT p FROM Funcionario p";
		
		return em.createQuery(jpql, Funcionario.class).getResultList();
	}
	
	private Funcionario buscarPorId(Integer id) {
		return em.find(Funcionario.class, id);
	}
	
	private void adicionar() {
		Funcionario funcionario1 = new Funcionario("Fulano",
				 				    java.sql.Date.valueOf(LocalDate.now()),
				 				    new BigDecimal("200.0"));
		
		Funcionario funcionario2 = new Funcionario("Beltrano",
				    				java.sql.Date.valueOf("2022-12-25"),
				    				new BigDecimal("300.0"));
		
		Funcionario funcionario3 = new Funcionario("Sicrano",
									java.sql.Date.valueOf("2022-12-25"),
									new BigDecimal("400.0"));

		em.getTransaction().begin();
		em.persist(funcionario1);
		em.persist(funcionario2);
		em.persist(funcionario3);
		em.getTransaction().commit();
	}
	
	private List<Funcionario> buscarPorNome(String nome) {
		String jpql = "SELECT p FROM Funcionario p WHERE p.nome LIKE :nome";
		
		return em.createQuery(jpql, Funcionario.class)
				  .setParameter("nome", "%" + nome + "%")
				  .getResultList();
	}
	
	private void excluir(Integer id) {
		Funcionario funcionario = this.buscarPorId(id);
		
		em.getTransaction().begin();
		em.remove(funcionario);
		em.getTransaction().commit();
	}
	
	private void alterar(Integer id) {
		Funcionario funcionario = this.buscarPorId(id);
		
		funcionario.setNome("Fulana");
		System.out.println(funcionario);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
	}
	
	private void testarMerge(Integer id) {
		Funcionario funcionario = this.buscarPorId(id);
		em.clear();
		
		funcionario = em.merge(funcionario);
		funcionario.setNome("Beltrana");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

	public static void main(String[] args) {
		App app = new App();
		
		// Recupera o gerenciador de entidades
		em = JPAUtil.getEntityManager();
		
		app.adicionar();
		app.alterar(1);
		app.testarMerge(2);
		app.excluir(2);
		
		List<Funcionario> lista = app.buscarPorNome("ano");
		
		for (Funcionario p : lista) {
			System.out.println(p.getId() + " - " + p.getNome() + " - " + p.getSalario());
		}
		
		Funcionario funcionario = app.buscarPorId(1);
		if (funcionario == null) {
			System.out.println("Funcionario não existe!");
		} else {
			System.out.println(funcionario.getNome());
		}
		
		lista = app.buscarTodos();
		System.out.println();
		
		for (Funcionario p : lista) {
			System.out.println(p.getNome() + " - " + p.getSalario());
		}
	
		System.out.println();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNome() + " - " + lista.get(i).getSalario());
		}
		
		System.out.println();
		lista.forEach(System.out::println);
		
		System.out.println();
		lista.forEach(p -> System.out.println(p.getNome() + " - " + p.getSalario()));
		
		// Fechar o gerenciador de entidades e a fábrica
		em.close();
		JPAUtil.closeEntityManagerFactory();
	}

}
