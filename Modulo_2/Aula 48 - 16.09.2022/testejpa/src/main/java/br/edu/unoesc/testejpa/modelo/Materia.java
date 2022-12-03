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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "materias")
public class Materia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50)
	private String descricao;
	
	@ManyToMany(mappedBy = "materiasCursadas",
			cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER)
	List<Aluno> alunos;

	public Materia() { }
	
	public Materia(String descricao) {
		this.descricao = descricao;
	}

	public void adicionarAluno(Aluno aluno) {
		this.getAlunos().add(aluno);
		aluno.getMateriasCursadas().add(this);
	}
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }

	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Aluno> getAlunos() {
		if (this.alunos == null) {
			this.alunos = new ArrayList<>();
		}
		
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", descricao=" + descricao + "]";
	}
	
	
}

