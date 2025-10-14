package aula2025_09_30.lista11.questao02;

public class Onca extends Felino{
    public Onca(double peso, Integer idade, String alimento, double velocidade) {
        super(peso, idade, alimento, velocidade);
    }

    public void rosnar() {
        System.out.println("Grrrr!");
    }
}
