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
	nome_cargo VARCHAR(40) NOT NULL,
    
    # Cria chave estrangeira implementando restrição de integridade referencial
	FOREIGN KEY (id_dep) REFERENCES departamento(id_dep) # ON DELETE CASCADE
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
	salario DECIMAL(12, 2) NOT NULL,
    
    # Cria chave estrangeira implementando restrição de integridade referencial
	FOREIGN KEY(id_cargo) REFERENCES cargo(id_cargo) # ON DELETE CASCADE
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

SELECT * 
FROM departamento d, cargo
ORDER BY d.id_dep;

SELECT nome_dep, nome_cargo FROM departamento d, cargo c
WHERE d.id_dep = c.id_dep;

# Seleciona registros sem repetição de escolaridade
SELECT DISTINCT escolaridade FROM funcionario;

# Utiliza o operador IN para selecionar somente funcionários
# cuja escolaridade seja 'Graduação' ou 'Mestrado'
SELECT id_func, nome_func, escolaridade 
FROM funcionario
WHERE escolaridade IN ('Graduação', 'Mestrado');

# Utiliza o operador IN para selecionar somente funcionários
# cuja escolaridade NÃO seja 'Doutorado'
SELECT id_func, nome_func, escolaridade 
FROM funcionario
WHERE escolaridade NOT IN ('Doutorado');

# Seleciona os 5 salários mais altos
SELECT id_func, nome_func, salario FROM funcionario ORDER BY salario DESC LIMIT 5;

# Faz um JOIN entre as tabelas de funcionários, cargos e departamentos 
# utilizando para isso a cláusula WHERE
SELECT nome_func, nome_cargo, nome_dep
FROM funcionario f, cargo c, departamento d
WHERE f.id_cargo = c.id_cargo AND c.id_dep=d.id_dep
ORDER BY id_func;

# Faz um JOIN entre as tabelas de funcionários, cargos e departamentos 
# utilizando para isso a cláusula JOIN ... ON
SELECT nome_func, nome_cargo, nome_dep
FROM funcionario f
JOIN cargo c ON f.id_cargo = c.id_cargo
JOIN departamento d ON c.id_dep=d.id_dep
ORDER BY id_func;

# Faz um JOIN entre as tabelas de funcionários, cargos e departamentos 
# utilizando para isso a cláusula JOIN ... USING
SELECT nome_func, nome_cargo, nome_dep
FROM funcionario
JOIN cargo USING(id_cargo)
JOIN departamento USING(id_dep)
ORDER BY id_func;

# Faz um JOIN entre as tabelas de funcionários, cargos e departamentos 
# utilizando para isso a cláusula NATURAL JOIN
SELECT nome_func, nome_cargo, nome_dep
FROM funcionario f
NATURAL JOIN cargo
NATURAL JOIN departamento 
ORDER BY id_func;

#DELETE FROM departamento WHERE id_dep = 1;
#DELETE FROM cargo WHERE id_cargo = 4;