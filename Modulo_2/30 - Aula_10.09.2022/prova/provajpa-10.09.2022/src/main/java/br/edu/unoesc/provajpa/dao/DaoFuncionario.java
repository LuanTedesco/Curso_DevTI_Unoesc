package br.edu.unoesc.provajpa.dao;

import java.util.List;

import br.edu.unoesc.provajpa.modelo.Funcionario;
import br.edu.unoesc.provajpa.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class DaoFuncionario {
	private EntityManager em;
	
	public DaoFuncionario() { em = JPAUtil.getEntityManager(); }
	
	private DaoFuncionario abrirTransacao() {
		em.getTransaction().begin();
		return this;
	}
	
	private DaoFuncionario fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}
	
	private DaoFuncionario incluir(Funcionario p) {
		em.persist(p);
		return this;
	}
	
	private DaoFuncionario remover(Funcionario p) {
		em.remove(p);
		return this;
	}
	
	public DaoFuncionario salvar(Funcionario p) {
		return this.abrirTransacao()
				   .incluir(p)
				   .fecharTransacao();
	}
	
	public DaoFuncionario excluir(Funcionario p) {
		return this.abrirTransacao()
				   .remover(p)
				   .fecharTransacao();
	}
	
	public List<Funcionario> obterTodos() {
		String jpql = "SELECT p FROM Funcionario p";
		return em.createQuery(jpql, Funcionario.class).getResultList();
	}
	
	public Funcionario buscarPorId(Integer id) {
		return em.find(Funcionario.class, id);
	}
	
	public List<Funcionario> buscarPorNome(String nome) {
		String jpql = "SELECT p FROM Funcionario p WHERE p.nome LIKE :nome";
		
		TypedQuery<Funcionario> consulta = em.createQuery(jpql, Funcionario.class);
		consulta.setParameter("nome", "%" + nome + "%");
		
		return consulta.getResultList();
	}
	
	public void fechar() { em.close(); }
}




