package aula2025_09_30.lista11.questao02;

public class Cachorro extends Canino {
    public Cachorro(String nomeAnimal, double peso, Integer idade, String alimento, double velocidade, String habitat) {
        super(nomeAnimal, peso, idade, alimento, velocidade, habitat);
    }

    public void alimentar() {
        System.out.println("Alimentando-se com: " + getAlimento());
    }

    public void latir() {
        System.out.println("Au au!");
    }
}
