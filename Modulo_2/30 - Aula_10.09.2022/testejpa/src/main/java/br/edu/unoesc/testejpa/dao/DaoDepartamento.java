package br.edu.unoesc.testejpa.dao;

import java.util.List;

import br.edu.unoesc.testejpa.modelo.Departamento;
import br.edu.unoesc.testejpa.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class DaoDepartamento {
	private EntityManager em;
	
	public DaoDepartamento() { em = JPAUtil.getEntityManager(); }
	
	private DaoDepartamento abrirTransacao() {
		em.getTransaction().begin();
		return this;
	}
	
	private DaoDepartamento fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}
	
	private DaoDepartamento incluir(Departamento p) {
		em.persist(p);
		return this;
	}
	
	private DaoDepartamento remover(Departamento p) {
		em.remove(p);
		return this;
	}
	
	public DaoDepartamento salvar(Departamento p) {
		return this.abrirTransacao()
				   .incluir(p)
				   .fecharTransacao();
	}
	
	public DaoDepartamento excluir(Departamento p) {
		return this.abrirTransacao()
				   .remover(p)
				   .fecharTransacao();
	}
	
	public List<Departamento> obterTodos() {
		String jpql = "SELECT p FROM Departamento p";
		return em.createQuery(jpql, Departamento.class).getResultList();
	}
	
	public Departamento buscarPorId(Integer id) {
		return em.find(Departamento.class, id);
	}
	
	public List<Departamento> buscarPorNome(String nome) {
		String jpql = "SELECT p FROM Departamento p WHERE p.nome LIKE :nome";
		
		TypedQuery<Departamento> consulta = em.createQuery(jpql, Departamento.class);
		consulta.setParameter("nome", "%" + nome + "%");
		
		return consulta.getResultList();
	}
	
	public void fechar() { em.close(); }
}




