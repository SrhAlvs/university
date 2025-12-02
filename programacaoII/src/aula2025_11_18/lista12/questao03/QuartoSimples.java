package aula2025_11_18.lista12.questao03;

public class QuartoSimples extends Quarto {

    public QuartoSimples(int numero, int capacidade, double valorBase) {
        super(numero, capacidade, valorBase);
    }

    @Override
    public double calcularDiaria() {
        return getValorBase();
    }
}