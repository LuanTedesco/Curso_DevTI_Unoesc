package br.edu.unoesc.funcionarios.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.unoesc.funcionarios.dto.FuncionarioDTO;
import br.edu.unoesc.funcionarios.model.Funcionario;
import br.edu.unoesc.funcionarios.service.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
	@Autowired
	private FuncionarioService servico;

	@GetMapping("/listar")
	public String listarPaginas(@RequestParam(value = "nome", defaultValue = "") String nome,
			@RequestParam(value = "pagina", defaultValue = "0") Integer pagina,
			@RequestParam(value = "tamPagina", defaultValue = "8") Integer tamPagina,
			@RequestParam(value = "ordenacao", defaultValue = "nome") String campo,
			@RequestParam(value = "direcao", defaultValue = "ASC") String direcao, ModelMap modelo) {

		Page<Funcionario> buscaPaginada = servico.buscaPaginadaPorNome(nome, pagina, tamPagina, campo, direcao);

		modelo.addAttribute("pagina", buscaPaginada);
		modelo.addAttribute("numRegistros", buscaPaginada.getNumberOfElements());
		modelo.addAttribute("nome", nome);
		modelo.addAttribute("tamanhoPagina", tamPagina);
		modelo.addAttribute("campoOrdenacao", campo);
		modelo.addAttribute("direcaoOrdenacao", direcao);
		modelo.addAttribute("direcaoReversa", direcao.equals("ASC")?"DESC":"ASC");

		return "paginacao";
	}

	@GetMapping("/cadastrar")
	public String cadastrar(FuncionarioDTO funcionarioDTO) {
		return "funcionario/cadastro";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid FuncionarioDTO funcionarioDTO, BindingResult resultado,RedirectAttributes atributo) {
		Funcionario funcionario = servico.fromDTO(funcionarioDTO);

		if(resultado.hasErrors()) {
			return "/funcionario/cadastro";
		}

		servico.incluir(funcionario);
		atributo.addFlashAttribute("sucesso", "Funcionario inserido com sucesso!");

		return "redirect:/funcionarios/listar";
	}

	@GetMapping("/editar/{id}")
	public String iniciarEdicao(@PathVariable("id") Long id, Model model)  {
		model.addAttribute("funcionarioDTO", new FuncionarioDTO(servico.buscarPorId(id)));

		return "funcionario/cadastro";
	}

	@PostMapping("/editar")
	public String finalizarEdicao(@Valid FuncionarioDTO funcionarioDTO, BindingResult resultado, RedirectAttributes atributo) {
		Funcionario funcionario = servico.fromDTO(funcionarioDTO);

		if(resultado.hasErrors()) {
			return "/funcionario/cadastro";
		}

		servico.alterar(funcionario.getId(), funcionario);
		atributo.addFlashAttribute("sucesso", "Funcionario editado com sucesso!");

		return "redirect:/funcionarios/listar";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes atributo) {
		servico.excluir(id);
		atributo.addFlashAttribute("sucesso", "Funcionario excluído com sucesso!");

		return "redirect:/funcionarios/listar";
	}

}
