package aula2025_11_18.lista12.questao03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Quarto quartoReservado;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Reserva(Quarto quartoReservado, LocalDate dataEntrada, LocalDate dataSaida) {
        this.quartoReservado = quartoReservado;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public Quarto getQuartoReservado() { return quartoReservado; }

    public double calcularValorTotal() {
        if (dataEntrada!=null && dataSaida!=null && quartoReservado!=null) {
            // Calcula a diferença de dias entre entrada e saída
            long dias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);

            // Se a data de saída for igual ou anterior à entrada, vai considerar pelo menos 1 diária
            if (dias <= 0) dias = 1;

            return dias * quartoReservado.calcularDiaria();
        }
        return 0.0;
    }

    public String getPeriodoFormatado() {
        return dataEntrada + " até " + dataSaida;
    }
}