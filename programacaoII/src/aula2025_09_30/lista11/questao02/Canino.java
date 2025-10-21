package aula2025_09_30.lista11.questao02;

public class Canino extends Animal{
    private String habitat;

    public Canino(String nomeAnimal, double peso, Integer idade, String alimento, double velocidade, String habitat) {
        super(nomeAnimal, peso, idade, alimento, velocidade);
        setHabitat(habitat);
    }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = (habitat == null) ? "" : habitat; }
}
