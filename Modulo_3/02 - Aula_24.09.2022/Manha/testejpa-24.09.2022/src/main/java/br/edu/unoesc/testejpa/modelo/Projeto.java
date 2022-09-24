package br.edu.unoesc.testejpa.modelo;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "projetos")
public class Projeto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@ManyToMany(mappedBy="projetos", cascade = CascadeType.ALL)
	private List<Funcionario> funcionarios;

	public Projeto() {
		super();
	}
	
	public Projeto(String nome) {
		super();
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
		
		
	}

	@Override
	public String toString() {
		return "Projeto [codigo=" + codigo + ", nome=" + nome + "]";
	}}