package aula2025_09_30.lista11.questao01;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;
    private String genero;

    public Pessoa(String nome, LocalDate nascimento, String genero) {
        setNome(nome);
        setNascimento(nascimento);
        setGenero(genero);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = (nome == null) ? "" : nome;}

    public LocalDate getNascimento() { return nascimento; }
    public void setNascimento(LocalDate nascimento) {
        LocalDate dataHoje = LocalDate.now();
        if (nascimento.isBefore(dataHoje) || (nascimento.isEqual(dataHoje))) {
            this.nascimento = nascimento;
        } else {
            this.nascimento = null;
        }
    }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = (genero==null || genero=="") ? "Não informado" : genero;}
}