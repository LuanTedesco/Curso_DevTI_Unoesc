package br.edu.unoesc.funcionarios.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.edu.unoesc.funcionarios.model.Funcionario;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
public class FuncionarioDTO implements Serializable {
	Long id;

	@NotBlank(message = "É obrigatório informar um nome!")
	@Size(min = 1, max = 100, message = "O nome deve ter entre {min} e {max} caracteres")
	String nome;

	@NotBlank(message = "É obrigatório informar um endereço!")
	@Size(min = 1, max = 100, message = "O endereço deve ter entre {min} e {max} caracteres")
	String endereco;

	@Size(min = 1, max = 10, message = "O número de dependentes deve ter entre {min} e {max} caracteres")
	Integer numDep;
	BigDecimal salario;

	@NotBlank(message = "É obrigatório informar uma data de nascimento!")
	LocalDate nascimento;;

	public FuncionarioDTO(Funcionario funcionario) {
		this.id = funcionario.getId();
		this.nome = funcionario.getNome();
		this.endereco = funcionario.getEndereco();
		this.numDep = funcionario.getNumDep();
		this.salario = funcionario.getSalario();
		this.nascimento = funcionario.getNascimento();
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