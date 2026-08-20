CREATE DATABASE escola;

USE escola;

CREATE TABLE aluno (
    id_aluno INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

CREATE TABLE disciplina (
    id_disciplina INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    carga_horaria INTEGER
);

CREATE TABLE matricula (
    id_matricula INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    id_aluno INT UNSIGNED,
    id_disciplina INT UNSIGNED,
    CONSTRAINT FK_matricula_aluno FOREIGN KEY (id_aluno) REFERENCES aluno(id_aluno),
    CONSTRAINT FK_matricula_disciplina FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina)
);

INSERT INTO aluno (nome)
VALUES
    ('Ana Clara'),
    ('Bruna Patrícia'),
    ('Clara Cairé'),
    ('Daniel Marcondes'),
    ('Eduardo Paulino'),
    ('Felipe Daniel');

INSERT INTO disciplina (nome, carga_horaria)
VALUES
    ('Algoritmos e Técnicas de Programação', 54),
    ('Programação II', 54),
    ('Programação III', 54),
    ('Banco de Dados I', 54),
    ('Banco de Dados II', 54),
    ('Matemática Financeira', 27);

INSERT INTO matricula (id_aluno, id_disciplina)
VALUES
    (1, 6),
    (2, 5),
    (3, 4),
    (4, 3),
    (5, 2),
    (6, 1);

SELECT a.nome, d.nome
FROM matricula m JOIN aluno a JOIN disciplina d
ON m.id_aluno = a.id_aluno
AND m.id_disciplina = d.id_disciplina;