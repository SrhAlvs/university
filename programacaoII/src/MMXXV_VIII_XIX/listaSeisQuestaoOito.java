package MMXXV_VIII_XIX;

import java.util.Scanner;

public class listaSeisQuestaoOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = 6;

        int palpite = 0;

        System.out.println("Tente adivinhar o número secreto entre 1 e 10!");

        while (palpite != numeroSecreto) {
            System.out.print("Insira o seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Acertou!");
            } else {
                System.out.println("Você errou. Tente novamente.");
            }
        }
    }
}
