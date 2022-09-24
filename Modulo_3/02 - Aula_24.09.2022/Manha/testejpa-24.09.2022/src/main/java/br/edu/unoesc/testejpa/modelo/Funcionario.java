package br.edu.unoesc.testejpa.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "funcionarios")
public class Funcionario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento", nullable = false)
	private LocalDate dataNascimento;
	
	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal salario;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Funcionario",
	joinColumns = {@JoinColumn(name = "id_funcionario")},
	inverseJoinColumns = {@JoinColumn(name = "id_projeto")})
	
	private List<Projeto> projetos;

	public Funcionario() { }

	public Funcionario(String nome, LocalDate dataNascimento, 
					   BigDecimal salario) {
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
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
		return "Funcionario [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", salario="
				+ salario + "]";
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}
	
	
}


