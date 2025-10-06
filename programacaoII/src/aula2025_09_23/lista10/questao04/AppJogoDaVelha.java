package aula2025_09_23.lista10.questao04;

import java.util.Scanner;

public class AppJogoDaVelha {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        boolean jogoContinua = true;

        System.out.println("--- Jogo da Velha ---");
        System.out.println("Instruções: Digite a linha e a coluna (1 a 3) para sua jogada.");

        while (jogoContinua) {
            jogo.exibirGrade();

            System.out.println("Vez do Jogador " + jogo.getJogadorAtual() + ". Digite a linha e a coluna:");

            int linha = scanner.nextInt() - 1;
            int coluna = scanner.nextInt() - 1;

            if (jogo.jogar(linha, coluna)) {
                if (jogo.verificarVitoria()) {
                    jogo.exibirGrade();
                    System.out.println("Parabéns! O Jogador " + jogo.getJogadorAtual() + " venceu!");
                    jogoContinua = false;
                } else if (jogo.verificarEmpate()) {
                    jogo.exibirGrade();
                    System.out.println("Jogo encerrado! Empate.");
                    jogoContinua = false;
                } else {
                    jogo.alternarJogador();
                }
            }
        }

        scanner.close();
        System.out.println("Fim do Jogo.");
    }
}
