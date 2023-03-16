package br.edu.unoesc.livros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.unoesc.livros.model.Livro;
import br.edu.unoesc.livros.service.LivroService;

@Controller
@RequestMapping("/livros")
public class LivroController {
	@Autowired
	private LivroService servico;
	
	@GetMapping("/paginas")
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
		
		return "paginacao";
	} 
}
