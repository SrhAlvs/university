CREATE DATABASE escola;

USE escola;

CREATE TABLE professores (
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    disciplina VARCHAR(255),
    idade INT
);

INSERT INTO professores (nome, disciplina, idade) VALUES
	("Sandra de Macedo", "Geografia", 120),
    ("Samuel Novais", "Programação Orientada a Objetos", 215),
    ("Pelé", "Dribles e Embaixadinhas III", 837),
    ("Joui Jouki", "Momentos de Aura II", 33),
    ("Ratatouille Jones da Silva", "Engenharia de Alimentos", 2);
    
SELECT * FROM professores ORDER BY idade ASC;