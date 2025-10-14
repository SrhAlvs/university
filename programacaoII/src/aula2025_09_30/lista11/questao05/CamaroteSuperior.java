package aula2025_09_30.lista11.questao05;

import java.time.LocalDate;

public class CamaroteSuperior extends VIP {
    private String localizacao;
    private double adicionalValorCamaroteSuperior;

    public CamaroteSuperior(double valor, LocalDate data, String nomeEvento, double adicionalValor, String localizacao, double adicionalValorCamaroteSuperior) {
        super(valor, data, nomeEvento, adicionalValor);
        setLocalizacao(localizacao);
        setAdicionalValorCamaroteSuperior(adicionalValorCamaroteSuperior);
    }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = (localizacao == null) ? "" : localizacao; }


    public double getAdicionalValorCamaroteSuperior() { return adicionalValorCamaroteSuperior; }
    public void setAdicionalValorCamaroteSuperior(double adicionalValorCamaroteSuperior) { this.adicionalValorCamaroteSuperior = (adicionalValorCamaroteSuperior > 0) ? 0 : adicionalValorCamaroteSuperior; }


    public void imprimirLocalizacao() {
        double valorVIPCamaroteSuperior = getValor() + getAdicionalValorCamaroteSuperior();
        System.out.println("Localização (camarote superior): " + getLocalizacao());
        System.out.println("Valor do ingresso VIP (camarote superior: " + valorVIPCamaroteSuperior);
    }
}
