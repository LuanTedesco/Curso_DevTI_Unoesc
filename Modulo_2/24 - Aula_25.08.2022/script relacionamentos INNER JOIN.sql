CREATE DATABASE IF NOT EXISTS unoesc_relacionamentos;
USE unoesc_relacionamentos;

CREATE TABLE IF NOT EXISTS departamento (
	id_dep INT AUTO_INCREMENT PRIMARY KEY,
	nome_dep VARCHAR(40) NOT NULL
) ENGINE=InnoDB;

INSERT INTO departamento (nome_dep) VALUES ('Tecnologia da Informação');
INSERT INTO departamento (nome_dep) VALUES ('Marketing');
INSERT INTO departamento (nome_dep) VALUES ('Financeiro');

CREATE TABLE IF NOT EXISTS cargo (
	id_cargo INT AUTO_INCREMENT PRIMARY KEY,
	id_dep INT NOT NULL,
	nome_cargo VARCHAR(40) NOT NULL
#	FOREIGN KEY (id_dep) REFERENCES departamento(id_dep)
) ENGINE=InnoDB;

INSERT INTO cargo VALUES (1, 1, 'Analista de Sistemas');
INSERT INTO cargo VALUES (2, 1, 'Programador');
INSERT INTO cargo VALUES (3, 2, 'Analista de Marketing');
INSERT INTO cargo VALUES (4, 2, 'Designer');
INSERT INTO cargo VALUES (5, 3, 'Analista de Negócios');
INSERT INTO cargo VALUES (6, 3, 'Contador');

CREATE TABLE IF NOT EXISTS funcionario (
	id_func INT AUTO_INCREMENT PRIMARY KEY,
	id_cargo INT,    
	nome_func VARCHAR(50) NOT NULL,
	escolaridade ENUM('Ensino fundamental', 'Ensino médio', 
					  'Graduação', 'Especialização', 'Mestrado', 
                      'Doutorado'),
	salario DECIMAL NOT NULL
#	FOREIGN KEY(id_cargo) REFERENCES cargo(id_cargo)
) ENGINE=InnoDB;

INSERT INTO funcionario VALUES(1, 2, 'André', 'Especialização', 1000);
INSERT INTO funcionario VALUES(2, 1, 'Fabiana', 'Ensino fundamental', 2000);
INSERT INTO funcionario VALUES(3, 3, 'Luis', 'Graduação', 700);
INSERT INTO funcionario VALUES(4, 5, 'Alfredo', 'Especialização', 2300);
INSERT INTO funcionario VALUES(5, 4, 'Patricia', 'Doutorado', 2600);
INSERT INTO funcionario VALUES(6, 6, 'Ricardo', 'Graduação', 1000);
INSERT INTO funcionario VALUES(7, 5, 'Thais', 'Graduação', 1100);
INSERT INTO funcionario VALUES(8, 6, 'Pedro', 'Ensino médio', 900);
INSERT INTO funcionario VALUES(9, 4, 'Flavia', 'Mestrado', 2300);
INSERT INTO funcionario VALUES(10, 2, 'Fernanda', 'Ensino médio', 800);