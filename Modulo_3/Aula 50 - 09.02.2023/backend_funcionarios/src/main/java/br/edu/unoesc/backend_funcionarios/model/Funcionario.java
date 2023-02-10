package br.edu.unoesc.backend_funcionarios.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Funcionario {
	private Long id;
	private String nome;
	private Integer numDep;
	private BigDecimal salario;

	// Versão com LocalDateTime
//	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss")
//	private LocalDateTime nascimento;
	
	// Versão com LocalDate
//	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="UTC")
	private LocalDate nascimento;
	
//	public String getNascimento() {
//		return nascimento.format(DateTimeFormatter.ISO_LOCAL_DATE);
//	}
}