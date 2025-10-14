package aula2025_09_30.lista11.questao02;

public class Animal {
    private double peso;
    private Integer idade;
    private String alimento;
    private double velocidade;

    public Animal(double peso, Integer idade, String alimento, double velocidade) {
        setPeso(peso);
        setIdade(idade);
        setAlimento(alimento);
        setVelocidade(velocidade);
    }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = (peso > 0) ? 0 : peso; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = (idade < 0) ? 0 : idade; }

    public String getAlimento() { return alimento; }
    public void setAlimento(String alimento) { this.alimento = (alimento == null) ? "" : alimento; }

    public double getVelocidade() { return velocidade; }
    public void setVelocidade(double velocidade) { this.velocidade = (velocidade > 0) ? 0 : velocidade; }

    protected void comer() {
        System.out.println("Atualmente comendo: " + getAlimento());
    }

    public void mostrarIdade() {
        System.out.println("Idade: " + getIdade());
    }

    public void mover() {
        System.out.println("Movendo...");
    }
}
