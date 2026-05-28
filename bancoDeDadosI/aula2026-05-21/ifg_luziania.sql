CREATE DATABASE ifg_luziania;

USE ifg_luziania;

CREATE TABLE curso (
    id_curso INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    modalidade VARCHAR(50), -- técnico, bacharel, pós-graduação
    duracao INTEGER -- semestres
);

CREATE TABLE professor (
    id_professor INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    titulacao VARCHAR(50) -- especialista, mestre, doutor
);

CREATE TABLE aluno (
    id_aluno INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    id_curso INT UNSIGNED,
    nome VARCHAR(100) NOT NULL,
    idade INTEGER,
    semestre INTEGER,
    FOREIGN KEY (id_curso) REFERENCES curso(id_curso)
);

CREATE TABLE disciplina (
    id_disciplina INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    id_professor INT UNSIGNED,
    nome VARCHAR(100) NOT NULL,
    carga_horaria INTEGER,
    FOREIGN KEY (id_professor) REFERENCES professor(id_professor)
);

CREATE TABLE matricula (
    id_aluno INT UNSIGNED,
    id_disciplina INT UNSIGNED,
    nota NUMERIC(4,2),
    PRIMARY KEY (id_aluno, id_disciplina),
    FOREIGN KEY (id_aluno) REFERENCES aluno(id_aluno),
    FOREIGN KEY (id_disciplina) REFERENCES disciplina(id_disciplina)
);

INSERT INTO curso (nome, modalidade, duracao) VALUES
    ('Engenharia de Software', 'Bacharel', 10),
    ('Eletrotécnica', 'Técnico', 4),
    ('Matemática', 'Licenciatura', 8);

INSERT INTO professor (nome, titulacao) VALUES
    ('Alan Turing', 'Doutor'),
    ('Ada Lovelace', 'Mestre'),
    ('Grace Hopper', 'Especialista'),
    ('Tim Berners-Lee', 'Doutor');

INSERT INTO aluno (id_curso, nome, idade, semestre) VALUES
    (1, 'Ana Clara Silva', 17, 1),
    (2, 'Bruno Mendes', 21, 3),
    (1, 'Carlos Eduardo Costa', 18, 2),
    (3, 'Daniela Rocha', 23, 6),
    (2, 'Eduardo Lima', 22, 5),
    (3, 'Fernanda Martins', 19, 1),
    (3, 'Gabriel Souza', 24, 8),
    (1, 'Helena Nunes', 20, 3),
    (2, 'Igor Ferreira', 21, 4),
    (2, 'Juliana Castro', 25, 7);

INSERT INTO disciplina (id_professor, nome, carga_horaria) VALUES
    (1, 'Teoria da Computação', 80),
    (2, 'Lógica de Programação', 60),
    (3, 'Construção de Compiladores', 60),
    (4, 'Desenvolvimento Web e Redes', 40);

INSERT INTO matricula (id_aluno, id_disciplina, nota) VALUES
    -- Aluno 21 cursando duas disciplinas
    (21, 1, 9.50),
    (21, 2, 8.00),

    -- Aluno 22 e 23 cursando uma disciplina cada
    (22, 3, 7.75),
    (23, 4, 10.00),

    -- Aluno 24 cursando duas disciplinas (com uma nota mais baixa)
    (24, 1, 5.50),
    (24, 4, 6.00),

    -- Alunos 25 a 29 bem distribuídos
    (25, 2, 8.25),
    (26, 3, 9.00),
    (27, 4, 7.50),
    (28, 1, 8.80),
    (29, 2, 9.10),

    -- Aluno 30 gabaritando duas disciplinas
    (30, 3, 9.50),
    (30, 4, 9.80);

UPDATE matricula SET nota = 10.00 WHERE id_aluno = 29;

DELETE FROM matricula WHERE id_aluno = 24;
DELETE FROM aluno WHERE id_aluno = 24;

BEGIN;
    SAVEPOINT antesDoNovoAluno;

    INSERT INTO aluno (id_curso, nome, idade, semestre) VALUES
        (2, 'Rodrigo Pimenta', 28, 1);

    INSERT INTO matricula (id_aluno, id_disciplina, nota) VALUES
        (31, 1, 8.50),
        (31, 4, 7.45);
ROLLBACK TO antesDoNovoAluno;

SELECT a.nome, c.nome, d.nome, p.nome
FROM aluno a JOIN curso c JOIN disciplina d JOIN professor p JOIN matricula m
ON a.id_aluno = m.id_aluno
AND a.id_curso = c.id_curso
AND m.id_disciplina = d.id_disciplina
AND d.id_professor = p.id_professor;

