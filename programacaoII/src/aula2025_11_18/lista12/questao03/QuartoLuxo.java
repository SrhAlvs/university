package aula2025_11_18.lista12.questao03;

public class QuartoLuxo extends Quarto {

    public QuartoLuxo(int numero, int capacidade, double valorBase) {
        super(numero, capacidade, valorBase);
    }

    @Override
    public double calcularDiaria() {
        double taxaServico = 0.20;
        double taxaFixaLuxo = 150.00;

        return getValorBase() + (getValorBase() * taxaServico) + taxaFixaLuxo;
    }
}