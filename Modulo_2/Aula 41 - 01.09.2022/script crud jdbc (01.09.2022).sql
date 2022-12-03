CREATE DATABASE IF NOT EXISTS unoesc_crud_jdbc;
USE unoesc_crud_jdbc;

CREATE TABLE IF NOT EXISTS produto (
	id_prod INT AUTO_INCREMENT PRIMARY KEY,
	nome_prod VARCHAR(40) NOT NULL,
    data_cadastro DATE NOT NULL,
    quantidade INT NOT NULL CHECK(quantidade>=0),
    preco DECIMAL(12, 2) NOT NULL CHECK(preco>=0)
) ENGINE=InnoDB;

ALTER TABLE produto ADD UNIQUE INDEX (
	nome_prod, data_cadastro, quantidade, preco
);

INSERT INTO produto VALUES (null, 'Mesa', '2022-08-26', 10, 10000);

SELECT * FROM produto;
SELECT * FROM produto WHERE id_prod=1;