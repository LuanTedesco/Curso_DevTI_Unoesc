package br.edu.unoesc.testejpa.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.unoesc.testejpa.modelo.Cargo;
import br.edu.unoesc.testejpa.modelo.Funcionario;
import br.edu.unoesc.testejpa.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class AppUmParaMuitosBidirecional {
	private static EntityManager em;
	private static Cargo c1, c2;
	
	private static void cadastrarCargos() {
//		em = JPAUtil.getEntityManager();
		
		c1 = new Cargo("Programador");
		c2 = new Cargo("Analista");
		
//		em.getTransaction().begin();
//		em.persist(c1);
//		em.persist(c2);
//		em.getTransaction().commit();
//		em.close();
	}
	
	private static void listarFuncionarios() {
		em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT f FROM Funcionario f";
		List<Funcionario> funcionarios = em.createQuery(jpql, Funcionario.class).getResultList();
		for (Funcionario f : funcionarios) {
			System.out.println(f.getNome());
			System.out.println(f.getDataNascimento());
			System.out.println(f.getSalario());
			System.out.println(f.getCargo());
			System.out.println();
		}
		
		em.close();
	}
	
	private static void inserirFuncionarios() {
		em = JPAUtil.getEntityManager();
		
		Funcionario f1 = new Funcionario("Fulano",
										 LocalDate.now(),
										 new BigDecimal("3000"),
										 c1);
		
		Funcionario f2 = new Funcionario("Beltrano",
										 LocalDate.parse("25/12/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
										 new BigDecimal("5000"),
										 c1);
		
		Funcionario f3 = new Funcionario("Sicrano",
										 LocalDate.parse("01/04/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
										 new BigDecimal("15000"),
										 c2);
		
		em.getTransaction().begin();
		em.persist(f1);
		em.persist(f2);
		em.persist(f3);
		em.getTransaction().commit();
		
		em.close();
	}
	
	private static void listarTodosOsCargos() {
		em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT c FROM Cargo c";
		List<Cargo> cargos = em.createQuery(jpql, Cargo.class).getResultList();
		
		for (Cargo c : cargos) {
			System.out.println(c.getId() + " - " + c.getNome());
			
			for (Funcionario f: c.getFuncionarios()) {
				System.out.println("\t" + f.getNome() + " - " + f.getSalario());
			}
			
			System.out.println();
		}
		
		em.close();
	}
	
	private static void listarUmCargo(Integer id) {
		em = JPAUtil.getEntityManager();
		
		Cargo c = em.find(Cargo.class, id);
		
		System.out.println(c.getId() + " - " + c.getNome());
		
		for (Funcionario f: c.getFuncionarios()) {
			System.out.println("\t" + f.getNome() + 
							   " - " + f.getSalario());
		}
		
		em.close();
	}
	
	private static void adicionarFuncionarioComCargo() {
		em = JPAUtil.getEntityManager();
		
		Cargo c = new Cargo("Designer");
		
		Funcionario f = new Funcionario("Zé das Couves",
										 LocalDate.now(),
										 new BigDecimal("1234.56"),
										 c);
		
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		
		em.close();
	}
	
	private static void removerFuncionario() {
		em = JPAUtil.getEntityManager();
		
		Funcionario f = em.find(Funcionario.class, 1);
		
		em.getTransaction().begin();
		em.remove(f);
		em.getTransaction().commit();
		
		em.close();
	}
	
	public static void main(String[] args) {
		cadastrarCargos();
		inserirFuncionarios();
		adicionarFuncionarioComCargo();
//		removerFuncionario();
		listarFuncionarios();
//		listarUmCargo(1);
//		listarTodosOsCargos();
		
		JPAUtil.closeEntityManagerFactory();
	}

}


