package aula2025_09_30.lista11.questao03;

import aula2025_09_30.lista11.questao02.Animal;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(double peso, Integer idade, String alimento, double velocidade, String caracteristica) {
        super(peso, idade, alimento, velocidade);
        setCaracteristica(caracteristica);
    }

    public String getCaracteristica() { return caracteristica; }
    public void setCaracteristica(String caracteristica) { this.caracteristica = (caracteristica == null) ? "" : caracteristica; }

    public void dadosDoPeixe() {
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Alimento: " + getAlimento());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Caracteristica: " + getCaracteristica());
    }
}
