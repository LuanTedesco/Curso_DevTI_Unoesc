package br.edu.unoesc.testejpa.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cargos")
public class Cargo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@OneToMany(mappedBy = "cargo", fetch = FetchType.EAGER)
	private Set<Funcionario> funcionarios = new HashSet<Funcionario>();

	public Cargo() { }
	public Cargo(String nome) { this.nome = nome; }
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionario.setCargo(this);
		this.funcionarios.add(funcionario);
	}
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public Set<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(Set<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public String toString() {
		return "Cargo [id=" + id + ", nome=" + nome + "]";
	}
}
