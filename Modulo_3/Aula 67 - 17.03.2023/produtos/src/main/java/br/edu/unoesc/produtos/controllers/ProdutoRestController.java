package br.edu.unoesc.produtos.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.produtos.model.Produto;

@RestController
@RequestMapping(value = "/api")
public class ProdutoRestController {
	List<Produto> produtos = new ArrayList<>();
	
	public ProdutoRestController() {
		produtos.add(new Produto(1L, "Mesa", 10, new BigDecimal("3.33")));
		produtos.add(new Produto(2L, "Cadeira", 20, new BigDecimal("33.33")));
		produtos.add(new Produto(3L, "Notebook", 0, new BigDecimal("3333.33")));
	}
	
	// Incluir produto
	@PostMapping("/produtos")
	public Produto salvarProduto(@RequestBody Produto produto) {
		System.out.println("Inserindo um novo produto...");
		System.out.println(produto);
		
		produtos.add(produto);
		
		System.out.println(this.listarProdutos());
		
		return produto;
	}
	
	// Alterar produto
	@PutMapping("/produtos")
	public Produto atualizarProduto(@RequestBody Produto produto) {
		Produto p = findById(produto.getId());
		System.out.println(p);
		
		p.setDescricao(produto.getDescricao());
		p.setQuantidade(produto.getQuantidade());
		p.setValor(produto.getValor());
		
		System.out.println("Atualizando o produto...");
		System.out.println(p);
		
		System.out.println(this.listarProdutos());
		
		return p;
	}
	
	// Excluir produto
	@DeleteMapping(value = "/produtos/{id}")
	public void deletarProduto(@PathVariable Long id) {
		Produto p = findById(id);
		System.out.println(p);
		
		produtos.remove(p);
		
		System.out.println("Excluindo produto [" + id + "]...");
		
		System.out.println(this.listarProdutos());
	}
	
	@GetMapping(value = "/produtos")
	public List<Produto> listarProdutos() {
		return produtos;
	}
	
	@GetMapping(value = "/produtos/{id}")
	public Produto findById(@PathVariable Long id) {
		for (Produto produto : produtos) {
			if (produto.getId().equals(id)) {
				return produto;
			}
		}
		
		return null;
	}
}
