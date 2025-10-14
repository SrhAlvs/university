package aula2025_09_30.lista11.questao05;

import java.time.LocalDate;

public class Ingresso {
    private double valor;
    private LocalDate data;
    private String nomeEvento;

    public Ingresso(double valor, LocalDate data, String nomeEvento) {
        setValor(valor);
        setData(data);
        setNomeEvento(nomeEvento);
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = (valor > 0) ? 0 : valor; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getNomeEvento() { return nomeEvento; }
    public void setNomeEvento(String nomeEvento) { this.nomeEvento = (nomeEvento == null) ? "" : nomeEvento; }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: " + getValor());
    }

    public void imprimeDadosDoEvento() {
        System.out.println("Nome do evento: " + getNomeEvento());
        System.out.println("Data: " + getData());
    }
}
