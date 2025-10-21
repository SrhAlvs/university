package aula2025_09_30.lista11.questao05;

import java.time.LocalDate;

public class testeIngresso {
    static void main() {
        Ingresso i1 = new Ingresso(90, LocalDate.of(2025, 10, 30), "Coisa interessante");
        i1.imprimeDadosDoEvento();
        i1.imprimeValor();
        dividirEscopo();

        Normal n1 = new Normal(90, LocalDate.of(2025, 10, 30), "Coisa interessante");
        n1.imprimeDadosDoEvento();
        n1.imprimeValor();
        n1.imprimirValorIngressoNormal();
        dividirEscopo();

        VIP v1 = new VIP(90, LocalDate.of(2025, 10, 30), "Coisa interessante", 40);
        v1.imprimeDadosDoEvento();
        v1.imprimeValor();
        v1.imprimirValorVIP();
        dividirEscopo();

        CamaroteInferior ci1 = new CamaroteInferior(90, LocalDate.of(2025, 10, 30), "Coisa interessante", 40, "i3B");
        ci1.imprimeDadosDoEvento();
        ci1.imprimeValor();
        ci1.imprimirValorVIP();
        ci1.imprimirLocalizacao();
        dividirEscopo();

        CamaroteSuperior cs1 = new CamaroteSuperior(90, LocalDate.of(2025, 10, 30), "Coisa interessante", 40, "s8F", 25);
        cs1.imprimeDadosDoEvento();
        cs1.imprimeValor();
        cs1.imprimirValorVIP();
        cs1.imprimirValorAdicionalCSuperior();
        cs1.imprimirLocalizacao();
        dividirEscopo();
    }
    public static void dividirEscopo() {
        System.out.print("\n------------------------------------------------\n\n");
    }
}
