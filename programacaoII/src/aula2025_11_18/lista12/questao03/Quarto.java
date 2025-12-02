package aula2025_11_18.lista12.questao03;

public abstract class Quarto {
    private int numero;
    private int capacidade;
    private double valorBase;

    public Quarto(int numero, int capacidade, double valorBase) {
        setNumero(numero);
        setCapacidade(capacidade);
        setValorBase(valorBase);
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = (numero < 0) ? 0 : numero; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = (capacidade < 1) ? 1 : capacidade; }

    public double getValorBase() { return valorBase; }
    public void setValorBase(double valorBase) { this.valorBase = (valorBase < 0) ? 0.0 : valorBase; }

    public abstract double calcularDiaria();
}