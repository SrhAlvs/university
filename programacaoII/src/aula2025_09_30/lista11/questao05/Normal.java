package aula2025_09_30.lista11.questao05;

import java.time.LocalDate;

public class Normal extends Ingresso {
    public Normal(double valor, LocalDate data, String nomeEvento) {
        super(valor, data, nomeEvento);
    }

    public void imprimirValorIngressoNormal() {
        System.out.println("Valor do ingresso normal: " + getValor());
    }
}
