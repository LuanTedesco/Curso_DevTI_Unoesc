package br.edu.unoesc.exemplo_H2.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.exemplo_H2.model.Livro;
import br.edu.unoesc.exemplo_H2.repository.LivroRepository;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
	private Logger logger = Logger.getLogger(LivroController.class.getName()); 
	
	@Autowired
	private LivroRepository repositorio;
	
	@GetMapping
	public Iterable<Livro> listarTudo() {
		return repositorio.findAll();
	}

	@RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Livro porId(@PathVariable Long id) {
		return repositorio.findById(id).get();
	}
	
	@RequestMapping(value = "/xml/{id}", headers = "Accept=application/xml")
	public Livro porIdXML(@PathVariable Long id) {
		return repositorio.findById(id).get();
	}
	
	@GetMapping("/find")
	List<Livro> listarComFiltro(@RequestParam("filtro") String filtro) {
		return repositorio.findByFiltro(filtro);
	}
	
	@GetMapping("/paginas/{paginas}")
	public List<Livro> porQdtPaginas(@PathVariable Integer paginas) {
		return repositorio.porQtdPaginas(paginas);
	}
	
    @PostMapping()
    public Livro incluir(@RequestBody Livro livro) {
        return repositorio.save(livro);
    }
    
    @PostMapping(value = "/xml", 
    		//consumes = MediaType.APPLICATION_XML_VALUE,
    		produces = MediaType.APPLICATION_XML_VALUE)
    public Livro incluirXML(@RequestBody Livro livro) {
        return repositorio.save(livro);
    }
 
    @PutMapping("/{id}")
    public Livro atualizar(@PathVariable("id") Long id, @RequestBody Livro livro) {
    	// Versão mais simplificada, não faz uso do id nem testa se o recurso existe
        return repositorio.save(livro);
    }
 
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id) {
		repositorio.deleteById(id);
    }
    
    @GetMapping("/somar-query")
    public Double somarQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1,
    						 @RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
    	return numero1 + numero2;
    }
    
    @RequestMapping(value = "/somar-path/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double somarPath(@PathVariable("numero1") String numero1,
    					    @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	if (!ehNumerico(numero1) || !ehNumerico(numero2)) {
    		return 0d;
    	}
    	
    	return converterParaDouble(numero1) + converterParaDouble(numero2);
    }

	private boolean ehNumerico(String strNumero) {
		if (strNumero == null) {
			logger.info("Valor ausente!");
			return false;
		}
		
		// 10,65 => 10.65
		String numero = strNumero.replaceAll(",", ".");
		
		// Utilizando tratamento de exceções
		try {
			System.out.println(Double.parseDouble(numero));
			return true; // Significa que a string contém um Double válido
		} catch (NumberFormatException e) {
			return false;
		}
		
		// Utilizando expressões regulares
//		return numero.matches("[-+]?\\d*\\.?\\d*");
	}
	
	private Double converterParaDouble(String strNumero) {
		if (strNumero == null) {
			return 0d;
		}
		
		String numero = strNumero.replaceAll(",", ".");
		if (ehNumerico(numero)) {
			return Double.parseDouble(numero);
		}
		
		return 0d;
	}
}












