package br.edu.unoesc.funcionarios.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@XmlRootElement
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(nullable=false, unique=true, length=100)
	String nome;
	@Column(nullable=false, unique=true, length=100)
	String endereco;
	@Column(length=10)
	Integer numDep;
	BigDecimal salario;
	@Column(nullable=false)
	LocalDate nascimento;

	public Funcionario() {
	}

	public Funcionario(Long id, String nome, String endereco, Integer numDep, BigDecimal salario,
			LocalDate nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.numDep = numDep;
		this.salario = salario;
		this.nascimento = nascimento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getNumDep() {
		return numDep;
	}
	public void setNumDep(Integer numDep) {
		this.numDep = numDep;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
}