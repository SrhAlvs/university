CREATE DATABASE biblioteca;

USE biblioteca; -- usa sempre, vlw

CREATE TABLE estante (
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, -- int: inteiro, unsigned: não pode ser negativo, 
    titulo VARCHAR(100),
    quantidadePaginas INT,
    autor VARCHAR(100)
);

INSERT INTO estante (titulo, quantidadePaginas, autor) VALUES
	("Tormenta", 336, "C. J. Tudor"),
    ("As irmãs Blue", 400, "Coco Mellors"),
    ("O Corvo", 200, "Edgar Allan Poe");

SELECT quantidadePaginas as "Quantidade de páginas", titulo FROM estante; 
-- dá pra por "apelidinhos" nos atributos (colunas) na hora de ver eles heheehhe

SELECT titulo, quantidadePaginas FROM estante WHERE quantidadePaginas > 300;
-- dá pra limitar também hihi

SELECT e.titulo, c.titulo FROM estante e JOIN cliente c;
-- supondo muito suposto que tenho 2 tabelas com atributos de nomes iguais, aí eu posso colocar um "apelido" na tabela pra saber qual atributo que eu tô "puxando"

SELECT * FROM estante;
