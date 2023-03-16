package br.edu.unoesc.teste_templates.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa {
	private Long id;
	private String titulo;
	private String nome;
	private String sobrenome;
	
	private Date nascimento;				// API antiga
	private LocalDate dataLocal;			// ISO-8601 sem informação de fuso horário
	private LocalDateTime dataHoraLocal;
	private Instant log;					// UTC
	
	private BigDecimal salario;
}