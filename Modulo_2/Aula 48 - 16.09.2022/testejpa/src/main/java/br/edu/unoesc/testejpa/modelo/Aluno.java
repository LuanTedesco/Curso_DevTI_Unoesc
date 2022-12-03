package br.edu.unoesc.testejpa.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50)
	private String nome;
	
	@ManyToMany(cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER)
	@JoinTable(name = "alunos_cursam_materias",
			   joinColumns = @JoinColumn(name = "id_aluno"),
			   inverseJoinColumns = @JoinColumn(name = "id_materia"))
	List<Materia> materiasCursadas;

	public void adicionarMateria(Materia materia) {
		this.getMateriasCursadas().add(materia);
		materia.getAlunos().add(this);
	}
	
	public Aluno() { }
	public Aluno(String nome) { this.nome = nome; }

	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public List<Materia> getMateriasCursadas() {
		if (this.materiasCursadas == null) {
			this.materiasCursadas = new ArrayList<>();
		}
		
		return materiasCursadas;
	}

	public void setMateriasCursadas(List<Materia> materiasCursadas) {
		this.materiasCursadas = materiasCursadas;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + "]";
	}
	
	
}


