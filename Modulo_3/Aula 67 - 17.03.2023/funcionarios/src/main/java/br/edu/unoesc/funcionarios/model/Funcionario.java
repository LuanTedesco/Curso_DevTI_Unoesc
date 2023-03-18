package br.edu.unoesc.funcionarios.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@Entity
@Table(name = "tb_func")
public class Funcionario implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Integer numDep;
	private BigDecimal salario;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate nascimento;

	public Funcionario(Long id, String nome, Integer numDep, BigDecimal salario, LocalDate nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.numDep = numDep;
		this.salario = salario;
		this.nascimento = nascimento;
	}
	
	public Funcionario() {
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