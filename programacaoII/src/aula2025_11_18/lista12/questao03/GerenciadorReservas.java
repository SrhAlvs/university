package aula2025_11_18.lista12.questao03;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorReservas {
    private List<Reserva> listaReservas;

    public GerenciadorReservas() {
        this.listaReservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        this.listaReservas.add(reserva);
        System.out.println("Reserva adicionada para o quarto " + reserva.getQuartoReservado().getNumero());
    }

    public void cancelarReserva(Reserva reserva) {
        if (this.listaReservas.remove(reserva)) {
            System.out.println("Reserva do quarto " + reserva.getQuartoReservado().getNumero() + " cancelada com sucesso.");
        } else {
            System.out.println("Reserva não encontrada.");
        }
    }

    public void listarReservas() {
        System.out.println("\n>>> LISTA DE RESERVAS ATIVAS <<<");
        double faturamentoTotal = 0.0;

        for (Reserva r : listaReservas) {
            double total = r.calcularValorTotal();
            faturamentoTotal += total;

            System.out.println("Quarto: " + r.getQuartoReservado().getNumero() +
                    " | Período: " + r.getPeriodoFormatado());
            System.out.println("Valor Total: R$ " + String.format("%.2f", total));
            System.out.println("-----------------------------------");
        }
        System.out.println("Faturamento previsto: R$ " + String.format("%.2f", faturamentoTotal));
    }
}