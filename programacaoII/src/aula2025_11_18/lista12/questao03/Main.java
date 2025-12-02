package aula2025_11_18.lista12.questao03;

import java.time.LocalDate;

public class Main {
    static void main() {
        System.out.println(">>> SISTEMA DE HOTEL <<<");

        QuartoSimples qSimples = new QuartoSimples(101, 2, 200.00);
        QuartoLuxo qLuxo = new QuartoLuxo(505, 4, 800.00);

        GerenciadorReservas gerenciador = new GerenciadorReservas();

        Reserva r1 = new Reserva(qSimples, LocalDate.of(2025, 12, 20), LocalDate.of(2025, 12, 25));

        Reserva r2 = new Reserva(qLuxo, LocalDate.of(2025, 12, 30), LocalDate.of(2026, 1, 2));

        gerenciador.adicionarReserva(r1);
        gerenciador.adicionarReserva(r2);

        gerenciador.listarReservas();
    }
}