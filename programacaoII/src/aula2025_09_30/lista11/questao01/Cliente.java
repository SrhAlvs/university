package aula2025_09_30.lista11.questao01;

import java.time.LocalDate;

public class Cliente extends Pessoa{
    private Integer cpf;
    private String endereco;

    public Cliente(String nome, LocalDate nascimento, String genero, Integer cpf, String endereco) {
        super(nome, nascimento, genero);
        setCpf(cpf);
        setEndereco(endereco);
    }

    private Integer getCpf() { return cpf; }
    private void setCpf(Integer cpf) { this.cpf = cpf; }

    private String getEndereco() { return endereco; }
    private void setEndereco(String endereco) { this.endereco = (endereco==null || endereco=="") ? "Não informado" : endereco; }

    public void exibirDadosDoCliente() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getNascimento());
        System.out.println("Gênero: " + getGenero());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
    }
}
