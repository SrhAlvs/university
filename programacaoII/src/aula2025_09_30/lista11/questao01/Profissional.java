package aula2025_09_30.lista11.questao01;

import java.time.LocalDate;

public class Profissional extends Pessoa{
    private Integer registroProfissional;
    private String cargo;

    public Profissional(String nome, LocalDate nascimento, String genero, Integer registroProfissional, String cargo) {
        super(nome, nascimento, genero);
        setRegistroProfissional(registroProfissional);
        setCargo(cargo);
    }

    public Integer getRegistroProfissional() { return registroProfissional; }
    public void setRegistroProfissional(Integer registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = (cargo == null) ? "Não informado" : cargo; }

    public void exibirDadosProfissionais() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getNascimento());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Registro Profissional: " + getRegistroProfissional());
        System.out.println("Cargo: " + getCargo());
    }
}
