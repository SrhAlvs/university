package aula2025_09_30.lista11.questao05;

import java.time.LocalDate;

public class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, LocalDate data, String nomeEvento, double adicionalValor, String localizacao) {
        super(valor, data, nomeEvento, adicionalValor);
        setLocalizacao(localizacao);
    }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = (localizacao == null) ? "" : localizacao; }

    public void imprimirLocalizacao() {
        System.out.println("Localização (camarote inferior): " + getLocalizacao());
    }
}
