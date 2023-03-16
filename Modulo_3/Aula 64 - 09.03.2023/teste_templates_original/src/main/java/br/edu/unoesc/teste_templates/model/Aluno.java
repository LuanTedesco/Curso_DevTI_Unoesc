package br.edu.unoesc.teste_templates.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Aluno {
	private Long id;
	private String nome;
	private List<String> hobbies;
}