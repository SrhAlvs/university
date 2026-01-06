package aula2025_12_02.lista13.questao02;

public abstract class Funcionario implements Pagamento {
    private String nome;

    public Funcionario(String nome) { setNome(nome); }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = (nome == null) ? "" : nome; }
}
