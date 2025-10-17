package aula2025_09_30.lista11.questao02;

public class Gato extends Felino {
    private String raca;

    public Gato(String nomeAnimal, double peso, Integer idade, String alimento, double velocidade, String raca) {
        super(nomeAnimal, peso, idade, alimento, velocidade);
        setRaca(raca);
    }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = (raca == null) ? "" : raca; }

    public void miar() {
        System.out.println("Miau!");
    }
}
