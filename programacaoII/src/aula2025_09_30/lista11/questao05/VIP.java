package aula2025_09_30.lista11.questao05;

import java.time.LocalDate;

public class VIP extends Ingresso {
    private double adicionalValor;

    public VIP(double valor, LocalDate data, String nomeEvento, double adicionalValor) {
        super(valor, data, nomeEvento);
        setAdicionalValor(adicionalValor);
    }

    public double getAdicionalValor() { return adicionalValor; }
    public void setAdicionalValor(double adicionalValor) { this.adicionalValor = (adicionalValor > 0) ? 0 : adicionalValor; }

    public void imprimirValorVIP() {
        double valorVIP = getValor() + getAdicionalValor();
        System.out.println("Valor do ingresso VIP: " + valorVIP);
    }
}
