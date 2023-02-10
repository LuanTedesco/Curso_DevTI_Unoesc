package br.edu.unoesc.exemplo_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerPadrao {
	@RequestMapping("/ola")
	@ResponseBody
	String home() {
		return "Olá Mundo!";
	}
}