package aula2025_09_23.lista10.questao04;

import java.util.Arrays;

public class JogoDaVelha {

    private enum Ocupacao {
        VAZIA(' '),
        JOGADOR_1('X'),
        JOGADOR_2('O');

        private final char simbolo;

        Ocupacao(char simbolo) {
            this.simbolo = simbolo;
        }

        public String toString() {
            return String.valueOf(simbolo);
        }
    }

    private final Ocupacao[][] tabuleiro;
    private Ocupacao jogadorAtual;

    public JogoDaVelha() {
        this.tabuleiro = new Ocupacao[3][3];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(tabuleiro[i], Ocupacao.VAZIA);
        }
        this.jogadorAtual = Ocupacao.JOGADOR_1;
    }

    public void exibirGrade() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + " |");
            }
            System.out.println("\n-------------");
        }
    }

    public boolean jogar(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            System.out.println("Posição inválida. Escolha entre 1 e 3 para linha e coluna.");
            return false;
        }

        if (tabuleiro[linha][coluna] != Ocupacao.VAZIA) {
            System.out.println("Essa casa já está ocupada. Escolha outra.");
            return false;
        }

        tabuleiro[linha][coluna] = jogadorAtual;
        return true;
    }

    public void alternarJogador() {
        jogadorAtual = (jogadorAtual == Ocupacao.JOGADOR_1) ? Ocupacao.JOGADOR_2 : Ocupacao.JOGADOR_1;
    }

    public boolean verificarVitoria() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != Ocupacao.VAZIA && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return true;
            }
            if (tabuleiro[0][i] != Ocupacao.VAZIA && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                return true;
            }
        }

        if (tabuleiro[0][0] != Ocupacao.VAZIA && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return true;
        }
        if (tabuleiro[0][2] != Ocupacao.VAZIA && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return true;
        }

        return false;
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == Ocupacao.VAZIA) {
                    return false;
                }
            }
        }
        return !verificarVitoria();
    }

    public Ocupacao getJogadorAtual() {
        return jogadorAtual;
    }
}
