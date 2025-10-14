package aula2025_09_30.lista11.questao02;

public class Lobo extends Canino {
    public Lobo(double peso, Integer idade, String alimento, double velocidade, String habitat) {
        super(peso, idade, alimento, velocidade, habitat);
    }

    public void uivar() {
        System.out.println("Auuu!");
    }
}
