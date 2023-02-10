CREATE TABLE departamentos (
	id_departamento SERIAL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL
);

CREATE TABLE cargos (
	id_cargo SERIAL PRIMARY KEY,
	id_departamento INTEGER NOT NULL,
	nome VARCHAR(50) NOT NULL,
	FOREIGN KEY (id_departamento) REFERENCES departamentos(id_departamento)
);

CREATE TABLE funcionarios (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(60) NOT NULL,
	escolaridade tipo_escolaridade,
	id_cargo INTEGER REFERENCES cargos(id_cargo),
	salario DECIMAL NOT NULL
);

INSERT INTO departamentos VALUES(1, 'TI');
INSERT INTO cargos VALUES(1, 1, 'Desenvolvedor');
INSERT INTO funcionarios VALUES(1, 'André', 'Especialização', 1, 1000);

SELECT * FROM funcionarios ORDER BY nome;
SELECT * FROM funcionarios ORDER BY nome ASC;
SELECT * FROM funcionarios ORDER BY nome DESC;





