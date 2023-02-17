package br.edu.unoesc.exemplo_H2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.unoesc.exemplo_H2.model.Aluno;
import br.edu.unoesc.exemplo_H2.repository.AlunoRepository;

@SpringBootApplication
public class ExemploH2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExemploH2Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(AlunoRepository repositorio) {
		return args -> {
			Aluno l = new Aluno(null, "Rafa", new BigDecimal(676), new Date("01/01/2023"));
			l = repositorio.save(l);
			System.out.println(l);

			repositorio.save(new Aluno(null, "Paulo", new BigDecimal(5000), new Date("01/12/2025")));
			repositorio.delete(l);

			Optional<Aluno> p = repositorio.findById(2L);
			if (p.isEmpty()) {
				System.out.println("Registro não encontrado!");
			} else {
				System.out.println(p.get());
			}

//			Livro antigo = repositorio.findById(3).get();
//			antigo.setTitulo("Título nada a ver");
//			antigo.setPaginas(100);
//			antigo.setAutor("Fulano da Silva");
//			repositorio.save(antigo);

			System.out.println(repositorio.findAll());

			for (var aluno : repositorio.findByNomeContainingIgnoreCase("j")) {
				System.out.println(aluno);
			}

			for (var aluno : repositorio.porSalario(new BigDecimal(300))) {
				System.out.println(aluno);
			}

			for (var aluno : repositorio.findByFiltro("luan")) {
				System.out.println(aluno);
			}
		};
	}
}
