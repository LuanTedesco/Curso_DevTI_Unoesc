package br.edu.unoesc.teste_templates.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.unoesc.teste_templates.model.Aluno;
import br.edu.unoesc.teste_templates.model.Pessoa;

@Controller	
public class TesteController {
	@GetMapping("/")
	public String home(Model model) {
		Map<String, Object> dados = new HashMap<String, Object>();
		dados.put("nome", "Herculano");
		dados.put("valor", 42);
		
		model.addAttribute("nome", "Unoesc");
		model.addAttribute("dados", dados);
		model.addAttribute("descricao", "Tutorial do <strong>Thymeleaf</strong>");
		
		return "index";
	}
	
	@GetMapping("/perfil")
	public ModelAndView perfil(Model model) {
		model.addAttribute("perfil", new Pessoa(1L, 
												"Sr.",
												"Herculano", 
												"De Biasi",
												new GregorianCalendar(1975, 6, 6).getTime(),
												LocalDate.of(1975, 6, 6),
												LocalDateTime.of(1975, 6, 6, 2, 0),
												Instant.now(),
												new BigDecimal("123.45")));
		
		return new ModelAndView("perfil");
	}
	
	@GetMapping("/funcionalidades")
	public String funcionalidades(ModelMap model) {
		model.addAttribute("frutas", List.of("Maçã", "Banana", "Mamão"));

		Aluno a1 = new Aluno(1L, "Fulano", Arrays.asList("Ler", "Ver TV", "Caminhar"));
		Aluno a2 = new Aluno(2L, "Beltrano", Arrays.asList("Ouvir música", "Dançar"));
		Aluno a3 = new Aluno(3L, "Sicrano", Arrays.asList("Estudar"));
		
		model.addAttribute("aluno", a3);

		return "funcionalidades";
	}
	
	@GetMapping("/recursos")
	public String recursos(ModelMap model) {
		return "recursos";
	}
	
	@GetMapping("/locale")
	public String locale(ModelMap model, Locale locale) {
		System.out.println(locale.toString());

		LocalDate data = LocalDate.now();
		
		DateTimeFormatter dtfs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale);
		String dataCurta = dtfs.format(data);
		
		DateTimeFormatter dtfl = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(locale);
		String dataLonga = dtfl.format(data);
		
		System.out.println("-----");

		SimpleDateFormat dateFormat = new SimpleDateFormat();
		dateFormat.applyPattern("dd 'de' MMMM 'de' yyyy");
		System.out.println(dateFormat.format(Calendar.getInstance().getTime()));
		
		model.addAttribute("dataCurta", dataCurta);
		model.addAttribute("dataLonga", dataLonga);

		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		String precoLocalizado = numberFormat.format(123.45);
		
		model.addAttribute("quantidade", 42);
		model.addAttribute("preco", precoLocalizado);
		model.addAttribute("valor", new BigDecimal("123.45"));
		
		return "internacionalizacao";
	}
}