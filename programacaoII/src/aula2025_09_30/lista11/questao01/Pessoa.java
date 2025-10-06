package aula2025_09_30.lista11.questao01;

import java.util.Date;

public class Pessoa {
    private String nome, genero;
    private Date dataNascimento;

    public Pessoa(String nome, String genero, Date dataNascimento) {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { this.nome = (nome == null) ? "" : nome; }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) { this.genero = (genero == null) ? "" : genero; }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {

    }
}