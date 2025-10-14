package aula2025_09_30.lista11.questao01;

import java.time.LocalDate;

public class testeFuncionarioCliente {
    static void main() {
        Profissional profi1 = new Profissional("ana", LocalDate.of(2002, 9, 25), "", 123456, "gerente de marketing");
        Cliente cli1 = new Cliente("gustavo", LocalDate.of(1970, 3, 5), "homem", 00011122233, "");

        profi1.exibirDadosProfissionais();
        System.out.println("\n------------------------------------\n");
        cli1.exibirDadosDoCliente();
    }
}
