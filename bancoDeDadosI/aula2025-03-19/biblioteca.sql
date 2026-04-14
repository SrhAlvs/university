CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE livro (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    autor VARCHAR(255),
    isbn VARCHAR(20),
    quantidadePaginas INT
);

CREATE TABLE usuario (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    cpf VARCHAR(20),
    email VARCHAR(255)
);

CREATE TABLE emprestimos (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    id_livro INT UNSIGNED,
    id_usuario INT UNSIGNED,
    data_emprestimo DATE,
    FOREIGN KEY (id_livro) REFERENCES livro(id),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

INSERT INTO livro (titulo, autor, isbn, quantidadePaginas) VALUES
    ("Tormenta", "C. J. Tudor", "978-6555665024", 336),
    ("As irmãs Blue", "Coco Mellors", "978-6555665024", 400),
    ("O Corvo", "Edgar Allan Poe", "978-6555665024", 200);

INSERT INTO usuario (nome, cpf, email) VALUES
    ("Sal Alves", "000.111.222-33", "sssarahalves@gmail.com"),
    ("Fê Ventura", "444.555.666-77", "fefeventura@gmail.com"),
    ("Dadi Cocozinho", "888.999.000-11", "eusoucoco@gmail.com");

-- resgistrando 
INSERT INTO emprestimos (id_livro, id_usuario, data_emprestimo) VALUES 
	(1, 2, '2026-03-07');

INSERT INTO emprestimos (id_livro, id_usuario, data_emprestimo) VALUES 
	(2, 1, '2026-03-10');

INSERT INTO emprestimos (id_livro, id_usuario, data_emprestimo) VALUES 
	(3, 3, '2026-03-19');

SELECT l.titulo, l.isbn, u.nome, u.email
FROM emprestimos e
JOIN usuario u ON e.id_usuario = u.id
JOIN livro l ON e.id_livro = l.id;