package br.edu.ifg.luziania.programacaoiiijavafx;

public class Usuario {
    private String nome;
    private String senha;
    private String descricao;
    private String sexo;
    private String linguagem;
    private boolean termos;

    public Usuario(String nome, String senha, String descricao,
                   String sexo, String linguagem, boolean termos) {
        this.nome = nome;
        this.senha = senha;
        this.descricao = descricao;
        this.sexo = sexo;
        this.linguagem = linguagem;
        this.termos = termos;
    }

    public String getNome() { return nome; }
    public String getSenha() { return senha; }
    public String getDescricao() { return descricao; }
    public String getSexo() { return sexo; }
    public String getLinguagem() { return linguagem; }
    public boolean isTermos() { return termos; }
}
