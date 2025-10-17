package aula2025_09_30.lista11.questao02;

public class Felino extends Animal {
    public Felino(String nomeAnimal, double peso, Integer idade, String alimento, double velocidade) {
        super(nomeAnimal, peso, idade, alimento, velocidade);
    }

    public void ronronar() {
        System.out.println("Ronronando...");
    }
}
