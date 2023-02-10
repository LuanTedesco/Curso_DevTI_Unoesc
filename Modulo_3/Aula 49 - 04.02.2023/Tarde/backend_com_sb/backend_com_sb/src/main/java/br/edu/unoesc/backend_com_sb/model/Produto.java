package br.edu.unoesc.backend_com_sb.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {
	private Long id;
	private String descricao;
	private Integer quantidade;
	private BigDecimal valor;
}
