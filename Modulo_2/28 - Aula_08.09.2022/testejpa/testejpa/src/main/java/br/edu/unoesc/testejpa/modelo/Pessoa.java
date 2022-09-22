package br.edu.unoesc.testejpa.modelo;

import java.math.BigDecimal;
import java.sql.Date;

public class Pessoa {
	private Integer id;
	private String nome;
	private java.sql.Date dataNascimento;
	private BigDecimal salario;
	
	public Pessoa() { }

	public Pessoa(Integer id, String nome, Date dataNascimento, BigDecimal salario) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public java.sql.Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(java.sql.Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", salario=" + salario
				+ "]";
	}
}
