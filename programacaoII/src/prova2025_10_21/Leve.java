package prova2025_10_21;

public class Leve extends Drone{
    private double eficienciaEnergetica;

    public Leve(int codigo, int bateriaAtual, String modelo, double pesoMaximo, double autonomiaKm, double velocidadeMedia, double eficienciaEnergetica) {
        super(codigo, bateriaAtual, modelo, pesoMaximo, autonomiaKm, velocidadeMedia);
        setEficienciaEnergetica(eficienciaEnergetica);
    }

    public double getEficienciaEnergetica() { return this.eficienciaEnergetica; }
    public void setEficienciaEnergetica(double eficienciaEnergetica) { this.eficienciaEnergetica = (eficienciaEnergetica < 0) ? 0 : eficienciaEnergetica; }

    public double consumo(double distanciaKm) {
        double bateriaConsumida = distanciaKm/eficienciaEnergetica;
        return bateriaConsumida;
    }

    public void exibirConsumo(double distanciaKm) {
        int bateriaRestante = (int) (getBateriaAtual() - consumo(distanciaKm)); //bateria é um número inteiro, já que não há 17,6% de bateria
        exibirTempoEstimado(distanciaKm);
        if (bateriaRestante > 0) {
            setBateriaAtual(bateriaRestante);
            System.out.println("Bateria restante: " + bateriaRestante);
        } else {
            System.out.println("Bateria restante: " + getBateriaAtual());
        }
    }
}
