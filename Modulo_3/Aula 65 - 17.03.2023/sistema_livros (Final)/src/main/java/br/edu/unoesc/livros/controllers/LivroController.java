package br.edu.unoesc.livros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.unoesc.livros.model.Livro;
import br.edu.unoesc.livros.service.LivroService;

@Controller
@RequestMapping("/livros")
public class LivroController {
	@Autowired
	private LivroService servico;
	
	@GetMapping("/listar")
	public String listarPaginas(
				@RequestParam(value="titulo", defaultValue = "") String titulo,
				@RequestParam(value="pagina", defaultValue = "0") Integer pagina,
				@RequestParam(value="tamPagina", defaultValue = "8") Integer tamPagina,
				@RequestParam(value="ordenacao", defaultValue = "titulo") String campo,
				@RequestParam(value="direcao", defaultValue = "ASC") String direcao,
				ModelMap modelo
			) {
		Page<Livro> buscaPaginada = servico.buscaPaginadaPorTitulo(titulo, pagina, tamPagina, campo, direcao);
		
		modelo.addAttribute("pagina", buscaPaginada);
		modelo.addAttribute("numRegistros", buscaPaginada.getNumberOfElements());
		modelo.addAttribute("titulo", titulo);
		modelo.addAttribute("tamanhoPagina", tamPagina);
		modelo.addAttribute("campoOrdenacao", campo);
		modelo.addAttribute("direcaoOrdenacao", direcao);
		modelo.addAttribute("direcaoReversa", direcao.equals("ASC") ? "DESC" : "ASC");
		
		return "livro/lista";
	}
	
	@GetMapping("/cadastrar")
	public String cadastro(Livro livro) {
		return "livro/cadastro";
	}
	
	@PostMapping("/salvar")
	public String salvar(Livro livro, RedirectAttributes atributo) {
		servico.incluir(livro);
		
		atributo.addFlashAttribute("sucesso", "Livro inserido com sucesso");
		
		return "redirect:/livros/listar";
	}

	@GetMapping("/editar/{id}")
	public String iniciarEdicao(@PathVariable("id") Long id, Model model) {
		model.addAttribute(servico.buscarPorId(id));
		
		return "livro/cadastro";
	}
	
	@PostMapping("/editar")
	public String finalizarEdicao(Livro livro, RedirectAttributes atributo) {
		servico.alterar(livro.getId(), livro);
		
		atributo.addFlashAttribute("sucesso", "Livro alterado com sucesso");
		
		return "redirect:/livros/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes atributo) {
		servico.excluir(id);
		
		atributo.addFlashAttribute("sucesso", "Livro excluído com sucesso");
		
		return "redirect:/livros/listar";
	}
}