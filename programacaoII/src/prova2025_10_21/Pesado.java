package prova2025_10_21;

public class Pesado extends Drone{
    public Pesado(int codigo, int bateriaAtual, String modelo, double pesoMaximo, double autonomiaKm, double velocidadeMedia) {
        super(codigo, bateriaAtual, modelo, pesoMaximo, autonomiaKm, velocidadeMedia);
    }

    public double consumo(double pesoCargaAtual, double distanciaKm) {
        double fatorPeso = 1 + (pesoCargaAtual / pesoMaximo);
        double bateriaConsumida = (distanciaKm / autonomiaKm) * 100 * fatorPeso;
        return bateriaConsumida;
    }

    public void exibirConsumo(double pesoCargaAtual, double distanciaKm) {
        int bateriaRestante = (int) (bateriaAtual - consumo(pesoCargaAtual, distanciaKm)); //bateria é um número inteiro, já que não há 17,6% de bateria
        exibirTempoEstimado(distanciaKm);
        if (bateriaRestante > 0) {
            bateriaAtual = bateriaRestante;
            System.out.println("Bateria restante: " + bateriaRestante);
        } else {
            System.out.println("Bateria restante: " + bateriaAtual);
        }
    }
}
