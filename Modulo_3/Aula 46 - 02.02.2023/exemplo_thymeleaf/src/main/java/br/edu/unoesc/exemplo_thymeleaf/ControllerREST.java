package br.edu.unoesc.exemplo_thymeleaf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerREST {
	@RequestMapping("/rest")
	String home() {
		return "<h3>Olá Spring Boot!!!</h3>";
	}
	
	@GetMapping("/rest/ola")
	public String ola(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
		return String.format("Olá %s!", nome);
	}
}