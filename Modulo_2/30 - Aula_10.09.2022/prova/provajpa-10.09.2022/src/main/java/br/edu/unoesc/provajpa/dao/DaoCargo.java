package br.edu.unoesc.provajpa.dao;

import java.util.List;

import br.edu.unoesc.provajpa.modelo.Cargo;
import br.edu.unoesc.provajpa.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class DaoCargo {
	private EntityManager em;
	
	public DaoCargo() { em = JPAUtil.getEntityManager(); }
	
	private DaoCargo abrirTransacao() {
		em.getTransaction().begin();
		return this;
	}
	
	private DaoCargo fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}
	
	private DaoCargo incluir(Cargo p) {
		em.persist(p);
		return this;
	}
	
	private DaoCargo remover(Cargo p) {
		em.remove(p);
		return this;
	}
	
	public DaoCargo salvar(Cargo p) {
		return this.abrirTransacao()
				   .incluir(p)
				   .fecharTransacao();
	}
	
	public DaoCargo excluir(Cargo p) {
		return this.abrirTransacao()
				   .remover(p)
				   .fecharTransacao();
	}
	
	public List<Cargo> obterTodos() {
		String jpql = "SELECT p FROM Cargo p";
		return em.createQuery(jpql, Cargo.class).getResultList();
	}
	
	public Cargo buscarPorId(Integer id) {
		return em.find(Cargo.class, id);
	}
	
	public List<Cargo> buscarPorNome(String nome) {
		String jpql = "SELECT p FROM Cargo p WHERE p.nome LIKE :nome";
		
		TypedQuery<Cargo> consulta = em.createQuery(jpql, Cargo.class);
		consulta.setParameter("nome", "%" + nome + "%");
		
		return consulta.getResultList();
	}
	
	public void fechar() { em.close(); }
}




