CREATE DATABASE IF NOT EXISTS relacionamentos;
USE relacionamentos;

CREATE TABLE IF NOT EXISTS empregado (
    nome_emp VARCHAR(40) NOT NULL,
    end_emp VARCHAR(40) NOT NULL,
    nome_depto VARCHAR(30) NOT NULL
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS departamento (
    nome_depto VARCHAR(40) NOT NULL,
    gerente_depto VARCHAR(30) NOT NULL
) ENGINE = InnoDB;

INSERT INTO empregado VALUES ('Pedro', 'Rua X', 'Finanças'),
							 ('Ana', 'Rua Y', 'Vendas'),
							 ('Jorge', 'Rua Z', 'Finanças'),
                             ('Maria', 'Rua X', 'Vendas'),
                             ('Marcia', 'Rua Y', 'Executivo');
                             
INSERT INTO departamento VALUES ('Vendas', 'Maria'), ('Produção', 'Gabriel');