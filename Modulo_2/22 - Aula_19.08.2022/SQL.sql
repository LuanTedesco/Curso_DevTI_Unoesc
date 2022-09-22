# Ctrl + Enter executa o comando atual
# Ctrl + Shift + Enter executa o bloco de comandos selecionado

# Cria o banco de dados
CREATE DATABASE unoesc;

# Seleciona um banco de dados
USE unoesc;

# Apaga todo o banco de dados
DROP DATABASE unoesc;

# Cria a tabela aluno
CREATE TABLE IF NOT EXISTS aluno (
	id_aluno INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    endereco VARCHAR(70) NOT NULL,
    estado CHAR(2) NOT NULL DEFAULT 'SC',
    data_nascimento DATE DEFAULT (date_format(now(), '%Y-%m-%d')),
    sexo ENUM('m', 'f', 'n') NOT NULL DEFAULT 'n',
    salario DECIMAL(10, 2) NOT NULL CHECK(salario >= 0) DEFAULT 1000.00
) ENGINE = InnoDB;

# Trunca a tabela (apaga todos os registros dela)
TRUNCATE aluno;

# Exclui a tabela (remove ela fisicamente do disco)
DROP TABLE aluno;

# Insere registro usando todos os campos
INSERT INTO aluno VALUES(null, 'Fulano da Silva', 'Av.X, 10', 'SC', '1980-01-01', 'm', 1000.00);
INSERT INTO aluno VALUES(null, 'Beltrano da Silva', 'Av.X, 50', 'SC', '1970-10-31', 'm', 3000.00);
INSERT INTO aluno VALUES(null, 'Sicrano da Silva', 'Rua Y, 25', 'PR', '1990-05-15', 'm', 1000.00);
INSERT INTO aluno VALUES(null, 'Maria das Dores', 'Av.Z, 50', 'SP', '2000-02-28', 'f', 10000.00);
INSERT INTO aluno VALUES(null, 'Maria Pereira', 'Alameda W, 42', 'SP', '1985-11-23', 'f', 15000.00);

# Insere registro especificando somente alguns campos
INSERT INTO aluno (id_aluno, nome, endereco) VALUES (1, 'João', 'Rua dos Programadores');

# Modifica registro
UPDATE aluno SET salario = 1234.56 WHERE id_aluno = 1;

# Exclui registro
DELETE FROM aluno WHERE id_aluno = 1;

# Consulta/mostra todos os dados da tabela
SELECT * FROM aluno;

# Lista os nomes em ordem alfabética decrescente
SELECT nome FROM aluno ORDER BY nome DESC;

# Altera a localização para Português Brasil
SET lc_time_names='pt_BR';
# Mostra a data de nascimento formatada (%d representa o dia, %M representa o mês por extenso e %Y ano com 4 dígitos
SELECT nome, date_format(data_nascimento, '%d de %M de %Y') as 'data de nascimento' FROM aluno;

# Mostra alunos que se chamam 'Fulano da Silva' ou cujo salário é 1000
SELECT * FROM aluno WHERE nome = 'Fulano da Silva' OR salario = 1000;

# Seleciona todos os registros cujo nome termina com 'Silva'
SELECT nome FROM aluno
WHERE nome LIKE '%Silva';

# Seleciona todos os registros cujo nome inicia com 'Maria'
SELECT nome FROM aluno
WHERE nome LIKE 'Maria%';

# Seleciona todos os registros cujo salário está entre 1000 e 3000
SELECT nome, salario FROM aluno
WHERE salario >= 1000 AND salario <= 3000;

# Seleciona todos os registros cujo salário está entre 1000 e 3000
SELECT nome, salario FROM aluno
WHERE salario BETWEEN 1000 AND 3000;

# Seleciona todos os registros que nasceram entre 1970 e 1990
SELECT nome, data_nascimento FROM aluno
WHERE year(data_nascimento) BETWEEN 1970 AND 1990;

# Mostra a média salarial de cada estado mas só se for maior ou igual a 5000
SELECT estado, round(avg(salario), 2) as 'média salarial' 
FROM aluno
GROUP BY estado
HAVING avg(salario) >= 5000;

# Mostra alunos que nasceram antes de 1990
SELECT nome, data_nascimento FROM aluno 
WHERE year(data_nascimento) < 1990;

# Mostra alunos que nasceram em São Paulo
SELECT nome, estado FROM aluno WHERE estado = 'SP';

# Mostra nome e salário em formato monetário
SELECT nome, concat('R$ ', format(salario, 2, 'de_DE')) AS 'salário' FROM aluno;

# Exibe somente alunos que ganham a partir de 5.000,00
SELECT nome, salario FROM aluno
WHERE salario >= 5000;

# Mostra os salários máximo e mínimo
SELECT max(salario) AS 'maior salário', min(salario) AS 'menor salário'
FROM aluno;