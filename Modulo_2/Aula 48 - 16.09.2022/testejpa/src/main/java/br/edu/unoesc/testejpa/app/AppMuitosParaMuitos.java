package br.edu.unoesc.testejpa.app;

import java.util.List;

import br.edu.unoesc.testejpa.modelo.Aluno;
import br.edu.unoesc.testejpa.modelo.Materia;
import br.edu.unoesc.testejpa.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class AppMuitosParaMuitos {
	private static EntityManager em;
	
	private static void listarAlunos() {
		em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT a FROM Aluno a";
		List<Aluno> alunos = em.createQuery(jpql, Aluno.class).getResultList();
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getMateriasCursadas());
			System.out.println();
		}
		em.close();
	}
	
	private static void listarMaterias() {
		em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT a FROM Materia a";
		List<Materia> materias = em.createQuery(jpql, Materia.class).getResultList();
		
		for (Materia materia : materias) {
			System.out.println(materia.getDescricao());
			System.out.println(materia.getAlunos());
			System.out.println();
		}
		em.close();
	}
	private static void adicionarAlunosComMaterias() {
		em = JPAUtil.getEntityManager();
		
		Aluno a1 = new Aluno("Fulano");
		Aluno a2 = new Aluno("Beltrano");
		
		Materia m1 = new Materia("Java");
		Materia m2 = new Materia("Python");
		Materia m3 = new Materia("Banco de Dados");
		
		a1.adicionarMateria(m1);
		a1.adicionarMateria(m3);
		
		a2.adicionarMateria(m2);
		a2.adicionarMateria(m3);
		
		em.getTransaction().begin();
		em.persist(a1);
		em.persist(a2);
		em.getTransaction().commit();
		
		em.close();
	}
	
	public static void main(String[] args) {
		adicionarAlunosComMaterias();
		listarAlunos();
		listarMaterias();
		
		JPAUtil.closeEntityManagerFactory();
	}

}


