CREATE TABLE categoria (
	cod_categoria SERIAL PRIMARY KEY,
	categoria VARCHAR(50) NOT NULL
);

insert into categoria values(1, 'Fertilizantes');

select * from categoria;

CREATE TABLE cliente (
	cod_cliente SERIAL PRIMARY KEY,
	nome VARCHAR(50) NOT null,
	cpf VARCHAR(50) NOT null,
	identidade VARCHAR(50) NOT null,
	endereco VARCHAR(50) NOT null,
	cep VARCHAR(50) NOT null,
	telefone VARCHAR(50) NOT null
);

insert into cliente values(1, 'Fran', '333333','22222', 'rua x', '999999','49 999999');

select * from cliente;

CREATE TABLE produtos (
	cod_produto SERIAL PRIMARY KEY,
	produto VARCHAR(50) NOT null,
	cod_categoria integer not null,
	preco_unitario decimal NOT NULL,
	custo decimal NOT NUll,
	quantidade int not null,
	classificacao VARCHAR(8) NOT NULL,
	obs text,
	FOREIGN KEY (cod_categoria) REFERENCES categoria(cod_categoria)
);

insert into produtos values(1, 'inseticida mirato', '1','500', '400', '40','ncm', '');
select * from produtos;

create table pedidos (
	cod_pedido SERIAL primary key,
	cod_produto integer not null,
	cod_cliente integer not null,
	quantidade integer,
	valor_total decimal,
	FOREIGN KEY (cod_produto) REFERENCES produtos(cod_produto),
	FOREIGN KEY (cod_cliente) REFERENCES cliente(cod_cliente)
	);

insert into pedidos values(1,1,1,10,5000);

select produtos.produto, cliente.nome, pedidos.quantidade, pedidos.valor_total 
           from produtos, cliente, pedidos 
           where produtos.cod_produto = pedidos.cod_pedido and pedidos.cod_cliente = cliente.cod_cliente;

