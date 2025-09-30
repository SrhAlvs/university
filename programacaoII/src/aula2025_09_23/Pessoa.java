package aula2025_09_23;

public class Pessoa {
    //característica ou atributo
    private String nome;
    private int idade;

    //construtor padrão ou vazio.
    public Pessoa(){
        setNome(null);
    }

    //construtor completo
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null)
            this.nome = "";
        else
            this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade < 0)
            this.idade = 0;
        else
            this.idade = idade;
    }

    public void exibirAtributos(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
